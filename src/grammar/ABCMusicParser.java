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
		T__48=1, T__47=2, T__46=3, T__45=4, T__44=5, T__43=6, T__42=7, T__41=8, 
		T__40=9, T__39=10, T__38=11, T__37=12, T__36=13, T__35=14, T__34=15, T__33=16, 
		T__32=17, T__31=18, T__30=19, T__29=20, T__28=21, T__27=22, T__26=23, 
		T__25=24, T__24=25, T__23=26, T__22=27, T__21=28, T__20=29, T__19=30, 
		T__18=31, T__17=32, T__16=33, T__15=34, T__14=35, T__13=36, T__12=37, 
		T__11=38, T__10=39, T__9=40, T__8=41, T__7=42, T__6=43, T__5=44, T__4=45, 
		T__3=46, T__2=47, T__1=48, T__0=49, TEXT=50, DIGIT=51, NEWLINE=52, COLON=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'E'", "'*'", "'['", "'A'", "'d'", "'-'", "'M'", "'^^'", 
		"'%'", "'_'", "'D'", "'c'", "'X'", "'='", "'[|'", "'[1'", "'|'", "'C|'", 
		"'T'", "'g'", "'L'", "'b'", "']'", "'C'", "','", "'-'", "'('", "'w'", 
		"'f'", "'''", "'|]'", "' '", "'G'", "'Q'", "'K'", "'[2'", "'^'", "'a'", 
		"'__'", "'B'", "'e'", "'||'", "'m'", "'z'", "'V'", "'F'", "'/'", "'~'", 
		"'#'", "TEXT", "DIGIT", "NEWLINE", "COLON"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
		RULE_other_fields = 4, RULE_field_composer = 5, RULE_field_default_length = 6, 
		RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, 
		RULE_key = 11, RULE_keynote = 12, RULE_key_accidental = 13, RULE_mode_minor = 14, 
		RULE_meter = 15, RULE_meter_fraction = 16, RULE_tempo = 17, RULE_abc_music = 18, 
		RULE_abc_line = 19, RULE_element = 20, RULE_note_element = 21, RULE_note = 22, 
		RULE_note_or_rest = 23, RULE_pitch = 24, RULE_octave = 25, RULE_note_length = 26, 
		RULE_note_length_strict = 27, RULE_accidental = 28, RULE_basenote = 29, 
		RULE_rest = 30, RULE_tuplet_element = 31, RULE_tuplet_spec = 32, RULE_multi_note = 33, 
		RULE_barline = 34, RULE_nth_repeat = 35, RULE_mid_tune_field = 36, RULE_comment = 37, 
		RULE_end_of_line = 38, RULE_lyric = 39, RULE_lyrical_element = 40;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "key", "keynote", "key_accidental", "mode_minor", 
		"meter", "meter_fraction", "tempo", "abc_music", "abc_line", "element", 
		"note_element", "note", "note_or_rest", "pitch", "octave", "note_length", 
		"note_length_strict", "accidental", "basenote", "rest", "tuplet_element", 
		"tuplet_spec", "multi_note", "barline", "nth_repeat", "mid_tune_field", 
		"comment", "end_of_line", "lyric", "lyrical_element"
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
			setState(82); abc_header();
			setState(83); abc_music();
			setState(84); match(EOF);
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
			setState(86); field_number();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(87); comment();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); field_title();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << 21) | (1L << 24) | (1L << 34) | (1L << 45))) != 0)) {
				{
				{
				setState(94); other_fields();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); field_key();
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
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public TerminalNode COLON() { return getToken(ABCMusicParser.COLON, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(13);
			setState(103); match(COLON);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104); match(DIGIT);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(109); end_of_line();
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
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(19);
			setState(112); match(COLON);
			setState(113); match(TEXT);
			setState(114); end_of_line();
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
			setState(122);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); field_composer();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); field_default_length();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); field_meter();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); field_tempo();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 5);
				{
				setState(120); field_voice();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 6);
				{
				setState(121); comment();
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
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
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
			setState(124); match(24);
			setState(125); match(COLON);
			setState(126); match(TEXT);
			setState(127); end_of_line();
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
			setState(129); match(21);
			setState(130); match(COLON);
			setState(131); note_length_strict();
			setState(132); end_of_line();
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
			setState(134); match(7);
			setState(135); match(COLON);
			setState(136); meter();
			setState(137); end_of_line();
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
			setState(139); match(34);
			setState(140); match(COLON);
			setState(141); tempo();
			setState(142); end_of_line();
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
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(45);
			setState(145); match(COLON);
			setState(146); match(TEXT);
			setState(147); end_of_line();
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
			setState(149); match(35);
			setState(150); match(COLON);
			setState(151); key();
			setState(152); end_of_line();
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
		enterRule(_localctx, 22, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); keynote();
			setState(155); mode_minor();
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
		enterRule(_localctx, 24, RULE_keynote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); basenote();
			setState(158); key_accidental();
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
		enterRule(_localctx, 26, RULE_key_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==22 || _la==49) ) {
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
		enterRule(_localctx, 28, RULE_mode_minor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(43);
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
		enterRule(_localctx, 30, RULE_meter);
		try {
			setState(167);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); match(24);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); match(18);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(166); meter_fraction();
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
		enterRule(_localctx, 32, RULE_meter_fraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169); match(DIGIT);
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(174); match(47);
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175); match(DIGIT);
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
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
		enterRule(_localctx, 34, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); meter_fraction();
			setState(181); match(14);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182); match(DIGIT);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		enterRule(_localctx, 36, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187); abc_line();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 27) | (1L << 31) | (1L << 32) | (1L << 36) | (1L << 37) | (1L << 39) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << COLON))) != 0) );
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
		enterRule(_localctx, 38, RULE_abc_line);
		int _la;
		try {
			setState(203);
			switch (_input.LA(1)) {
			case 3:
			case 8:
			case 10:
			case 14:
			case 15:
			case 16:
			case 17:
			case 27:
			case 31:
			case 32:
			case 36:
			case 37:
			case 39:
			case 42:
			case 44:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192); element();
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 8) | (1L << 10) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 27) | (1L << 31) | (1L << 32) | (1L << 36) | (1L << 37) | (1L << 39) | (1L << 42) | (1L << 44) | (1L << COLON))) != 0) );
				setState(197); match(NEWLINE);
				setState(198); lyric();
				setState(199); match(NEWLINE);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); mid_tune_field();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); comment();
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
		enterRule(_localctx, 40, RULE_element);
		try {
			setState(210);
			switch (_input.LA(1)) {
			case 3:
			case 8:
			case 10:
			case 14:
			case 37:
			case 39:
			case 44:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); note_element();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); tuplet_element();
				}
				break;
			case 15:
			case 17:
			case 31:
			case 42:
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(207); barline();
				}
				break;
			case 16:
			case 36:
				enterOuterAlt(_localctx, 4);
				{
				setState(208); nth_repeat();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 5);
				{
				setState(209); match(32);
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
		public Multi_noteContext multi_note() {
			return getRuleContext(Multi_noteContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
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
		enterRule(_localctx, 42, RULE_note_element);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case 8:
			case 10:
			case 14:
			case 37:
			case 39:
			case 44:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); note();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); multi_note();
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
		enterRule(_localctx, 44, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); note_or_rest();
			setState(217); note_length();
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
		enterRule(_localctx, 46, RULE_note_or_rest);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case 8:
			case 10:
			case 14:
			case 37:
			case 39:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); pitch();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 2);
				{
				setState(220); rest();
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
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
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
		enterRule(_localctx, 48, RULE_pitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); accidental();
			setState(224); basenote();
			setState(225); octave();
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
		enterRule(_localctx, 50, RULE_octave);
		int _la;
		try {
			setState(237);
			switch (_input.LA(1)) {
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(227); match(30);
					}
					}
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==30 );
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232); match(25);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==25 );
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
		enterRule(_localctx, 52, RULE_note_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239); match(DIGIT);
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(244); match(47);
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245); match(DIGIT);
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		enterRule(_localctx, 54, RULE_note_length_strict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250); match(DIGIT);
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(255); match(47);
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256); match(DIGIT);
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class AccidentalContext extends ParserRuleContext {
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAccidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAccidental(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 10) | (1L << 14) | (1L << 37) | (1L << 39))) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_basenote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 5) | (1L << 11) | (1L << 12) | (1L << 20) | (1L << 22) | (1L << 24) | (1L << 29) | (1L << 33) | (1L << 38) | (1L << 40) | (1L << 41) | (1L << 46))) != 0)) ) {
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
		enterRule(_localctx, 60, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(44);
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
		enterRule(_localctx, 62, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267); tuplet_spec();
			setState(269); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(268); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(271); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 64, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(27);
			setState(274); match(DIGIT);
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
		enterRule(_localctx, 66, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(3);
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277); note();
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 10) | (1L << 14) | (1L << 37) | (1L << 39) | (1L << 44))) != 0) );
			setState(282); match(23);
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
		enterRule(_localctx, 68, RULE_barline);
		try {
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284); match(17);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285); match(42);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286); match(15);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287); match(31);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288); match(COLON);
				setState(289); match(17);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(290); match(17);
				setState(291); match(COLON);
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
		enterRule(_localctx, 70, RULE_nth_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==16 || _la==36) ) {
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
		enterRule(_localctx, 72, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); field_voice();
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
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
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
		enterRule(_localctx, 74, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(9);
			setState(299); match(TEXT);
			setState(300); match(NEWLINE);
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
		enterRule(_localctx, 76, RULE_end_of_line);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); comment();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); match(NEWLINE);
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
		enterRule(_localctx, 78, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(28);
			setState(307); match(COLON);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 10) | (1L << 17) | (1L << 26) | (1L << 32) | (1L << 48) | (1L << TEXT))) != 0)) {
				{
				{
				setState(308); lyrical_element();
				}
				}
				setState(313);
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
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
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
		enterRule(_localctx, 80, RULE_lyrical_element);
		try {
			int _alt;
			setState(326);
			switch (_input.LA(1)) {
			case 32:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(314); match(32);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(317); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 2);
				{
				setState(319); match(26);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 3);
				{
				setState(320); match(10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 4);
				{
				setState(321); match(2);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 5);
				{
				setState(322); match(48);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323); match(6);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 7);
				{
				setState(324); match(17);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(325); match(TEXT);
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
		"\2\3\67\u014b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\4*\t*\3\2\3\2\3\2\3\2\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3"+
		"\7\3b\n\3\f\3\16\3e\13\3\3\3\3\3\3\4\3\4\3\4\6\4l\n\4\r\4\16\4m\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21\u00aa\n\21\3\22\6\22\u00ad\n\22"+
		"\r\22\16\22\u00ae\3\22\3\22\6\22\u00b3\n\22\r\22\16\22\u00b4\3\23\3\23"+
		"\3\23\6\23\u00ba\n\23\r\23\16\23\u00bb\3\24\6\24\u00bf\n\24\r\24\16\24"+
		"\u00c0\3\25\6\25\u00c4\n\25\r\25\16\25\u00c5\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00ce\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u00d5\n\26\3\27\3"+
		"\27\5\27\u00d9\n\27\3\30\3\30\3\30\3\31\3\31\5\31\u00e0\n\31\3\32\3\32"+
		"\3\32\3\32\3\33\6\33\u00e7\n\33\r\33\16\33\u00e8\3\33\6\33\u00ec\n\33"+
		"\r\33\16\33\u00ed\5\33\u00f0\n\33\3\34\6\34\u00f3\n\34\r\34\16\34\u00f4"+
		"\3\34\3\34\6\34\u00f9\n\34\r\34\16\34\u00fa\3\35\6\35\u00fe\n\35\r\35"+
		"\16\35\u00ff\3\35\3\35\6\35\u0104\n\35\r\35\16\35\u0105\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\6!\u0110\n!\r!\16!\u0111\3\"\3\"\3\"\3#\3#\6#\u0119"+
		"\n#\r#\16#\u011a\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0127\n$\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\3\'\3(\3(\5(\u0133\n(\3)\3)\3)\7)\u0138\n)\f)\16)\u013b"+
		"\13)\3*\6*\u013e\n*\r*\16*\u013f\3*\3*\3*\3*\3*\3*\3*\5*\u0149\n*\3*\2"+
		"+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPR\2\6\4\30\30\63\63\7\n\n\f\f\20\20\'\'))\r\3\3\6\7\r\16\26\26\30"+
		"\30\32\32\37\37##((*+\60\60\4\22\22&&\u0150\2T\3\2\2\2\4X\3\2\2\2\6h\3"+
		"\2\2\2\bq\3\2\2\2\n|\3\2\2\2\f~\3\2\2\2\16\u0083\3\2\2\2\20\u0088\3\2"+
		"\2\2\22\u008d\3\2\2\2\24\u0092\3\2\2\2\26\u0097\3\2\2\2\30\u009c\3\2\2"+
		"\2\32\u009f\3\2\2\2\34\u00a2\3\2\2\2\36\u00a4\3\2\2\2 \u00a9\3\2\2\2\""+
		"\u00ac\3\2\2\2$\u00b6\3\2\2\2&\u00be\3\2\2\2(\u00cd\3\2\2\2*\u00d4\3\2"+
		"\2\2,\u00d8\3\2\2\2.\u00da\3\2\2\2\60\u00df\3\2\2\2\62\u00e1\3\2\2\2\64"+
		"\u00ef\3\2\2\2\66\u00f2\3\2\2\28\u00fd\3\2\2\2:\u0107\3\2\2\2<\u0109\3"+
		"\2\2\2>\u010b\3\2\2\2@\u010d\3\2\2\2B\u0113\3\2\2\2D\u0116\3\2\2\2F\u0126"+
		"\3\2\2\2H\u0128\3\2\2\2J\u012a\3\2\2\2L\u012c\3\2\2\2N\u0132\3\2\2\2P"+
		"\u0134\3\2\2\2R\u0148\3\2\2\2TU\5\4\3\2UV\5&\24\2VW\7\1\2\2W\3\3\2\2\2"+
		"X\\\5\6\4\2Y[\5L\'\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2"+
		"\2^\\\3\2\2\2_c\5\b\5\2`b\5\n\6\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2df\3\2\2\2ec\3\2\2\2fg\5\26\f\2g\5\3\2\2\2hi\7\17\2\2ik\7\67\2\2j"+
		"l\7\65\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5N(\2p"+
		"\7\3\2\2\2qr\7\25\2\2rs\7\67\2\2st\7\64\2\2tu\5N(\2u\t\3\2\2\2v}\5\f\7"+
		"\2w}\5\16\b\2x}\5\20\t\2y}\5\22\n\2z}\5\24\13\2{}\5L\'\2|v\3\2\2\2|w\3"+
		"\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\13\3\2\2\2~\177\7\32\2"+
		"\2\177\u0080\7\67\2\2\u0080\u0081\7\64\2\2\u0081\u0082\5N(\2\u0082\r\3"+
		"\2\2\2\u0083\u0084\7\27\2\2\u0084\u0085\7\67\2\2\u0085\u0086\58\35\2\u0086"+
		"\u0087\5N(\2\u0087\17\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u008a\7\67\2\2"+
		"\u008a\u008b\5 \21\2\u008b\u008c\5N(\2\u008c\21\3\2\2\2\u008d\u008e\7"+
		"$\2\2\u008e\u008f\7\67\2\2\u008f\u0090\5$\23\2\u0090\u0091\5N(\2\u0091"+
		"\23\3\2\2\2\u0092\u0093\7/\2\2\u0093\u0094\7\67\2\2\u0094\u0095\7\64\2"+
		"\2\u0095\u0096\5N(\2\u0096\25\3\2\2\2\u0097\u0098\7%\2\2\u0098\u0099\7"+
		"\67\2\2\u0099\u009a\5\30\r\2\u009a\u009b\5N(\2\u009b\27\3\2\2\2\u009c"+
		"\u009d\5\32\16\2\u009d\u009e\5\36\20\2\u009e\31\3\2\2\2\u009f\u00a0\5"+
		"<\37\2\u00a0\u00a1\5\34\17\2\u00a1\33\3\2\2\2\u00a2\u00a3\t\2\2\2\u00a3"+
		"\35\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5\37\3\2\2\2\u00a6\u00aa\7\32\2\2\u00a7"+
		"\u00aa\7\24\2\2\u00a8\u00aa\5\"\22\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00a8\3\2\2\2\u00aa!\3\2\2\2\u00ab\u00ad\7\65\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\7\61\2\2\u00b1\u00b3\7\65\2\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"#\3\2\2\2\u00b6\u00b7\5\"\22\2\u00b7\u00b9\7\20\2\2\u00b8\u00ba\7\65\2"+
		"\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc%\3\2\2\2\u00bd\u00bf\5(\25\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\'\3\2\2\2"+
		"\u00c2\u00c4\5*\26\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\66\2\2"+
		"\u00c8\u00c9\5P)\2\u00c9\u00ca\7\66\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00ce"+
		"\5J&\2\u00cc\u00ce\5L\'\2\u00cd\u00c3\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00d5\5,\27\2\u00d0\u00d5\5@!\2\u00d1"+
		"\u00d5\5F$\2\u00d2\u00d5\5H%\2\u00d3\u00d5\7\"\2\2\u00d4\u00cf\3\2\2\2"+
		"\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5+\3\2\2\2\u00d6\u00d9\5.\30\2\u00d7\u00d9\5D#\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9-\3\2\2\2\u00da\u00db\5\60\31\2\u00db"+
		"\u00dc\5\66\34\2\u00dc/\3\2\2\2\u00dd\u00e0\5\62\32\2\u00de\u00e0\5> "+
		"\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\61\3\2\2\2\u00e1\u00e2"+
		"\5:\36\2\u00e2\u00e3\5<\37\2\u00e3\u00e4\5\64\33\2\u00e4\63\3\2\2\2\u00e5"+
		"\u00e7\7 \2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f0\3\2\2\2\u00ea\u00ec\7\33\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0"+
		"\65\3\2\2\2\u00f1\u00f3\7\65\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2"+
		"\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8"+
		"\7\61\2\2\u00f7\u00f9\7\65\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\67\3\2\2\2\u00fc\u00fe"+
		"\7\65\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7\61\2\2\u0102\u0104"+
		"\7\65\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u01069\3\2\2\2\u0107\u0108\t\3\2\2\u0108;\3\2\2\2"+
		"\u0109\u010a\t\4\2\2\u010a=\3\2\2\2\u010b\u010c\7.\2\2\u010c?\3\2\2\2"+
		"\u010d\u010f\5B\"\2\u010e\u0110\5,\27\2\u010f\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112A\3\2\2\2\u0113"+
		"\u0114\7\35\2\2\u0114\u0115\7\65\2\2\u0115C\3\2\2\2\u0116\u0118\7\5\2"+
		"\2\u0117\u0119\5.\30\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\31\2\2"+
		"\u011dE\3\2\2\2\u011e\u0127\7\23\2\2\u011f\u0127\7,\2\2\u0120\u0127\7"+
		"\21\2\2\u0121\u0127\7!\2\2\u0122\u0123\7\67\2\2\u0123\u0127\7\23\2\2\u0124"+
		"\u0125\7\23\2\2\u0125\u0127\7\67\2\2\u0126\u011e\3\2\2\2\u0126\u011f\3"+
		"\2\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127G\3\2\2\2\u0128\u0129\t\5\2\2\u0129I\3\2\2\2\u012a"+
		"\u012b\5\24\13\2\u012bK\3\2\2\2\u012c\u012d\7\13\2\2\u012d\u012e\7\64"+
		"\2\2\u012e\u012f\7\66\2\2\u012fM\3\2\2\2\u0130\u0133\5L\'\2\u0131\u0133"+
		"\7\66\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133O\3\2\2\2\u0134"+
		"\u0135\7\36\2\2\u0135\u0139\7\67\2\2\u0136\u0138\5R*\2\u0137\u0136\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"Q\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\7\"\2\2\u013d\u013c\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0149"+
		"\3\2\2\2\u0141\u0149\7\34\2\2\u0142\u0149\7\f\2\2\u0143\u0149\7\4\2\2"+
		"\u0144\u0149\7\62\2\2\u0145\u0149\7\b\2\2\u0146\u0149\7\23\2\2\u0147\u0149"+
		"\7\64\2\2\u0148\u013d\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0142\3\2\2\2"+
		"\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0147\3\2\2\2\u0149S\3\2\2\2\36\\cm|\u00a9\u00ae\u00b4"+
		"\u00bb\u00c0\u00c5\u00cd\u00d4\u00d8\u00df\u00e8\u00ed\u00ef\u00f4\u00fa"+
		"\u00ff\u0105\u0111\u011a\u0126\u0132\u0139\u013f\u0148";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}