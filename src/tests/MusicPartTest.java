package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import player.Chord;
import player.Lyric;
import player.Measure;
import player.MusicPiece;
import player.MusicSymbol;
import player.Pitch;
import player.Rest;
import player.Signature;
import player.Voice;
import utils.Fraction;

/**
 * This is the test suite for equals(), toString(), hashCode(), addNotes(), and
 * calculateTicksPerBeat() for the classes in the MusicPart interface.
 * 
 * Moreover, we test the particular methods of the classes that implement the
 * interface: Measure: hasEnoughLyrics() and MusicPiece: getPlayerTempo().
 * 
 * Testing strategy: test each method and make sure it is true to its spec for
 * every valid type of input. equals() must return true on equal objects, and
 * false on unequal objects. toString() must provide the appropriate string
 * representation of the object. hashCode() must return a hashcode that is the
 * same for equal objects.
 * 
 */

public class MusicPartTest {

    /**
     * Test Measure equals()
     */
    @Test
    public void equalsMeasureTest() {
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
    public void equalsVoiceTest() {
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
     * Test MusicPiece equals()
     */
    @Test
    public void equalsMusicPieceTest() {
        Signature sig1 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));
        Signature sig2 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));
        Signature sig3 = new Signature("title2", "composer1", new Fraction(2, 2), new Fraction(1, 2),
                new Fraction(1, 8), "Am", Arrays.asList("one"));

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

        MusicPiece music1 = new MusicPiece(sig1, Arrays.asList(voice1, voice2, voice3));
        MusicPiece music2 = new MusicPiece(sig2, Arrays.asList(voice2, voice1, voice3));
        MusicPiece music3 = new MusicPiece(sig3, Arrays.asList(voice3, voice2, voice3));

        assertEquals(music1, music1); // reflexive
        assertEquals(music1, music2);
        assertNotEquals(music1, music3);
    }

    /**
     * Test Measure hashCode()
     */
    @Test
    public void hashCodeMeasureTest() {
        MusicSymbol pitch1 = new Pitch(new Fraction(1), 'B', 2, 0);
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'A', 1, 1);
        MusicSymbol rest1 = new Rest(new Fraction(1));

        Lyric lyric1 = new Lyric(Arrays.asList("A!!", "B123"));
        Lyric lyric2 = new Lyric(Arrays.asList("A!!", "B123"));

        // make sure that if we give a different lyric object with the same
        // value, it is still the same measure object
        Measure measure1 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric1);
        Measure measure2 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric2);

        assertEquals(measure1.hashCode(), measure1.hashCode()); // reflexive
        assertEquals(measure1.hashCode(), measure2.hashCode());
    }

    /**
     * Test Voice hashCode()
     */
    @Test
    public void hashCodeVoiceTest() {
        MusicSymbol pitch1 = new Pitch(new Fraction(1), 'B', 2, 0);
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'A', 1, 1);
        MusicSymbol pitch3 = new Pitch(new Fraction(1), 'D', 1, -2);
        MusicSymbol rest1 = new Rest(new Fraction(1));

        Lyric lyric1 = new Lyric(Arrays.asList("A!!", "B123"));
        Lyric lyric2 = new Lyric(Arrays.asList("A!!", "B123"));

        // make sure that if we give a different lyric or MusicSymbol object
        // with the same value, it is still the same measure object
        Measure measure1 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric1);
        Measure measure2 = new Measure(Arrays.asList(pitch2, pitch3, pitch1), lyric2);

        Voice voice1 = new Voice("name1", Arrays.asList(measure1, measure2));
        Voice voice2 = new Voice("name1", Arrays.asList(measure1, measure2));

        assertEquals(voice1, voice1); // reflexive
        assertEquals(voice1, voice2);
    }

    /**
     * Test MusicPiece hashCode()
     */
    @Test
    public void hashCodeMusicPieceTest() {
        Signature sig1 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));
        Signature sig2 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));

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

        MusicPiece music1 = new MusicPiece(sig1, Arrays.asList(voice1, voice2, voice3));
        MusicPiece music2 = new MusicPiece(sig2, Arrays.asList(voice2, voice1, voice3));

        assertEquals(music1.hashCode(), music1.hashCode()); // reflexive
        assertEquals(music1.hashCode(), music2.hashCode());
    }

    /**
     * Test Measure toString()
     */
    @Test
    public void toStringMeasureTest() {
        MusicSymbol pitch1 = new Pitch(new Fraction(1), 'B', 2, 0);
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'A', 1, 1);
        MusicSymbol rest1 = new Rest(new Fraction(1));
        MusicSymbol chord1 = new Chord(Arrays.asList((Pitch) pitch1, (Pitch) pitch2));

        Lyric lyric1 = new Lyric(Arrays.asList("A!!", "B123"));
        Measure measure1 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric1);
        Measure measure2 = new Measure(Arrays.asList(pitch1, chord1), lyric1);

        assertEquals(" b'1/1 ^a1/1 z1/1 |", measure1.toString());
        assertEquals(" b'1/1 [b'1/1 ^a1/1] |", measure2.toString());
    }

    /**
     * Test Voice toString()
     */
    @Test
    public void toStringVoiceTest() {
        MusicSymbol pitch1 = new Pitch(new Fraction(1), 'B', 2, 0);
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'A', 1, 1);
        MusicSymbol pitch3 = new Pitch(new Fraction(1), 'D', 1, -2);
        MusicSymbol rest1 = new Rest(new Fraction(1));
        MusicSymbol chord1 = new Chord(Arrays.asList((Pitch) pitch1, (Pitch) pitch2));

        Lyric lyric1 = new Lyric(Arrays.asList("A!!", "B123"));
        Measure measure1 = new Measure(Arrays.asList(pitch1, pitch2, pitch1, rest1), lyric1);
        Measure measure2 = new Measure(Arrays.asList(pitch3, chord1, chord1), lyric1);

        Voice voice1 = new Voice("name1", Arrays.asList(measure1, measure2));
        Voice voice2 = new Voice("name2", Arrays.asList(measure1));

        assertEquals(" b'1/1 ^a1/1 b'1/1 z1/1 | _d1/1 [b'1/1 ^a1/1] [b'1/1 ^a1/1] |]", voice1.toString());
        assertEquals(" b'1/1 ^a1/1 b'1/1 z1/1 |]", voice2.toString());
    }

    /**
     * Test MusicPiece toString()
     */
    @Test
    public void toStringMusicPieceTest() {
        Signature sig1 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));
        Signature sig2 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one", "two", "three"));

        MusicSymbol pitch1 = new Pitch(new Fraction(1), 'B', 2, 0);
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'A', 1, 1);
        MusicSymbol rest1 = new Rest(new Fraction(1));

        Lyric lyric1 = new Lyric(Arrays.asList("A!!", "B123"));

        Measure measure1 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric1);
        Measure measure2 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric1);

        Voice voice1 = new Voice("name1", Arrays.asList(measure1));
        Voice voice2 = new Voice("name1", Arrays.asList(measure1, measure2));
        Voice voice3 = new Voice("name2", Arrays.asList(measure1, measure2));

        MusicPiece music1 = new MusicPiece(sig1, Arrays.asList(voice1));
        MusicPiece music2 = new MusicPiece(sig2, Arrays.asList(voice2, voice1, voice3));

        assertEquals(
                "T: title1 \n C: composer1 \n M: 1/2 \n L: 1/2 \n Q: 1/8 \n V: [one] \n K: C \n "
                        + "b'1/1 ^a1/1 z1/1 |]",
                music1.toString());
        assertEquals("T: title1 \n C: composer1 \n M: 1/2 \n L: 1/2 \n Q: 1/8 \n V: [one, two, three] \n K: C \n "
                + "b'1/1 ^a1/1 z1/1 | b'1/1 ^a1/1 z1/1 |],  b'1/1 ^a1/1 z1/1 |],  b'1/1 ^a1/1 z1/1 | "
                + "b'1/1 ^a1/1 z1/1 |]", music2.toString());
    }

    /**
     * Test Measure's hasEnoughLyrics(), should return true if the number of
     * notes (pitches or chords, not rests) matches the number of syllables,
     * false otherwise
     */
    @Test
    public void measureHasEnoughLyricsTest() {
        MusicSymbol pitch1 = new Pitch(new Fraction(1), 'B', 2, 0);
        MusicSymbol pitch2 = new Pitch(new Fraction(1), 'A', 1, 1);
        MusicSymbol pitch3 = new Pitch(new Fraction(1), 'D', 1, -2);
        MusicSymbol rest1 = new Rest(new Fraction(1));

        Lyric lyric1 = new Lyric(Arrays.asList("A!!", "B123"));
        Lyric lyric2 = new Lyric(Arrays.asList("C", " "));
        Lyric lyric3 = new Lyric(new ArrayList<String>());

        Measure measure1 = new Measure(Arrays.asList(pitch1, pitch2, rest1), lyric1);
        Measure measure2 = new Measure(Arrays.asList(pitch1, pitch2), lyric2);
        Measure measure3 = new Measure(Arrays.asList(pitch3, pitch2, pitch1), lyric2);
        Measure measure4 = new Measure(Arrays.asList(rest1, rest1, rest1), lyric3);
        Measure measure5 = new Measure(Arrays.asList(pitch2, pitch1, rest1), lyric3);

        assertTrue(measure1.hasEnoughLyrics()); // 2 pitches, 2 syllables
        assertTrue(measure2.hasEnoughLyrics()); // 2 pitches, 2 syllables
        assertFalse(measure3.hasEnoughLyrics()); // 3 pitches, 2 syllables
        assertTrue(measure4.hasEnoughLyrics()); // no pitches, no syllables
        assertFalse(measure5.hasEnoughLyrics()); // 2 pitches, no syllables
    }

}