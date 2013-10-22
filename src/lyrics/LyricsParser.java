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
		RULE_lyric = 0, RULE_measure = 1, RULE_syllable_cluster = 2, RULE_hyphen_cluster = 3, 
		RULE_star_cluster = 4, RULE_extender_cluster = 5, RULE_syllable = 6;
	public static final String[] ruleNames = {
		"lyric", "measure", "syllable_cluster", "hyphen_cluster", "star_cluster", 
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); measure();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << EXTENDER) | (1L << PIPE))) != 0) );
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(19); match(WHITESPACE);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25); match(EOF);
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
		public Syllable_clusterContext syllable_cluster(int i) {
			return getRuleContext(Syllable_clusterContext.class,i);
		}
		public TerminalNode PIPE() { return getToken(LyricsParser.PIPE, 0); }
		public List<Syllable_clusterContext> syllable_cluster() {
			return getRuleContexts(Syllable_clusterContext.class);
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
			setState(42);
			switch (_input.LA(1)) {
			case WORD:
			case EXTENDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(27); syllable_cluster();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(30); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(33);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(32); match(WHITESPACE);
					}
					break;
				}
				setState(36);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(35); match(PIPE);
					}
					break;
				}
				}
				break;
			case PIPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); match(PIPE);
				setState(40);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(39); match(WHITESPACE);
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
		enterRule(_localctx, 4, RULE_syllable_cluster);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); syllable();
				setState(45); match(HYPHEN);
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
					setState(48); extender_cluster();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); syllable();
				setState(52); match(WHITESPACE);
				setState(53); match(HYPHEN);
				setState(57);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(54); syllable_cluster();
					}
					break;

				case 2:
					{
					setState(55); hyphen_cluster();
					}
					break;

				case 3:
					{
					setState(56); extender_cluster();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); syllable();
				setState(60); match(STAR);
				setState(63);
				switch (_input.LA(1)) {
				case WORD:
				case EXTENDER:
					{
					setState(61); syllable_cluster();
					}
					break;
				case STAR:
				case WHITESPACE:
					{
					setState(62); star_cluster();
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
				setState(65); syllable();
				setState(66); match(UNION_OPER);
				setState(67); syllable_cluster();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(69); syllable();
					setState(70); match(EXTENDER);
					setState(73);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(71); syllable_cluster();
						}
						break;

					case 2:
						{
						setState(72); extender_cluster();
						}
						break;
					}
					}
					break;

				case 2:
					{
					setState(77);
					switch (_input.LA(1)) {
					case WORD:
						{
						setState(75); syllable();
						}
						break;
					case EXTENDER:
						{
						setState(76); match(EXTENDER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				setState(82);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(81); match(WHITESPACE);
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
		public Hyphen_clusterContext hyphen_cluster() {
			return getRuleContext(Hyphen_clusterContext.class,0);
		}
		public TerminalNode HYPHEN() { return getToken(LyricsParser.HYPHEN, 0); }
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
		enterRule(_localctx, 6, RULE_hyphen_cluster);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case HYPHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(HYPHEN);
				setState(87); hyphen_cluster();
				}
				break;
			case WHITESPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); match(WHITESPACE);
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

	public static class Star_clusterContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(LyricsParser.WHITESPACE, 0); }
		public Star_clusterContext star_cluster() {
			return getRuleContext(Star_clusterContext.class,0);
		}
		public TerminalNode STAR() { return getToken(LyricsParser.STAR, 0); }
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
		enterRule(_localctx, 8, RULE_star_cluster);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); match(STAR);
				setState(92); star_cluster();
				}
				break;
			case WHITESPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(WHITESPACE);
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

	public static class Extender_clusterContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(LyricsParser.WHITESPACE, 0); }
		public TerminalNode EXTENDER() { return getToken(LyricsParser.EXTENDER, 0); }
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
		enterRule(_localctx, 10, RULE_extender_cluster);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==EXTENDER || _la==WHITESPACE) ) {
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
		enterRule(_localctx, 12, RULE_syllable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(WORD);
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
		"\2\3\ng\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6"+
		"\2\22\n\2\r\2\16\2\23\3\2\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\6\3"+
		"\37\n\3\r\3\16\3 \3\3\5\3$\n\3\3\3\5\3\'\n\3\3\3\3\3\5\3+\n\3\5\3-\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3"+
		"\4\3\4\3\4\5\4B\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\5"+
		"\4P\n\4\5\4R\n\4\3\4\5\4U\n\4\5\4W\n\4\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3"+
		"\6\5\6a\n\6\3\7\3\7\3\b\3\b\3\b\2\t\2\4\6\b\n\f\16\2\3\4\7\7\t\tu\2\21"+
		"\3\2\2\2\4,\3\2\2\2\6V\3\2\2\2\b[\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16d\3"+
		"\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3"+
		"\2\2\2\24\30\3\2\2\2\25\27\7\t\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3"+
		"\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\1\2\2\34\3\3"+
		"\2\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!"+
		"#\3\2\2\2\"$\7\t\2\2#\"\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\'\7\b\2\2&%\3\2\2"+
		"\2&\'\3\2\2\2\'-\3\2\2\2(*\7\b\2\2)+\7\t\2\2*)\3\2\2\2*+\3\2\2\2+-\3\2"+
		"\2\2,\36\3\2\2\2,(\3\2\2\2-\5\3\2\2\2./\5\16\b\2/\63\7\5\2\2\60\64\5\6"+
		"\4\2\61\64\5\b\5\2\62\64\5\f\7\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2"+
		"\2\2\64W\3\2\2\2\65\66\5\16\b\2\66\67\7\t\2\2\67;\7\5\2\28<\5\6\4\29<"+
		"\5\b\5\2:<\5\f\7\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<W\3\2\2\2=>\5\16\b\2"+
		">A\7\6\2\2?B\5\6\4\2@B\5\n\6\2A?\3\2\2\2A@\3\2\2\2BW\3\2\2\2CD\5\16\b"+
		"\2DE\7\4\2\2EF\5\6\4\2FW\3\2\2\2GH\5\16\b\2HK\7\7\2\2IL\5\6\4\2JL\5\f"+
		"\7\2KI\3\2\2\2KJ\3\2\2\2LR\3\2\2\2MP\5\16\b\2NP\7\7\2\2OM\3\2\2\2ON\3"+
		"\2\2\2PR\3\2\2\2QG\3\2\2\2QO\3\2\2\2RT\3\2\2\2SU\7\t\2\2TS\3\2\2\2TU\3"+
		"\2\2\2UW\3\2\2\2V.\3\2\2\2V\65\3\2\2\2V=\3\2\2\2VC\3\2\2\2VQ\3\2\2\2W"+
		"\7\3\2\2\2XY\7\5\2\2Y\\\5\b\5\2Z\\\7\t\2\2[X\3\2\2\2[Z\3\2\2\2\\\t\3\2"+
		"\2\2]^\7\6\2\2^a\5\n\6\2_a\7\t\2\2`]\3\2\2\2`_\3\2\2\2a\13\3\2\2\2bc\t"+
		"\2\2\2c\r\3\2\2\2de\7\3\2\2e\17\3\2\2\2\23\23\30 #&*,\63;AKOQTV[`";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}