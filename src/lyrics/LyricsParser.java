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
		WORD=1, UNION_OPER=2, HYPHEN=3, STAR=4, EXTENDER=5, PIPE=6, WHITESPACE=7, 
		LINESPACE=8;
	public static final String[] tokenNames = {
		"<INVALID>", "WORD", "UNION_OPER", "'-'", "'*'", "'_'", "'|'", "' '", 
		"LINESPACE"
	};
	public static final int
		RULE_lyric = 0, RULE_measure = 1, RULE_cluster = 2, RULE_syllable_cluster = 3, 
		RULE_hyphen_cluster = 4, RULE_star_cluster = 5, RULE_extender_cluster = 6, 
		RULE_syllable = 7;
	public static final String[] ruleNames = {
		"lyric", "measure", "cluster", "syllable_cluster", "hyphen_cluster", "star_cluster", 
		"extender_cluster", "syllable"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16); measure();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << HYPHEN) | (1L << STAR) | (1L << EXTENDER) | (1L << PIPE))) != 0) );
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(21); match(WHITESPACE);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27); match(EOF);
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
		public TerminalNode WHITESPACE() { return getToken(LyricsParser.WHITESPACE, 0); }
		public TerminalNode PIPE() { return getToken(LyricsParser.PIPE, 0); }
		public ClusterContext cluster(int i) {
			return getRuleContext(ClusterContext.class,i);
		}
		public List<ClusterContext> cluster() {
			return getRuleContexts(ClusterContext.class);
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
		try {
			int _alt;
			setState(44);
			switch (_input.LA(1)) {
			case WORD:
			case HYPHEN:
			case STAR:
			case EXTENDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(29); cluster();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(32); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(35);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(34); match(WHITESPACE);
					}
					break;
				}
				setState(38);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(37); match(PIPE);
					}
					break;
				}
				}
				break;
			case PIPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); match(PIPE);
				setState(42);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(41); match(WHITESPACE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode WHITESPACE() { return getToken(LyricsParser.WHITESPACE, 0); }
		public Star_clusterContext star_cluster() {
			return getRuleContext(Star_clusterContext.class,0);
		}
		public Hyphen_clusterContext hyphen_cluster() {
			return getRuleContext(Hyphen_clusterContext.class,0);
		}
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
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(46); syllable_cluster();
				}
				break;

			case 2:
				{
				setState(47); hyphen_cluster();
				}
				break;

			case 3:
				{
				setState(48); star_cluster();
				}
				break;
			}
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(51); match(WHITESPACE);
				}
				break;
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
		public Star_clusterContext star_cluster() {
			return getRuleContext(Star_clusterContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(LyricsParser.WHITESPACE, 0); }
		public Extender_clusterContext extender_cluster() {
			return getRuleContext(Extender_clusterContext.class,0);
		}
		public TerminalNode STAR() { return getToken(LyricsParser.STAR, 0); }
		public Hyphen_clusterContext hyphen_cluster() {
			return getRuleContext(Hyphen_clusterContext.class,0);
		}
		public TerminalNode HYPHEN() { return getToken(LyricsParser.HYPHEN, 0); }
		public TerminalNode EXTENDER() { return getToken(LyricsParser.EXTENDER, 0); }
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
		try {
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54); syllable();
				setState(55); match(HYPHEN);
				setState(59);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(56); syllable_cluster();
					}
					break;

				case 2:
					{
					setState(57); hyphen_cluster();
					}
					break;

				case 3:
					{
					setState(58); extender_cluster();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); syllable();
				setState(62); match(WHITESPACE);
				setState(63); match(HYPHEN);
				setState(67);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(64); syllable_cluster();
					}
					break;

				case 2:
					{
					setState(65); hyphen_cluster();
					}
					break;

				case 3:
					{
					setState(66); extender_cluster();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69); syllable();
				setState(70); match(STAR);
				setState(73);
				switch (_input.LA(1)) {
				case WORD:
				case EXTENDER:
					{
					setState(71); syllable_cluster();
					}
					break;
				case HYPHEN:
				case STAR:
					{
					setState(72); star_cluster();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); syllable();
				setState(76); match(UNION_OPER);
				setState(77); syllable_cluster();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79); syllable();
				setState(80); match(EXTENDER);
				setState(83);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(81); syllable_cluster();
					}
					break;

				case 2:
					{
					setState(82); extender_cluster();
					}
					break;
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(85); syllable();
					}
					break;
				case EXTENDER:
					{
					setState(86); match(EXTENDER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(89); match(WHITESPACE);
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

	public static class Hyphen_clusterContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(LyricsParser.WHITESPACE, 0); }
		public TerminalNode HYPHEN() { return getToken(LyricsParser.HYPHEN, 0); }
		public Syllable_clusterContext syllable_cluster() {
			return getRuleContext(Syllable_clusterContext.class,0);
		}
		public Hyphen_clusterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyphen_cluster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).enterHyphen_cluster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).exitHyphen_cluster(this);
		}
	}

	public final Hyphen_clusterContext hyphen_cluster() throws RecognitionException {
		Hyphen_clusterContext _localctx = new Hyphen_clusterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hyphen_cluster);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); syllable_cluster();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(HYPHEN);
				setState(96); syllable_cluster();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); match(HYPHEN);
				setState(99);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(98); match(WHITESPACE);
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

	public static class Star_clusterContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(LyricsParser.WHITESPACE, 0); }
		public TerminalNode STAR() { return getToken(LyricsParser.STAR, 0); }
		public TerminalNode HYPHEN() { return getToken(LyricsParser.HYPHEN, 0); }
		public ClusterContext cluster() {
			return getRuleContext(ClusterContext.class,0);
		}
		public Syllable_clusterContext syllable_cluster() {
			return getRuleContext(Syllable_clusterContext.class,0);
		}
		public Star_clusterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_cluster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).enterStar_cluster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).exitStar_cluster(this);
		}
	}

	public final Star_clusterContext star_cluster() throws RecognitionException {
		Star_clusterContext _localctx = new Star_clusterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_star_cluster);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(HYPHEN);
				setState(104); syllable_cluster();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(STAR);
				setState(106); cluster();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); match(STAR);
				setState(109);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(108); match(WHITESPACE);
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

	public static class Extender_clusterContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(LyricsParser.WHITESPACE, 0); }
		public TerminalNode HYPHEN() { return getToken(LyricsParser.HYPHEN, 0); }
		public TerminalNode EXTENDER() { return getToken(LyricsParser.EXTENDER, 0); }
		public ClusterContext cluster() {
			return getRuleContext(ClusterContext.class,0);
		}
		public Extender_clusterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extender_cluster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).enterExtender_cluster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LyricsListener ) ((LyricsListener)listener).exitExtender_cluster(this);
		}
	}

	public final Extender_clusterContext extender_cluster() throws RecognitionException {
		Extender_clusterContext _localctx = new Extender_clusterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_extender_cluster);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case HYPHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(HYPHEN);
				setState(114); cluster();
				}
				break;
			case EXTENDER:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); match(EXTENDER);
				setState(117);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(116); match(WHITESPACE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 14, RULE_syllable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(WORD);
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
		"\2\3\n~\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\3\2\6\2\24\n\2\r\2\16\2\25\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2"+
		"\3\3\6\3!\n\3\r\3\16\3\"\3\3\5\3&\n\3\3\3\5\3)\n\3\3\3\3\3\5\3-\n\3\5"+
		"\3/\n\3\3\4\3\4\3\4\5\4\64\n\4\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\5\5"+
		">\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5F\n\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5V\n\5\3\5\3\5\5\5Z\n\5\3\5\5\5]\n\5\5\5"+
		"_\n\5\3\6\3\6\3\6\3\6\3\6\5\6f\n\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7p\n\7\5\7r\n\7\3\b\3\b\3\b\3\b\5\bx\n\b\5\bz\n\b\3\t\3\t\3\t\2\n\2\4"+
		"\6\b\n\f\16\20\2\2\u0094\2\23\3\2\2\2\4.\3\2\2\2\6\63\3\2\2\2\b^\3\2\2"+
		"\2\ng\3\2\2\2\fq\3\2\2\2\16y\3\2\2\2\20{\3\2\2\2\22\24\5\4\3\2\23\22\3"+
		"\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\32\3\2\2\2\27\31\7"+
		"\t\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3"+
		"\2\2\2\34\32\3\2\2\2\35\36\7\1\2\2\36\3\3\2\2\2\37!\5\6\4\2 \37\3\2\2"+
		"\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$&\7\t\2\2%$\3\2\2\2%&\3"+
		"\2\2\2&(\3\2\2\2\')\7\b\2\2(\'\3\2\2\2()\3\2\2\2)/\3\2\2\2*,\7\b\2\2+"+
		"-\7\t\2\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2. \3\2\2\2.*\3\2\2\2/\5\3\2\2\2"+
		"\60\64\5\b\5\2\61\64\5\n\6\2\62\64\5\f\7\2\63\60\3\2\2\2\63\61\3\2\2\2"+
		"\63\62\3\2\2\2\64\66\3\2\2\2\65\67\7\t\2\2\66\65\3\2\2\2\66\67\3\2\2\2"+
		"\67\7\3\2\2\289\5\20\t\29=\7\5\2\2:>\5\b\5\2;>\5\n\6\2<>\5\16\b\2=:\3"+
		"\2\2\2=;\3\2\2\2=<\3\2\2\2>_\3\2\2\2?@\5\20\t\2@A\7\t\2\2AE\7\5\2\2BF"+
		"\5\b\5\2CF\5\n\6\2DF\5\16\b\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F_\3\2\2\2"+
		"GH\5\20\t\2HK\7\6\2\2IL\5\b\5\2JL\5\f\7\2KI\3\2\2\2KJ\3\2\2\2L_\3\2\2"+
		"\2MN\5\20\t\2NO\7\4\2\2OP\5\b\5\2P_\3\2\2\2QR\5\20\t\2RU\7\7\2\2SV\5\b"+
		"\5\2TV\5\16\b\2US\3\2\2\2UT\3\2\2\2V_\3\2\2\2WZ\5\20\t\2XZ\7\7\2\2YW\3"+
		"\2\2\2YX\3\2\2\2Z\\\3\2\2\2[]\7\t\2\2\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2"+
		"^8\3\2\2\2^?\3\2\2\2^G\3\2\2\2^M\3\2\2\2^Q\3\2\2\2^Y\3\2\2\2_\t\3\2\2"+
		"\2`h\5\b\5\2ab\7\5\2\2bh\5\b\5\2ce\7\5\2\2df\7\t\2\2ed\3\2\2\2ef\3\2\2"+
		"\2fh\3\2\2\2g`\3\2\2\2ga\3\2\2\2gc\3\2\2\2h\13\3\2\2\2ij\7\5\2\2jr\5\b"+
		"\5\2kl\7\6\2\2lr\5\6\4\2mo\7\6\2\2np\7\t\2\2on\3\2\2\2op\3\2\2\2pr\3\2"+
		"\2\2qi\3\2\2\2qk\3\2\2\2qm\3\2\2\2r\r\3\2\2\2st\7\5\2\2tz\5\6\4\2uw\7"+
		"\7\2\2vx\7\t\2\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2ys\3\2\2\2yu\3\2\2\2z\17"+
		"\3\2\2\2{|\7\3\2\2|\21\3\2\2\2\30\25\32\"%(,.\63\66=EKUY\\^egoqwy";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}