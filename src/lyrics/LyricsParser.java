// Generated from Lyrics.g4 by ANTLR 4.0

package lyrics;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LyricsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WORD=1, UNION_OPER=2, DOUBHYPHEN=3, HYPHEN=4, STARS=5, EXTENDERS=6, PIPE=7, 
		WHITESPACE=8, LINESPACE=9;
	public static final String[] tokenNames = {
		"<INVALID>", "WORD", "UNION_OPER", "'--'", "'-'", "STARS", "EXTENDERS", 
		"'|'", "' '", "LINESPACE"
	};
	public static final int
		RULE_lyric = 0, RULE_measure = 1, RULE_cluster = 2, RULE_syllable_cluster = 3, 
		RULE_syllable = 4;
	public static final String[] ruleNames = {
		"lyric", "measure", "cluster", "syllable_cluster", "syllable"
	};

	@Override
	public String getGrammarFileName() { return "Lyrics.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public LyricsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LyricContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(LyricsParser.WHITESPACE); }
		public List<MeasureContext> measure() {
			return getRuleContexts(MeasureContext.class);
		}
		public TerminalNode EOF() { return getToken(LyricsParser.EOF, 0); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LyricsParser.WHITESPACE, i);
		}
		public MeasureContext measure(int i) {
			return getRuleContext(MeasureContext.class,i);
		}
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lyric);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(10); measure();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(13); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(15); match(WHITESPACE);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21); match(EOF);
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

	public static class MeasureContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(LyricsParser.WHITESPACE); }
		public List<TerminalNode> PIPE() { return getTokens(LyricsParser.PIPE); }
		public ClusterContext cluster(int i) {
			return getRuleContext(ClusterContext.class,i);
		}
		public TerminalNode PIPE(int i) {
			return getToken(LyricsParser.PIPE, i);
		}
		public List<ClusterContext> cluster() {
			return getRuleContexts(ClusterContext.class);
		}
		public TerminalNode WHITESPACE(int i) {
			return getToken(LyricsParser.WHITESPACE, i);
		}
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).exitMeasure(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_measure);
		int _la;
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(23); match(PIPE);
					}
				}

				setState(27);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(26); match(WHITESPACE);
					}
				}

				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29); cluster();
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD || _la==STARS );
				setState(34); match(WHITESPACE);
				setState(36);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(35); match(PIPE);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(38); match(PIPE);
					}
				}

				setState(42);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(41); match(WHITESPACE);
					}
				}

				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44); cluster();
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD || _la==STARS );
				setState(50);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(49); match(WHITESPACE);
					}
				}

				setState(52); match(PIPE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54); match(PIPE);
				setState(56);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(55); match(WHITESPACE);
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

	public static class ClusterContext extends ParserRuleContext {
		public TerminalNode STARS() { return getToken(LyricsParser.STARS, 0); }
		public Syllable_clusterContext syllable_cluster() {
			return getRuleContext(Syllable_clusterContext.class,0);
		}
		public ClusterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cluster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).enterCluster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).exitCluster(this);
		}
	}

	public final ClusterContext cluster() throws RecognitionException {
		ClusterContext _localctx = new ClusterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cluster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(60); syllable_cluster();
				}
				break;
			case STARS:
				{
				setState(61); match(STARS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Syllable_clusterContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(LyricsParser.WHITESPACE, 0); }
		public TerminalNode DOUBHYPHEN() { return getToken(LyricsParser.DOUBHYPHEN, 0); }
		public TerminalNode EXTENDERS() { return getToken(LyricsParser.EXTENDERS, 0); }
		public TerminalNode HYPHEN() { return getToken(LyricsParser.HYPHEN, 0); }
		public TerminalNode UNION_OPER() { return getToken(LyricsParser.UNION_OPER, 0); }
		public Syllable_clusterContext syllable_cluster() {
			return getRuleContext(Syllable_clusterContext.class,0);
		}
		public SyllableContext syllable() {
			return getRuleContext(SyllableContext.class,0);
		}
		public Syllable_clusterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syllable_cluster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).enterSyllable_cluster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).exitSyllable_cluster(this);
		}
	}

	public final Syllable_clusterContext syllable_cluster() throws RecognitionException {
		Syllable_clusterContext _localctx = new Syllable_clusterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_syllable_cluster);
		int _la;
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); syllable();
				setState(66);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(65); match(WHITESPACE);
					}
				}

				setState(68); match(HYPHEN);
				setState(71);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(69); syllable_cluster();
					}
					break;
				case EXTENDERS:
					{
					setState(70); match(EXTENDERS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); syllable();
				setState(74); match(DOUBHYPHEN);
				setState(77);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(75); syllable_cluster();
					}
					break;
				case EXTENDERS:
					{
					setState(76); match(EXTENDERS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); syllable();
				setState(80); match(UNION_OPER);
				setState(81); syllable_cluster();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83); syllable();
				setState(84); match(EXTENDERS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86); syllable();
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

	public static class SyllableContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(LyricsParser.WORD, 0); }
		public SyllableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syllable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).enterSyllable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).exitSyllable(this);
		}
	}

	public final SyllableContext syllable() throws RecognitionException {
		SyllableContext _localctx = new SyllableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_syllable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(WORD);
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
		"\2\3\13^\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16"+
		"\2\17\3\2\7\2\23\n\2\f\2\16\2\26\13\2\3\2\3\2\3\3\5\3\33\n\3\3\3\5\3\36"+
		"\n\3\3\3\6\3!\n\3\r\3\16\3\"\3\3\3\3\5\3\'\n\3\3\3\5\3*\n\3\3\3\5\3-\n"+
		"\3\3\3\6\3\60\n\3\r\3\16\3\61\3\3\5\3\65\n\3\3\3\3\3\3\3\3\3\5\3;\n\3"+
		"\5\3=\n\3\3\4\3\4\5\4A\n\4\3\5\3\5\5\5E\n\5\3\5\3\5\3\5\5\5J\n\5\3\5\3"+
		"\5\3\5\3\5\5\5P\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3"+
		"\6\2\7\2\4\6\b\n\2\2m\2\r\3\2\2\2\4<\3\2\2\2\6@\3\2\2\2\bY\3\2\2\2\n["+
		"\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2"+
		"\2\2\20\24\3\2\2\2\21\23\7\n\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2"+
		"\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2\2\27\30\7\1\2\2\30\3\3\2"+
		"\2\2\31\33\7\t\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\36\7\n"+
		"\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37!\5\6\4\2 \37\3\2\2\2!"+
		"\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$&\7\n\2\2%\'\7\t\2\2&%\3\2"+
		"\2\2&\'\3\2\2\2\'=\3\2\2\2(*\7\t\2\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\7"+
		"\n\2\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\61\3\2\2"+
		"\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\65\7\n\2\2\64\63\3\2\2\2"+
		"\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\t\2\2\67=\3\2\2\28:\7\t\2\29;\7\n"+
		"\2\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<\32\3\2\2\2<)\3\2\2\2<8\3\2\2\2=\5"+
		"\3\2\2\2>A\5\b\5\2?A\7\7\2\2@>\3\2\2\2@?\3\2\2\2A\7\3\2\2\2BD\5\n\6\2"+
		"CE\7\n\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FI\7\6\2\2GJ\5\b\5\2HJ\7\b\2\2"+
		"IG\3\2\2\2IH\3\2\2\2JZ\3\2\2\2KL\5\n\6\2LO\7\5\2\2MP\5\b\5\2NP\7\b\2\2"+
		"OM\3\2\2\2ON\3\2\2\2PZ\3\2\2\2QR\5\n\6\2RS\7\4\2\2ST\5\b\5\2TZ\3\2\2\2"+
		"UV\5\n\6\2VW\7\b\2\2WZ\3\2\2\2XZ\5\n\6\2YB\3\2\2\2YK\3\2\2\2YQ\3\2\2\2"+
		"YU\3\2\2\2YX\3\2\2\2Z\t\3\2\2\2[\\\7\3\2\2\\\13\3\2\2\2\23\17\24\32\35"+
		"\"&),\61\64:<@DIOY";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}