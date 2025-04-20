package TP2;

import ejemploCola.Queue;
import java.util.*;

public class ProfundidadDeArbolBinario {
	public BinaryTree<Integer> arbol;

	public int SumaElementosProfundiad2(Integer p) {
		Queue<BinaryTree<Integer>> cola = new Queue<>(); // se USA QUEQUE

		cola.enqueue(arbol);
		cola.enqueue(null);
		int levelAct = 1;
		int sum = 0;
		boolean noEncontro = true;
		while (!cola.isEmpty() && (noEncontro)) {
			BinaryTree<Integer> ab = cola.dequeue(); // variable auxiliar ab y desencolamos en primer elemento
			if ((ab != null) && (levelAct != p)) {
				if (ab.hasLeftChild()) { // si tiene hijo izq encolamso
					cola.enqueue(ab.getLeftChild());
				}
				if (ab.hasRightChild()) { // idem
					cola.enqueue(ab.getRightChild());
				}
			} else if (levelAct == p) {
				noEncontro = false;
				while (!cola.isEmpty()) {
					ab = cola.dequeue();
					if (ab != null) {
						System.out.println(ab.getData());
						sum += ab.getData();
					}
				}
			} else if (!cola.isEmpty()) { // IMPORTANTE ESTE CHEK
				levelAct++;
				cola.enqueue(null);
			}
		}

		return sum;

	}

	public int SumaElementosProfundiad2_0(Integer p) {
		Queue<BinaryTree<Integer>> cola = new Queue<>(); // se USA QUEQUE

		cola.enqueue(arbol);
		cola.enqueue(null);
		int levelAct = 1;
		int sum = 0;
		while (!cola.isEmpty() && (levelAct <= p)) {
			BinaryTree<Integer> ab = cola.dequeue(); // variable auxiliar ab y desencolamos en primer elemento
			if (ab != null) {
				if (levelAct == p)
					sum += ab.getData();
				else {
					if (ab.hasLeftChild()) { // si tiene hijo izq encolamso
						cola.enqueue(ab.getLeftChild());
					}
					if (ab.hasRightChild()) { // idem
						cola.enqueue(ab.getRightChild());
					}
				}
			} else if (!cola.isEmpty()) { // IMPORTANTE ESTE CHEK
				levelAct++;
				cola.enqueue(null);
			}
		}

		return sum;

	}
}
