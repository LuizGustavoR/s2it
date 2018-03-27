package com.s2it;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for Exs8.
 */
public class Exs8Test extends TestCase {

	@Test
	public void testExs8UmMilhao() {
		System.out.println("\nExecício 8: testExs8UmMilhao:\n");

		String a = "10256";
		String b = "512";
		int expectedC = -1;

		int resultC = new Exs8().ExsResult(a, b);

		System.out.println("a: " + a + "\nb: " + b + "\nc: " + expectedC + "\nresultC: " + resultC);

		assertEquals(expectedC, resultC);
	}

	@Test
	public void testExs8Correto() {
		System.out.println("\nExecício 8: testExs8Correto:\n");

		String a = "123";
		String b = "321";
		int expectedC = 132231;

		int resultC = new Exs8().ExsResult(a, b);

		System.out.println("a: " + a + "\nb: " + b + "\nc: " + expectedC + "\nresultC: " + resultC);

		assertEquals(expectedC, resultC);
	}

}
