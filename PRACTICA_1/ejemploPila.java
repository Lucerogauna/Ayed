package PRACTICA_1;
import java.util.*;
public class ejemploPila {
	
	public static void main (String [] args) {
		Stack <Libro> pila = new Stack <>();
		pila.push(new Libro("Rayuela", "J.C", 1965));// se apila un libro
		pila.push(new Libro("Mi planta NL", "desc", 2000));
		System.out.println(pila);
		
		Libro unLibro=null; //variable para almacenar un libro;
		
		if (!pila.isEmpty()) { //SIEMPRE VERIFICAR EL ESTADO DE LA PILA, SI TIENE ELEMENTOS
			unLibro = pila.pop(); //DESAPILA UN LIBRO
		}
		System.out.println(pila.size());
	}

}
