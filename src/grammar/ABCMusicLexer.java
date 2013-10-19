// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BASENOTE=2, DIGIT=3, NEWLINE=4, COLON=5, ACCIDENTAL=6, WHITESPACE=7, 
		INDEX=8, TITLE=9, COMPOSER=10, LENGTH=11, METER=12, TEMPO=13, VOICE=14, 
		KEY=15, LYRIC=16, COMMENT=17, PAREN=18, PIPE=19, LBRAC=20, RBRAC=21, NTH_REPEAT=22, 
		OCTAVE=23, SLASH=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'z'", "BASENOTE", "DIGIT", "NEWLINE", "':'", "ACCIDENTAL", "WHITESPACE", 
		"INDEX", "TITLE", "COMPOSER", "LENGTH", "METER", "TEMPO", "VOICE", "KEY", 
		"LYRIC", "COMMENT", "'('", "'|'", "'['", "']'", "NTH_REPEAT", "OCTAVE", 
		"'/'"
	};
	public static final String[] ruleNames = {
		"T__0", "BASENOTE", "DIGIT", "NEWLINE", "COLON", "ACCIDENTAL", "WHITESPACE", 
		"INDEX", "TITLE", "COMPOSER", "LENGTH", "METER", "TEMPO", "VOICE", "KEY", 
		"LYRIC", "COMMENT", "PAREN", "PIPE", "LBRAC", "RBRAC", "NTH_REPEAT", "OCTAVE", 
		"SLASH"
	};


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\32\u00ea\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\3\2\3\2\3\3\3\3\3\4\6\49\n\4\r\4\16\4:\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7H\n\7\3\b\6\bK\n\b\r\b\16\b"+
		"L\3\b\3\b\3\t\3\t\3\t\6\tT\n\t\r\t\16\tU\3\t\3\t\3\n\3\n\3\n\6\n]\n\n"+
		"\r\n\16\n^\3\n\3\n\3\13\3\13\3\13\6\13f\n\13\r\13\16\13g\3\13\3\13\3\f"+
		"\3\f\3\f\6\fo\n\f\r\f\16\fp\3\f\3\f\6\fu\n\f\r\f\16\fv\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\r\3\r\6\r\u0087\n\r\r"+
		"\r\16\r\u0088\3\r\5\r\u008c\n\r\3\16\3\16\3\16\6\16\u0091\n\16\r\16\16"+
		"\16\u0092\3\16\3\16\6\16\u0097\n\16\r\16\16\16\u0098\3\16\3\16\6\16\u009d"+
		"\n\16\r\16\16\16\u009e\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\5\20\u00ac\n\20\3\20\5\20\u00af\n\20\3\20\3\20\3\21\3\21\3\21"+
		"\6\21\u00b6\n\21\r\21\16\21\u00b7\3\21\7\21\u00bb\n\21\f\21\16\21\u00be"+
		"\13\21\3\21\6\21\u00c1\n\21\r\21\16\21\u00c2\5\21\u00c5\n\21\3\22\3\22"+
		"\6\22\u00c9\n\22\r\22\16\22\u00ca\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00db\n\27\3\30\6\30\u00de\n\30"+
		"\r\30\16\30\u00df\3\30\6\30\u00e3\n\30\r\30\16\30\u00e4\5\30\u00e7\n\30"+
		"\3\31\3\31\2\32\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\2\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\3\2 \4CIci\3\62;\3\f\f\5\13\13"+
		"\17\17\"\"\3\62;\3\f\f\t##%%(+\60\60AAC\\c|\3\f\f\7))\60\60\62;C\\c|\3"+
		"\f\f\3\62;\3\62;\3\f\f\3\62;\3\62;\3\f\f\3\62;\3\62;\3\62;\3\f\f\5\62"+
		";C\\c|\3\f\f\4CIci\5%%))dd\3\f\f\b)),,//aa~~\u0080\u0080\b)),,//aa~~\u0080"+
		"\u0080\b##))\60\60AAC\\c|\r##)),,/\60\62;AAC\\aac|~~\u0080\u0080\3\f\f"+
		"\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\78\3\2\2\2\t<\3\2\2\2"+
		"\13>\3\2\2\2\rG\3\2\2\2\17J\3\2\2\2\21P\3\2\2\2\23Y\3\2\2\2\25b\3\2\2"+
		"\2\27k\3\2\2\2\31\u008b\3\2\2\2\33\u008d\3\2\2\2\35\u00a2\3\2\2\2\37\u00a7"+
		"\3\2\2\2!\u00c4\3\2\2\2#\u00c6\3\2\2\2%\u00ce\3\2\2\2\'\u00d0\3\2\2\2"+
		")\u00d2\3\2\2\2+\u00d4\3\2\2\2-\u00da\3\2\2\2/\u00e6\3\2\2\2\61\u00e8"+
		"\3\2\2\2\63\64\7|\2\2\64\4\3\2\2\2\65\66\t\2\2\2\66\6\3\2\2\2\679\t\3"+
		"\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\b\3\2\2\2<=\t\4\2\2=\n"+
		"\3\2\2\2>?\7<\2\2?\f\3\2\2\2@H\7`\2\2AB\7`\2\2BH\7`\2\2CH\7a\2\2DE\7a"+
		"\2\2EH\7a\2\2FH\7?\2\2G@\3\2\2\2GA\3\2\2\2GC\3\2\2\2GD\3\2\2\2GF\3\2\2"+
		"\2H\16\3\2\2\2IK\t\5\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2"+
		"\2\2NO\b\b\2\2O\20\3\2\2\2PQ\7Z\2\2QS\7<\2\2RT\t\6\2\2SR\3\2\2\2TU\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\t\7\2\2X\22\3\2\2\2YZ\7V\2\2Z\\\7"+
		"<\2\2[]\t\b\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a"+
		"\t\t\2\2a\24\3\2\2\2bc\7E\2\2ce\7<\2\2df\t\n\2\2ed\3\2\2\2fg\3\2\2\2g"+
		"e\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\t\13\2\2j\26\3\2\2\2kl\7N\2\2ln\7<\2\2"+
		"mo\t\f\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rt\7\61\2"+
		"\2su\t\r\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\t\16"+
		"\2\2y\30\3\2\2\2z{\7O\2\2{|\7<\2\2|\u008c\7E\2\2}~\7E\2\2~\u008c\7~\2"+
		"\2\177\u0081\t\17\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\7\61\2\2"+
		"\u0085\u0087\t\20\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\t\21\2\2"+
		"\u008bz\3\2\2\2\u008b}\3\2\2\2\u008b\u0080\3\2\2\2\u008c\32\3\2\2\2\u008d"+
		"\u008e\7S\2\2\u008e\u0090\7<\2\2\u008f\u0091\t\22\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\7\61\2\2\u0095\u0097\t\23\2\2\u0096\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\7?\2\2\u009b\u009d\t\24\2\2\u009c\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\t\25\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7X\2"+
		"\2\u00a3\u00a4\7<\2\2\u00a4\u00a5\t\26\2\2\u00a5\u00a6\t\27\2\2\u00a6"+
		"\36\3\2\2\2\u00a7\u00a8\7M\2\2\u00a8\u00a9\7<\2\2\u00a9\u00ab\t\30\2\2"+
		"\u00aa\u00ac\t\31\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00af\7o\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\t\32\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7y\2\2"+
		"\u00b3\u00b5\7<\2\2\u00b4\u00b6\t\33\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c5\3\2\2\2\u00b9"+
		"\u00bb\t\34\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\t\35\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b2\3\2\2\2\u00c4"+
		"\u00bc\3\2\2\2\u00c5\"\3\2\2\2\u00c6\u00c8\7\'\2\2\u00c7\u00c9\t\36\2"+
		"\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\t\37\2\2\u00cd$\3\2\2\2\u00ce"+
		"\u00cf\7*\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7~\2\2\u00d1(\3\2\2\2\u00d2\u00d3"+
		"\7]\2\2\u00d3*\3\2\2\2\u00d4\u00d5\7_\2\2\u00d5,\3\2\2\2\u00d6\u00d7\7"+
		"]\2\2\u00d7\u00db\7\63\2\2\u00d8\u00d9\7]\2\2\u00d9\u00db\7\64\2\2\u00da"+
		"\u00d6\3\2\2\2\u00da\u00d8\3\2\2\2\u00db.\3\2\2\2\u00dc\u00de\7)\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e7\3\2\2\2\u00e1\u00e3\7.\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7\60\3\2\2\2\u00e8\u00e9"+
		"\7\61\2\2\u00e9\62\3\2\2\2\34\2:GLU^gpv\u0082\u0088\u008b\u0092\u0098"+
		"\u009e\u00ab\u00ae\u00b7\u00bc\u00c2\u00c4\u00ca\u00da\u00df\u00e4\u00e6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}