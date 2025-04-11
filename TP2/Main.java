package TP2;

public class Main {

	public static void main(String[] args) {
		BinaryTree <Integer> ab = new BinaryTree<Integer>(new Integer(40));
		BinaryTree <Integer> hijoIzq = new BinaryTree<Integer>(25);
		hijoIzq.addLeftChild(new BinaryTree<Integer>(10));
		BinaryTree <Integer> hijoDer = new BinaryTree<Integer>(78);
		hijoIzq.addRightChild(new BinaryTree<Integer>(32));
		ab.addLeftChild(hijoIzq);
		ab.addRightChild(hijoDer);
		ab.imprimirPreOrden();
		
	}

}
