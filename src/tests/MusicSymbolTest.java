package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import player.Chord;
import player.Pitch;
import player.Rest;
import utils.Fraction;

/**
 * This is the test suite for equals(), toString(), hashCode(), addNote(), and
 * calculateTicksPerBeat() for the classes in the MusicSymbol interface.
 * 
 * Moreover, we test the particular methods of the classes that implement the
 * interface: Chord: multiplyLength(), Pitch: multiplyLength(), getLength().
 * 
 * Testing strategy: test each method and make sure it is true to its spec for
 * every valid type of input. equals() must return true on equal objects, and
 * false on unequal objects. toString() must provide the appropriate string
 * representation of the object. hashCode() must return a hashcode that is the
 * same for equal objects.
 * 
 */

public class MusicSymbolTest {

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
     * Test Pitch hashCode()
     */
    @Test
    public void testHashcodePitchTest() {
        Pitch pitch1 = new Pitch(new Fraction(1), 'A', 1, 0);
        Pitch pitch2 = new Pitch(new Fraction(1), 'A', 1, 0);

        assertEquals(pitch1.hashCode(), pitch1.hashCode()); // reflexive
        assertEquals(pitch1.hashCode(), pitch2.hashCode());
    }

    /**
     * Test Rest hashCode()
     */
    @Test
    public void testHashcodeRestTest() {
        Rest rest1 = new Rest(new Fraction(1));
        Rest rest2 = new Rest(new Fraction(1));

        assertEquals(rest1.hashCode(), rest1.hashCode()); // reflexive
        assertEquals(rest1.hashCode(), rest2.hashCode());
    }

    /**
     * Test Chord hashCode()
     */
    @Test
    public void testHashcodeChordTest() {
        Pitch pitch1 = new Pitch(new Fraction(1), 'A', 1, 0);
        Pitch pitch2 = new Pitch(new Fraction(1), 'A', 1, 0);
        Pitch pitch3 = new Pitch(new Fraction(1), 'D', 0, -2);
        Pitch pitch4 = new Pitch(new Fraction(1), 'D', 0, -2);

        // make sure that even if we use different pitch object that amount to
        // the same, they evaluate to the same thing
        Chord chord1 = new Chord(Arrays.asList(pitch1, pitch2, pitch3));
        Chord chord2 = new Chord(Arrays.asList(pitch1, pitch1, pitch4));

        assertEquals(chord1.hashCode(), chord1.hashCode()); // reflexive
        assertEquals(chord1.hashCode(), chord2.hashCode());
    }

    /**
     * Test Pitch toString()
     */
    @Test
    public void testToStringPitchTest() {
        // flat is _, sharp is ^, octave up is first lowercase and then with ',
        // octave down has ,
        Pitch pitch1 = new Pitch(new Fraction(2, 3), 'D', 1, -2);
        Pitch pitch2 = new Pitch(new Fraction(1, 2), 'A', 2, 1);
        Pitch pitch3 = new Pitch(new Fraction(1), 'C', -1, 0);

        assertEquals("_d2/3", pitch1.toString());
        assertEquals("^a'1/2", pitch2.toString());
        assertEquals("C,1/1", pitch3.toString());
    }

    /**
     * Test Rest toString()
     */
    @Test
    public void testToStringRestTest() {
        Rest rest1 = new Rest(new Fraction(1));
        Rest rest2 = new Rest(new Fraction(2, 3));

        assertEquals("z1/1", rest1.toString());
        assertEquals("z2/3", rest2.toString());
    }

    /**
     * Test Chord toString()
     */
    @Test
    public void testToStringChordTest() {
        Pitch pitch1 = new Pitch(new Fraction(2, 3), 'D', 1, -2);
        Pitch pitch2 = new Pitch(new Fraction(1, 2), 'A', 2, 1);
        Pitch pitch3 = new Pitch(new Fraction(1), 'C', -1, 0);

        Chord chord1 = new Chord(Arrays.asList(pitch2));
        Chord chord2 = new Chord(Arrays.asList(pitch1, pitch2, pitch3));

        assertEquals("[^a'1/2]", chord1.toString());
        assertEquals("[_d2/3 ^a'1/2 C,1/1]", chord2.toString());
    }

}