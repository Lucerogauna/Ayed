package TP2;

import ejemploCola.Queue;

public class BinaryTree <T>{


	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() { //Constructor
		super(); // es lo mismo que no poner nada, java interpreta que es un super de objeto
	}

	public BinaryTree(T data) { //inicializa el arbol con el dato pasado como parametro e hijos en null
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild; // devuelve arbol izq
	}
	
	
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
		
		
		
	}
	private int contarRecursivo(BinaryTree<T>nodo) {
	if (nodo.getData() == null)
		 return 0;
	if ((nodo.getLeftChild()!= null) && (nodo.getRightChild()!= null)){ // o hashijo
		return 1;
	}
	//si tiene hijos sumo 
	int der = 0, izq = 0;
	 if (nodo.hasRightChild()) {
		der = 1 + contarRecursivo(nodo.getLeftChild());
		}
	if (nodo.hasLeftChild()) {
		izq = 1+ contarRecursivo(nodo.getLeftChild());
				
		}
	int res = der + izq;
	return res;
	}
	
	
	public  int contarHojas(BinaryTree<T> binaryTree) {
		return this.contarRecursivo2(binaryTree);
				}
	private int contarRecursivo2(BinaryTree<T> ab) {
		if ((ab.data == null) || (ab == null)) //o puedo hacer si no es empty 
			return  0; 
		if (!ab.hasLeftChild() && !ab.hasRightChild()) // si es una hoja
			  return 1; //devuelve 1
		int suma=0;
		if (ab.hasLeftChild()) {
			 suma += contarRecursivo2(ab.leftChild); }
		if (ab.hasRightChild()) {
			suma +=contarRecursivo2(ab.rightChild);}
		return suma;
		
		}
			
	public BinaryTree<T> espejo(BinaryTree<T> ab){
		BinaryTree<T> ae = new BinaryTree<T>();
		if (ab.data == null) //tengo que preguntar si el arbol es null o ya lo contempla
			return null;
		ae.setData(ab.data); 
		if ((ab.hasLeftChild()) && (ab.hasLeftChild()))
			ae.leftChild.setData(ab.getRightChild().getData());
			ae.rightChild.setData(ab.getLeftChild().getData());
		return ae;
	}
	
	
	//is empty pregunto afuera
	public BinaryTree<T> espejo2(BinaryTree<T> ab){
		BinaryTree<T> ae = new BinaryTree<T>();
		ae.setData(ab.data); 
		if (ab.hasLeftChild())
			ae.addRightChild(espejo2(ab.getLeftChild())); // Toma el hijo derecho del árbol original (ab). Llama recursivamente sobre ese hijo!
		if (ab.hasRightChild())
			ae.addLeftChild(espejo2(ab.getRightChild()));
		return ae;
	}
	
	// 0<=n<=m
	public void imprimeEntreNivelesNormal(){
		 BinaryTree<T> ab = null; // para guardar el nodo del arbol temporalmente
		 Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>(); // creo la cola

			 cola.enqueue(this);
			 cola.enqueue(null); // para marcar el final del nivel
			 while (!cola.isEmpty()) { //iterador de los niveles
				 ab = cola.dequeue();// se saca el primer elementro y se guarda en ab
				 if (ab!= null) {
					 System.out.print(ab.getData()); // imprime el contenido
					 if (ab.hasLeftChild()) {
			                cola.enqueue(ab.getLeftChild());
			            }
					 if (ab.hasRightChild()) {
			                cola.enqueue(ab.getRightChild());
			            }
				 } else if (!cola.isEmpty()) { 
					 System.out.println();// indicsa fin de nivel
		            cola.enqueue(null);// encola el fin del nivel, para arrancar el nuievo
				 }
			 }
		 }
	public BinaryTree<T> Espejito() {
		
		BinaryTree<T> espejo = new BinaryTree<>();
		espejo.setData(this.getData());
			if (this.hasLeftChild()) {
				espejo.addRightChild(this.getLeftChild().Espejito());//llamada recursiva
		
			}
			if (this.hasRightChild()) 
				espejo.addLeftChild(this.getRightChild().Espejito());
			
			return espejo;
		}
	
	public void imprimirPreOrden() { //opcio 2 usar el arbol cmo parametro o

		if (this != null)
			System.out.println(this.getData());
		if (this.hasLeftChild())
			this.leftChild.imprimirPreOrden();
		if (this.hasRightChild());
			this.rightChild.imprimirPreOrden();
	}
	public void entreNivelerNyM(int n,int m){
		
		 BinaryTree<T> ab = null; // para guardar el nodo del arbol temporalmente
		 Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>(); // creo la cola
		    cola.enqueue(this);
		    cola.enqueue(null); 
		 	int levelAct =0;
		 	while (!cola.isEmpty()) {
		 		ab = cola.dequeue();
		 		if (ab != null) {
		 			if ((levelAct >= n) && (levelAct<=m))
		 			System.out.print(ab.getData());
		 			if (ab.hasLeftChild()) {
		 				cola.enqueue(ab.getLeftChild());
		 				}
		 			if (ab.hasRightChild()) {
		 				cola.enqueue(ab.getRightChild());
		 				}
		 		    } else if (!cola.isEmpty()) {
		 		    	levelAct++;
		 		    	cola.enqueue(null);}
		 	}
			
		 }
	
	
   }
		


