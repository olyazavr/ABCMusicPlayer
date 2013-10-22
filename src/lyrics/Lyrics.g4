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
 * 
 */

WORD : ('\'' | '(' | ')' | ',' | [a-zA-Z0-9] | '.' | '!' | '?' | ':' | ';')+ ;
UNION_OPER : '~' | '\-';
HYPHEN : '-';
STAR : '*';
EXTENDER : '_';
PIPE : '|';
WHITESPACE : ' ';
LINESPACE : [\t\n\r]+ -> skip ;

/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * lyric: 
 * 	no PIPEs at the beginning of a lyric
 * 	no empty lyric
 * 	can have multiple measures and any amount of trailing whitespace at the end
 * measure:
 * 	can be an entire lyric if no PIPEs are found
 * 	can be empty or a cluster (the first word in the cluster determines the first token)
 * 	clusters can ONLY start with a syllable, a HYPHEN, or a STAR
 * syllable_cluster:
 *	begins with a syllable
 *	if followed by HYPHEN|WHITESPACE HYPHEN|STAR|EXTENDER|UNION_OPER it will end with a syllable_cluster|
 *	its corresponding
 *		matching token
 *	will end with a syllable or an EXTENDER, and/or a WHITESPACE
 *	one WHITESPACE is allowed at the end of every cluster
 * hyphen_cluster:

 *
 */
 
lyric : measure+ WHITESPACE* EOF;

measure : cluster+ WHITESPACE? PIPE?| PIPE WHITESPACE?;

cluster : (syllable_cluster| hyphen_cluster | star_cluster ) WHITESPACE?;

syllable_cluster : syllable HYPHEN (syllable_cluster|hyphen_cluster|extender_cluster)| syllable WHITESPACE HYPHEN (syllable_cluster|hyphen_cluster|extender_cluster)| 
	syllable STAR (syllable_cluster|star_cluster) | syllable UNION_OPER syllable_cluster | 
	syllable EXTENDER (syllable_cluster|extender_cluster) | (syllable | EXTENDER) WHITESPACE?;

hyphen_cluster : syllable_cluster | HYPHEN syllable_cluster | HYPHEN WHITESPACE?;
star_cluster : HYPHEN syllable_cluster| STAR cluster | STAR WHITESPACE?;
extender_cluster : HYPHEN cluster | EXTENDER WHITESPACE?;

syllable : WORD;