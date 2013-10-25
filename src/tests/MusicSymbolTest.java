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

}