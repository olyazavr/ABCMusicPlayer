/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar Lyrics.g4
 */

grammar Lyrics;

/*
 * This puts "package grammar;" at the top of the output Java files.
 * Do not change these lines unless you know what you're doing.
 */
@header {
package lyrics;
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
 * These are the lyrics lexical rules. They define the tokens used by the lyrics lexer.
 *
 * All of the header lines and comments are individual tokens, then the notes and rests are 
 * lexed together with their modifiers. Tuplet and chord (, [, and ] symbols are lexed 
 * separately from their notes.
 * Repeats and pipes are lexed on their own.
 *
 */

WORD : ('\'' | '(' | ')' | ',' | [a-zA-Z0-9] | '.' | '!' | '?' | ':' | ';')+ ;
UNIONOPER : '~' | '\-';
BEGSYMBOL : '-'+ | '*'+;
EXTENDER : '_'+;
PIPE : '|';
WHITESPACE : ' ';
LINESPACE : [\t\n\r]+ -> skip ;

/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * Each header field has its own rule. Notes, rests, tuplets, chords, and measures have 
 * their own respective rules. Repeats have their own rules as well, but to get the 
 * entire repeated measure, extract the token from measure.
 * Lyrics also have their own rule.
 *
 */
lyric : measure+ WHITESPACE* EOF;
measure : cluster* PIPE?;
cluster : BEGSYMBOL cluster | syllable (BEGSYMBOL|EXTENDER|UNIONOPER) | WORD WHITESPACE '-'* cluster | WORD ;
syllable : WORD | '-' | '*' | '_';