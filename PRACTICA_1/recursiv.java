package PRACTICA_1;

import java.util.List;

public class recursiv {/*implementar un metodo recursivo que cuente cuantos numeros pares hay en una lista. el metodo tiene la sig firma:
	 * publi static int contarPares(List<integer> lista{........}*/

	public static int contarPares (List <Integer> lista) {
		if (!lista.isEmpty())
			return contarParesRecursivo(lista, 0); //pasa la lista y el numero 0 para que comience a evaluar el 1er elemento
		else
			return 0;
	}
	
	private static int contarParesRecursivo(List <Integer> lista, int index){
		if (index==lista.size())//caso base: se llega al final de la lista
			return 0;
		return evaluarPar(lista.get(index)) + contarParesRecursivo(lista, index + 1);//llamada recursiva con el siguiente indice de la lista
		
	}
	
	
	//evalua si el valor recibido por parametro es par o no
	private static int evaluarPar(int valor) {
		return (valor % 2 == 0) ? 1: 0; 
	}
	private static int evaluarPar2 (int valor) {
		int par=0;
		if(valor % 2 ==0) {
			par = 1;
		}else {
			par= 0;
		}
		return par;
		}
	}

