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
 */
 
WHITESPACE : [ \t]+ -> skip ;
DIGIT: [0-9]+;
NEWLINE: [\n\r];
LREPEAT: '|:';
RREPEAT: ':|';
INDEX : 'X' ' '* ':' ' '* [0-9]+ ' '* [\n\r]+;
TITLE : 'T' ' '* ':' ' '* [a-zA-Z0-9'.'' '',''!''#''&''('')''?']+ ' '* [\n\r]+;
COMPOSER : 'C' ' '* ':' ' '* [a-zA-Z0-9'.'' ']+ ' '* [\n\r]+;
LENGTH : 'L' ' '* ':' ' '* [0-9]+'/'[0-9]+ ' '* [\n\r]+;
METER : 'M' ' '* ':' ' '* ('C' | 'C|' | [0-9]+'/'[0-9]+) ' '* [\n\r]+;
TEMPO : 'Q' ' '* ':' ' '* [0-9]+'/'[0-9]+ ' '* '=' ' '* [0-9]+ ' '* [\n\r]+;
VOICE : ('V' | 'v') ' '* ':' ' '* [a-zA-Z0-9] ' '* [\n\r]+;
KEY : 'K' ' '* ':' ' '* [A-Ga-g]['#''b']?'m'? ' '* [\n\r]+;
LYRIC : 'w' ' '* ':' ('-' | ' ' | '|' | '\'' | '(' | ')' | '_' | '*' | '~' | ',' | '\-' | [a-zA-Z] | '.' | '!' | '?')+ ' '* [\n\r];
COMMENT : '%' ' '* [a-zA-Z0-9'.''!''?''-''_''*''~''\-''|'' ']* ' '* [\n\r]+;
PAREN: '(';
PIPE: '|';
LBRAC: '[';
RBRAC: ']';
ONE_REPEAT : '[1';
TWO_REPEAT: '[2';
NOTE_LENGTH : [1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/';
END_NOTES: '|]' | '||';
NOTE :  ['^''^^''_''__''=']?[a-gA-G]['\''',']*([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;
REST : 'z'([1-9]* '/' [1-9]+ | [1-9]+ '/'? | '/')?;

/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * "line" the start rule.
 *
 * For more information, see
 * http://www.antlr.org/wiki/display/ANTLR4/Parser+Rules#ParserRules-StartRulesandEOF
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

abc_music : (NEWLINE* measure+ NEWLINE* LYRIC? NEWLINE* | field_voice NEWLINE* | COMMENT)+;
measure : (l_repeat|PIPE)? note_element+ (END_NOTES|NEWLINE|r_repeat);

note_element : note | rest | chord | tuplet;
note: NOTE;
rest: REST;
tuplet : PAREN DIGIT (note|chord)+;
chord : LBRAC note+ RBRAC;

l_repeat: LREPEAT | ONE_REPEAT | TWO_REPEAT;
r_repeat: RREPEAT;
