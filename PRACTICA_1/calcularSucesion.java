package PRACTICA_1;

import java.util.List;

public class calcularSucesion {
	public void calcularSucesion (int n) {
		if (n  != 1) {
			if (n % 2 ==0){
				n = n/ 2;
				calcularSucesion(n);
			} else {
				n = n*3 + 1;
				calcularSucesion(n);
			}
			
		}
	 }


}
