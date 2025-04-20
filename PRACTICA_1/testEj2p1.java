package PRACTICA_1;


import java.util.Scanner;

public class testEj2p1 {
public static void main(String[]args) {
			Scanner scan = new Scanner(System.in) ;
			System.out.println("leer in numero por teclado");
			int num = scan.nextInt();
			ej2tp1.cargarArreglo(num);//PREGUNTAR EN CHATGPT QUE HACE ESTO
			ej2tp1.imprimirArreglo();
			System.out.println("si quiere leer otro numero marque 1 sino marque 0");
			int corte = scan.nextInt();
			while (corte != 0) {
				System.out.println("leer in numero por teclado para cargar en el arreglo");
				num = scan.nextInt();
				ej2tp1.cargarArreglo(num);
				ej2tp1.imprimirArreglo();
				System.out.println("si quiere leer otro numero marque 1 sino marque 0");
				 corte = scan.nextInt();
			}
			
		}
}