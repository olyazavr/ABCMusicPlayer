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
DIGIT: [0-9];
NEWLINE: [\n];
COLON : ':';
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=';
TEXT: [a-zA-Z'.''!''#''&''('')''?'];
WHITESPACE : [ \t\r]+ -> skip ;

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
abc_tune : abc_header abc_music EOF;

abc_header : field_number comment* field_title other_fields* field_key;

field_number : 'X' COLON DIGIT+ end_of_line;
field_title : 'T' COLON text_with_numbers end_of_line;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | comment;
field_composer : 'C' COLON text_with_numbers end_of_line;
field_default_length : 'L' COLON note_length_strict end_of_line;
field_meter : 'M' COLON meter end_of_line;
field_tempo : 'Q' COLON tempo end_of_line;
field_voice : 'V' COLON text_with_numbers end_of_line;
field_key : 'K' COLON key end_of_line;

text_with_numbers: DIGIT* TEXT+ DIGIT* text_with_numbers*;
basenote : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B'| 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';

key : keynote mode_minor?;
keynote : basenote key_accidental?;
key_accidental : '#' | 'b';
mode_minor : 'm';

meter : 'C' | 'C|' | meter_fraction;
meter_fraction : DIGIT+ '/' DIGIT+;

tempo : meter_fraction '=' DIGIT+;

abc_music : abc_line+;
abc_line : element+ NEWLINE (lyric NEWLINE)? | mid_tune_field | comment;
element : note_element | tuplet_element | barline | nth_repeat ;

note_element : note | multi_note;

note : note_or_rest note_length?;
note_or_rest : pitch | rest;
pitch : ACCIDENTAL? basenote octave?;
octave : '\''+ | ','+;
note_length : DIGIT+ '/'? | '/' |  DIGIT* '/' DIGIT+;
note_length_strict : DIGIT+ '/' DIGIT+;

rest : 'z';

tuplet_element : tuplet_spec note_element+;
tuplet_spec : '(' DIGIT ;

multi_note : '[' note+ ']';

barline : '|' | '||' | '[|' | '|]' | COLON '|' | '|' COLON;
nth_repeat : '[1' | '[2';

mid_tune_field : field_voice;

comment : '%' text_with_numbers NEWLINE;
end_of_line : comment | NEWLINE;

lyric : 'w' COLON lyrical_element*;
lyrical_element : '-' | '_' | '*' | '~' | '\-' | '|' | text_with_numbers;
