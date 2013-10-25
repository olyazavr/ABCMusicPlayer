package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import player.Signature;
import utils.Fraction;

/**
 * This is the test suite for Signature's equals(), toString(), hashCode(), and
 * getPlayerTempo().
 * 
 * Testing strategy: test each method and make sure it is true to its spec for
 * every valid type of input. equals() must return true on equal objects, and
 * false on unequal objects. toString() must provide the appropriate string
 * representation of the object. hashCode() must return a hashcode that is the
 * same for equal objects.
 * 
 */

public class SignatureTest {

    /**
     * Test equals(), must return true on equal objects, and false on unequal
     * objects
     */
    @Test
    public void equalsTest() {
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
     * Test hashcode(), must return the same value on equal objects
     */
    @Test
    public void hashCodeTest() {
        Signature sig1 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));
        Signature sig2 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));

        assertEquals(sig1.hashCode(), sig1.hashCode()); // reflexive
        assertEquals(sig1.hashCode(), sig2.hashCode());
    }

    /**
     * Test toString()
     */
    @Test
    public void toStringTest() {
        Signature sig1 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));
        Signature sig2 = new Signature("title1", "composer1", new Fraction(1, 2), new Fraction(1, 2),
                new Fraction(1, 8), "C", Arrays.asList("one"));

        assertEquals("T: title1 \n C: composer1 \n M: 1/2 \n L: 1/2 \n Q: 1/8 \n V: [one] \n K: C", sig1.toString());
        assertEquals(sig1.hashCode(), sig2.hashCode());
    }
}