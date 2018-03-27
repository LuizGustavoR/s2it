package com.s2it;

/**
 * Exercício 9
 *
 */
public class Exs9 {

	public class BinaryTree {
		int valor;
		BinaryTree left;
		BinaryTree right;

		public BinaryTree(int valor) {
			this.valor = valor;
		}

		/**
		 * 
		 * @param binaryTree
		 *            novo nó a ser adicionado a esquerda
		 */
		public void adicionaNoLeft(BinaryTree binaryTree) {
			left = binaryTree;
		}

		/**
		 * 
		 * @param binaryTree
		 *            novo nó a ser adicionado a direita
		 */
		public void adicionaNoRight(BinaryTree binaryTree) {
			right = binaryTree;
		}

		@Override
		public String toString() {
			String leftStr = left != null ? left.toString() : "";
			String rightStr = right != null ? right.toString() : "";
			return leftStr + valor + rightStr;
		}

		public int somaNosAbaixo() {
			String sumStr = toString();
			int sum = 0;
			for (int i = 0; i < sumStr.length(); i++) {
				sum += Character.getNumericValue(sumStr.charAt(i));
			}
			return sum;
		}
	}

	public BinaryTree createBinaryTree(int valor) {
		return new BinaryTree(valor);
	}
}
