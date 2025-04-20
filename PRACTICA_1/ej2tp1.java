package PRACTICA_1;

import java.util.Scanner;

public class ej2tp1{
	private static  int [] a ; //conocida por todos los metodos

		public static void cargarArreglo(int n) {
			a= new int[n];
			for (int i = 0; i < n; i++) {
				a[i]= (i+1) * n;
				//System.out.println("se agrego el n" + a[i]);
			}
		}
		
		public static void imprimirArreglo () {
			for (int i= 0; i< a.length; i++) {
				System.out.println("Pos"+i+":" + a[i]);
			}
		}
		/* EJEMPLO DE USO para contar la cantidad de números leídos hasta el
		primer 42 se puede hacer 
		public class Contador {
			public static int contar42 ( ) {
			Scanner s = new Scanner(System.in) ;
			int cantidad = 1 ;
			while (s.nextInt() != 42) {
			cantidad++;
			}
			return cantidad;
			}
			}
		*/

	
}