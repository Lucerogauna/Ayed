package ejemploCola;
import java.util.*;

public class Queue <T> extends Sequence {
    protected List<T> cola;
    
    public Queue() { // CONSTRUCTOR DE LA CLASE
        this.cola = new ArrayList<T>();
    }
     
    public void enqueue(T dato) {  //INSERTA UN DATO AL FINAL DE LA COLA
        cola.add(dato);
    }
    
    public T dequeue() { //ELIMINA ELE,ENTO DEL FRENTE DE LA COLA Y LO RETORNA. OJO SI ESTA VACIA DA ERROR
        return cola.remove(0);
    }
    
    public T head() { // SOLO Retorna el elemento del frente de la cola. Si la cola está vacía seproduce un error.
        return cola.get(0);
    }
    
    @Override
    public int size() { //Retorna la cantidad de elementos de la cola
        return cola.size();
    }
    
    @Override
    public boolean isEmpty() { //SI ESTA VACIA
        return cola.size() == 0;
    }
    
    @Override
    public String toString() {
        String str = "[";
	for(T d: cola)
            str = str + d +", ";
	str = str.substring(0, str.length()-2)+"]";  //substring(int beginIndex): Devuelve una nueva cadena que comienza desde el índice especificado (beginIndex) hasta el final de la cadena original.​
	return str;
    }
}