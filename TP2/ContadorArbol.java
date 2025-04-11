package TP2;

import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {
	BinaryTree<Integer> ab;
	
	
	public int numePares(BinaryTree<Integer> ab) {
		if (ab==null)
			return 0;
		int cant =0;
		if (ab.getData()%2==0)
			cant++;
		if (ab.hasLeftChild())
			cant += numePares(ab.getLeftChild());
		if (ab.hasRightChild())
			cant +=  numePares(ab.getRightChild());
		
		return cant;
	}
	
	/////////////////////////////////////////////
	///
	private void inOrdenRecursivo(BinaryTree<Integer>ab, List <Integer> l) { //!!!!!!!!!!!!!!!!!!
		if (ab==null) 
			return ;
			if (ab.hasLeftChild())
				inOrdenRecursivo(ab, l);
			if (ab.getData()%2==0)
				l.add(ab.getData());
			if (ab.hasRightChild())
				inOrdenRecursivo(ab, l);
		}
	
	public void inOrden(BinaryTree<Integer>ab) { //!!!!!!!!!!!!!!!!!!!!!!
		List <Integer> lista = new ArrayList <>();
		inOrdenRecursivo(ab, lista);
		}
	///////
	
	public void PosOrdenRecursivo (BinaryTree<Integer>a, List <Integer>l) {
		if (ab==null) 
			return ;
			if (ab.hasLeftChild())
				PosOrdenRecursivo(ab, l);
			if (ab.hasRightChild())
				PosOrdenRecursivo(ab, l);
			if (ab.getData()%2==0)
				l.add(ab.getData());
		}
	
	public void PosOrden(BinaryTree<Integer>ab) {
		List<Integer> l = new ArrayList<>();
		PosOrdenRecursivo(ab, l);
	}
	
		public List<Integer> onlyParesInOrden (BinaryTree<Integer> ab) {// mal, merch es mas costoso!
		List <Integer> list = new ArrayList<> ();
		if (ab==null) {
			return list;}
		
		if (ab.hasLeftChild())
			list.addAll(onlyParesInOrden(ab.getLeftChild()));
		if (ab.getData()%2==0)
			list.add(ab.getData());
		if (ab.hasRightChild())
		  list.addAll(onlyParesInOrden(ab.getRightChild())); //preguntar no estaria retornandoo los valores ?
		
		return list;
		}


	public ArrayList <Integer> PostOrden(BinaryTree<Integer> ab){ // mal, merch es mas costoso!
		ArrayList <Integer> arreglo = new ArrayList <>();
		if (ab== null) {
			return arreglo;}
		if (ab.getData()%2==0) {
			arreglo.add(ab.getData());
		if (ab.hasLeftChild()) {
			
		}
		}
		return arreglo;
			
		}
	
}
