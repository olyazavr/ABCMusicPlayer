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
 
BASENOTE : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B'| 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';
DIGIT: [0-9]+;
NEWLINE: [\n];
COLON : ':';
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=';
WHITESPACE : [ \t\r]+ -> skip;
INDEX : 'X' ':' [0-9]+ [\n];
TITLE : 'T' ':' [a-zA-Z'.''!''#''&''('')''?']+ [\n];
COMPOSER : 'C' ':' [a-zA-Z0-9'.']+ [\n];
LENGTH : 'L' ':' [0-9]+'/'[0-9]+ [\n];
METER : 'M' ':' 'C' | 'C|' | [0-9]+'/'[0-9]+ [\n];
TEMPO : 'Q' ':' [0-9]+'/'[0-9]+ '=' [0-9]+ [\n];
VOICE : 'V' ':' [a-zA-Z0-9] [\n];
KEY : 'K' ':' [A-Ga-g]['#''b']?'m'? [\n];
LYRIC : 'w' ':'  ['-''_''*''~''\-''|']+ | ['-''_''*''~''\-''|']* [a-zA-Z'.''!''?']+;
COMMENT : '%' [a-zA-Z0-9'.''!''?''-''_''*''~''\-''|']+ [\n];
PAREN: '(';
PIPE: '|';
LBRAC: '[';
RBRAC: ']';
NTH_REPEAT : '[1' | '[2';
OCTAVE : '\''+ | ','+ ;
SLASH: '/';


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

abc_music : abc_line+;
abc_line : element+ NEWLINE (LYRIC NEWLINE)? | field_voice | COMMENT;
element : note_element | tuplet_element | barline | NTH_REPEAT ;

note_element : note+ | multi_note;

note : note_or_rest note_length?;
note_or_rest : pitch | rest;
pitch : ACCIDENTAL? BASENOTE OCTAVE?;
note_length : DIGIT SLASH? | SLASH |  DIGIT? SLASH DIGIT;

rest : 'z';

tuplet_element : tuplet_spec note_element+;
tuplet_spec : PAREN DIGIT ;

multi_note : LBRAC note+ RBRAC;

barline : PIPE | PIPE PIPE | LBRAC PIPE | PIPE RBRAC | COLON PIPE | PIPE COLON;
