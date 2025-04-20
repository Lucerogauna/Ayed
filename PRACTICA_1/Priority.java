package PRACTICA_1;

import java.util.PriorityQueue;
import java.util.Comparator;
public class Priority {

	class Cliente {
	    String nombre;
	    int prioridad; // Menor número = Mayor prioridad

	    public Cliente(String nombre, int prioridad) {
	        this.nombre = nombre;
	        this.prioridad = prioridad;
	    }

	    @Override
	    public String toString() {
	        return nombre + " (Prioridad: " + prioridad + ")";
	    }
	}

	public class Banco {
	    public static void main(String[] args) {
	        PriorityQueue<Cliente> colaBanco = new PriorityQueue<>(Comparator.comparingInt(c -> c.prioridad)); 
	        //  le decimos a la PriorityQueue cómo debe ordenar los clientes. Comparator.comparingInt(c -> c.prioridad) es un comparador que compara a los clientes según su atributo prioridad
	        //c -> c.prioridad es una expresión lambda en Java.
	        // Agregamos clientes a la cola (prioridad baja = más urgente)
	        colaBanco.add(new Cliente("Juan", 2)); // Cliente normal
	        colaBanco.add(new Cliente("Ana (Embarazada)", 1)); // Prioridad alta
	        colaBanco.add(new Cliente("Pedro (70 años)", 1)); // Prioridad alta
	        colaBanco.add(new Cliente("Luis", 2)); // Cliente normal
	        colaBanco.add(new Cliente("María (Movilidad reducida)", 1)); // Prioridad alta

	        // Atendemos a los clientes según su prioridad
	        while (!colaBanco.isEmpty()) {
	            System.out.println("Atendiendo a: " + colaBanco.poll());
	        }
	    }
	}

}
