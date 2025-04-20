package PRACTICA_1;

public class ej4tp1 {
 public static void swap1 ( int x, int y) {
 if (x < y) {
 int tmp = x ;
 x = y ;
 y = tmp;
}
 }
 public static void swap2 (Integer x, Integer y) {
 if (x < y) {
 int tmp = x ;
 x = y ;
 y = tmp;
}
 }public static void main(String[] args) {
	 int a = 1, b = 2; //primitiv
	 Integer c = 3, d = 4; //wrapper
	 swap1(a,b);
	 swap2(c,d);
	 System.out.println("a=" + a + " b=" + b) ; //imprime 2 y 1
	 System.out.println("c=" + c + " d=" + d) ; //imprime 3 y 4 SON INMUTABLES
	  }
	 }

