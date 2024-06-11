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
package org.eclipse.syson.services.diagrams.api;

import org.eclipse.sirius.components.view.diagram.DiagramDescription;

/**
 * Retrieves a diagram description.
 *
 * @author gdaniel
 */
public interface IGivenDiagramDescription {

    DiagramDescription getDiagramDescription(String editingContextId, String diagramDescriptionId);

}
