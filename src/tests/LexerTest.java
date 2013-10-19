package tests;

import static org.junit.Assert.assertEquals;
import grammar.ABCMusicLexer;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

/**
 * Tests the Lexer, ensures tokens are what they should be. Tests headers,
 * headers and body, and all kinds of strange notes (chords, repeats, tuplets,
 * etc).
 * 
 */
public class LexerTest {

    @Test
    public void basicHeaderOnlyTest() {
        String input = "X: 1 \n T:Piece No.1 \n K:C \n";
        verifyLexer(input, new String[] { "X: 1 \n", "T:Piece No.1 \n", "K:C \n" });
    }

    @Test
    public void extendedHeaderOnlyTest() {
        String input = "X: 1 \n T:Piece No.1 \n M:4/4 \n L:1/4 \n Q:1/4=140 \n K:C \n";
        verifyLexer(input, new String[] { "X: 1 \n", "T:Piece No.1 \n", "M:4/4 \n", "L:1/4 \n", "Q:1/4=140 \n",
                "K:C \n" });
    }

    @Test
    public void HeaderAndOneMeasureTest() {
        String input = "X: 1 \n T:Piece No.1 \n K:C \n C C C3/4 D/4 E";
        verifyLexer(input,
                new String[] { "X: 1 \n", "T:Piece No.1 \n", "K:C \n", "C", "C", "C", "3/4", "D", "/4", "E" });
    }

    
    private void verifyLexer(String input, String[] expectedTokens) {
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();

        assertEquals(expectedTokens.length, actualTokens.size());
        
        for(int i = 0; i < actualTokens.size(); i++) {
             String actualToken = actualTokens.get(i).getText();
             String expectedToken = expectedTokens[i];
             assertEquals(actualToken, expectedToken);
        }
    }
        
}
