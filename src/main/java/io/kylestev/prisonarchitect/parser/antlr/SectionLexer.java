// Generated from Section.g4 by ANTLR 4.4
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
public class SectionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION_BEGIN=1, SECTION_END=2, BOOL=3, NUMBER=4, ID=5, UNDER_SEPARATED_NAME=6, 
		PROPERTY=7, OBJ_PROPERTY=8, ATOM=9, QUOTE=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'"
	};
	public static final String[] ruleNames = {
		"SECTION_BEGIN", "SECTION_END", "BOOL", "NUMBER", "ID", "UNDER_SEPARATED_NAME", 
		"PROPERTY", "OBJ_PROPERTY", "ATOM", "QUOTE", "WS"
	};


	public SectionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrisonSection.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rc\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\6\5\60\n\5\r\5\16\5\61\3\5\3\5\6\5\66"+
		"\n\5\r\5\16\5\67\5\5:\n\5\3\6\6\6=\n\6\r\6\16\6>\3\7\6\7B\n\7\r\7\16\7"+
		"C\3\b\3\b\3\b\3\t\3\t\5\tK\n\t\3\t\6\tN\n\t\r\t\16\tO\3\n\6\nS\n\n\r\n"+
		"\16\nT\3\13\3\13\7\13Y\n\13\f\13\16\13\\\13\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\7\4\2"+
		"C\\c|\6\2\62;C\\aac|\5\2\f\f\17\17\"\"\3\2$$\5\2\13\f\17\17\"\"l\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3"+
		"\2\2\2\5\37\3\2\2\2\7,\3\2\2\2\t/\3\2\2\2\13<\3\2\2\2\rA\3\2\2\2\17E\3"+
		"\2\2\2\21H\3\2\2\2\23R\3\2\2\2\25V\3\2\2\2\27_\3\2\2\2\31\32\7D\2\2\32"+
		"\33\7G\2\2\33\34\7I\2\2\34\35\7K\2\2\35\36\7P\2\2\36\4\3\2\2\2\37 \7G"+
		"\2\2 !\7P\2\2!\"\7F\2\2\"\6\3\2\2\2#$\7v\2\2$%\7t\2\2%&\7w\2\2&-\7g\2"+
		"\2\'(\7h\2\2()\7c\2\2)*\7n\2\2*+\7u\2\2+-\7g\2\2,#\3\2\2\2,\'\3\2\2\2"+
		"-\b\3\2\2\2.\60\4\62;\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\629\3\2\2\2\63\65\7\60\2\2\64\66\4\62;\2\65\64\3\2\2\2\66\67\3\2"+
		"\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\63\3\2\2\29:\3\2\2\2:\n\3\2"+
		"\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\f\3\2\2\2@B\t"+
		"\3\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\16\3\2\2\2EF\7\60\2\2"+
		"FG\5\r\7\2G\20\3\2\2\2HJ\5\13\6\2IK\5\t\5\2JI\3\2\2\2JK\3\2\2\2KM\3\2"+
		"\2\2LN\5\17\b\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\22\3\2\2\2QS"+
		"\n\4\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\24\3\2\2\2VZ\7$\2\2"+
		"WY\n\5\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2"+
		"\2]^\7$\2\2^\26\3\2\2\2_`\t\6\2\2`a\3\2\2\2ab\b\f\2\2b\30\3\2\2\2\r\2"+
		",\61\679>CJOTZ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}