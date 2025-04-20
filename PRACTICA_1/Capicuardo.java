package PRACTICA_1;

import java.util.*;

public class Capicuardo {
	public static boolean esCapicua (ArrayList <Integer>lista) {
		boolean  sigo = true;
		if (!lista.isEmpty()) {
			int tamano = lista.size()/2;
			int pri=0;
			System.out.println(lista.size());
			int ult= lista.size()-1; //ACORDARSE QUE EL ULTIOMO ESTA EN SIZE - 1 SINO MARCA EEROR INDEXT BOUND .-S..F.
			while ((tamano >0) && (sigo==true )){
			if (lista.get(ult) == lista.get(pri)) { //el ultimo de la lista comparo con el primeor
				//sigo=true;
				pri++;
				ult--;
				tamano--;
				}
				else 
					sigo = false;
			} 
			}
		return sigo;
		}
		
	}

