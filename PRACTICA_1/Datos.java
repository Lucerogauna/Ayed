package PRACTICA_1;
import java.util.Scanner;
public class Datos{
	private static int [] a;
	private int max=0;
	private int min=0;
	private double prom=0;
	
	
	public double getProm() {
		return prom;
	}

	public void setProm(double prom) {
		this.prom = prom;
	}

	public static int[] getArreglo() {
		return a;
	}

	public static void setA(int[] a) {
		Datos.a = a;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public static void cargarA(int n) {
		a= new int [n];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i<n; i++) {
			System.out.print("leer un numero");
			a[i]=s.nextInt();
		}
	}
	
	public static String incisoA () {
		int min= a[0];
		int max= a[0];
		double prom = 0;
		for (int i = 0; i< a.length; i++) {
			prom =+ a[i];
			if (a[i]<min)	min = a[i];
			else if (a[i]>max)  max= a[i];
			
		}
		prom= prom/a.length;
		return "minimo" + min+ "maximo"+ max+ "prom"+ prom;
		
	}

}
	