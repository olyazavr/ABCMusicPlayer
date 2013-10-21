package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import player.Pitch;
import utils.Fraction;

/**
 * This is the test suite for the Utils auxiliary functions. It starts by testing to
 * make sure all the equals(), toString(), and hashCode() methods work correctly
 * as they are the foundation for the entire project. It ends by testing the more specific methods for each class. Must supply valid inputs
 * for the tests as defined by the preconditions in each class to pass these
 * tests.
 */

public class UtilsTest {

	/*
	 * Testing strategy
	 * 
	 * Goal: make sure every auxiliary Utils method works correctly
	 * 
	 * Strategy: begin with simple Fraction and Scales objects and increase complexity
	 * until the most complex instance of each is reached. Each test will include
	 * levels of complexity and test all possible combinations at that level of
	 * complexity. For example, "simple" Fraction tests will test one Fraction alone, while "multiple"
	 * Fraction tests will test two or more Fraction objects.
	 */
	
	/*
	 * Test Fraction objects for the equals methods by creating two Notes instances
	 */
	@Test
	public void testEqualsFractionTest() {

		// All equality tests will pass if reflexivity, symmetry, and
		// transitivity hold therefore the test for equality will assert these
		// are always true

		// Begin with a bare note that has length of 1 and is a C in default
		// octave 1 with no accidentals
		Pitch pitch1 = new Pitch(new Fraction(1), 'A', 0, 0);
		Pitch pitch2 = new Pitch(new Fraction(1), 'A', 0, 0);

		// reflexivity
		assertEquals(true, pitch1.equals(pitch1));

		// symmetry
		assertEquals(true, pitch1.equals(pitch2));
		assertEquals(true, pitch2.equals(pitch1));

		// non-equal comparisons
		Pitch pitch3 = new Pitch(new Fraction(1), 'B', 0, 0);
		Pitch pitch4 = new Pitch(new Fraction(1), 'A', 1, 0);
		Pitch pitch5 = new Pitch(new Fraction(1), 'A', 0, 1);
		
		assertFalse(pitch1.equals(pitch3));
		assertFalse(pitch1.equals(pitch4));
		assertFalse(pitch1.equals(pitch5));
	}

		/*
		 * Test all class objects for the toString method by creating both Number
		 * and Variable instances. Note that all Numbers are floats so will return
		 * answers in the form of number point number, meaning floats will always
		 * contain a number before and after the point
		 */
	@Test
	public void testToStringFractionTest() {
		// TODO
	}



	/*
	 * Test all class objects for the hashCode methods by creating both Number
	 * and Variable instances and testing that equal Expressions yield the same
	 * hashCode.
	 */
	@Test
	public void testHashCodeAdditionPublicTest() {
		// TODO
	}
}