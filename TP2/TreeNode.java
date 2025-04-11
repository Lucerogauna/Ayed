package TP2;

class TreeNode<T> {
    private T data;
    private TreeNode<T> left, right;

    public TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public void addHijoDer(TreeNode<T> data) {
    	this.right = data;
    }
    public T getData() {
        return data;
    }
    public boolean tieneHijoDer() {
    		return this.right!= null;
    }
    public boolean isEmpty() {
        return (this.isLeaf() && this.getData() == null);
    }

// Ejemplo de uso:
    public static void main(String[] args) {
        TreeNode<Integer> node1 = new TreeNode<>(null);
        TreeNode<Integer> node2 = new TreeNode<>(5);
        TreeNode<Integer> hijoD = new TreeNode<>(15);// creo el nodo 
        node2.addHijoDer(hijoD); //el nodo "Raiz" le guardo el nodo hijo  que cree arriba
        
        System.out.println("Nodo vacío: " + node1.isEmpty()); // true (porque es hoja y tiene null)
        System.out.println("Nodo con dato: " + node2.isEmpty()); // false (porque tiene un valor)
        System.out.println("Tiene hijo derecho?" + node2.tieneHijoDer());
    }
}