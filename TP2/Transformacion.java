package TP2;

public class Transformacion {
	BinaryTree<Integer> arbol;

	private BinaryTree<Integer> sumaRecursiva(BinaryTree<Integer> ab) { // creando un nuevo arbol
		BinaryTree<Integer> nodoTemp = new BinaryTree<Integer>();
		BinaryTree<Integer> ladoIzq = null;
		BinaryTree<Integer> ladoDer = null;
		int suma = 0; // o el dato actual
		if (ab.isEmpty())
			return nodoTemp; // devuelve el arbol que cree sin ningun dato
		if (ab.isLeaf()) { // si es hoja
			nodoTemp.setData(0); // devuelve 0; za
			return nodoTemp;
		}
		if (ab.hasLeftChild()) {
			ladoIzq = sumaRecursiva(ab.getLeftChild()); // recursivo
			suma += ab.getLeftChild().getData() + ladoIzq.getData(); // faltaba sumar lado izq que tiene la suma de los
																		// anteriores
		}
		if (ab.hasRightChild()) {
			ladoDer = sumaRecursiva(ab.getRightChild());
			suma += ab.getRightChild().getData() + ladoDer.getData();
		}

		nodoTemp.setData(suma); // se guarda la suma y se hace la conexion
		nodoTemp.addLeftChild(ladoIzq);
		nodoTemp.addRightChild(ladoDer);
		// ladoDer.setData(sumaRecursiva(ab.getRightChild()).getData());

		return nodoTemp;
	}

	public BinaryTree<Integer> suma() {
		if (arbol != null)
			return sumaRecursiva(arbol);
		else
			return new BinaryTree<Integer>();
	}

	// opcion 2 es la correcta
	private int sumaRecursiva2(BinaryTree<Integer> ab) {
		int sumDer = 0;
		int sumIzq = 0;
		if (ab.hasLeftChild()) {
			sumIzq = sumaRecursiva2(ab.getLeftChild());

		}
		if (ab.hasRightChild()) {
			sumDer = sumaRecursiva2(ab.getRightChild());
		}
		int act = ab.getData(); // lo uso para no perder el dato 
		ab.setData(sumDer + sumIzq);
		return act + sumDer + sumIzq; //aca
	}

	public BinaryTree<Integer> suma2() {
		if (arbol != null) {
			sumaRecursiva2(arbol);
			return arbol;
		} else
			return arbol;
	}

}
