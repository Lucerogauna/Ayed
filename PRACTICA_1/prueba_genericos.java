package PRACTICA_1;
import java.util.*;


public class prueba_genericos {
	public static void main(String[]args) {
	List <Integer> numeros = new ArrayList<>();
	//List <Integer> numeros= new LinkedList<>();
	numeros.add(3); //agrega un elemento en la pos 0 NOTA EL PRIMER ELEMENNTO ESTA EN LA POSICION O 
	numeros.add(1,8); //se agrega el elemento en la pos 1}
	System.out.println(numeros.get(0)); // obtener el primer elemento
	System.out.println(numeros.indexOf(8)); //byusca el elemenmto y devuelve la pos en  la que esta
	
	
	
	//NOTA: importante chequear que la lista cargada porque sino da null exception pointer 
	// acceder a una posicion invalida
	// preguntarif lista.size ()> 1 
	//system....lista.get1
	if (!numeros.isEmpty()) // si no esta vacia elimino el primer elemento
		numeros.remove(0);
	
	
	
	
	System.out.println(numeros.size());//obtengo el tamaño de la list
	
	
	}

}
