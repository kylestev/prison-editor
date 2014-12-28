// Generated from Section.g4 by ANTLR 4.4
package io.kylestev.prisonarchitect.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SectionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION_BEGIN=1, SECTION_END=2, BOOL=3, NUMBER=4, ID=5, UNDER_SEPARATED_NAME=6, 
		PROPERTY=7, OBJ_PROPERTY=8, ATOM=9, QUOTE=10, WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'BEGIN'", "'END'", "BOOL", "NUMBER", "ID", "UNDER_SEPARATED_NAME", 
		"PROPERTY", "OBJ_PROPERTY", "ATOM", "QUOTE", "WS"
	};
	public static final int
		RULE_attributes = 0, RULE_sections = 1, RULE_section = 2, RULE_section_name = 3, 
		RULE_attr = 4, RULE_attrKey = 5, RULE_attrValue = 6;
	public static final String[] ruleNames = {
		"attributes", "sections", "section", "section_name", "attr", "attrKey", 
		"attrValue"
	};

	@Override
	public String getGrammarFileName() { return "PrisonSection.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SectionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AttributesContext extends ParserRuleContext {
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << UNDER_SEPARATED_NAME) | (1L << OBJ_PROPERTY) | (1L << QUOTE))) != 0)) {
				{
				{
				setState(14); attr();
				}
				}
				setState(19);
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

	public static class SectionsContext extends ParserRuleContext {
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).enterSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).exitSections(this);
		}
	}

	public final SectionsContext sections() throws RecognitionException {
		SectionsContext _localctx = new SectionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SECTION_BEGIN) {
				{
				{
				setState(20); section();
				}
				}
				setState(25);
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

	public static class SectionContext extends ParserRuleContext {
		public SectionsContext sections() {
			return getRuleContext(SectionsContext.class,0);
		}
		public TerminalNode SECTION_BEGIN() { return getToken(SectionParser.SECTION_BEGIN, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Section_nameContext section_name() {
			return getRuleContext(Section_nameContext.class,0);
		}
		public TerminalNode SECTION_END() { return getToken(SectionParser.SECTION_END, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(SECTION_BEGIN);
			setState(27); section_name();
			setState(28); attributes();
			setState(29); sections();
			setState(30); match(SECTION_END);
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

	public static class Section_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SectionParser.ID, 0); }
		public TerminalNode UNDER_SEPARATED_NAME() { return getToken(SectionParser.UNDER_SEPARATED_NAME, 0); }
		public TerminalNode QUOTE() { return getToken(SectionParser.QUOTE, 0); }
		public Section_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).enterSection_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).exitSection_name(this);
		}
	}

	public final Section_nameContext section_name() throws RecognitionException {
		Section_nameContext _localctx = new Section_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_section_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << UNDER_SEPARATED_NAME) | (1L << QUOTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AttrContext extends ParserRuleContext {
		public AttrKeyContext attrKey() {
			return getRuleContext(AttrKeyContext.class,0);
		}
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); attrKey();
			setState(35); attrValue();
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

	public static class AttrKeyContext extends ParserRuleContext {
		public TerminalNode OBJ_PROPERTY() { return getToken(SectionParser.OBJ_PROPERTY, 0); }
		public TerminalNode ID() { return getToken(SectionParser.ID, 0); }
		public TerminalNode UNDER_SEPARATED_NAME() { return getToken(SectionParser.UNDER_SEPARATED_NAME, 0); }
		public TerminalNode QUOTE() { return getToken(SectionParser.QUOTE, 0); }
		public AttrKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).enterAttrKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).exitAttrKey(this);
		}
	}

	public final AttrKeyContext attrKey() throws RecognitionException {
		AttrKeyContext _localctx = new AttrKeyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attrKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << UNDER_SEPARATED_NAME) | (1L << OBJ_PROPERTY) | (1L << QUOTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AttrValueContext extends ParserRuleContext {
		public TerminalNode OBJ_PROPERTY() { return getToken(SectionParser.OBJ_PROPERTY, 0); }
		public TerminalNode ID() { return getToken(SectionParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(SectionParser.BOOL, 0); }
		public TerminalNode ATOM() { return getToken(SectionParser.ATOM, 0); }
		public TerminalNode UNDER_SEPARATED_NAME() { return getToken(SectionParser.UNDER_SEPARATED_NAME, 0); }
		public TerminalNode NUMBER() { return getToken(SectionParser.NUMBER, 0); }
		public TerminalNode QUOTE() { return getToken(SectionParser.QUOTE, 0); }
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).enterAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SectionListener ) ((SectionListener)listener).exitAttrValue(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NUMBER) | (1L << ID) | (1L << UNDER_SEPARATED_NAME) | (1L << OBJ_PROPERTY) | (1L << ATOM) | (1L << QUOTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\5\4\2\7\b\f\f"+
		"\5\2\7\b\n\n\f\f\4\2\5\b\n\f&\2\23\3\2\2\2\4\31\3\2\2\2\6\34\3\2\2\2\b"+
		"\"\3\2\2\2\n$\3\2\2\2\f\'\3\2\2\2\16)\3\2\2\2\20\22\5\n\6\2\21\20\3\2"+
		"\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\23\3\2"+
		"\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2"+
		"\2\2\32\5\3\2\2\2\33\31\3\2\2\2\34\35\7\3\2\2\35\36\5\b\5\2\36\37\5\2"+
		"\2\2\37 \5\4\3\2 !\7\4\2\2!\7\3\2\2\2\"#\t\2\2\2#\t\3\2\2\2$%\5\f\7\2"+
		"%&\5\16\b\2&\13\3\2\2\2\'(\t\3\2\2(\r\3\2\2\2)*\t\4\2\2*\17\3\2\2\2\4"+
		"\23\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}