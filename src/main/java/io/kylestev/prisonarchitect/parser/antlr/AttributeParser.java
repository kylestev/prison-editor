// Generated from Attribute.g4 by ANTLR 4.4
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
public class AttributeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, NUMBER=2, ID=3, UNDER_SEPARATED_NAME=4, PROPERTY=5, OBJ_PROPERTY=6, 
		ATOM=7, QUOTE=8, WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "BOOL", "NUMBER", "ID", "UNDER_SEPARATED_NAME", "PROPERTY", 
		"OBJ_PROPERTY", "ATOM", "QUOTE", "WS"
	};
	public static final int
		RULE_attr = 0, RULE_attrKey = 1, RULE_attrValue = 2;
	public static final String[] ruleNames = {
		"attr", "attrKey", "attrValue"
	};

	@Override
	public String getGrammarFileName() { return "Attribute.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AttributeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof AttributeListener ) ((AttributeListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributeListener ) ((AttributeListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); attrKey();
			setState(7); attrValue();
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
		public TerminalNode OBJ_PROPERTY() { return getToken(AttributeParser.OBJ_PROPERTY, 0); }
		public TerminalNode ID() { return getToken(AttributeParser.ID, 0); }
		public TerminalNode UNDER_SEPARATED_NAME() { return getToken(AttributeParser.UNDER_SEPARATED_NAME, 0); }
		public TerminalNode QUOTE() { return getToken(AttributeParser.QUOTE, 0); }
		public AttrKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributeListener ) ((AttributeListener)listener).enterAttrKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributeListener ) ((AttributeListener)listener).exitAttrKey(this);
		}
	}

	public final AttrKeyContext attrKey() throws RecognitionException {
		AttrKeyContext _localctx = new AttrKeyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_attrKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
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
		public TerminalNode OBJ_PROPERTY() { return getToken(AttributeParser.OBJ_PROPERTY, 0); }
		public TerminalNode ID() { return getToken(AttributeParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(AttributeParser.BOOL, 0); }
		public TerminalNode ATOM() { return getToken(AttributeParser.ATOM, 0); }
		public TerminalNode UNDER_SEPARATED_NAME() { return getToken(AttributeParser.UNDER_SEPARATED_NAME, 0); }
		public TerminalNode NUMBER() { return getToken(AttributeParser.NUMBER, 0); }
		public TerminalNode QUOTE() { return getToken(AttributeParser.QUOTE, 0); }
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AttributeListener ) ((AttributeListener)listener).enterAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AttributeListener ) ((AttributeListener)listener).exitAttrValue(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\20\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\4\5\2\5\6\b"+
		"\b\n\n\4\2\3\6\b\n\f\2\b\3\2\2\2\4\13\3\2\2\2\6\r\3\2\2\2\b\t\5\4\3\2"+
		"\t\n\5\6\4\2\n\3\3\2\2\2\13\f\t\2\2\2\f\5\3\2\2\2\r\16\t\3\2\2\16\7\3"+
		"\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}