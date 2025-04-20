package TP2limpio;

import ejemploCola.Queue;

public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> hijoDer;
	private BinaryTree<T> hijoIzq;

	public BinaryTree(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTree<T> getHijoDer() {
		return hijoDer;
	}

	public void setHijoDer(BinaryTree<T> hijoDer) {
		this.hijoDer = hijoDer;
	}

	public BinaryTree<T> getHijoIzq() {
		return hijoIzq;
	}

	public void setHijoIzq(BinaryTree<T> hijoIzq) {
		this.hijoIzq = hijoIzq;
	}

	public void removeLeftChild() {
		this.hijoIzq = null;
	}

	public void removeRightChild() {
		this.hijoDer = null;
	}

	public boolean isEmpty() {
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}

	public boolean hasLeftChild() {
		return this.hijoIzq != null;
	}

	public boolean hasRightChild() {
		return this.hijoDer != null;
	}

	@Override
	public String toString() {
		return this.getData().toString();
	}

	private int contarHojasRecursiva(BinaryTree<T> a) {

		if (a == null) {
			return 0;
		} else if (a.isLeaf()) {
			return 1;
		}
		int sum = 0;
		if (a.hasLeftChild()) {
			sum += contarHojasRecursiva(a.getHijoIzq());
		}
		if (a.hasRightChild()) {
			sum += contarHojasRecursiva(a.getHijoDer());
		}
		return sum;
	}

	public int contarHojas() {
		int tot = contarHojasRecursiva(this);
		return tot;
	}

	private BinaryTree<T> espejoRecursivo(BinaryTree<T> ab) {
		BinaryTree<T> nuevo = new BinaryTree<T>(null);
		nuevo.setData(ab.data);
		if (ab.hasLeftChild()) {
			nuevo.setHijoDer(espejoRecursivo(ab.getHijoIzq()));
		}
		if (ab.hasRightChild()) {
			nuevo.setHijoIzq(espejoRecursivo(ab.getHijoDer()));
		}
		return nuevo;

	}

	public BinaryTree<T> espejo() {

		return espejoRecursivo(this);
	}

	public void imprimirPreOrden(BinaryTree<T> ab) {
		if (ab != null) {
			System.out.println(ab.getData());
		}
		if (ab.hasLeftChild()) {
			imprimirPreOrden(ab.getHijoIzq());
		}
		if (ab.hasRightChild()) {
			imprimirPreOrden(ab.getHijoDer());
		}
	}

	public void entreNiveles(int n, int m) {
		BinaryTree<T> ab = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel = 0;
		boolean sigo = true;
		while (!cola.isEmpty()&& (nivel<=m)) {
			ab = cola.dequeue();
			if (ab != null) {
				if ((nivel >= n) && (nivel <= m))
					System.out.print(ab.getData());
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getHijoIzq());
				}
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getHijoDer());
				}
			} else if (!cola.isEmpty()) {
				// cambio de nivel
				System.out.println();
				cola.enqueue(null);
				nivel++;
			}

		}
	}

}
