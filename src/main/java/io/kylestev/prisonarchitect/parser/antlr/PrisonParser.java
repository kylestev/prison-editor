// Generated from Prison.g4 by ANTLR 4.4
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
public class PrisonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WL=1, SECTION_BEGIN=2, SECTION_END=3, BOOL=4, NUMBER=5, ID=6, UNDER_SEPARATED_NAME=7, 
		PROPERTY=8, OBJ_PROPERTY=9, ATOM=10, QUOTE=11, WS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "WL", "'BEGIN'", "'END'", "BOOL", "NUMBER", "ID", "UNDER_SEPARATED_NAME", 
		"PROPERTY", "OBJ_PROPERTY", "ATOM", "QUOTE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_attributes = 1, RULE_sections = 2, RULE_section = 3, 
		RULE_section_name = 4, RULE_attr = 5, RULE_attrKey = 6, RULE_attrValue = 7;
	public static final String[] ruleNames = {
		"prog", "attributes", "sections", "section", "section_name", "attr", "attrKey", 
		"attrValue"
	};

	@Override
	public String getGrammarFileName() { return "Prison.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrisonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public SectionsContext sections() {
			return getRuleContext(SectionsContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); attributes();
			setState(17); sections();
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
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << UNDER_SEPARATED_NAME) | (1L << OBJ_PROPERTY) | (1L << QUOTE))) != 0)) {
				{
				{
				setState(19); attr();
				}
				}
				setState(24);
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
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).enterSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).exitSections(this);
		}
	}

	public final SectionsContext sections() throws RecognitionException {
		SectionsContext _localctx = new SectionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SECTION_BEGIN) {
				{
				{
				setState(25); section();
				}
				}
				setState(30);
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
		public TerminalNode SECTION_BEGIN() { return getToken(PrisonParser.SECTION_BEGIN, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Section_nameContext section_name() {
			return getRuleContext(Section_nameContext.class,0);
		}
		public TerminalNode SECTION_END() { return getToken(PrisonParser.SECTION_END, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(SECTION_BEGIN);
			setState(32); section_name();
			setState(33); attributes();
			setState(34); sections();
			setState(35); match(SECTION_END);
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
		public TerminalNode ID() { return getToken(PrisonParser.ID, 0); }
		public TerminalNode UNDER_SEPARATED_NAME() { return getToken(PrisonParser.UNDER_SEPARATED_NAME, 0); }
		public TerminalNode QUOTE() { return getToken(PrisonParser.QUOTE, 0); }
		public Section_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).enterSection_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).exitSection_name(this);
		}
	}

	public final Section_nameContext section_name() throws RecognitionException {
		Section_nameContext _localctx = new Section_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_section_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
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
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); attrKey();
			setState(40); attrValue();
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
		public TerminalNode OBJ_PROPERTY() { return getToken(PrisonParser.OBJ_PROPERTY, 0); }
		public TerminalNode ID() { return getToken(PrisonParser.ID, 0); }
		public TerminalNode UNDER_SEPARATED_NAME() { return getToken(PrisonParser.UNDER_SEPARATED_NAME, 0); }
		public TerminalNode QUOTE() { return getToken(PrisonParser.QUOTE, 0); }
		public AttrKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).enterAttrKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).exitAttrKey(this);
		}
	}

	public final AttrKeyContext attrKey() throws RecognitionException {
		AttrKeyContext _localctx = new AttrKeyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attrKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
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
		public TerminalNode OBJ_PROPERTY() { return getToken(PrisonParser.OBJ_PROPERTY, 0); }
		public TerminalNode ID() { return getToken(PrisonParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(PrisonParser.BOOL, 0); }
		public TerminalNode ATOM() { return getToken(PrisonParser.ATOM, 0); }
		public TerminalNode UNDER_SEPARATED_NAME() { return getToken(PrisonParser.UNDER_SEPARATED_NAME, 0); }
		public TerminalNode NUMBER() { return getToken(PrisonParser.NUMBER, 0); }
		public TerminalNode QUOTE() { return getToken(PrisonParser.QUOTE, 0); }
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).enterAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrisonListener ) ((PrisonListener)listener).exitAttrValue(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\7"+
		"\3\27\n\3\f\3\16\3\32\13\3\3\4\7\4\35\n\4\f\4\16\4 \13\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16"+
		"\20\2\5\4\2\b\t\r\r\5\2\b\t\13\13\r\r\4\2\6\t\13\r*\2\22\3\2\2\2\4\30"+
		"\3\2\2\2\6\36\3\2\2\2\b!\3\2\2\2\n\'\3\2\2\2\f)\3\2\2\2\16,\3\2\2\2\20"+
		".\3\2\2\2\22\23\5\4\3\2\23\24\5\6\4\2\24\3\3\2\2\2\25\27\5\f\7\2\26\25"+
		"\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\30"+
		"\3\2\2\2\33\35\5\b\5\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3"+
		"\2\2\2\37\7\3\2\2\2 \36\3\2\2\2!\"\7\4\2\2\"#\5\n\6\2#$\5\4\3\2$%\5\6"+
		"\4\2%&\7\5\2\2&\t\3\2\2\2\'(\t\2\2\2(\13\3\2\2\2)*\5\16\b\2*+\5\20\t\2"+
		"+\r\3\2\2\2,-\t\3\2\2-\17\3\2\2\2./\t\4\2\2/\21\3\2\2\2\4\30\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}