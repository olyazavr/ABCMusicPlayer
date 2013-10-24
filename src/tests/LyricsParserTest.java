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

import player.LyricsListener;

/**
 * Testing strategy: The first part of this test suite will test for compilation
 * errors. All valid inputs should pass the tests without any exception
 * throwing. The second part will be a more rigorous test suite to test for
 * accuracy.
 * 
 * As the documentation for the antlr parser describes, there are six different
 * groupings being formed with rules explicitly describing what is/is not
 * allowed as an input lyric. Each one of the valid inputs will be tested for
 * compilation, in the first test suite, and then for accuracy in the second
 * suite. The seven groupings are:
 * 
 * lyric, measure, cluster, syllable_cluster, hyphen_cluster, star_cluster,
 * extender_cluster
 * 
 * @category no_didit
 */
public class LyricsParserTest {

	/**
	 * Compilation tests: general, non-antlr-rule specific tests
	 */

	@Test
	public void noSymbolsTest() {
		String input = "A 2 mazing";
		verifyWalk(input);
	}

	@Test
	public void endTrailingSpaceTest() {
		// inputs can start with pipes, words, stars, or hyphens and end with
		// any amount of trailing whitespaces.
		String input1 = "abc       ";
		String input2 = "*       ";
		String input3 = "-       ";
		String input4 = "|       ";
		verifyWalk(input1);
		verifyWalk(input2);
		verifyWalk(input3);
		verifyWalk(input4);

		// also test for multiple beginnings and trailing space
		String input11 = "abc abc       ";
		String input12 = "** --       ";
		String input13 = "-- |      ";
		String input14 = "|| a      ";
		verifyWalk(input11);
		verifyWalk(input12);
		verifyWalk(input13);
		verifyWalk(input14);
	}

	@Test
	public void noSymbols2Test() {
		String input = "Aaah b2.! ? (223) dire ,,, find:it or., then; l O";
		verifyWalk(input);
	}

	@Test
	public void allSymbolsTest() {
		String input = "a-1 a-22 bb-1 | a_1 a_22 bb_2 | a*1 a*22 bb*2 | a~1 a~22 bb~2 | a\\-1 a\\-22 bb\\-2 |"
				+ " a--1 a--22 bb--2 | a -1 a -22 bb -2 | a-_1 a-_22 bb-_2 | a____ a-___ | a--- a***";
		verifyWalk(input);
	}

	/**
	 * Antlr-rules-specific tests. Each java doc begins with the grouping name
	 * followed by each of its rules, "category". They build on each other
	 * starting with the most general "lyric" grouping to achieve a
	 * "dynamic-test-programming" strategy
	 */

	/**
	 * lyric
	 * 
	 * @category no empty lyric
	 * @category can have multiple measures and any amount of trailing
	 *           whitespace at the end.
	 */
	@Test
	public void lyricAnyNumMeasuresTest() {
		// only one measure, no bars
		String input1 = "word other word";
		verifyWalk(input1);

		// only one measure, no bars
		String input2 = "word | other |word";
		verifyWalk(input2);
	}

	/**
	 * measure
	 * 
	 * @category can be an entire lyric if no PIPEs are found
	 * @category can be empty or a cluster (the first word in the cluster
	 *           determines the first token)
	 */
	@Test
	public void measureEmptyTest() {
		String input = "|||||";
		verifyWalk(input);
	}

	@Test
	public void measureNonEmptyTest() {
		String input = "| | | | |";
		verifyWalk(input);
	}

	/**
	 * cluster
	 * 
	 * @category can ONLY start with a WHITESPACE, a syllable, a HYPHEN, or a
	 *           STAR so clusters will always be one of these three cluster
	 *           types.
	 * @category single syllable, single HYPHEN, and single STAR can be
	 *           considered a full cluster
	 * @category only HYPHEN allowed, only STAR+ allowed; no combination without
	 *           the use of syllable_clusters
	 * @category one WHITESPACE is allowed at the end of every cluster
	 */
	@Test
	public void clusterStartThreeTypesTest() {
		// a WORD is a terminating token therefore it will be used to fill all
		// recursive calls for these tests
		String generalCluster = "abc    ";

		// test all three allowed clusters
		String syllable_cluster = "|w2Df!" + generalCluster;
		String hyphen_cluster = "|-" + generalCluster;
		String star_cluster = "|*" + generalCluster;

		verifyWalk(syllable_cluster);
		verifyWalk(hyphen_cluster);
		verifyWalk(star_cluster);
	}

	@Test
	public void clusterEmptySymbolsTest() {
		String input = "* | **** ---- | * | - | word";
		verifyWalk(input);
	}

	@Test
	public void clusterWhitespacesTest() {
		// can have a whitespace before and after a cluster but no more than
		// that and for an empty cluster, only one whitespace is allowed
		String input = "|| | |    ";
		verifyWalk(input);
	}

