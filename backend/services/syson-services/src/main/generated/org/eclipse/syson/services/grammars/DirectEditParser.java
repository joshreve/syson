// Generated from DirectEdit.g4 by ANTLR 4.10.1

/*******************************************************************************
 * Copyright (c) 2023, 2024 Obeo.
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
package org.eclipse.syson.services.grammars;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DirectEditParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, Boolean=14, Integer=15, Real=16, SingleQuotedString=17, 
		DoubleQuotedString=18, BasicName=19, BasicInitialCharacter=20, BasicNameCharacter=21, 
		ABOUT=22, ABSTRACT=23, ALIAS=24, ALL=25, AND=26, AS=27, ASSIGN=28, ASSOC=29, 
		BEAHVIOR=30, BINDING=31, BOOL=32, BY=33, CHAINS=34, CLASS=35, CLASSIFIER=36, 
		COMMENT=37, COMPOSITE=38, CONJUGATE=39, CONJUGATES=40, CONJUGATION=41, 
		CONNECTOR=42, DATATYPE=43, DEFAULT=44, DEPENDENCY=45, DERIVED=46, DIFFERENCES=47, 
		DISJOINING=48, DISJOINT=49, DOC=50, ELSE=51, END=52, EXPR=53, FALSE=54, 
		FEATURE=55, FEATURED=56, FEATURING=57, FILTER=58, FIRST=59, FLOW=60, FOR=61, 
		FROM=62, FUNCTION=63, HASTYPE=64, IF=65, INTERSECTS=66, IMPLIES=67, IMPORT=68, 
		IN=69, INPUT=70, INTERACTION=71, INV=72, INVERSE=73, INVERTING=74, ISTYPE=75, 
		LANGUAGE=76, MEMBER=77, METACLASS=78, METADATA=79, MULTIPLICITY=80, NAMESPACE=81, 
		NONUNIQUE=82, NOT=83, NULL=84, OF=85, OR=86, ORDERED=87, OUT=88, PACKAGE=89, 
		PORTION=90, PREDICATE=91, PRIAVTE=92, PROTECTED=93, PUBLIC=94, READONLY=95, 
		REDEFINES=96, REDEFINITION=97, RFERENCES=98, REP=99, RETURN=100, SPECIALIZTION=101, 
		SPECIALIZES=102, STEP=103, STRCUT=104, SUBCLASSIFIER=105, SUBSET=106, 
		SUBSETS=107, SUBTYPE=108, SUCCESSION=109, THEN=110, TO=111, TRUE=112, 
		TYPE=113, TYPED=114, TYPING=115, UNIONS=116, XOR=117;
	public static final int
		RULE_expression = 0, RULE_multiplicityExpression = 1, RULE_multiplicityExpressionMember = 2, 
		RULE_featureExpressions = 3, RULE_subsettingExpression = 4, RULE_redefinitionExpression = 5, 
		RULE_typingExpression = 6, RULE_valueExpression = 7, RULE_transitionExpression = 8, 
		RULE_triggerExpression = 9, RULE_guardExpression = 10, RULE_effectExpression = 11, 
		RULE_qualifiedName = 12, RULE_name = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "multiplicityExpression", "multiplicityExpressionMember", 
			"featureExpressions", "subsettingExpression", "redefinitionExpression", 
			"typingExpression", "valueExpression", "transitionExpression", "triggerExpression", 
			"guardExpression", "effectExpression", "qualifiedName", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "'..'", "']'", "'*'", "':>'", "':>>'", "':'", "'='", "'|'", 
			"'/'", "','", "'::'", null, null, null, null, null, null, null, null, 
			null, "'about'", "'abstract'", "'alias'", "'all'", "'and'", "'as'", "'assign'", 
			"'assoc'", "'behavior'", "'binding'", "'bool'", "'by'", "'chains'", "'class'", 
			"'classifier'", "'comment'", "'composite'", "'conjugate'", "'conjugates'", 
			"'conjugation'", "'connector'", "'datatype'", "'default'", "'dependency'", 
			"'derived'", "'differences'", "'disjoining'", "'disjoint'", "'doc'", 
			"'else'", "'end'", "'expr'", "'false'", "'feature'", "'featured'", "'featuring'", 
			"'filter'", "'first'", "'flow'", "'for'", "'from'", "'function'", "'hastype'", 
			"'if'", "'intersects'", "'implies'", "'import'", "'in'", "'inout'", "'interaction'", 
			"'inv'", "'inverse'", "'inverting'", "'istype'", "'language'", "'member'", 
			"'metaclass'", "'metadata'", "'multiplicity'", "'namespace'", "'nonunique'", 
			"'not'", "'null'", "'of'", "'or'", "'ordered'", "'out'", "'package'", 
			"'portion'", "'predicate'", "'private'", "'protected'", "'public'", "'readonly'", 
			"'redefines'", "'redefinition'", "'references'", "'rep'", "'return'", 
			"'specialization'", "'specializes'", "'step'", "'struct'", "'subclassifier'", 
			"'subset'", "'subsets'", "'subtype'", "'succession'", "'then'", "'to'", 
			"'true'", "'type'", "'typed'", "'typing'", "'unions'", "'xor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "Boolean", "Integer", "Real", "SingleQuotedString", "DoubleQuotedString", 
			"BasicName", "BasicInitialCharacter", "BasicNameCharacter", "ABOUT", 
			"ABSTRACT", "ALIAS", "ALL", "AND", "AS", "ASSIGN", "ASSOC", "BEAHVIOR", 
			"BINDING", "BOOL", "BY", "CHAINS", "CLASS", "CLASSIFIER", "COMMENT", 
			"COMPOSITE", "CONJUGATE", "CONJUGATES", "CONJUGATION", "CONNECTOR", "DATATYPE", 
			"DEFAULT", "DEPENDENCY", "DERIVED", "DIFFERENCES", "DISJOINING", "DISJOINT", 
			"DOC", "ELSE", "END", "EXPR", "FALSE", "FEATURE", "FEATURED", "FEATURING", 
			"FILTER", "FIRST", "FLOW", "FOR", "FROM", "FUNCTION", "HASTYPE", "IF", 
			"INTERSECTS", "IMPLIES", "IMPORT", "IN", "INPUT", "INTERACTION", "INV", 
			"INVERSE", "INVERTING", "ISTYPE", "LANGUAGE", "MEMBER", "METACLASS", 
			"METADATA", "MULTIPLICITY", "NAMESPACE", "NONUNIQUE", "NOT", "NULL", 
			"OF", "OR", "ORDERED", "OUT", "PACKAGE", "PORTION", "PREDICATE", "PRIAVTE", 
			"PROTECTED", "PUBLIC", "READONLY", "REDEFINES", "REDEFINITION", "RFERENCES", 
			"REP", "RETURN", "SPECIALIZTION", "SPECIALIZES", "STEP", "STRCUT", "SUBCLASSIFIER", 
			"SUBSET", "SUBSETS", "SUBTYPE", "SUCCESSION", "THEN", "TO", "TRUE", "TYPE", 
			"TYPED", "TYPING", "UNIONS", "XOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DirectEdit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DirectEditParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public FeatureExpressionsContext featureExpressions() {
			return getRuleContext(FeatureExpressionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DirectEditParser.EOF, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public MultiplicityExpressionContext multiplicityExpression() {
			return getRuleContext(MultiplicityExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(28);
				name();
				}
				break;
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(31);
				multiplicityExpression();
				}
			}

			setState(34);
			featureExpressions();
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicityExpressionContext extends ParserRuleContext {
		public MultiplicityExpressionMemberContext lowerBound;
		public MultiplicityExpressionMemberContext upperBound;
		public List<MultiplicityExpressionMemberContext> multiplicityExpressionMember() {
			return getRuleContexts(MultiplicityExpressionMemberContext.class);
		}
		public MultiplicityExpressionMemberContext multiplicityExpressionMember(int i) {
			return getRuleContext(MultiplicityExpressionMemberContext.class,i);
		}
		public MultiplicityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterMultiplicityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitMultiplicityExpression(this);
		}
	}

	public final MultiplicityExpressionContext multiplicityExpression() throws RecognitionException {
		MultiplicityExpressionContext _localctx = new MultiplicityExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multiplicityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(38);
				((MultiplicityExpressionContext)_localctx).lowerBound = multiplicityExpressionMember();
				setState(39);
				match(T__1);
				}
				break;
			}
			setState(43);
			((MultiplicityExpressionContext)_localctx).upperBound = multiplicityExpressionMember();
			setState(44);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicityExpressionMemberContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(DirectEditParser.Integer, 0); }
		public MultiplicityExpressionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicityExpressionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterMultiplicityExpressionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitMultiplicityExpressionMember(this);
		}
	}

	public final MultiplicityExpressionMemberContext multiplicityExpressionMember() throws RecognitionException {
		MultiplicityExpressionMemberContext _localctx = new MultiplicityExpressionMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplicityExpressionMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==Integer) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureExpressionsContext extends ParserRuleContext {
		public SubsettingExpressionContext subsettingExpression() {
			return getRuleContext(SubsettingExpressionContext.class,0);
		}
		public RedefinitionExpressionContext redefinitionExpression() {
			return getRuleContext(RedefinitionExpressionContext.class,0);
		}
		public TypingExpressionContext typingExpression() {
			return getRuleContext(TypingExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TransitionExpressionContext transitionExpression() {
			return getRuleContext(TransitionExpressionContext.class,0);
		}
		public FeatureExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterFeatureExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitFeatureExpressions(this);
		}
	}

	public final FeatureExpressionsContext featureExpressions() throws RecognitionException {
		FeatureExpressionsContext _localctx = new FeatureExpressionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_featureExpressions);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(48);
					subsettingExpression();
					}
					break;
				case T__5:
					{
					setState(49);
					redefinitionExpression();
					}
					break;
				case EOF:
				case T__6:
				case T__7:
					break;
				default:
					break;
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(52);
					typingExpression();
					}
				}

				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(55);
					valueExpression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(58);
					typingExpression();
					}
				}

				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(61);
					subsettingExpression();
					}
					break;
				case T__5:
					{
					setState(62);
					redefinitionExpression();
					}
					break;
				case EOF:
				case T__7:
					break;
				default:
					break;
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(65);
					valueExpression();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(68);
					transitionExpression();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubsettingExpressionContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SubsettingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsettingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterSubsettingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitSubsettingExpression(this);
		}
	}

	public final SubsettingExpressionContext subsettingExpression() throws RecognitionException {
		SubsettingExpressionContext _localctx = new SubsettingExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subsettingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			setState(74);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedefinitionExpressionContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public RedefinitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redefinitionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterRedefinitionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitRedefinitionExpression(this);
		}
	}

	public final RedefinitionExpressionContext redefinitionExpression() throws RecognitionException {
		RedefinitionExpressionContext _localctx = new RedefinitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_redefinitionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__5);
			setState(77);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypingExpressionContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterTypingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitTypingExpression(this);
		}
	}

	public final TypingExpressionContext typingExpression() throws RecognitionException {
		TypingExpressionContext _localctx = new TypingExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__6);
			setState(80);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public TerminalNode Real() { return getToken(DirectEditParser.Real, 0); }
		public TerminalNode Boolean() { return getToken(DirectEditParser.Boolean, 0); }
		public TerminalNode Integer() { return getToken(DirectEditParser.Integer, 0); }
		public TerminalNode DoubleQuotedString() { return getToken(DirectEditParser.DoubleQuotedString, 0); }
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitValueExpression(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valueExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__7);
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Integer) | (1L << Real) | (1L << DoubleQuotedString))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionExpressionContext extends ParserRuleContext {
		public TriggerExpressionContext triggerExpression() {
			return getRuleContext(TriggerExpressionContext.class,0);
		}
		public EffectExpressionContext effectExpression() {
			return getRuleContext(EffectExpressionContext.class,0);
		}
		public TransitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterTransitionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitTransitionExpression(this);
		}
	}

	public final TransitionExpressionContext transitionExpression() throws RecognitionException {
		TransitionExpressionContext _localctx = new TransitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transitionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SingleQuotedString || _la==BasicName) {
				{
				setState(85);
				triggerExpression();
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(88);
				effectExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriggerExpressionContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TriggerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterTriggerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitTriggerExpression(this);
		}
	}

	public final TriggerExpressionContext triggerExpression() throws RecognitionException {
		TriggerExpressionContext _localctx = new TriggerExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_triggerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			qualifiedName();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(92);
				match(T__8);
				setState(93);
				qualifiedName();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardExpressionContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public GuardExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterGuardExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitGuardExpression(this);
		}
	}

	public final GuardExpressionContext guardExpression() throws RecognitionException {
		GuardExpressionContext _localctx = new GuardExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_guardExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__0);
			setState(100);
			valueExpression();
			setState(101);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EffectExpressionContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public EffectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterEffectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitEffectExpression(this);
		}
	}

	public final EffectExpressionContext effectExpression() throws RecognitionException {
		EffectExpressionContext _localctx = new EffectExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_effectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__9);
			setState(104);
			qualifiedName();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(105);
				match(T__10);
				setState(106);
				qualifiedName();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			name();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(113);
				match(T__11);
				setState(114);
				name();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode BasicName() { return getToken(DirectEditParser.BasicName, 0); }
		public TerminalNode SingleQuotedString() { return getToken(DirectEditParser.SingleQuotedString, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==SingleQuotedString || _la==BasicName) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001u{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0001\u0000\u0003\u0000\u001e\b\u0000\u0001\u0000\u0003"+
		"\u0000!\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u00033\b\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003\u0003\u0003"+
		"9\b\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003@\b\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0003\u0003\u0003"+
		"F\b\u0003\u0003\u0003H\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\bW\b\b\u0001\b\u0003\bZ\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t_\b\t\n\t\f\tb\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"l\b\u000b\n\u000b\f\u000bo\t\u000b\u0001\f\u0001\f\u0001\f\u0005\ft\b"+
		"\f\n\f\f\fw\t\f\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0003"+
		"\u0002\u0000\u0004\u0004\u000f\u000f\u0002\u0000\u000e\u0010\u0012\u0012"+
		"\u0002\u0000\u0011\u0011\u0013\u0013\u007f\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0002%\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u0006"+
		"G\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fO\u0001\u0000\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010"+
		"V\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014c\u0001"+
		"\u0000\u0000\u0000\u0016g\u0001\u0000\u0000\u0000\u0018p\u0001\u0000\u0000"+
		"\u0000\u001ax\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u001a\r\u0000"+
		"\u001d\u001c\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e \u0001\u0000\u0000\u0000\u001f!\u0003\u0002\u0001\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0003\u0006\u0003\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001"+
		"\u0000\u0000\u0000%)\u0005\u0001\u0000\u0000&\'\u0003\u0004\u0002\u0000"+
		"\'(\u0005\u0002\u0000\u0000(*\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0003\u0004"+
		"\u0002\u0000,-\u0005\u0003\u0000\u0000-\u0003\u0001\u0000\u0000\u0000"+
		"./\u0007\u0000\u0000\u0000/\u0005\u0001\u0000\u0000\u000003\u0003\b\u0004"+
		"\u000013\u0003\n\u0005\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000046\u0003\f\u0006"+
		"\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000"+
		"\u0000\u000079\u0003\u000e\u0007\u000087\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009H\u0001\u0000\u0000\u0000:<\u0003\f\u0006\u0000;:\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=@\u0003\b\u0004\u0000>@\u0003\n\u0005\u0000?=\u0001\u0000\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000"+
		"\u0000AC\u0003\u000e\u0007\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CH\u0001\u0000\u0000\u0000DF\u0003\u0010\b\u0000ED\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000G2\u0001"+
		"\u0000\u0000\u0000G;\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0005\u0000\u0000JK\u0003\u0018"+
		"\f\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\u0006\u0000\u0000MN\u0003"+
		"\u0018\f\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0005\u0007\u0000\u0000"+
		"PQ\u0003\u0018\f\u0000Q\r\u0001\u0000\u0000\u0000RS\u0005\b\u0000\u0000"+
		"ST\u0007\u0001\u0000\u0000T\u000f\u0001\u0000\u0000\u0000UW\u0003\u0012"+
		"\t\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000"+
		"\u0000\u0000XZ\u0003\u0016\u000b\u0000YX\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\u0011\u0001\u0000\u0000\u0000[`\u0003\u0018\f\u0000"+
		"\\]\u0005\t\u0000\u0000]_\u0003\u0018\f\u0000^\\\u0001\u0000\u0000\u0000"+
		"_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a\u0013\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0001\u0000\u0000de\u0003\u000e\u0007\u0000ef\u0005\u0003\u0000\u0000"+
		"f\u0015\u0001\u0000\u0000\u0000gh\u0005\n\u0000\u0000hm\u0003\u0018\f"+
		"\u0000ij\u0005\u000b\u0000\u0000jl\u0003\u0018\f\u0000ki\u0001\u0000\u0000"+
		"\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000n\u0017\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"pu\u0003\u001a\r\u0000qr\u0005\f\u0000\u0000rt\u0003\u001a\r\u0000sq\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\u0019\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0007\u0002\u0000\u0000y\u001b\u0001\u0000\u0000\u0000"+
		"\u0010\u001d )258;?BEGVY`mu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}