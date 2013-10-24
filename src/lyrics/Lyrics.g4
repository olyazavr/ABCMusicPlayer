 /**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/lyrics>) and run the following command:
 *
 * java -jar ../../antlr.jar Lyrics.g4
 */

grammar Lyrics;

/*
 * This puts "package lyrics;" at the top of the output Java files.
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
 */

WORD : ('\'' | '(' | ')' | ',' | [a-zA-Z0-9] | '.' | '!' | '?' | ':' | ';')+ ;
UNION_OPER : '~' | '\-';
DOUBHYPHEN : '--';
HYPHEN : '-';
STARS : '*'+;
EXTENDERS : '_'+;
PIPE : '|';
WHITESPACE : ' ';
LINESPACE : [\t\n\r]+ -> skip ;

/*
 * These are the parser rules. They define the structures used by the parser.
 * A well constructed lyric will be parsed as follows
 * 
 * lyric:
 *		no empty lyric
 *		can have multiple measures and any amount of trailing whitespace at the end
 * measure:
 *		can be an entire lyric if no PIPEs are found
 *		can be empty or a cluster (the first word in the cluster determines the first token)
 * cluster:
 *		can ONLY start with a syllable or a STARS so clusters will always be one of these
 * 			two cluster types
 *		single syllable, single HYPHEN, and single STAR can be considered a full cluster
 *		only HYPHEN+ allowed, only STAR+ allowed; no combination without the use of syllable_clusters
 *		one WHITESPACE is allowed at the end of every cluster
 * syllable_cluster:
 *		begins with a syllable
 *		if followed by HYPHEN|WHITESPACE HYPHEN|EXTENDER|UNION_OPER it will end with a syllable_cluster|
 *			its corresponding matching token with the exception of WHITESPACE HYPHEN which will also be 
 *			redirected to hyphen_cluster 
 *		will end with a syllable or an EXTENDER, and/or a WHITESPACE (in some cases a cluster will be reached
 * 			because a WHITESPACE is needed)
 *		may end in HYPHEN
 * hyphen_cluster:
 *		may begin with a syllable_cluster, or a HYPHEN and a cluster
 *		can end with a HYPHEN and a WHITESPACE
 * 		can end with a WHITESPACE by becoming a syllable_cluster which can end in a cluster which can
 * 		end in a WHITESPACE
 * 		may end in a HYPHEN
 * stars_cluster:
 * 		must be the only thing in a cluster so will begin and end in STARS
 *		must end with a STAR or WHITESPACE
 * extender_cluster:
 * 		may begin with a HYPHEN followed by a cluster
 *		will end with an EXTENDER and/or a WHITESPACE
 */

lyric	: measure+ WHITESPACE* EOF;
measure	: PIPE? WHITESPACE? cluster+ WHITESPACE PIPE?| PIPE? WHITESPACE? cluster+ WHITESPACE? PIPE | PIPE WHITESPACE?;
cluster	: (syllable_cluster | STARS );

syllable_cluster : 	syllable WHITESPACE? HYPHEN (syllable_cluster|EXTENDERS)| 
				   	syllable DOUBHYPHEN (syllable_cluster|EXTENDERS)| 
				   	syllable UNION_OPER syllable_cluster| 
					syllable EXTENDERS | 
					syllable;

syllable : WORD;