package com.s2it;

/**
 * Exercício 8
 *
 */
public class Exs8 {
	public int ExsResult(String a, String b) {
		StringBuilder c = new StringBuilder();
		int resultC;

		int lengthMenor = a.length() < b.length() ? a.length() : b.length();

		for (int i = 0; i < lengthMenor; i++) {
			c.append(a.charAt(i)).append(b.charAt(i));
			if (i == lengthMenor - 1) {
				if (a.length() < b.length()) {
					c.append(b.substring(lengthMenor, b.length()));
				} else {
					c.append(a.substring(lengthMenor, a.length()));
				}
			}
		}

		resultC = Integer.valueOf(c.toString());
		if (resultC > 1000000) {
			return -1;
		} else {
			return resultC;
		}
	}
}
