package PRACTICA_1;

public class testEj5p1 {
	 public static Datos maxmin(int[] datos) {
		   int max = 0, min = 0; int suma=0;
		   for (int i = 0; i < datos.length; i++) {
		     if (datos[i] > max) max = datos[i];
		     if (datos[i] < min) min = datos[i];
		     suma =+ datos[i];
		   }
		   double prom= suma/datos.length;
		   Datos obj = new Datos();
		   obj.setMax(max);
		   obj.setMin(min); 
		   obj.setProm(prom);
		   return obj;
		 }
		 }
