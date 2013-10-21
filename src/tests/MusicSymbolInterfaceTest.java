package tests;

import org.junit.Test;

import player.Pitch;
import utils.Fraction;

/**
 * This is the test suite for the MusicSymbol interface. It starts by testing to
 * make sure all the equals(), toString(), and hashCode() methods work correctly
 * as they are the foundation for the entire project. Must supply valid inputs
 * for the tests as defined by the preconditions in each class to pass these
 * tests.
 */

public class MusicSymbolInterfaceTest {

	/*
	 * Testing strategy
	 * 
	 * Goal: make sure every method works correctly
	 * 
	 * Strategy: begin with single MusicSymbol testing and increase complexity
	 * until the most complex MusicSymbol is reached. Each test will include
	 * levels of complexity and test all possible combinations at that level of
	 * complexity. For example, "single" MusicSymbol tests will test each
	 * MusicSymbol against a single other MusicSymbol, while "multiple"
	 * MusicSymbol tests will test two or more MusicSymbol.
	 */

	/*
	 * Test Pitch objects for the equals methods by creating two Notes instances
	 */
	@Test
	public void testEqualsPitchTest() {

		// All equality tests will pass if reflexivity, symmetry, and
		// transitivity hold therefore the test for equality will assert these
		// are always true

		// Begin with a bare note that has length of 1 and is a C in default
		// octave 1 with no accidentals
		Pitch pitch1 = new Pitch(new Fraction(1), 'A', 0, 0);
		Pitch pitch2 = new Pitch(new Fraction(1), 'A', 0, 0);
		Pitch pitch3 = new Pitch(new Fraction(1), 'A', 0, 0);

		// TODO
	}
	
	// TODO
}