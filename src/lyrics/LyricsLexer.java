// Generated from Lyrics.g4 by ANTLR 4.0

package lyrics;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LyricsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WORD=1, UNION_OPER=2, HYPHEN=3, STAR=4, EXTENDER=5, PIPE=6, WHITESPACE=7, 
		LINESPACE=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WORD", "UNION_OPER", "'-'", "'*'", "'_'", "'|'", "' '", "LINESPACE"
	};
	public static final String[] ruleNames = {
		"WORD", "UNION_OPER", "HYPHEN", "STAR", "EXTENDER", "PIPE", "WHITESPACE", 
		"LINESPACE"
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


	public LyricsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lyrics.g4"; }

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
		case 7: LINESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void LINESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\n.\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\3\2\6\2\25\n\2\r\2\16\2\26\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t)\n\t\r\t\16\t*\3\t\3\t\2\n\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\2\3\2\4\n##)+..\60\60\62=AA"+
		"C\\c|\4\13\f\17\17\60\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5\33"+
		"\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r#\3\2\2\2\17%\3\2\2\2"+
		"\21(\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26"+
		"\27\3\2\2\2\27\4\3\2\2\2\30\34\7\u0080\2\2\31\32\7^\2\2\32\34\7/\2\2\33"+
		"\30\3\2\2\2\33\31\3\2\2\2\34\6\3\2\2\2\35\36\7/\2\2\36\b\3\2\2\2\37 \7"+
		",\2\2 \n\3\2\2\2!\"\7a\2\2\"\f\3\2\2\2#$\7~\2\2$\16\3\2\2\2%&\7\"\2\2"+
		"&\20\3\2\2\2\')\t\3\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2"+
		"\2\2,-\b\t\2\2-\22\3\2\2\2\7\2\24\26\33*";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}