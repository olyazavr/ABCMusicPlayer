/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCMusic;

/*
 * This puts "package grammar;" at the top of the output Java files.
 * Do not change these lines unless you know what you're doing.
 */
@header {
package grammar;
}

/*
 * This adds code to the generated lexer and parser. This makes the lexer and
 * parser throw errors if they encounter invalid input. Do not change these
 * lines unless you know what you're doing.
 */
@members {
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
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 *
 * All of the header lines and comments are individual tokens, then the notes and rests are 
 * lexed together with their modifiers. Tuplet and chord (, [, and ] symbols are lexed 
 * separately from their notes.
 * Repeats and pipes are lexed on their own.
 *
 */
 
WHITESPACE : [ \t]+ -> skip ;
DIGIT: [0-9]+;
NEWLINE: [\n\r];
INDEX : 'X' ' '* ':' ' '* [0-9]+ ' '* [\n\r]+;
TITLE : 'T' ' '* ':' ' '* [a-zA-Z0-9'.'' '',''!''#''&''('')''?']+ ' '* [\n\r]+;
COMPOSER : 'C' ' '* ':' ' '* [a-zA-Z0-9'.'' ']+ ' '* [\n\r]+;
LENGTH : 'L' ' '* ':' ' '* [0-9]+'/'[0-9]+ ' '* [\n\r]+;
METER : 'M' ' '* ':' ' '* ('C' | 'C|' | [0-9]+'/'[0-9]+) ' '* [\n\r]+;
TEMPO : 'Q' ' '* ':' ' '* [0-9]+'/'[0-9]+ ' '* '=' ' '* [0-9]+ ' '* [\n\r]+;
VOICE : 'V' ' '* ':' ' '* [a-zA-Z0-9] ' '* [\n\r]+;
KEY : 'K' ' '* ':' ' '* [A-Ga-g]['#''b']?'m'? ' '* [\n\r]+;
LYRIC : 'w' ' '* ':' ('-' | ' ' | '|' | '\'' | '(' | ')' | '_' | '*' | '~' | ',' | '\-' | [a-zA-Z0-9] | '.' | '!' | '?')+ ' '* [\n\r];
COMMENT : '%' ' '* ([a-zA-Z0-9] | '.' | '!' | '?' | '\'' | '(' | ')' | '-' | '_' | '*' | '~' | '\-' | '|' | ' ')* ' '* [\n\r]+;
NOTE :  ['^''^^''_''__''=']?[a-gA-G]['\''',']*([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
REST : 'z'([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
PAREN: '(';
PIPE: '|';
LBRAC: '[';
RBRAC: ']';
LREPEAT: '|:';
RREPEAT: ':|';
ONE_REPEAT : '[1';
TWO_REPEAT: '[2';
END_NOTES: '|]' | '||';

/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * Each header field has its own rule. Notes, rests, tuplets, chords, and measures have 
 * their own respective rules. Repeats have their own rules as well, but to get the 
 * entire repeated measure, extract the token from measure. A measure has a bunch of 
 * notes and bars, optionally followed by lyrics.
 * Lyrics also have their own rule.
 *
 */
abc_tune : abc_header abc_music NEWLINE* EOF;
abc_header : field_number COMMENT* field_title other_fields* field_key;

field_number : INDEX;
field_title : TITLE;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | COMMENT;
field_composer : COMPOSER;
field_default_length : LENGTH;
field_meter : METER;
field_tempo : TEMPO;
field_voice : VOICE;
field_key : KEY;

abc_music : (NEWLINE* measure+ NEWLINE* | field_voice NEWLINE* | COMMENT)+;
measure : ((LREPEAT|ONE_REPEAT|TWO_REPEAT|PIPE)? note_element+ (PIPE|END_NOTES|RREPEAT))+ NEWLINE+ lyric?;

note_element : note | rest | chord | tuplet;
note: NOTE;
rest: REST;
tuplet : PAREN DIGIT (note|chord)+;
chord : LBRAC note+ RBRAC;
lyric: LYRIC;
