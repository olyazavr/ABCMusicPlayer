package tests;

import lyrics.LyricsLexer;
import lyrics.LyricsParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import player.Listener;

/**
 * 
 * @category no_didit
 */
public class LyricsParserTest {

	@Test
	public void lyricParserTestTest() {
		String input1 = "A 2| ma-zing | \n";
		String input2 = "Aaah b2.! ? (223) dire ,,, find:it or., then; l O";
		String input3 = "| || ||";
		String input4 = "a-1 a-22 bb-1 | a_1 a_22 bb_2 | a*1 a*22 bb*2 | a~1 a~22 bb~2 | a\\-1 a\\-22 bb\\-2 |"
				+ " a--1 a--22 bb--2 | a -1 a -22 bb -2 | a-_1 a-_22 bb-_2 | a____ a-___ | a--- a***";
		
		verifyWalk(input1);
		verifyWalk(input2);
		verifyWalk(input3);
		verifyWalk(input4);
	}

	/**
	 * Helper method to bring up the tree (if in debug mode) and to make sure
	 * the tree is walkable
	 * 
	 * @param input
	 *            to be fed to the lexer/parser
	 */
	private void verifyWalk(String input) {
		// Create a stream of tokens using the lexer.
		CharStream stream = new ANTLRInputStream(input);
		LyricsLexer lexer = new LyricsLexer(stream);
		lexer.reportErrorsAsExceptions();
		TokenStream tokens = new CommonTokenStream(lexer);

		// Feed the tokens into the parser.
		LyricsParser parser = new LyricsParser(tokens);
		parser.reportErrorsAsExceptions();

		// Generate the parse tree using the starter rule.
		ParseTree tree;
		tree = parser.lyric(); // "lyric" is the starter rule.
		((RuleContext) tree).inspect(parser);

		// Walk the tree with the listener.

		ParseTreeWalker walker = new ParseTreeWalker();
		Listener listener = new Listener();
		walker.walk(listener, tree);
	}

}