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
 * lexed together with their modifiers. Tuplet and chord (2, (3, (4, [, and ] symbols are 
 * lexed separately from their notes.
 * Repeats and pipes are lexed on their own.
 * Tabs and spaces are ignored.
 *
 */
 
WHITESPACE : [ \t]+ -> skip ;
NEWLINE: [\n\r];
INDEX : 'X:' ' '* [0-9]+ ' '* [\n\r]+;
TITLE : 'T:' ' '* [a-zA-Z0-9'.'' '',''!''#''&''('')''?']+ ' '* [\n\r]+;
COMPOSER : 'C:' ' '* [a-zA-Z0-9'.'' ']+ ' '* [\n\r]+;
LENGTH : 'L:' ' '* [0-9]+'/'[0-9]+ ' '* [\n\r]+;
METER : 'M:' ' '* ('C' | 'C|' | [0-9]+'/'[0-9]+) ' '* [\n\r]+;
TEMPO : 'Q:' ' '* ([0-9]+'/'[0-9]+ ' '* '=')? ' '* [0-9]+ ' '* [\n\r]+;
VOICE : 'V:' ' '* [a-zA-Z0-9] ' '* [\n\r]+;
KEY : 'K:' ' '* [A-Ga-g]['#''b']?'m'? ' '* [\n\r]+;
LYRIC : 'w:' ('-' | ' ' | '|' | '\'' | '(' | ')' | '_' | '*' | '~' | ',' | '\-' | [a-zA-Z0-9] | '.' | '!' | '?')+ ' '* [\n\r]+;
COMMENT : '%' ('-' | '^' | '=' | '_'  | ' ' | '|' | '\'' | '(' | ')' | ']' | '[' | ':' |'_' | '*' | '~' | ',' | '/' | [a-zA-Z0-9] | '.' | '!' | '?')*  [\n\r]+;
NOTE :  ('^'|'^^'|'_'|'__'|'=')?[a-gA-G]['\''',']*([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
REST : ('z'|'Z') ([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
DUPLET: '(' '2';
TRIPLET: '(' '3';
QUAD: '(' '4';
PIPE: '|' | '[|';
LBRAC: '[';
RBRAC: ']';
LREPEAT: '|:' | '||:';
RREPEAT: ':|' | ':||';
ONE_REPEAT : '[1';
TWO_REPEAT: '[2';
END_NOTES: '|]' | '||';

/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * The entire abc_tune is the abc_header and abc_music. 
 * Each header field has its own rule, and they collectively make up abc_header.
 * abc_music is either lines, voices, or comments. A line consists of measures and lyrics.
 * A measure consists of repeats, pipes, note elements, and has to end in a repeat,
 * newline, pipe, or end note symbols. Repeats have their own rules as well, but to get 
 * the entire repeated measure, extract the token from measure. Notes, rests, duplets, 
 * triplets, quadruplets, and chords have their own respective rules. 
 *
 */
abc_tune : abc_header abc_music NEWLINE* EOF;
abc_header : field_number field_title other_fields* field_key;

field_number : INDEX;
field_title : TITLE;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | COMMENT;
field_composer : COMPOSER;
field_default_length : LENGTH;
field_meter : METER;
field_tempo : TEMPO;
field_voice : VOICE;
field_key : KEY;

abc_music : (line | field_voice NEWLINE* | COMMENT)+;
line: NEWLINE* measure+ NEWLINE* lyric? NEWLINE*;
measure : (LREPEAT|ONE_REPEAT|TWO_REPEAT|PIPE)? note_element+ (PIPE|END_NOTES|NEWLINE|RREPEAT)?;

note_element : note | rest | chord | duplet | triplet | quadruplet;
note: NOTE;
rest: REST;
chord : LBRAC (note|rest)+ RBRAC;
lyric: LYRIC;

duplet: DUPLET (note|chord) (note|chord);
triplet: TRIPLET (note|chord) (note|chord) (note|chord);
quadruplet: QUAD (note|chord) (note|chord) (note|chord) (note|chord);
