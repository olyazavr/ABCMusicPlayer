package tests;

import lyrics.LyricsLexer;
import lyrics.LyricsParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import player.Listener;
import player.Main;

/**
 * Tests all the sample_abc files by playing them in the Main method, only makes
 * sure they don't crash. These files have all kinds of crazy stuff (chords,
 * repeats, comments, lyrics, etc)
 * 
 * @category no_didit
 */
public class PlayerTest {
	
    @Test
    public void lyricParserTestTest() {
    	String input = "one--two";
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
//    		((RuleContext) tree).inspect(parser);
    		
    		// Walk the tree with the listener.
    		ParseTreeWalker walker = new ParseTreeWalker();
    		Listener listener = new Listener();
    		walker.walk(listener, tree);
    }

    @Test
    public void playabcTest() {
        Main.play("sample_abc/abc_song.abc");
    }

    @Test
    public void fur_eliseTest() {
        Main.play("sample_abc/fur_elise.abc");
    }

    @Test
    public void inventionTest() {
        Main.play("sample_abc/invention.abc");
    }

    @Test
    public void little_night_musicTest() {
        Main.play("sample_abc/little_night_music.abc");
    }

    @Test
    public void paddyTest() {
        Main.play("sample_abc/paddy.abc");
    }

    @Test
    public void piece1Test() {
        Main.play("sample_abc/piece1.abc");
    }

    @Test
    public void piece2Test() {
        Main.play("sample_abc/piece2.abc");
    }

    @Test
    public void piece3Test() {
        Main.play("sample_abc/piece3.abc");
    }

    @Test
    public void preludeTest() {
        Main.play("sample_abc/prelude.abc");
    }

    @Test
    public void scaleTest() {
        Main.play("sample_abc/scale.abc");
    }

    @Test
    public void waxies_dargleTest() {
        Main.play("sample_abc/waxies_dargle.abc");
    }
	
}
