/*******************************************************************************
 * Copyright (c) 2024 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.syson.sysml.dto;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.api.ChangeKind;
import org.eclipse.sirius.components.collaborative.api.IEditingContextEventHandler;
import org.eclipse.sirius.components.collaborative.api.Monitoring;
import org.eclipse.sirius.components.collaborative.messages.ICollaborativeMessageService;
import org.eclipse.sirius.components.core.api.ErrorPayload;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IFeedbackMessageService;
import org.eclipse.sirius.components.core.api.IInput;
import org.eclipse.sirius.components.core.api.IObjectService;
import org.eclipse.sirius.components.core.api.IPayload;
import org.eclipse.sirius.components.core.api.SuccessPayload;
import org.eclipse.sirius.components.emf.services.api.IEMFEditingContext;
import org.eclipse.sirius.components.representations.Message;
import org.eclipse.sirius.components.representations.MessageLevel;
import org.eclipse.syson.sysml.ASTTransformer;
import org.eclipse.syson.sysml.Element;
import org.eclipse.syson.sysml.Membership;
import org.eclipse.syson.sysml.Namespace;
import org.eclipse.syson.sysml.Package;
import org.eclipse.syson.sysml.SysmlFactory;
import org.eclipse.syson.sysml.SysmlPackage;
import org.eclipse.syson.sysml.SysmlToAst;
import org.springframework.stereotype.Service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import reactor.core.publisher.Sinks.Many;
import reactor.core.publisher.Sinks.One;

/**
 * Event handler for InsertTextualSysMLv2 mutation.
 * 
 * @author arichard
 */
@Service
public class InsertTextualSysMLv2EventHandler implements IEditingContextEventHandler {

    private final IObjectService objectService;

    private final ICollaborativeMessageService messageService;

    private final IFeedbackMessageService feedbackMessageService;

    private final SysmlToAst sysmlToAst;

    private final Counter counter;

    public InsertTextualSysMLv2EventHandler(IObjectService objectService, ICollaborativeMessageService messageService, IFeedbackMessageService feedbackMessageService,
            SysmlToAst sysmlToAst, MeterRegistry meterRegistry) {
        this.objectService = Objects.requireNonNull(objectService);
        this.messageService = Objects.requireNonNull(messageService);
        this.feedbackMessageService = Objects.requireNonNull(feedbackMessageService);
        this.sysmlToAst = Objects.requireNonNull(sysmlToAst);
        this.counter = Counter.builder(Monitoring.EVENT_HANDLER)
                .tag(Monitoring.NAME, this.getClass().getSimpleName())
                .register(meterRegistry);
    }

    @Override
    public boolean canHandle(IEditingContext editingContext, IInput input) {
        return input instanceof InsertTextualSysMLv2Input;
    }

    @Override
    public void handle(One<IPayload> payloadSink, Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext, IInput input) {
        this.counter.increment();

        List<Message> messages = List.of(new Message(this.messageService.invalidInput(input.getClass().getSimpleName(), InsertTextualSysMLv2Input.class.getSimpleName()),
                MessageLevel.ERROR));
        ChangeDescription changeDescription = new ChangeDescription(ChangeKind.NOTHING, editingContext.getId(), input);

        IPayload payload = null;

        if (input instanceof InsertTextualSysMLv2Input insertTextualInput && editingContext instanceof IEMFEditingContext emfEditingContext) {
            var parentObjectId = insertTextualInput.objectId();
            var parentElement = this.getParentElement(parentObjectId, emfEditingContext);
            if (parentElement != null) {
                var rootElements = this.getRootElementsFromTextualContent(insertTextualInput, emfEditingContext);
                if (!rootElements.isEmpty()) {
                    for (Element element : rootElements) {
                        var membership = createMembership(parentElement);
                        membership.getOwnedRelatedElement().add(element);
                    }
                    payload = new SuccessPayload(input.id(), this.feedbackMessageService.getFeedbackMessages());
                    changeDescription = new ChangeDescription(ChangeKind.SEMANTIC_CHANGE, editingContext.getId(), input);
                } else {
                    messages = List.of(new Message("Unable to convert the input into valid SysMLv2", MessageLevel.ERROR));
                }
            }
        }

        if (payload == null) {
            payload = new ErrorPayload(input.id(), messages);
        }

        payloadSink.tryEmitValue(payload);
        changeDescriptionSink.tryEmitNext(changeDescription);
    }

    private Element getParentElement(String parentObjectId, IEMFEditingContext emfEditingContext) {
        var parentObject = this.objectService.getObject(emfEditingContext, parentObjectId);
        if (parentObject.isPresent()) {
            var object = parentObject.get();
            if (object instanceof Element parentElement) {
                return parentElement;
            }
        }
        return null;
    }

    private List<Element> getRootElementsFromTextualContent(InsertTextualSysMLv2Input insertTextualInput, IEMFEditingContext emfEditingContext) {
        var resource = this.convert(insertTextualInput, emfEditingContext);
        if (resource != null && !resource.getContents().isEmpty()) {
            var rootElements = this.extractContent(resource);
            // We don't want the new resource to stay in the resource set and create a new document
            var resourceSet = emfEditingContext.getDomain().getResourceSet();
            resourceSet.getResources().remove(resource);
            return rootElements;
        }
        return List.of();
    }

    private Resource convert(InsertTextualSysMLv2Input insertTextualInput, IEMFEditingContext emfEditingContext) {
        var textualContent = insertTextualInput.textualContent();
        var resourceSet = emfEditingContext.getDomain().getResourceSet();
        var inputStream = new ByteArrayInputStream(textualContent.getBytes());
        var astStream = this.sysmlToAst.convert(inputStream, ".sysml");
        var tranformer = new ASTTransformer();
        var resource = tranformer.convertResource(astStream, resourceSet);
        return resource;
    }

    private Membership createMembership(Element element) {
        Membership membership = null;
        if (element instanceof Package || SysmlPackage.eINSTANCE.getNamespace().equals(element.eClass())) {
            membership = SysmlFactory.eINSTANCE.createOwningMembership();
        } else {
            membership = SysmlFactory.eINSTANCE.createFeatureMembership();
        }
        element.getOwnedRelationship().add(membership);
        return membership;
    }

    private List<Element> extractContent(Resource resource) {
        var roots = resource.getContents().stream()
                .filter(Namespace.class::isInstance)
                .map(Namespace.class::cast)
                .flatMap(ns -> ns.getOwnedRelationship().stream())
                .flatMap(r -> r.getOwnedRelatedElement().stream())
                .toList();
        return roots;
    }
}
