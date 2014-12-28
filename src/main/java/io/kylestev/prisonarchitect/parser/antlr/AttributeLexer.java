// Generated from Attribute.g4 by ANTLR 4.4
package io.kylestev.prisonarchitect.parser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AttributeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, NUMBER=2, ID=3, UNDER_SEPARATED_NAME=4, PROPERTY=5, OBJ_PROPERTY=6, 
		ATOM=7, QUOTE=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"BOOL", "NUMBER", "ID", "UNDER_SEPARATED_NAME", "PROPERTY", "OBJ_PROPERTY", 
		"ATOM", "QUOTE", "WS"
	};


	public AttributeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Attribute.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13U\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\6\3\"\n\3\r\3\16\3#\3\3\3"+
		"\3\6\3(\n\3\r\3\16\3)\5\3,\n\3\3\4\6\4/\n\4\r\4\16\4\60\3\5\6\5\64\n\5"+
		"\r\5\16\5\65\3\6\3\6\3\6\3\7\3\7\5\7=\n\7\3\7\6\7@\n\7\r\7\16\7A\3\b\6"+
		"\bE\n\b\r\b\16\bF\3\t\3\t\7\tK\n\t\f\t\16\tN\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\7\4\2C\\c|\6"+
		"\2\62;C\\aac|\5\2\f\f\17\17\"\"\3\2$$\5\2\13\f\17\17\"\"^\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\36\3\2\2\2\5!\3\2\2\2\7.\3\2\2\2\t\63"+
		"\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17D\3\2\2\2\21H\3\2\2\2\23Q\3\2\2\2"+
		"\25\26\7v\2\2\26\27\7t\2\2\27\30\7w\2\2\30\37\7g\2\2\31\32\7h\2\2\32\33"+
		"\7c\2\2\33\34\7n\2\2\34\35\7u\2\2\35\37\7g\2\2\36\25\3\2\2\2\36\31\3\2"+
		"\2\2\37\4\3\2\2\2 \"\4\62;\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2"+
		"$+\3\2\2\2%\'\7\60\2\2&(\4\62;\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2"+
		"\2\2*,\3\2\2\2+%\3\2\2\2+,\3\2\2\2,\6\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\b\3\2\2\2\62\64\t\3\2\2\63\62\3"+
		"\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\n\3\2\2\2\678\7\60"+
		"\2\289\5\t\5\29\f\3\2\2\2:<\5\7\4\2;=\5\5\3\2<;\3\2\2\2<=\3\2\2\2=?\3"+
		"\2\2\2>@\5\13\6\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\16\3\2\2\2"+
		"CE\n\4\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\20\3\2\2\2HL\7$\2"+
		"\2IK\n\5\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2"+
		"\2OP\7$\2\2P\22\3\2\2\2QR\t\6\2\2RS\3\2\2\2ST\b\n\2\2T\24\3\2\2\2\r\2"+
		"\36#)+\60\65<AFL\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}