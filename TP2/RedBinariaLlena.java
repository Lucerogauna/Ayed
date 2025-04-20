package TP2;

public class RedBinariaLlena {
	/*
	 * retardo de reenvío se define como el período comprendido entre que un nodo
	 * recibe un mensaje y lo reenvía a sus dos hijos.
	 */
	// o antes de invocar preguntar si el arbol esta cargado
	public int retardoReenvio(BinaryTree<Integer> ab) {
		int sumIzq, sum, sumDer;
		if (ab.isEmpty())
			return 0;
		else {
			if (ab.isLeaf()) { // si es hoja
				sum = ab.getData();
			} else {
				sumIzq = retardoReenvio(ab.getLeftChild());
				sumDer = retardoReenvio(ab.getRightChild());
				if (sumIzq > sumDer)
					sum = sumIzq;
				else
					sum = sumDer;
				sum += ab.getData();

			}
		}
		return sum;
	}
	
	
	//opcion 2

	private int retardoReenvioRecursivo(BinaryTree<Integer> ab) {
		int sumIzq, sum, sumDer;
		if (ab.isLeaf()) { // si es hoja
			sum = ab.getData(); // cuando se choca con la hoja inicializa sum con su dato
		} else {
			sumIzq = retardoReenvioRecursivo(ab.getLeftChild());
			sumDer = retardoReenvioRecursivo(ab.getRightChild());
			if (sumIzq > sumDer)
				sum = sumIzq;
			else
				sum = sumDer;
			sum += ab.getData(); // se le suma el nodo que espera 

		}
		return sum;
	}

	public int retardoReenvioAuxiliar(BinaryTree<Integer> ab) {
		if (ab.isEmpty())
		return 0;
		else {
		return retardoReenvioRecursivo(ab);
		}
		
		}
	}
