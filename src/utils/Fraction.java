package utils;

/* Fraction.java */

/**
 * The Fraction class implements non-negative fractions, i.e., rational numbers.
 */
public class Fraction {

	/* private fields within a Fraction. */
	private int numerator;
	private int denominator;

	/**
	 * Constructs a Fraction n/d.
	 * 
	 * @param n
	 *            is the numerator, assumed non-negative.
	 * @param d
	 *            is the denominator, assumed positive.
	 */
	public Fraction(int n, int d) {
		int gcd = NumberTheory.gcd(n, d);
		this.numerator = n / gcd;
		this.denominator = d / gcd;
	}

	/**
	 * Constructs a Fraction n/1.
	 * 
	 * @param n
	 *            is the numerator, assumed non-negative.
	 */
	public Fraction(int n) {
		this(n, 1);
	}

	/**
	 * Constructs a Fraction parsed from a String input.
	 * 
	 * @param frac
	 *            is an int followed by a "/" followed by another int.
	 */
	public Fraction(String frac) {
		int n = 1, d = 2;
		if (!frac.equals("/")){
			if (frac.charAt(0)=='/'){
				d=Integer.parseInt(frac.substring(1));
			} else if (frac.charAt(frac.length()-1)=='/'){
				n=Integer.parseInt(frac.substring(0,frac.length()-1));
			} else {
				String[] elementsFrac = frac.trim().split("/");
				n=Integer.parseInt(elementsFrac[0]);
				if (elementsFrac.length!=1){
					d=Integer.parseInt(elementsFrac[1]);
				} else {
					d=1;
				}
			}
		}
		
		int gcd = NumberTheory.gcd(n, d);
		this.numerator = n / gcd;
		this.denominator = d / gcd;
	}

	/**
	 * Constructs a Fraction 0/1.
	 */
	public Fraction() {
		this.numerator = 0;
		this.denominator = 1;
	}

	/**
	 * Converts this fraction to a string format: "numerator/denominator."
	 * Fractions are printed in reduced form (part of your assignment is to make
	 * this statement true).
	 * 
	 * @return a String representation of this Fraction.
	 */
	public String toString() {

		return (numerator + "/" + denominator);
	}

	/**
	 * Calculates and returns the double floating point value of a fraction.
	 * 
	 * @return a double floating point value for this Fraction.
	 */
	public double evaluate() {
		double n = numerator; // convert to double
		double d = denominator;
		return (n / d);
	}

	/**
	 * Add f2 to this fraction and return the result.
	 * 
	 * @param f2
	 *            is the fraction to be added.
	 * @return the result of adding f2 to this Fraction.
	 */
	public Fraction add(Fraction f2) {
		Fraction r = new Fraction((numerator * f2.denominator)
				+ (f2.numerator * denominator), (denominator * f2.denominator));
		return r;
	}

	/**
	 * Multiply f to this fraction and return the result.
	 * 
	 * @param f
	 *            is the Fraction to be multiplied.
	 * @return the result of multiplying Fraction f to this Fraction.
	 */
	public Fraction multiply(Fraction f) {

		int num = this.numerator * f.getNumerator();
		int den = this.denominator * f.getDenominator();

		return new Fraction(num, den);
	}

	/**
	 * Multiply int f to this fraction and return the result.
	 * 
	 * @param f
	 *            is the int to be multiplied.
	 * @return the result of multiplying int f to this Fraction.
	 */
	public Fraction multiply(int f) {

		// This calculation is fairly straight-forward.
		int num = this.numerator * f;
		int den = this.denominator;

		return new Fraction(num, den);
	}

	/**
	 * Getters
	 */
	public int getNumerator() {
		return this.numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}



	// Returns true iff the current object and f store the same value.
	public boolean equals(Fraction f) {

		if (this.numerator == f.numerator && this.denominator == f.denominator)
			return true;
		else
			return false;
	}
}
