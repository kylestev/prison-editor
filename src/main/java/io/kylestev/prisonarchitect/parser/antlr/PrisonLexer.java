// Generated from Prison.g4 by ANTLR 4.4
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
public class PrisonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WL=1, SECTION_BEGIN=2, SECTION_END=3, BOOL=4, NUMBER=5, ID=6, UNDER_SEPARATED_NAME=7, 
		PROPERTY=8, OBJ_PROPERTY=9, ATOM=10, QUOTE=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"WL", "SECTION_BEGIN", "SECTION_END", "BOOL", "NUMBER", "ID", "UNDER_SEPARATED_NAME", 
		"PROPERTY", "OBJ_PROPERTY", "ATOM", "QUOTE", "WS"
	};


	public PrisonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Prison.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66\n"+
		"\5\3\6\6\69\n\6\r\6\16\6:\3\6\3\6\6\6?\n\6\r\6\16\6@\5\6C\n\6\3\7\6\7"+
		"F\n\7\r\7\16\7G\3\b\6\bK\n\b\r\b\16\bL\3\t\3\t\3\t\3\n\3\n\5\nT\n\n\3"+
		"\n\6\nW\n\n\r\n\16\nX\3\13\6\13\\\n\13\r\13\16\13]\3\f\3\f\7\fb\n\f\f"+
		"\f\16\fe\13\f\3\f\3\f\3\r\3\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\3\2\7\5\2\13\f\17\17\"\"\4\2C\\c|\6\2"+
		"\62;C\\aac|\5\2\f\f\17\17\"\"\3\2$$v\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\34\3\2\2\2\5\"\3\2\2"+
		"\2\7(\3\2\2\2\t\65\3\2\2\2\138\3\2\2\2\rE\3\2\2\2\17J\3\2\2\2\21N\3\2"+
		"\2\2\23Q\3\2\2\2\25[\3\2\2\2\27_\3\2\2\2\31h\3\2\2\2\33\35\t\2\2\2\34"+
		"\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\b"+
		"\2\2\2!\4\3\2\2\2\"#\7D\2\2#$\7G\2\2$%\7I\2\2%&\7K\2\2&\'\7P\2\2\'\6\3"+
		"\2\2\2()\7G\2\2)*\7P\2\2*+\7F\2\2+\b\3\2\2\2,-\7v\2\2-.\7t\2\2./\7w\2"+
		"\2/\66\7g\2\2\60\61\7h\2\2\61\62\7c\2\2\62\63\7n\2\2\63\64\7u\2\2\64\66"+
		"\7g\2\2\65,\3\2\2\2\65\60\3\2\2\2\66\n\3\2\2\2\679\4\62;\28\67\3\2\2\2"+
		"9:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;B\3\2\2\2<>\7\60\2\2=?\4\62;\2>=\3\2\2"+
		"\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B<\3\2\2\2BC\3\2\2\2C\f\3\2"+
		"\2\2DF\t\3\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\16\3\2\2\2IK\t"+
		"\4\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\20\3\2\2\2NO\7\60\2\2"+
		"OP\5\17\b\2P\22\3\2\2\2QS\5\r\7\2RT\5\13\6\2SR\3\2\2\2ST\3\2\2\2TV\3\2"+
		"\2\2UW\5\21\t\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\24\3\2\2\2Z\\"+
		"\n\5\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\26\3\2\2\2_c\7$\2\2"+
		"`b\n\6\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2"+
		"fg\7$\2\2g\30\3\2\2\2hi\t\2\2\2ij\3\2\2\2jk\b\r\2\2k\32\3\2\2\2\16\2\36"+
		"\65:@BGLSX]c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}