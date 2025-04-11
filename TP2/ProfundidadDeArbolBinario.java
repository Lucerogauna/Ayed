package TP2;
import java.util.*;
public class ProfundidadDeArbolBinario {
	public BinaryTree<Integer> arbol;
	
	public int SumaElementosProfundiad(Integer p) {
		Queue <BinaryTree<Integer>> cola = new LinkedList <>();
		cola.add(arbol);
			int levelAct = 0;
			if (!cola.isEmpty())
			if (arbol.hasLeftChild()) {
				if (arbol.getLeftChild().getData() > p) {
					
				}
				}
		return 0;
	}
}
