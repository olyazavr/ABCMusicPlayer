package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import player.Pitch;
import utils.Fraction;

/**
 * This is the test suite for the Utils auxiliary functions. It starts by
 * testing to make sure all the equals(), toString(), and hashCode() methods
 * work correctly as they are the foundation for the entire project. It ends by
 * testing the more specific methods for each class. Must supply valid inputs
 * for the tests as defined by the preconditions in each class to pass these
 * tests.
 */

public class UtilsTest {

	/*
	 * Testing strategy
	 * 
	 * Goal: make sure every auxiliary Utils method works correctly
	 * 
	 * Strategy: begin with simple Fraction and Scales objects and increase
	 * complexity until the most complex instance of each is reached. Each test
	 * will include levels of complexity and test all possible combinations at
	 * that level of complexity. For example, "simple" Fraction tests will test
	 * one Fraction alone, while "multiple" Fraction tests will test two or more
	 * Fraction objects.
	 */

	/*
	 * Test Fraction objects for the equals methods by creating two Notes
	 * instances
	 */
	@Test
	public void equalsFractionWithNotesTest() {

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
	
	@Test
	public void equalsFractionTest() {
		
		Fraction frac1 = new Fraction(1,2);
		Fraction frac2 = new Fraction(2,4);
		Fraction frac3 = new Fraction(5000000, 10000000);
		
		assertTrue(frac1.equals(frac2));
		assertTrue(frac2.equals(frac3));
		assertTrue(frac3.equals(frac1));
		
	}

	/*
	 * Test all class objects for the toString method by creating both Number
	 * and Variable instances. Note that all Numbers are floats so will return
	 * answers in the form of number point number, meaning floats will always
	 * contain a number before and after the point
	 */
	@Test
	public void fractionToStringStandardTest() {
		Fraction frac1 = new Fraction(4,7);
		String frac2 = "4/7";
		assertTrue(frac1.toString().equals(frac2));
	}
	
	@Test
	public void fractionToStringNonReducedFormTest() {
		Fraction frac1 = new Fraction(12,18);
		String frac2 = "2/3";
		assertTrue(frac1.toString().equals(frac2));
	}
	
	@Test
	public void fractionToStringABCformatOneTest() {
		Fraction frac1 = new Fraction(1,1);
		String frac2 = "";
		assertTrue(frac1.toString().equals(frac2));
	}
	@Test
	public void fractionToStringABCformatNumeratorOneTest() {
		Fraction frac1 = new Fraction(1,8);
		String frac2 = "/8";
		assertTrue(frac1.toString().equals(frac2));
	}

	/**
	 * Test all Fraction objects for the hashCode methods,  testing that equal Fractions yield the same
	 * hashCode.
	 */
	@Test
	public void hashCodePublicTheSameTest() {
		Fraction frac1 = new Fraction(3,8);
		Fraction frac2 = new Fraction(3,8);
		assertTrue(frac1.hashCode()==frac2.hashCode());
	}
	
	@Test
	public void hashCodePublicEqualTest() {
		Fraction frac1 = new Fraction(4,12);
		Fraction frac2 = new Fraction(1,3);
		assertTrue(frac1.hashCode()==frac2.hashCode());
	}
	
	@Test
	public void hashCodePublicNotEqualTest() {
		Fraction frac1 = new Fraction(14,12);
		Fraction frac2 = new Fraction(11,3);
		assertTrue(frac1.hashCode()!=frac2.hashCode());
	}

	/**
	 * Test Fraction's functionality
	 * 
	 * Strategy: begin by testing the constructors (there are several) and move
	 * on to its methods
	 */
	
	Fraction frac4 = new Fraction(1);
	Fraction frac5 = new Fraction("3/8");
	Fraction frac6 = new Fraction("3/");
	Fraction frac7 = new Fraction("/3");
	Fraction frac8 = new Fraction("/");
	
	@Test
	public void fractionFullStringConstructorTest() {
		Fraction frac1 = new Fraction(3,8);
		Fraction frac2 = new Fraction("3/8");
		assertTrue(frac1.equals(frac2));
	}
	
		
	@Test
	public void fractionOnlyBarStringConstructorTest() {
		Fraction frac1 = new Fraction(1,2);
		Fraction frac2 = new Fraction("/");
		assertTrue(frac1.equals(frac2));
	}
	
	@Test
	public void fractionNoDenominatorConstructorTest() {
		Fraction frac1 = new Fraction(31,2);
		Fraction frac2 = new Fraction("31/");
		assertTrue(frac1.equals(frac2));
	}
	
	@Test
	public void fractionNoNumeratorConstructorTest() {
		Fraction frac1 = new Fraction(1,8);
		Fraction frac2 = new Fraction("/8");
		assertTrue(frac1.equals(frac2));	
	}
}