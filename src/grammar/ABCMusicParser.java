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
		WHITESPACE=1, DIGIT=2, NEWLINE=3, INDEX=4, TITLE=5, COMPOSER=6, LENGTH=7, 
		METER=8, TEMPO=9, VOICE=10, KEY=11, LYRIC=12, COMMENT=13, NOTE=14, REST=15, 
		PAREN=16, PIPE=17, LBRAC=18, RBRAC=19, LREPEAT=20, RREPEAT=21, ONE_REPEAT=22, 
		TWO_REPEAT=23, END_NOTES=24;
	public static final String[] tokenNames = {
		"<INVALID>", "WHITESPACE", "DIGIT", "NEWLINE", "INDEX", "TITLE", "COMPOSER", 
		"LENGTH", "METER", "TEMPO", "VOICE", "KEY", "LYRIC", "COMMENT", "NOTE", 
		"REST", "'('", "'|'", "'['", "']'", "'|:'", "':|'", "'[1'", "'[2'", "END_NOTES"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
		RULE_other_fields = 4, RULE_field_composer = 5, RULE_field_default_length = 6, 
		RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, 
		RULE_abc_music = 11, RULE_measure = 12, RULE_note_element = 13, RULE_note = 14, 
		RULE_rest = 15, RULE_tuplet = 16, RULE_chord = 17, RULE_lyric = 18;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "abc_music", "measure", "note_element", "note", 
		"rest", "tuplet", "chord", "lyric"
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
		public List<TerminalNode> NEWLINE() { return getTokens(ABCMusicParser.NEWLINE); }
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ABCMusicParser.NEWLINE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); abc_header();
			setState(39); abc_music();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(40); match(NEWLINE);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46); match(EOF);
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
		public List<TerminalNode> COMMENT() { return getTokens(ABCMusicParser.COMMENT); }
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(ABCMusicParser.COMMENT, i);
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
			setState(48); field_number();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(49); match(COMMENT);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); field_title();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER) | (1L << LENGTH) | (1L << METER) | (1L << TEMPO) | (1L << VOICE) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(56); other_fields();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); field_key();
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
		public TerminalNode INDEX() { return getToken(ABCMusicParser.INDEX, 0); }
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
			setState(64); match(INDEX);
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
		public TerminalNode TITLE() { return getToken(ABCMusicParser.TITLE, 0); }
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
			setState(66); match(TITLE);
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
		public TerminalNode COMMENT() { return getToken(ABCMusicParser.COMMENT, 0); }
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
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
			setState(74);
			switch (_input.LA(1)) {
			case COMPOSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); field_composer();
				}
				break;
			case LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); field_default_length();
				}
				break;
			case METER:
				enterOuterAlt(_localctx, 3);
				{
				setState(70); field_meter();
				}
				break;
			case TEMPO:
				enterOuterAlt(_localctx, 4);
				{
				setState(71); field_tempo();
				}
				break;
			case VOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(72); field_voice();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(73); match(COMMENT);
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
		public TerminalNode COMPOSER() { return getToken(ABCMusicParser.COMPOSER, 0); }
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
			setState(76); match(COMPOSER);
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
		public TerminalNode LENGTH() { return getToken(ABCMusicParser.LENGTH, 0); }
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
			setState(78); match(LENGTH);
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
		public TerminalNode METER() { return getToken(ABCMusicParser.METER, 0); }
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
			setState(80); match(METER);
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
		public TerminalNode TEMPO() { return getToken(ABCMusicParser.TEMPO, 0); }
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
			setState(82); match(TEMPO);
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
		public TerminalNode VOICE() { return getToken(ABCMusicParser.VOICE, 0); }
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
			setState(84); match(VOICE);
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
		public TerminalNode KEY() { return getToken(ABCMusicParser.KEY, 0); }
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
			setState(86); match(KEY);
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
		public Field_voiceContext field_voice(int i) {
			return getRuleContext(Field_voiceContext.class,i);
		}
		public List<LyricContext> lyric() {
			return getRuleContexts(LyricContext.class);
		}
		public List<MeasureContext> measure() {
			return getRuleContexts(MeasureContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ABCMusicParser.NEWLINE); }
		public List<TerminalNode> COMMENT() { return getTokens(ABCMusicParser.COMMENT); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ABCMusicParser.NEWLINE, i);
		}
		public LyricContext lyric(int i) {
			return getRuleContext(LyricContext.class,i);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(ABCMusicParser.COMMENT, i);
		}
		public MeasureContext measure(int i) {
			return getRuleContext(MeasureContext.class,i);
		}
		public List<Field_voiceContext> field_voice() {
			return getRuleContexts(Field_voiceContext.class);
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
		enterRule(_localctx, 22, RULE_abc_music);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(122);
					switch (_input.LA(1)) {
					case NEWLINE:
					case NOTE:
					case REST:
					case PAREN:
					case PIPE:
					case LBRAC:
					case LREPEAT:
					case ONE_REPEAT:
					case TWO_REPEAT:
						{
						setState(91);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(88); match(NEWLINE);
							}
							}
							setState(93);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(95); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(94); measure();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(97); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						setState(102);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(99); match(NEWLINE);
								}
								} 
							}
							setState(104);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						}
						setState(106);
						_la = _input.LA(1);
						if (_la==LYRIC) {
							{
							setState(105); lyric();
							}
						}

						setState(111);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(108); match(NEWLINE);
								}
								} 
							}
							setState(113);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						}
						}
						break;
					case VOICE:
						{
						setState(114); field_voice();
						setState(118);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(115); match(NEWLINE);
								}
								} 
							}
							setState(120);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						}
						}
						break;
					case COMMENT:
						{
						setState(121); match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(124); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class MeasureContext extends ParserRuleContext {
		public TerminalNode ONE_REPEAT() { return getToken(ABCMusicParser.ONE_REPEAT, 0); }
		public TerminalNode LREPEAT() { return getToken(ABCMusicParser.LREPEAT, 0); }
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(ABCMusicParser.PIPE); }
		public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
		public TerminalNode RREPEAT() { return getToken(ABCMusicParser.RREPEAT, 0); }
		public TerminalNode PIPE(int i) {
			return getToken(ABCMusicParser.PIPE, i);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public TerminalNode END_NOTES() { return getToken(ABCMusicParser.END_NOTES, 0); }
		public TerminalNode TWO_REPEAT() { return getToken(ABCMusicParser.TWO_REPEAT, 0); }
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeasure(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_measure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIPE) | (1L << LREPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) {
				{
				setState(126);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIPE) | (1L << LREPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129); note_element();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << REST) | (1L << PAREN) | (1L << LBRAC))) != 0) );
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << PIPE) | (1L << RREPEAT) | (1L << END_NOTES))) != 0)) ) {
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

	public static class Note_elementContext extends ParserRuleContext {
		public TupletContext tuplet() {
			return getRuleContext(TupletContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
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
		enterRule(_localctx, 26, RULE_note_element);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); note();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); rest();
				}
				break;
			case LBRAC:
				enterOuterAlt(_localctx, 3);
				{
				setState(138); chord();
				}
				break;
			case PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(139); tuplet();
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
		public TerminalNode NOTE() { return getToken(ABCMusicParser.NOTE, 0); }
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
		enterRule(_localctx, 28, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(NOTE);
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
		public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
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
		enterRule(_localctx, 30, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(REST);
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

	public static class TupletContext extends ParserRuleContext {
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public TerminalNode PAREN() { return getToken(ABCMusicParser.PAREN, 0); }
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public TupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet(this);
		}
	}

	public final TupletContext tuplet() throws RecognitionException {
		TupletContext _localctx = new TupletContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tuplet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(PAREN);
			setState(147); match(DIGIT);
			setState(150); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(150);
					switch (_input.LA(1)) {
					case NOTE:
						{
						setState(148); note();
						}
						break;
					case LBRAC:
						{
						setState(149); chord();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ChordContext extends ParserRuleContext {
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public TerminalNode RBRAC() { return getToken(ABCMusicParser.RBRAC, 0); }
		public TerminalNode LBRAC() { return getToken(ABCMusicParser.LBRAC, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitChord(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(LBRAC);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155); note();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOTE );
			setState(160); match(RBRAC);
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
		public TerminalNode LYRIC() { return getToken(ABCMusicParser.LYRIC, 0); }
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
		enterRule(_localctx, 36, RULE_lyric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(LYRIC);
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
		"\2\3\32\u00a7\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16"+
		"\2/\13\2\3\2\3\2\3\3\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\7\3<\n\3\f"+
		"\3\16\3?\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6M\n\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\7\r\\\n\r\f\r\16"+
		"\r_\13\r\3\r\6\rb\n\r\r\r\16\rc\3\r\7\rg\n\r\f\r\16\rj\13\r\3\r\5\rm\n"+
		"\r\3\r\7\rp\n\r\f\r\16\rs\13\r\3\r\3\r\7\rw\n\r\f\r\16\rz\13\r\3\r\6\r"+
		"}\n\r\r\r\16\r~\3\16\5\16\u0082\n\16\3\16\6\16\u0085\n\16\r\16\16\16\u0086"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u008f\n\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\6\22\u0099\n\22\r\22\16\22\u009a\3\23\3\23\6\23\u009f"+
		"\n\23\r\23\16\23\u00a0\3\23\3\23\3\24\3\24\3\24\2\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\4\5\23\23\26\26\30\31\6\5\5\23\23\27\27\32"+
		"\32\u00ac\2(\3\2\2\2\4\62\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nL\3\2\2\2\fN"+
		"\3\2\2\2\16P\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24V\3\2\2\2\26X\3\2\2\2\30"+
		"|\3\2\2\2\32\u0081\3\2\2\2\34\u008e\3\2\2\2\36\u0090\3\2\2\2 \u0092\3"+
		"\2\2\2\"\u0094\3\2\2\2$\u009c\3\2\2\2&\u00a4\3\2\2\2()\5\4\3\2)-\5\30"+
		"\r\2*,\7\5\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3"+
		"\2\2\2\60\61\7\1\2\2\61\3\3\2\2\2\62\66\5\6\4\2\63\65\7\17\2\2\64\63\3"+
		"\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\2"+
		"9=\5\b\5\2:<\5\n\6\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2"+
		"?=\3\2\2\2@A\5\26\f\2A\5\3\2\2\2BC\7\6\2\2C\7\3\2\2\2DE\7\7\2\2E\t\3\2"+
		"\2\2FM\5\f\7\2GM\5\16\b\2HM\5\20\t\2IM\5\22\n\2JM\5\24\13\2KM\7\17\2\2"+
		"LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\13\3\2\2"+
		"\2NO\7\b\2\2O\r\3\2\2\2PQ\7\t\2\2Q\17\3\2\2\2RS\7\n\2\2S\21\3\2\2\2TU"+
		"\7\13\2\2U\23\3\2\2\2VW\7\f\2\2W\25\3\2\2\2XY\7\r\2\2Y\27\3\2\2\2Z\\\7"+
		"\5\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b"+
		"\5\32\16\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2dh\3\2\2\2eg\7\5\2\2"+
		"fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2km\5&\24\2"+
		"lk\3\2\2\2lm\3\2\2\2mq\3\2\2\2np\7\5\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2r}\3\2\2\2sq\3\2\2\2tx\5\24\13\2uw\7\5\2\2vu\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y}\3\2\2\2zx\3\2\2\2{}\7\17\2\2|]\3\2\2\2|t\3\2"+
		"\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\31\3\2\2\2\u0080\u0082"+
		"\t\2\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0085\5\34\17\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\t\3\2\2\u0089"+
		"\33\3\2\2\2\u008a\u008f\5\36\20\2\u008b\u008f\5 \21\2\u008c\u008f\5$\23"+
		"\2\u008d\u008f\5\"\22\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\35\3\2\2\2\u0090\u0091\7\20\2"+
		"\2\u0091\37\3\2\2\2\u0092\u0093\7\21\2\2\u0093!\3\2\2\2\u0094\u0095\7"+
		"\22\2\2\u0095\u0098\7\4\2\2\u0096\u0099\5\36\20\2\u0097\u0099\5$\23\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b#\3\2\2\2\u009c\u009e\7\24\2\2\u009d"+
		"\u009f\5\36\20\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\25\2\2\u00a3"+
		"%\3\2\2\2\u00a4\u00a5\7\16\2\2\u00a5\'\3\2\2\2\24-\66=L]chlqx|~\u0081"+
		"\u0086\u008e\u0098\u009a\u00a0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}