	/**
	 * hyphen_cluster
	 * 
	 * @category may begin with a syllable_cluster, or a HYPHEN and a cluster
	 * @category can end with a HYPHEN and a WHITESPACE
	 * @category can end with a WHITESPACE by becoming a syllable_cluster which
	 *           can end in a cluster which can end in a WHITESPACE
	 * @category may end in HYPHEN
	 */
	@Test
	public void hyphenClusterMultipleHyphenOnlyTest() {
		// only one HYPHEN is allowed if starting with a HYPHEN but multiple
		// ones are also allowed if it is only HYPHENs in the entire cluster
		String inputSingle = "-" + "-";
		String inputMultiple = "-" + "--- ";
		String inputComplex = "abc-- | abcd--aBB";

		verifyWalk(inputSingle);
		verifyWalk(inputMultiple);
		verifyWalk(inputComplex);
	}

	/**
	 * star_cluster
	 * 
	 * @category must begin with a STAR
	 * @category must end with a STAR or WHITESPACE
	 */
	@Test
	public void starClusterAllTest() {
		String inputSingle = "* ";
		String inputMultiple = "*" + "***** ";
		String inputComplex = "* * * ABC ****";

		verifyWalk(inputSingle);
		verifyWalk(inputMultiple);
		verifyWalk(inputComplex);
	}

	/**
	 * extender_cluster
	 * 
	 * @category may begin with a HYPHEN followed by a cluster
	 * @category will end with an EXTENDER and/or a WHITESPACE
	 */
	@Test
	public void extenderClusterAllTest() {
		String inputSingle = "abc2!_ ";
		String inputMultiple = "PASS____ ";
		String inputComplex = "this_ is__ a_ long___ lyric___________";

		verifyWalk(inputSingle);
		verifyWalk(inputMultiple);
		verifyWalk(inputComplex);
	}
	
	/**
	 * syllable_cluster
	 * 
	 * @category begins with a syllable
	 * @category followed by HYPHEN|WHITESPACE HYPHEN|EXTENDER|UNION_OPER it
	 *           will end with a syllable_cluster| its corresponding matching
	 *           token with the exception of WHITESPACE HYPHEN which will also
	 *           be redirected to hyphen_cluster
	 * @category will end with a syllable or an EXTENDER, and/or a WHITESPACE
	 *           (in some cases a cluster will be reached because an extra
	 *           WHITESPACE is needed)
	 * @category may end in HYPHEN
	 */
	@Test
	public void syllableClusterEndExtenderTest() {
		// a WORD is a terminating token therefore it will be used to fill all
		// recursive calls for these tests
		String generalCluster = "abc";
		// any number of EXTENDERs are allowed
		String inputSingle = generalCluster + "_";
		String inputMultiple = generalCluster + "_______";
		String inputMultipleWhite = generalCluster + "_______    ";

		verifyWalk(inputSingle);
		verifyWalk(inputMultiple);
		verifyWalk(inputMultipleWhite);
	}

	@Test
	public void syllableClusterMultipleTest() {
		// a WORD is a terminating token therefore it will be used to fill all
		// recursive calls for these tests
		String generalWord = "abc";

		// syllable HYPHEN syllable_cluster
		String inputHyphen = generalWord + "-" + generalWord;
		// syllable WHITESPACE HYPHEN syllable_cluster
		String inputWhiteHyphen = generalWord + " -" + generalWord;
		// syllable UNION_OPER syllable_cluster
		String inputTilda = generalWord + "~" + generalWord;
		String inputSlashHyphen = "Mary\\-Jane";
		// syllable EXTENDER extender_cluster
		String inputExtender = generalWord + "___ ";

		verifyWalk(inputHyphen);
		verifyWalk(inputWhiteHyphen);
		verifyWalk(inputTilda);
		verifyWalk(inputSlashHyphen);
		verifyWalk(inputExtender);
	}

	/**
	 * Complex test involving EVERY valid combination
	 */
	@Test
	public void allTest() {
		String input = "It's done.| "
				+ "Your e-ner-gy is de-crea-sing |"
				+ "with e-very blow___. | "
				+ "I~'m sa-tis-fied now.| "
				+ "* In fact,-* you're not -even| "
				+ "a cha~llen~ge to me| "
				+ "* * *** anymore. | "
				+ "It woul -dn't be-fair for-me-to-continue| "
				+ "fighting. * * *| "
				+ "You-have-cha~lleng\\-ed and-lost| "
				+ "to-- a-fighter who is| "
				+ "sup-erior to-you,-- and-to-make| "
				+ "it-worse:-- he-was * just-a-mon-key, right?| "
				+ "It would~be mea~ning~less to| "
				+ "fight you now;| "
				+ "you're-too scared and-a-shamed.| "
				+ "Live with the shock.| "
				+ "* * * * *| "
				+ "Keep it| "
				+ "bottled up| "
				+ "inside of you.| "
				+ "Good-bye, Frieza| "
				+ ", * | "
				+ "may you live-the| "
				+ "rest of-your-life| "
				+ "in peace...... -Goku";
		verifyWalk(input);
	}
	
	/**
	 * Listener tests: walker tests
	 */

	@Test
	public void simpleTest() {
		String input = "A2! | * - *** a-b a--b a -b | ";
		verifyWalk(input);
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
		LyricsListener listener = new LyricsListener();
		walker.walk(listener, tree);
	}

}