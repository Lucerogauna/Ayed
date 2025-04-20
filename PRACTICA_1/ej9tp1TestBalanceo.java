package PRACTICA_1;
import java.util.*;

public class ej9tp1TestBalanceo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un String");
        String string = s.nextLine();
        System.out.println("La expresión está balanceada? " + isBalance(string));
	}
	public static boolean cumple (char c) {
		return (c == '(' || c == '[' || c == '{') ;
	}
	public static boolean isBalance ( String s ) {
		 Stack<Character> stack = new Stack<Character>();
		 	for (int i = 0; i < s.length(); i++) {
		 		char car = s.charAt(i); // Accede al carácter en la posición i de la cadena s y lo almacena en car
		 		if (cumple(car)) 
		 			stack.push(car);
		 		else if (stack.isEmpty()) //verifica si hay algo en la pila ya cargado
		 			return false;
		 		else
		 			stack.pop();		 		
		 	}
		return stack.isEmpty();
	}

 
}
