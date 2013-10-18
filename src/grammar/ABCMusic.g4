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
LETTER: [a-zA-Z];
TEXT: [a-zA-Z]+;
DIGIT: [0-9];
WHITESPACE : [ \t\r\n]+ -> skip ;


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
abc-tune : abc-header abc-music EOF
abc-header : field-number comment* field-title other-fields* field-key

field-number : 'X:' DIGIT+ end-of-line
field-title : 'T:' text end-of-line
other-fields : field-composer | field-default-length | field-meter | field-tempo | field-voice | comment
field-composer : 'C:' text end-of-line
field-default-length : 'L:' note-length-strict end-of-line
field-meter : 'M:' meter end-of-line
field-tempo : 'Q:' tempo end-of-line
field-voice : 'V:' text end-of-line
field-key ::= "K:" key end-of-line

key ::= keynote [mode-minor]
keynote ::= basenote [key-accidental]
key-accidental ::= "#" | "b"
mode-minor ::= "m"

meter ::= "C" | "C|" | meter-fraction
meter-fraction ::= DIGIT+ "/" DIGIT+

tempo ::= meter-fraction "=" DIGIT+

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

abc-music ::= abc-line+
abc-line ::= element+ linefeed [lyric linefeed] | mid-tune-field | comment
element ::= note-element | tuplet-element | barline | nth-repeat | space 

note-element ::= note | multi-note

// note is either a pitch or a rest
note ::= note-or-rest [note-length]
note-or-rest ::= pitch | rest
pitch ::= [accidental] basenote [octave]
octave ::= "'"+ | ","+
note-length ::= [DIGIT+] ["/" [DIGIT+]]
note-length-strict ::= DIGIT+ "/" DIGIT+

; "^" is sharp, "_" is flat, and "=" is neutral
accidental ::= "^" | "^^" | "_" | "__" | "="

basenote ::= "C" | "D" | "E" | "F" | "G" | "A" | "B"
        | "c" | "d" | "e" | "f" | "g" | "a" | "b"

rest ::= "z"

// tuplets
tuplet-element ::= tuplet-spec note-element+
tuplet-spec ::= "(" DIGIT 

// chords
multi-note ::= "[" note+ "]"

barline ::= "|" | "||" | "[|" | "|]" | ":|" | "|:"
nth-repeat ::= "[1" | "[2"

; A voice field might reappear in the middle of a piece
; to indicate the change of a voice
mid-tune-field ::= field-voice

comment ::= "%" text linefeed
end-of-line ::= comment | linefeed

lyric ::= "w:" lyrical_element*
lyrical_element ::= " "+ | "-" | "_" | "*" | "~" | "\-" | "|" | lyric_text

