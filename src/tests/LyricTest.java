package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import player.Lyric;

/**
 * This is the test suite for Lyric's equals(), toString(), hashCode(),
 * isEmpty(), and getSyllable().
 * 
 * Testing strategy: test each method and make sure it is true to its spec for
 * every valid type of input. equals() must return true on equal objects, and
 * false on unequal objects. toString() must provide the appropriate string
 * representation of the object. hashCode() must return a hashcode that is the
 * same for equal objects.
 * 
 * Partition on complexity, and how many things the syllables list has (and the
 * strange possibilities that the syllables can be, like spaces and strange
 * characters).
 */

public class LyricTest {

    /**
     * Test equals(), must return true on equal objects, and false on unequal
     * objects
     */
    @Test
    public void equalsTest() {
        Lyric lyric1 = new Lyric(Arrays.asList("A", "B123", " "));
        Lyric lyric2 = new Lyric(Arrays.asList("A", "B123", " "));
        Lyric lyric3 = new Lyric(new ArrayList<String>());

        assertEquals(lyric1, lyric1); // reflexive
        assertEquals(lyric1, lyric2);
        assertNotEquals(lyric1, lyric3);
    }

    /**
     * Test hashCode(), must be equal for equal objects
     */
    @Test
    public void hashCodeTest() {
        Lyric lyric1 = new Lyric(Arrays.asList("A", "B123", " "));
        Lyric lyric2 = new Lyric(Arrays.asList("A", "B123", " "));

        assertEquals(lyric1.hashCode(), lyric1.hashCode()); // reflexive
        assertEquals(lyric1.hashCode(), lyric2.hashCode());
    }

    /**
     * Test toString()
     */
    @Test
    public void toStringTest() {
        Lyric lyric1 = new Lyric(Arrays.asList("Psy", "chic", "spies", "from", "China", "Try", "to",
                "steal", "your", "mind's", "elation.", "Lit", "tle", "girls", "from", "Swe", "den", "Dream", "of",
                "sil", "ver", "screen", "quo", "ta", "tions")); // Californicaion
        Lyric lyric2 = new Lyric(Arrays.asList("A-", " ", "B123", "Woo-oop", " ", " ", "eeee"));

        assertEquals(
                "Psy chic spies from China Try to steal your mind's elation. "
                        + "Lit tle girls from Swe den Dream of sil ver screen quo ta tions",
                lyric1.toString());
        assertEquals("A-   B123 Woo-oop     eeee", lyric2.toString());
    }

    /**
     * Test isEmpty()
     */
    @Test
    public void isEmptyTest() {
        Lyric lyric1 = new Lyric(Arrays.asList("Psy", "chic", "spies", "from", "China", "Try", "to",
                "steal", "your", "mind's", "elation.", "Lit", "tle", "girls", "from", "Swe", "den", "Dream", "of",
                "sil", "ver", "screen", "quo", "ta", "tions")); // Californication
        Lyric lyric2 = new Lyric(Arrays.asList(" "));
        Lyric lyric3 = new Lyric(new ArrayList<String>());

        assertFalse(lyric1.isEmpty());
        assertFalse(lyric2.isEmpty()); // has a space
        assertTrue(lyric3.isEmpty()); // is actually empty
    }

    /**
     * Test getSyllable()
     */
    @Test
    public void getSyllableTest() {
        Lyric lyric1 = new Lyric(Arrays.asList("Psy", "chic", "spies", "from", "China", "Try", "to",
                "steal", "your", "mind's", "elation.")); // Californication
        Lyric lyric2 = new Lyric(Arrays.asList(" "));

        assertEquals("Psy", lyric1.getSyllable(0));
        assertEquals("elation.", lyric1.getSyllable(10));
        assertEquals("Try", lyric1.getSyllable(5));
        assertEquals(" ", lyric2.getSyllable(0));
    }
}