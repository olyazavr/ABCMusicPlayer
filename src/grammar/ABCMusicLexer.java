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
		T__44=1, T__43=2, T__42=3, T__41=4, T__40=5, T__39=6, T__38=7, T__37=8, 
		T__36=9, T__35=10, T__34=11, T__33=12, T__32=13, T__31=14, T__30=15, T__29=16, 
		T__28=17, T__27=18, T__26=19, T__25=20, T__24=21, T__23=22, T__22=23, 
		T__21=24, T__20=25, T__19=26, T__18=27, T__17=28, T__16=29, T__15=30, 
		T__14=31, T__13=32, T__12=33, T__11=34, T__10=35, T__9=36, T__8=37, T__7=38, 
		T__6=39, T__5=40, T__4=41, T__3=42, T__2=43, T__1=44, T__0=45, DIGIT=46, 
		NEWLINE=47, COLON=48, ACCIDENTAL=49, TEXT=50, WHITESPACE=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'b'", "']'", "'C'", "'E'", "','", "'['", "'-'", "'*'", "'('", "'A'", 
		"'d'", "'w'", "'f'", "'''", "'|]'", "'G'", "'-'", "'Q'", "'K'", "'M'", 
		"'[2'", "'%'", "'a'", "'D'", "'_'", "'B'", "'c'", "'X'", "'='", "'[|'", 
		"'e'", "'||'", "'m'", "'z'", "'V'", "'F'", "'/'", "'[1'", "'~'", "'#'", 
		"'C|'", "'|'", "'T'", "'g'", "'L'", "DIGIT", "NEWLINE", "':'", "ACCIDENTAL", 
		"TEXT", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__44", "T__43", "T__42", "T__41", "T__40", "T__39", "T__38", "T__37", 
		"T__36", "T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", 
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "DIGIT", "NEWLINE", "COLON", "ACCIDENTAL", 
		"TEXT", "WHITESPACE"
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
		case 50: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\65\u00e8\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\6/\u00cc\n/\r/\16/\u00cd\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\5\62\u00db\n\62\3\63\6\63\u00de\n\63\r\63\16\63"+
		"\u00df\3\64\6\64\u00e3\n\64\r\64\16\64\u00e4\3\64\3\64\2\65\3\3\1\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63"+
		"\1e\64\1g\65\2\3\2\6\3\62;\3\f\f\t##%%(+\60\60AAC\\c|\5\13\13\17\17\""+
		"\"\u00ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2"+
		"\7m\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\rs\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2"+
		"\23y\3\2\2\2\25{\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u0081\3\2\2\2\35"+
		"\u0083\3\2\2\2\37\u0085\3\2\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\u008d\3"+
		"\2\2\2\'\u008f\3\2\2\2)\u0091\3\2\2\2+\u0093\3\2\2\2-\u0096\3\2\2\2/\u0098"+
		"\3\2\2\2\61\u009a\3\2\2\2\63\u009c\3\2\2\2\65\u009e\3\2\2\2\67\u00a0\3"+
		"\2\2\29\u00a2\3\2\2\2;\u00a4\3\2\2\2=\u00a6\3\2\2\2?\u00a9\3\2\2\2A\u00ab"+
		"\3\2\2\2C\u00ae\3\2\2\2E\u00b0\3\2\2\2G\u00b2\3\2\2\2I\u00b4\3\2\2\2K"+
		"\u00b6\3\2\2\2M\u00b8\3\2\2\2O\u00bb\3\2\2\2Q\u00bd\3\2\2\2S\u00bf\3\2"+
		"\2\2U\u00c2\3\2\2\2W\u00c4\3\2\2\2Y\u00c6\3\2\2\2[\u00c8\3\2\2\2]\u00cb"+
		"\3\2\2\2_\u00cf\3\2\2\2a\u00d1\3\2\2\2c\u00da\3\2\2\2e\u00dd\3\2\2\2g"+
		"\u00e2\3\2\2\2ij\7d\2\2j\4\3\2\2\2kl\7_\2\2l\6\3\2\2\2mn\7E\2\2n\b\3\2"+
		"\2\2op\7G\2\2p\n\3\2\2\2qr\7.\2\2r\f\3\2\2\2st\7]\2\2t\16\3\2\2\2uv\7"+
		"/\2\2v\20\3\2\2\2wx\7,\2\2x\22\3\2\2\2yz\7*\2\2z\24\3\2\2\2{|\7C\2\2|"+
		"\26\3\2\2\2}~\7f\2\2~\30\3\2\2\2\177\u0080\7y\2\2\u0080\32\3\2\2\2\u0081"+
		"\u0082\7h\2\2\u0082\34\3\2\2\2\u0083\u0084\7)\2\2\u0084\36\3\2\2\2\u0085"+
		"\u0086\7~\2\2\u0086\u0087\7_\2\2\u0087 \3\2\2\2\u0088\u0089\7I\2\2\u0089"+
		"\"\3\2\2\2\u008a\u008b\7^\2\2\u008b\u008c\7/\2\2\u008c$\3\2\2\2\u008d"+
		"\u008e\7S\2\2\u008e&\3\2\2\2\u008f\u0090\7M\2\2\u0090(\3\2\2\2\u0091\u0092"+
		"\7O\2\2\u0092*\3\2\2\2\u0093\u0094\7]\2\2\u0094\u0095\7\64\2\2\u0095,"+
		"\3\2\2\2\u0096\u0097\7\'\2\2\u0097.\3\2\2\2\u0098\u0099\7c\2\2\u0099\60"+
		"\3\2\2\2\u009a\u009b\7F\2\2\u009b\62\3\2\2\2\u009c\u009d\7a\2\2\u009d"+
		"\64\3\2\2\2\u009e\u009f\7D\2\2\u009f\66\3\2\2\2\u00a0\u00a1\7e\2\2\u00a1"+
		"8\3\2\2\2\u00a2\u00a3\7Z\2\2\u00a3:\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5<"+
		"\3\2\2\2\u00a6\u00a7\7]\2\2\u00a7\u00a8\7~\2\2\u00a8>\3\2\2\2\u00a9\u00aa"+
		"\7g\2\2\u00aa@\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac\u00ad\7~\2\2\u00adB\3"+
		"\2\2\2\u00ae\u00af\7o\2\2\u00afD\3\2\2\2\u00b0\u00b1\7|\2\2\u00b1F\3\2"+
		"\2\2\u00b2\u00b3\7X\2\2\u00b3H\3\2\2\2\u00b4\u00b5\7H\2\2\u00b5J\3\2\2"+
		"\2\u00b6\u00b7\7\61\2\2\u00b7L\3\2\2\2\u00b8\u00b9\7]\2\2\u00b9\u00ba"+
		"\7\63\2\2\u00baN\3\2\2\2\u00bb\u00bc\7\u0080\2\2\u00bcP\3\2\2\2\u00bd"+
		"\u00be\7%\2\2\u00beR\3\2\2\2\u00bf\u00c0\7E\2\2\u00c0\u00c1\7~\2\2\u00c1"+
		"T\3\2\2\2\u00c2\u00c3\7~\2\2\u00c3V\3\2\2\2\u00c4\u00c5\7V\2\2\u00c5X"+
		"\3\2\2\2\u00c6\u00c7\7i\2\2\u00c7Z\3\2\2\2\u00c8\u00c9\7N\2\2\u00c9\\"+
		"\3\2\2\2\u00ca\u00cc\t\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce^\3\2\2\2\u00cf\u00d0\t\3\2\2"+
		"\u00d0`\3\2\2\2\u00d1\u00d2\7<\2\2\u00d2b\3\2\2\2\u00d3\u00db\7`\2\2\u00d4"+
		"\u00d5\7`\2\2\u00d5\u00db\7`\2\2\u00d6\u00db\7a\2\2\u00d7\u00d8\7a\2\2"+
		"\u00d8\u00db\7a\2\2\u00d9\u00db\7?\2\2\u00da\u00d3\3\2\2\2\u00da\u00d4"+
		"\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"d\3\2\2\2\u00dc\u00de\t\4\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0f\3\2\2\2\u00e1\u00e3\t"+
		"\5\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\64\2\2\u00e7h\3\2\2\2"+
		"\7\2\u00cd\u00da\u00df\u00e4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}