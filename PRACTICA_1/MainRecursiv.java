package PRACTICA_1;

import java.util.ArrayList;
import java.util.List;

public class MainRecursiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> numeros= new ArrayList<>();
		numeros.add(3);
		numeros.add(10);
		numeros.add(8);
		int cantidadPares= recursiv.contarPares(numeros); //lo llamo desde otra clase
		System.out.println("cannt de pares:"+ cantidadPares);

	}

}
