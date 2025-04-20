package TP2;

import java.util.*;
import ejemploCola.Queue;

public class EsLleno {

	public boolean IsLlenoRecursivo(BinaryTree<Integer> ab) {
		Queue<BinaryTree<Integer>> cola = new Queue<>();
		int nivel = 0;
		int cantPorNivel = 0;
		cola.enqueue(ab);
		cola.enqueue(null);
		boolean cumple = true;
		while (!cola.isEmpty() && cumple) {
			ab = cola.dequeue();
			if (ab != null) {
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
					cantPorNivel++;
				}
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
					cantPorNivel++;
				}
			} else if (!cola.isEmpty()) {
				if (cantPorNivel == Math.pow(2, ++nivel)) {
					// cambio de nivel
					System.out.println();
					cola.enqueue(null);
					cantPorNivel = 0;
				} else
					cumple = false;

			}
		}
		return cumple;
	}
}