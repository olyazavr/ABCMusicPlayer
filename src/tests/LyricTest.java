package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import player.Lyric;

/**
 * This is the test suite for Lyric's equals(), toString(), hashCode(),
 * isEmpty(), getSyllable(), and getNumberOfSyllables().
 * 
 * Testing strategy: test each method and make sure it is true to its spec for
 * every valid type of input. equals() must return true on equal objects, and
 * false on unequal objects. toString() must provide the appropriate string
 * representation of the object. hashCode() must return a hashcode that is the
 * same for equal objects.
 * 
 */

public class LyricTest {

    /**
     * Test equals(), must return true on equal objects, and false on unequal
     * objects
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
}