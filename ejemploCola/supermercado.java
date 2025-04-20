package ejemploCola;

import java.util.*;

public class supermercado {
public static int simulacion (Queue <Cliente> clientes) {
	int tiempoTotal = 0;
	
	while (!clientes.isEmpty()) { // si la cola no esta vacia
		Cliente atendido = clientes.dequeue(); // desencolo
		int tiempo = atendido.getCantidadProd()* 2; // se tarda 2seg por producto
	}
	return tiempoTotal;
}

	public static void main(String[] args) {
		Queue <Cliente> clientes = new Queue<>(); // se crea una cola de clientes 
		clientes.enqueue (new Cliente ("Maria", 5)); 
		// se encola un clientr
		System.out.println("El tiempo total requerido es" + simulacion (clientes) + "seg");

	}
	
}

}
