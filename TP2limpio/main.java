package TP2limpio;

public class main {

	public static void main(String[] args) {
		BinaryTree<Integer> raiz = new BinaryTree<>(30);
		BinaryTree<Integer> hi = new  BinaryTree<>(10);
		BinaryTree<Integer> hd = new  BinaryTree<>(20);
		hi.setHijoIzq(new BinaryTree<>(25));
		hi.setHijoDer(new BinaryTree<>(27));
		raiz.setHijoIzq(hi);
		raiz.setHijoDer(hd);
		
		System.out.println("cantidad de nodos hoja"+raiz.contarHojas());
		
		raiz.espejo();
		raiz.imprimirPreOrden(raiz);
		raiz.espejo().imprimirPreOrden(raiz.espejo());
	}

}
