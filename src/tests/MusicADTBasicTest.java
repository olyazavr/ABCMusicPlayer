package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import player.Chord;
import player.Lyric;
import player.Measure;
import player.MusicSymbol;
import player.Pitch;
import player.Rest;
import player.Signature;
import player.Voice;
import utils.Fraction;

/**
 * This is the test suite for equals(), toString(), and hashCode() for the
 * classes in this project.
 * 
 * Testing strategy: equals() must return true on equal objects, and false on
 * unequal objects. toString() must provide the appropriate string
 * representation of the object. hashCode() must return a hashcode that is the
 * same for equal objects.
 * 
 */

public class MusicADTBasicTest {

    /**
     * Test Pitch equals()
     */
    @Test
    public void testEqualsPitchTest() {
        Pitch pitch1 = new Pitch(new Fraction(1), 'A', 1, 0);
        Pitch pitch2 = new Pitch(new Fraction(1), 'A', 1, 0);
        Pitch pitch3 = new Pitch(new Fraction(1), 'D', 0, -2);
        Pitch pitch4 = new Pitch(new Fraction(1), 'D', 0, -2);

        assertEquals(pitch1, pitch1); // reflexive
        assertEquals(pitch1, pitch2);
        assertNotEquals(pitch1, pitch3);
        assertEquals(pitch3, pitch4); // make sure things like accidentals work
    }

    /**
     * Test Rest equals()
     */
    @Test
    public void testEqualsRestTest() {
        Rest rest1 = new Rest(new Fraction(1));
        Rest rest2 = new Rest(new Fraction(1));
        Rest rest3 = new Rest(new Fraction(2, 3));

        assertEquals(rest1, rest1); // reflexive
        assertEquals(rest1, rest2);
        assertNotEquals(rest1, rest3);
    }

    /**
     * Test Chord equals()
     */
    @Test
    public void testEqualsChordTest() {
        Pitch pitch1 = new Pitch(new Fraction(1), 'A', 1, 0);
        Pitch pitch2 = new Pitch(new Fraction(1), 'A', 1, 0);
        Pitch pitch3 = new Pitch(new Fraction(1), 'D', 0, -2);
        Pitch pitch4 = new Pitch(new Fraction(1), 'D', 0, -2);

        Chord chord1 = new Chord(Arrays.asList(pitch1, pitch2, pitch3));
        Chord chord2 = new Chord(Arrays.asList(pitch1, pitch1, pitch4));
        Chord chord3 = new Chord(Arrays.asList(pitch1, pitch3, pitch4));

        assertEquals(chord1, chord1); // reflexive
        assertEquals(chord1, chord2);
        assertNotEquals(chord1, chord3);
    }

    /**
     * Test Lyric equals()
     */
    @Test
    public void testEqualsLyricTest() {
        Lyric lyric1 = new Lyric(Arrays.asList("A", "B123", " "));
        Lyric lyric2 = new Lyric(Arrays.asList("A", "B123", " "));
        Lyric lyric3 = new Lyric(Arrays.asList("C", "B"));

        assertEquals(lyric1, lyric1); // reflexive
        assertEquals(lyric1, lyric2);
        assertNotEquals(lyric1, lyric3);
    }

    /**
     * Test Measure equals()
     */
    @Test
    public void testEqualsMeasureTest() {
        MusicSymbol pitch1 = new Pitch(new Fraction(1), 'B', 2, 0);
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'A', 1, 1);
        MusicSymbol pitch3 = new Pitch(new Fraction(1), 'D', 1, -2);
        MusicSymbol rest1 = new Rest(new Fraction(1));

        Lyric lyric1 = new Lyric(Arrays.asList("A!!", "B123"));
        Lyric lyric2 = new Lyric(Arrays.asList("A!!", "B123"));
        Lyric lyric3 = new Lyric(Arrays.asList("C", "B"));

        Measure measure1 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric1);
        Measure measure2 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric2);
        Measure measure3 = new Measure(Arrays.asList(pitch3, pitch2, rest1), lyric3);
        // check order as well
        Measure measure4 = new Measure(Arrays.asList(pitch2, pitch1, rest1), lyric1);

        assertEquals(measure1, measure1); // reflexive
        assertEquals(measure1, measure2);
        assertNotEquals(measure1, measure3);
        assertNotEquals(measure1, measure4);
    }

    /**
     * Test Voice equals()
     */
    @Test
    public void testEqualsVoiceTest() {
        MusicSymbol pitch1 = new Pitch(new Fraction(1), 'B', 2, 0);
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'A', 1, 1);
        MusicSymbol pitch3 = new Pitch(new Fraction(1), 'D', 1, -2);
        MusicSymbol rest1 = new Rest(new Fraction(1));

        Lyric lyric1 = new Lyric(Arrays.asList("A!!", "B123"));
        Lyric lyric2 = new Lyric(Arrays.asList("A!!", "B123"));

        Measure measure1 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric1);
        Measure measure2 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric2);
        Measure measure3 = new Measure(Arrays.asList(pitch2, pitch3, pitch1), lyric1);

        Voice voice1 = new Voice("name1", Arrays.asList(measure1, measure3));
        Voice voice2 = new Voice("name1", Arrays.asList(measure1, measure3));
        Voice voice3 = new Voice("name2", Arrays.asList(measure1, measure2));

        assertEquals(voice1, voice1); // reflexive
        assertEquals(voice1, voice2);
        assertNotEquals(voice1, voice3);
    }

    /**
     * Test Signature equals()
     */
    @Test
    public void testEqualsSignatureTest() {
        Signature sig1 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));
        Signature sig2 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));
        Signature sig3 = new Signature("title2", "composer1", new Fraction(2, 2), new Fraction(1, 2),
                new Fraction(1, 8), "Am", Arrays.asList("one"));

        assertEquals(sig1, sig1); // reflexive
        assertEquals(sig1, sig2);
        assertNotEquals(sig1, sig3);
    }

    /**
     * Test MusicPiece equals()
     */
    @Test
    public void testEqualsMusicPieceTest() {
        MusicSymbol pitch1 = new Pitch(new Fraction(1), 'B', 2, 0);
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'A', 1, 1);
        MusicSymbol pitch3 = new Pitch(new Fraction(1), 'D', 1, -2);
        MusicSymbol rest1 = new Rest(new Fraction(1));

        Lyric lyric1 = new Lyric(Arrays.asList("A!!", "B123"));
        Lyric lyric2 = new Lyric(Arrays.asList("A!!", "B123"));

        Measure measure1 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric1);
        Measure measure2 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric2);
        Measure measure3 = new Measure(Arrays.asList(pitch2, pitch3, pitch1), lyric1);

        Voice voice1 = new Voice("name1", Arrays.asList(measure1, measure3));
        Voice voice2 = new Voice("name1", Arrays.asList(measure1, measure3));
        Voice voice3 = new Voice("name2", Arrays.asList(measure1, measure2));

        assertEquals(voice1, voice1); // reflexive
        assertEquals(voice1, voice2);
        assertNotEquals(voice1, voice3);
    }

}