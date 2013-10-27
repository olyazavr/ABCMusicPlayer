package tests;

import org.junit.Test;

import player.Play;

/**
 * Tests all the sample_abc files by playing them in the Play method, only makes
 * sure they don't crash. These files have all kinds of crazy stuff (chords,
 * repeats, comments, lyrics, etc)
 * 
 * Testing strategy: This tests all of our project. From the file reader to
 * lexer to parser to listener to ADT creation to actually playing the song.
 * These tests only test for not throwing exceptions, but these are a nice way
 * to see where the code is breaking.
 * 
 * @category no_didit
 */
public class PlayerTest {

	@Test
	public void playabcTest() {
		Play.play("sample_abc/abc_song.abc");
	}

	@Test
	public void fur_eliseTest() {
		Play.play("sample_abc/fur_elise.abc");
	}

	@Test
	public void inventionTest() {
		Play.play("sample_abc/invention.abc");
	}

	@Test
	public void little_night_musicTest() {
		Play.play("sample_abc/little_night_music.abc");
	}

	@Test
	public void paddyTest() {
		Play.play("sample_abc/paddy.abc");
	}

	@Test
	public void piece1Test() {
		Play.play("sample_abc/piece1.abc");
	}

	@Test
	public void piece2Test() {
		Play.play("sample_abc/piece2.abc");
	}

	@Test
	public void piece3Test() {
		Play.play("sample_abc/piece3.abc");
	}

	@Test
	public void preludeTest() {
		Play.play("sample_abc/prelude.abc");
	}

	@Test
	public void scaleTest() {
		Play.play("sample_abc/scale.abc");
	}

	@Test
	public void waxies_dargleTest() {
		Play.play("sample_abc/waxies_dargle.abc");
	}



}
