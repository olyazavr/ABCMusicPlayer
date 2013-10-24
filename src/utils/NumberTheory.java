package utils;

public class NumberTheory {
	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (a < b) {
			return gcd(b, a);
		}
		if (a % b == 0) {
			return b;
		} else {
			return gcd(a, a % b);
		}
	}

	public static int lcm(int a, int b) {
		return ((a * b) / gcd(a, b));
	}
}