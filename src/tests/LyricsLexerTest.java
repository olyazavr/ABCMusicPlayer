package tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import lyrics.LyricsLexer;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

/**
 * Tests the LyricsLexer, ensures tokens are what they should be. Tests all
 * kinds of lyrics.
 * 
 */
public class LyricsLexerTest {

	@Test
	public void simpleLyricsTest() {
		// Tests lyrics, which are lexed as one chunk.
		String input = "A 2| ma-zing | \n";
		verifyLexer(input, new String[] { "A", " ", "2", "|", " ", "ma", "-",
				"zing", " ", "|", " " });
	}
	
	@Test
	public void simpleLyrics2Test() {
		// Tests lyrics, which are lexed as one chunk.
		String input = "A 2 mazing ";
		verifyLexer(input, new String[] { "A", " ", "2", " ", "mazing", " "});
	}

	@Test
	public void noBarsNoSymbolsTest() {
		// Tests lyrics, which are lexed as one chunk.
		String input = "Aaah b2.! ? (223) dire ,,, find:it or., then; l O";
		verifyLexer(input, new String[] { "Aaah", " ", "b2.!", " ", "?", " ",
				"(223)", " ", "dire", " ", ",,,", " ", "find:it", " ", "or.,",
				" ", "then;", " ", "l", " ", "O" });
	}

	@Test
	public void onlyBarsAndSpacesTest() {
		// Tests lyrics, which are lexed as one chunk.
		String input = " |   | |||";
		verifyLexer(input, new String[] { " ", "|", " ", " ", " ", "|", " ",
				"|", "|", "|" });
	}

	@Test
	public void onlySymbolsTest() {
		// Tests lyrics, which are lexed as one chunk.
		String input = "-  _  *  ~  \\-  --  -_";
		verifyLexer(input,
				new String[] { "-", " ", " ", "_", " ", " ", "*", " ", " ",
						"~", " ", " ", "\\-", " ", " ", "--", " ", " ", "-","_" });
	}

	@Test
	public void onlyNewLinesTest() {
		String input = "\t\n\r";
		verifyLexer(input, new String[] {});
	}

	@Test
	public void complexMultiTokenTest() {
		String input = "a-1 a-22 bb-1 | a_1 a_22 bb_2 | a*1 a*22 bb*2 | a~1 a~22 bb~2 | a\\-1 a\\-22 bb\\-2 |"
				+ " a--1 a--22 bb--2 | a -1 a -22 bb -2 | a-_1 a-_22 bb-_2 | a____ a-___ | a--- a***";
		verifyLexer(input, new String[] { "a", "-", "1", " ", "a", "-", "22",
				" ", "bb", "-", "1", " ", "|", " ", "a", "_", "1", " ", "a",
				"_", "22", " ", "bb", "_", "2", " ", "|", " ", "a", "*", "1",
				" ", "a", "*", "22", " ", "bb", "*", "2", " ", "|", " ", "a",
				"~", "1", " ", "a", "~", "22", " ", "bb", "~", "2", " ", "|",
				" ", "a", "\\-", "1", " ", "a", "\\-", "22", " ", "bb", "\\-",
				"2", " ", "|", " ", "a", "--", "1", " ", "a", "--", "22", " ",
				"bb", "--", "2", " ", "|", " ", "a", " ", "-", "1", " ", "a",
				" ", "-", "22", " ", "bb", " ", "-", "2", " ", "|", " ", "a",
				"-","_", "1", " ", "a", "-","_", "22", " ", "bb", "-","_", "2", " ",
				"|", " ", "a", "____", " ", "a", "-", "___", " ", "|", " ", "a", "--","-", " ", "a", "***" });
	}

	/**
	 * Helper method to verify tokens are what they should be. Assert fails if
	 * they are not.
	 * 
	 * @param input
	 *            to be lexed
	 * @param expectedTokens
	 *            list of Strings that should match the tokens
	 */
	private void verifyLexer(String input, String[] expectedTokens) {
		CharStream stream = new ANTLRInputStream(input);
		LyricsLexer lexer = new LyricsLexer(stream);
		lexer.reportErrorsAsExceptions();
		List<? extends Token> actualTokens = lexer.getAllTokens();

		assertEquals(expectedTokens.length, actualTokens.size());

		for (int i = 0; i < actualTokens.size(); i++) {
			String actualToken = actualTokens.get(i).getText();
			String expectedToken = expectedTokens[i];
			assertEquals(actualToken, expectedToken);
		}
	}

}
