package com.s2it;

import org.junit.Test;

import com.s2it.Exs9.BinaryTree;

import junit.framework.TestCase;

/**
 * Unit test for Exs9.
 */
public class Exs9Test extends TestCase {

	@Test
	public void testExs9Teste1() {
		System.out.println("\nExecício 9: testExs9Teste1:\n");

		Exs9 exs9 = new Exs9();

		BinaryTree binaryTree2 = exs9.createBinaryTree(2);
		binaryTree2.adicionaNoLeft(exs9.createBinaryTree(1));
		binaryTree2.adicionaNoRight(exs9.createBinaryTree(3));

		int soma = binaryTree2.somaNosAbaixo();
		System.out.println(soma);
		assertEquals(6, binaryTree2.somaNosAbaixo());
	}

	@Test
	public void testExs9Teste2() {
		System.out.println("\nExecício 9: testExs9Teste2:\n");

		Exs9 exs9 = new Exs9();

		BinaryTree binaryTree = exs9.createBinaryTree(1);

		int soma = binaryTree.somaNosAbaixo();
		System.out.println(soma);
		assertEquals(1, soma);
	}

}
