package tests;

import org.junit.Test;

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
        Main.play("sample_abc/lyricParserTestFile.abc");
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
