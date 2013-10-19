// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'b'", "']'", "'C'", "'E'", "','", "'['", "'-'", "'*'", "'('", 
		"'A'", "'d'", "'w'", "'f'", "'''", "'|]'", "'G'", "'-'", "'Q'", "'K'", 
		"'M'", "'[2'", "'%'", "'a'", "'D'", "'_'", "'B'", "'c'", "'X'", "'='", 
		"'[|'", "'e'", "'||'", "'m'", "'z'", "'V'", "'F'", "'/'", "'[1'", "'~'", 
		"'#'", "'C|'", "'|'", "'T'", "'g'", "'L'", "DIGIT", "NEWLINE", "':'", 
		"ACCIDENTAL", "TEXT", "WHITESPACE"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
		RULE_other_fields = 4, RULE_field_composer = 5, RULE_field_default_length = 6, 
		RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, 
		RULE_basenote = 11, RULE_key = 12, RULE_keynote = 13, RULE_key_accidental = 14, 
		RULE_mode_minor = 15, RULE_meter = 16, RULE_meter_fraction = 17, RULE_tempo = 18, 
		RULE_abc_music = 19, RULE_abc_line = 20, RULE_element = 21, RULE_note_element = 22, 
		RULE_note = 23, RULE_note_or_rest = 24, RULE_pitch = 25, RULE_octave = 26, 
		RULE_note_length = 27, RULE_note_length_strict = 28, RULE_rest = 29, RULE_tuplet_element = 30, 
		RULE_tuplet_spec = 31, RULE_multi_note = 32, RULE_barline = 33, RULE_nth_repeat = 34, 
		RULE_mid_tune_field = 35, RULE_comment = 36, RULE_end_of_line = 37, RULE_lyric = 38, 
		RULE_lyrical_element = 39;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "basenote", "key", "keynote", "key_accidental", 
		"mode_minor", "meter", "meter_fraction", "tempo", "abc_music", "abc_line", 
		"element", "note_element", "note", "note_or_rest", "pitch", "octave", 
		"note_length", "note_length_strict", "rest", "tuplet_element", "tuplet_spec", 
		"multi_note", "barline", "nth_repeat", "mid_tune_field", "comment", "end_of_line", 
		"lyric", "lyrical_element"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

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

	public ABCMusicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_tune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_tune(this);
		}
	}

	public final Abc_tuneContext abc_tune() throws RecognitionException {
		Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); abc_header();
			setState(81); abc_music();
			setState(82); match(EOF);
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

	public static class Abc_headerContext extends ParserRuleContext {
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public List<Other_fieldsContext> other_fields() {
			return getRuleContexts(Other_fieldsContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public Field_titleContext field_title() {
			return getRuleContext(Field_titleContext.class,0);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); field_number();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==22) {
				{
				{
				setState(85); comment();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91); field_title();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 18) | (1L << 20) | (1L << 22) | (1L << 35) | (1L << 45))) != 0)) {
				{
				{
				setState(92); other_fields();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); field_key();
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

	public static class Field_numberContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_number(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(28);
			setState(101); match(COLON);
			setState(102); match(DIGIT);
			setState(103); end_of_line();
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

	public static class Field_titleContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicParser.TEXT, i);
		}
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicParser.TEXT); }
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(43);
			setState(106); match(COLON);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107); match(TEXT);
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(112); match(NEWLINE);
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

	public static class Other_fieldsContext extends ParserRuleContext {
		public Field_tempoContext field_tempo() {
			return getRuleContext(Field_tempoContext.class,0);
		}
		public Field_default_lengthContext field_default_length() {
			return getRuleContext(Field_default_lengthContext.class,0);
		}
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Field_composerContext field_composer() {
			return getRuleContext(Field_composerContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOther_fields(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_other_fields);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); field_composer();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); field_default_length();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); field_meter();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 4);
				{
				setState(117); field_tempo();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 5);
				{
				setState(118); field_voice();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 6);
				{
				setState(119); comment();
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

	public static class Field_composerContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(3);
			setState(123); match(COLON);
			setState(124); match(TEXT);
			setState(125); match(NEWLINE);
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

	public static class Field_default_lengthContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public Note_length_strictContext note_length_strict() {
			return getRuleContext(Note_length_strictContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(45);
			setState(128); match(COLON);
			setState(129); note_length_strict();
			setState(130); end_of_line();
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

	public static class Field_meterContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public MeterContext meter() {
			return getRuleContext(MeterContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(20);
			setState(133); match(COLON);
			setState(134); meter();
			setState(135); end_of_line();
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

	public static class Field_tempoContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(18);
			setState(138); match(COLON);
			setState(139); tempo();
			setState(140); end_of_line();
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

	public static class Field_voiceContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicParser.TEXT, i);
		}
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicParser.TEXT); }
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_voice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(35);
			setState(143); match(COLON);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144); match(TEXT);
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(149); match(NEWLINE);
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

	public static class Field_keyContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(19);
			setState(152); match(COLON);
			setState(153); key();
			setState(154); end_of_line();
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

	public static class BasenoteContext extends ParserRuleContext {
		public BasenoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basenote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterBasenote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitBasenote(this);
		}
	}

	public final BasenoteContext basenote() throws RecognitionException {
		BasenoteContext _localctx = new BasenoteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_basenote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 27) | (1L << 31) | (1L << 36) | (1L << 44))) != 0)) ) {
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

	public static class KeyContext extends ParserRuleContext {
		public Mode_minorContext mode_minor() {
			return getRuleContext(Mode_minorContext.class,0);
		}
		public KeynoteContext keynote() {
			return getRuleContext(KeynoteContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); keynote();
			setState(160);
			_la = _input.LA(1);
			if (_la==33) {
				{
				setState(159); mode_minor();
				}
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

	public static class KeynoteContext extends ParserRuleContext {
		public Key_accidentalContext key_accidental() {
			return getRuleContext(Key_accidentalContext.class,0);
		}
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public KeynoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keynote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKeynote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKeynote(this);
		}
	}

	public final KeynoteContext keynote() throws RecognitionException {
		KeynoteContext _localctx = new KeynoteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keynote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); basenote();
			setState(164);
			_la = _input.LA(1);
			if (_la==1 || _la==40) {
				{
				setState(163); key_accidental();
				}
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

	public static class Key_accidentalContext extends ParserRuleContext {
		public Key_accidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKey_accidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKey_accidental(this);
		}
	}

	public final Key_accidentalContext key_accidental() throws RecognitionException {
		Key_accidentalContext _localctx = new Key_accidentalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_key_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==40) ) {
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

	public static class Mode_minorContext extends ParserRuleContext {
		public Mode_minorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mode_minor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMode_minor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMode_minor(this);
		}
	}

	public final Mode_minorContext mode_minor() throws RecognitionException {
		Mode_minorContext _localctx = new Mode_minorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mode_minor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(33);
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

	public static class MeterContext extends ParserRuleContext {
		public Meter_fractionContext meter_fraction() {
			return getRuleContext(Meter_fractionContext.class,0);
		}
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_meter);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); match(3);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); match(41);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(172); meter_fraction();
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

	public static class Meter_fractionContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public Meter_fractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeter_fraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeter_fraction(this);
		}
	}

	public final Meter_fractionContext meter_fraction() throws RecognitionException {
		Meter_fractionContext _localctx = new Meter_fractionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_meter_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(DIGIT);
			setState(176); match(37);
			setState(177); match(DIGIT);
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

	public static class TempoContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public Meter_fractionContext meter_fraction() {
			return getRuleContext(Meter_fractionContext.class,0);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTempo(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); meter_fraction();
			setState(180); match(29);
			setState(181); match(DIGIT);
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

	public static class Abc_musicContext extends ParserRuleContext {
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183); abc_line();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 27) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 42) | (1L << 44) | (1L << COLON) | (1L << ACCIDENTAL))) != 0) );
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

	public static class Abc_lineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ABCMusicParser.NEWLINE); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ABCMusicParser.NEWLINE, i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_abc_line);
		int _la;
		try {
			setState(201);
			switch (_input.LA(1)) {
			case 1:
			case 3:
			case 4:
			case 6:
			case 9:
			case 10:
			case 11:
			case 13:
			case 15:
			case 16:
			case 21:
			case 23:
			case 24:
			case 26:
			case 27:
			case 30:
			case 31:
			case 32:
			case 34:
			case 36:
			case 38:
			case 42:
			case 44:
			case COLON:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188); element();
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 21) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 27) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 36) | (1L << 38) | (1L << 42) | (1L << 44) | (1L << COLON) | (1L << ACCIDENTAL))) != 0) );
				setState(193); match(NEWLINE);
				setState(197);
				_la = _input.LA(1);
				if (_la==12) {
					{
					setState(194); lyric();
					setState(195); match(NEWLINE);
					}
				}

				}
				break;
			case 35:
				enterOuterAlt(_localctx, 2);
				{
				setState(199); mid_tune_field();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 3);
				{
				setState(200); comment();
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

	public static class ElementContext extends ParserRuleContext {
		public BarlineContext barline() {
			return getRuleContext(BarlineContext.class,0);
		}
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
		}
		public Nth_repeatContext nth_repeat() {
			return getRuleContext(Nth_repeatContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_element);
		try {
			setState(207);
			switch (_input.LA(1)) {
			case 1:
			case 3:
			case 4:
			case 6:
			case 10:
			case 11:
			case 13:
			case 16:
			case 23:
			case 24:
			case 26:
			case 27:
			case 31:
			case 34:
			case 36:
			case 44:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); note_element();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); tuplet_element();
				}
				break;
			case 15:
			case 30:
			case 32:
			case 42:
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(205); barline();
				}
				break;
			case 21:
			case 38:
				enterOuterAlt(_localctx, 4);
				{
				setState(206); nth_repeat();
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

	public static class Note_elementContext extends ParserRuleContext {
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public Multi_noteContext multi_note() {
			return getRuleContext(Multi_noteContext.class,0);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public Note_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_note_element);
		try {
			int _alt;
			setState(215);
			switch (_input.LA(1)) {
			case 1:
			case 3:
			case 4:
			case 10:
			case 11:
			case 13:
			case 16:
			case 23:
			case 24:
			case 26:
			case 27:
			case 31:
			case 34:
			case 36:
			case 44:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(209); note();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(212); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); multi_note();
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

	public static class NoteContext extends ParserRuleContext {
		public Note_or_restContext note_or_rest() {
			return getRuleContext(Note_or_restContext.class,0);
		}
		public Note_lengthContext note_length() {
			return getRuleContext(Note_lengthContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); note_or_rest();
			setState(219);
			_la = _input.LA(1);
			if (_la==37 || _la==DIGIT) {
				{
				setState(218); note_length();
				}
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

	public static class Note_or_restContext extends ParserRuleContext {
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public Note_or_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_or_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_or_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_or_rest(this);
		}
	}

	public final Note_or_restContext note_or_rest() throws RecognitionException {
		Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_note_or_rest);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case 1:
			case 3:
			case 4:
			case 10:
			case 11:
			case 13:
			case 16:
			case 23:
			case 24:
			case 26:
			case 27:
			case 31:
			case 36:
			case 44:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); pitch();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); rest();
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

	public static class PitchContext extends ParserRuleContext {
		public OctaveContext octave() {
			return getRuleContext(OctaveContext.class,0);
		}
		public TerminalNode ACCIDENTAL() { return getToken(ABCMusicParser.ACCIDENTAL, 0); }
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(225); match(ACCIDENTAL);
				}
			}

			setState(228); basenote();
			setState(230);
			_la = _input.LA(1);
			if (_la==5 || _la==14) {
				{
				setState(229); octave();
				}
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

	public static class OctaveContext extends ParserRuleContext {
		public OctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOctave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOctave(this);
		}
	}

	public final OctaveContext octave() throws RecognitionException {
		OctaveContext _localctx = new OctaveContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_octave);
		int _la;
		try {
			setState(242);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232); match(14);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==14 );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(237); match(5);
					}
					}
					setState(240); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==5 );
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

	public static class Note_lengthContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public Note_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_length(this);
		}
	}

	public final Note_lengthContext note_length() throws RecognitionException {
		Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_note_length);
		int _la;
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); match(DIGIT);
				setState(246);
				_la = _input.LA(1);
				if (_la==37) {
					{
					setState(245); match(37);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); match(37);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(249); match(DIGIT);
					}
				}

				setState(252); match(37);
				setState(253); match(DIGIT);
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

	public static class Note_length_strictContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public Note_length_strictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length_strict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_length_strict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_length_strict(this);
		}
	}

	public final Note_length_strictContext note_length_strict() throws RecognitionException {
		Note_length_strictContext _localctx = new Note_length_strictContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_note_length_strict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(DIGIT);
			setState(257); match(37);
			setState(258); match(DIGIT);
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

	public static class RestContext extends ParserRuleContext {
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitRest(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(34);
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

	public static class Tuplet_elementContext extends ParserRuleContext {
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public Tuplet_specContext tuplet_spec() {
			return getRuleContext(Tuplet_specContext.class,0);
		}
		public Tuplet_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet_element(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262); tuplet_spec();
			setState(264); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(263); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(266); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class Tuplet_specContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public Tuplet_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet_spec(this);
		}
	}

	public final Tuplet_specContext tuplet_spec() throws RecognitionException {
		Tuplet_specContext _localctx = new Tuplet_specContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(9);
			setState(269); match(DIGIT);
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

	public static class Multi_noteContext extends ParserRuleContext {
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public Multi_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMulti_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMulti_note(this);
		}
	}

	public final Multi_noteContext multi_note() throws RecognitionException {
		Multi_noteContext _localctx = new Multi_noteContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(6);
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272); note();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 27) | (1L << 31) | (1L << 34) | (1L << 36) | (1L << 44) | (1L << ACCIDENTAL))) != 0) );
			setState(277); match(2);
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

	public static class BarlineContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public BarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitBarline(this);
		}
	}

	public final BarlineContext barline() throws RecognitionException {
		BarlineContext _localctx = new BarlineContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_barline);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(42);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); match(32);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281); match(30);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282); match(15);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283); match(COLON);
				setState(284); match(42);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285); match(42);
				setState(286); match(COLON);
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

	public static class Nth_repeatContext extends ParserRuleContext {
		public Nth_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nth_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNth_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNth_repeat(this);
		}
	}

	public final Nth_repeatContext nth_repeat() throws RecognitionException {
		Nth_repeatContext _localctx = new Nth_repeatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nth_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==21 || _la==38) ) {
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

	public static class Mid_tune_fieldContext extends ParserRuleContext {
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid_tune_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMid_tune_field(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); field_voice();
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicParser.TEXT, i);
		}
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicParser.TEXT); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(22);
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294); match(TEXT);
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(299); match(NEWLINE);
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

	public static class End_of_lineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public End_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterEnd_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitEnd_of_line(this);
		}
	}

	public final End_of_lineContext end_of_line() throws RecognitionException {
		End_of_lineContext _localctx = new End_of_lineContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_end_of_line);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); comment();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); match(NEWLINE);
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

	public static class LyricContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public List<Lyrical_elementContext> lyrical_element() {
			return getRuleContexts(Lyrical_elementContext.class);
		}
		public Lyrical_elementContext lyrical_element(int i) {
			return getRuleContext(Lyrical_elementContext.class,i);
		}
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(12);
			setState(306); match(COLON);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 8) | (1L << 17) | (1L << 25) | (1L << 39) | (1L << 42) | (1L << TEXT))) != 0)) {
				{
				{
				setState(307); lyrical_element();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Lyrical_elementContext extends ParserRuleContext {
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicParser.TEXT); }
		public Lyrical_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyrical_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyrical_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyrical_element(this);
		}
	}

	public final Lyrical_elementContext lyrical_element() throws RecognitionException {
		Lyrical_elementContext _localctx = new Lyrical_elementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lyrical_element);
		try {
			int _alt;
			setState(324);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(313); match(7);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 2);
				{
				setState(314); match(25);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 3);
				{
				setState(315); match(8);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 4);
				{
				setState(316); match(39);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 5);
				{
				setState(317); match(17);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 6);
				{
				setState(318); match(42);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 7);
				{
				setState(320); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(319); match(TEXT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(322); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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

	public static final String _serializedATN =
		"\2\3\65\u0149\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\3\2\3\2\3\2\3\2\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\3\3\7\3`"+
		"\n\3\f\3\16\3c\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5o\n\5\r"+
		"\5\16\5p\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\6\13\u0094\n\13\r\13\16\13\u0095\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\5\16\u00a3\n\16\3\17\3\17\5\17\u00a7\n\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\5\22\u00b0\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\6\25\u00bb\n\25\r\25\16\25\u00bc\3\26\6\26\u00c0\n\26"+
		"\r\26\16\26\u00c1\3\26\3\26\3\26\3\26\5\26\u00c8\n\26\3\26\3\26\5\26\u00cc"+
		"\n\26\3\27\3\27\3\27\3\27\5\27\u00d2\n\27\3\30\6\30\u00d5\n\30\r\30\16"+
		"\30\u00d6\3\30\5\30\u00da\n\30\3\31\3\31\5\31\u00de\n\31\3\32\3\32\5\32"+
		"\u00e2\n\32\3\33\5\33\u00e5\n\33\3\33\3\33\5\33\u00e9\n\33\3\34\6\34\u00ec"+
		"\n\34\r\34\16\34\u00ed\3\34\6\34\u00f1\n\34\r\34\16\34\u00f2\5\34\u00f5"+
		"\n\34\3\35\3\35\5\35\u00f9\n\35\3\35\3\35\5\35\u00fd\n\35\3\35\3\35\5"+
		"\35\u0101\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \6 \u010b\n \r \16 "+
		"\u010c\3!\3!\3!\3\"\3\"\6\"\u0114\n\"\r\"\16\"\u0115\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\5#\u0122\n#\3$\3$\3%\3%\3&\3&\6&\u012a\n&\r&\16&\u012b"+
		"\3&\3&\3\'\3\'\5\'\u0132\n\'\3(\3(\3(\7(\u0137\n(\f(\16(\u013a\13(\3)"+
		"\3)\3)\3)\3)\3)\3)\6)\u0143\n)\r)\16)\u0144\5)\u0147\n)\3)\2*\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\5"+
		"\f\3\3\5\6\f\r\17\17\22\22\31\32\34\35!!&&..\4\3\3**\4\27\27((\u0153\2"+
		"R\3\2\2\2\4V\3\2\2\2\6f\3\2\2\2\bk\3\2\2\2\nz\3\2\2\2\f|\3\2\2\2\16\u0081"+
		"\3\2\2\2\20\u0086\3\2\2\2\22\u008b\3\2\2\2\24\u0090\3\2\2\2\26\u0099\3"+
		"\2\2\2\30\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00a4\3\2\2\2\36\u00a8\3\2"+
		"\2\2 \u00aa\3\2\2\2\"\u00af\3\2\2\2$\u00b1\3\2\2\2&\u00b5\3\2\2\2(\u00ba"+
		"\3\2\2\2*\u00cb\3\2\2\2,\u00d1\3\2\2\2.\u00d9\3\2\2\2\60\u00db\3\2\2\2"+
		"\62\u00e1\3\2\2\2\64\u00e4\3\2\2\2\66\u00f4\3\2\2\28\u0100\3\2\2\2:\u0102"+
		"\3\2\2\2<\u0106\3\2\2\2>\u0108\3\2\2\2@\u010e\3\2\2\2B\u0111\3\2\2\2D"+
		"\u0121\3\2\2\2F\u0123\3\2\2\2H\u0125\3\2\2\2J\u0127\3\2\2\2L\u0131\3\2"+
		"\2\2N\u0133\3\2\2\2P\u0146\3\2\2\2RS\5\4\3\2ST\5(\25\2TU\7\1\2\2U\3\3"+
		"\2\2\2VZ\5\6\4\2WY\5J&\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3"+
		"\2\2\2\\Z\3\2\2\2]a\5\b\5\2^`\5\n\6\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab"+
		"\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\5\26\f\2e\5\3\2\2\2fg\7\36\2\2gh\7\62\2"+
		"\2hi\7\60\2\2ij\5L\'\2j\7\3\2\2\2kl\7-\2\2ln\7\62\2\2mo\7\64\2\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\61\2\2s\t\3\2\2\2t{\5"+
		"\f\7\2u{\5\16\b\2v{\5\20\t\2w{\5\22\n\2x{\5\24\13\2y{\5J&\2zt\3\2\2\2"+
		"zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\13\3\2\2\2|}\7\5\2"+
		"\2}~\7\62\2\2~\177\7\64\2\2\177\u0080\7\61\2\2\u0080\r\3\2\2\2\u0081\u0082"+
		"\7/\2\2\u0082\u0083\7\62\2\2\u0083\u0084\5:\36\2\u0084\u0085\5L\'\2\u0085"+
		"\17\3\2\2\2\u0086\u0087\7\26\2\2\u0087\u0088\7\62\2\2\u0088\u0089\5\""+
		"\22\2\u0089\u008a\5L\'\2\u008a\21\3\2\2\2\u008b\u008c\7\24\2\2\u008c\u008d"+
		"\7\62\2\2\u008d\u008e\5&\24\2\u008e\u008f\5L\'\2\u008f\23\3\2\2\2\u0090"+
		"\u0091\7%\2\2\u0091\u0093\7\62\2\2\u0092\u0094\7\64\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7\61\2\2\u0098\25\3\2\2\2\u0099\u009a\7\25"+
		"\2\2\u009a\u009b\7\62\2\2\u009b\u009c\5\32\16\2\u009c\u009d\5L\'\2\u009d"+
		"\27\3\2\2\2\u009e\u009f\t\2\2\2\u009f\31\3\2\2\2\u00a0\u00a2\5\34\17\2"+
		"\u00a1\u00a3\5 \21\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\33"+
		"\3\2\2\2\u00a4\u00a6\5\30\r\2\u00a5\u00a7\5\36\20\2\u00a6\u00a5\3\2\2"+
		"\2\u00a6\u00a7\3\2\2\2\u00a7\35\3\2\2\2\u00a8\u00a9\t\3\2\2\u00a9\37\3"+
		"\2\2\2\u00aa\u00ab\7#\2\2\u00ab!\3\2\2\2\u00ac\u00b0\7\5\2\2\u00ad\u00b0"+
		"\7+\2\2\u00ae\u00b0\5$\23\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0#\3\2\2\2\u00b1\u00b2\7\60\2\2\u00b2\u00b3\7\'\2\2"+
		"\u00b3\u00b4\7\60\2\2\u00b4%\3\2\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7\7"+
		"\37\2\2\u00b7\u00b8\7\60\2\2\u00b8\'\3\2\2\2\u00b9\u00bb\5*\26\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd)\3\2\2\2\u00be\u00c0\5,\27\2\u00bf\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c7\7\61\2\2\u00c4\u00c5\5N(\2\u00c5\u00c6\7\61\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\3\2\2\2\u00c9"+
		"\u00cc\5H%\2\u00ca\u00cc\5J&\2\u00cb\u00bf\3\2\2\2\u00cb\u00c9\3\2\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc+\3\2\2\2\u00cd\u00d2\5.\30\2\u00ce\u00d2\5"+
		"> \2\u00cf\u00d2\5D#\2\u00d0\u00d2\5F$\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2-\3\2\2\2\u00d3"+
		"\u00d5\5\60\31\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00da\5B\"\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da/\3\2\2\2\u00db\u00dd\5\62\32"+
		"\2\u00dc\u00de\58\35\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\61"+
		"\3\2\2\2\u00df\u00e2\5\64\33\2\u00e0\u00e2\5<\37\2\u00e1\u00df\3\2\2\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\63\3\2\2\2\u00e3\u00e5\7\63\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\5\30\r\2"+
		"\u00e7\u00e9\5\66\34\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\65"+
		"\3\2\2\2\u00ea\u00ec\7\20\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f5\3\2\2\2\u00ef\u00f1"+
		"\7\7\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00f0\3\2"+
		"\2\2\u00f5\67\3\2\2\2\u00f6\u00f8\7\60\2\2\u00f7\u00f9\7\'\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0101\3\2\2\2\u00fa\u0101\7\'\2\2\u00fb"+
		"\u00fd\7\60\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u00ff\7\'\2\2\u00ff\u0101\7\60\2\2\u0100\u00f6\3\2\2\2\u0100"+
		"\u00fa\3\2\2\2\u0100\u00fc\3\2\2\2\u01019\3\2\2\2\u0102\u0103\7\60\2\2"+
		"\u0103\u0104\7\'\2\2\u0104\u0105\7\60\2\2\u0105;\3\2\2\2\u0106\u0107\7"+
		"$\2\2\u0107=\3\2\2\2\u0108\u010a\5@!\2\u0109\u010b\5.\30\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"?\3\2\2\2\u010e\u010f\7\13\2\2\u010f\u0110\7\60\2\2\u0110A\3\2\2\2\u0111"+
		"\u0113\7\b\2\2\u0112\u0114\5\60\31\2\u0113\u0112\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\7\4\2\2\u0118C\3\2\2\2\u0119\u0122\7,\2\2\u011a\u0122\7\"\2\2\u011b"+
		"\u0122\7 \2\2\u011c\u0122\7\21\2\2\u011d\u011e\7\62\2\2\u011e\u0122\7"+
		",\2\2\u011f\u0120\7,\2\2\u0120\u0122\7\62\2\2\u0121\u0119\3\2\2\2\u0121"+
		"\u011a\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0122E\3\2\2\2\u0123\u0124\t\4\2\2\u0124G\3\2"+
		"\2\2\u0125\u0126\5\24\13\2\u0126I\3\2\2\2\u0127\u0129\7\30\2\2\u0128\u012a"+
		"\7\64\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\61\2\2\u012eK\3"+
		"\2\2\2\u012f\u0132\5J&\2\u0130\u0132\7\61\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132M\3\2\2\2\u0133\u0134\7\16\2\2\u0134\u0138\7\62\2"+
		"\2\u0135\u0137\5P)\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139O\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u0147\7\t\2\2\u013c\u0147\7\33\2\2\u013d\u0147\7\n\2\2\u013e\u0147\7"+
		")\2\2\u013f\u0147\7\23\2\2\u0140\u0147\7,\2\2\u0141\u0143\7\64\2\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u013b\3\2\2\2\u0146\u013c\3\2\2\2\u0146"+
		"\u013d\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u013f\3\2\2\2\u0146\u0140\3\2"+
		"\2\2\u0146\u0142\3\2\2\2\u0147Q\3\2\2\2#Zapz\u0095\u00a2\u00a6\u00af\u00bc"+
		"\u00c1\u00c7\u00cb\u00d1\u00d6\u00d9\u00dd\u00e1\u00e4\u00e8\u00ed\u00f2"+
		"\u00f4\u00f8\u00fc\u0100\u010c\u0115\u0121\u012b\u0131\u0138\u0144\u0146";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}