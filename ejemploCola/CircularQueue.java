package ejemploCola;

	public class CircularQueue<T> extends Queue<T> {
	    public T shift() { //T Permite que una clase o método trabaje con cualquier tipo de dato sin especificarlo previamente.
	        T cola = dequeue(); // SACA EL PRIMER ELEMENTO de la cola
	        enqueue(cola); // lo vuelve a insertar en el final
	        return cola; //retorna el elemento que fue mov
	    }
	}
