package PRACTICA_1;
import java.util.Scanner;
public class mainEj3{
	
	public static void main (String []args) {
		String nombre ;
		Scanner s= new Scanner(System.in);
		Profesor [] arrayP= new Profesor [3];
		Estudiantes []arrayE = new Estudiantes[3];
		Estudiantes e1 = new Estudiantes("Raul", "Gauna", "raulg@gmail.com", 2, "180 n323");
		Estudiantes e2 = new Estudiantes("Carlos", "Gutierrez", "cg@hmail.com", 32, "90 Alsina ");
		Estudiantes e3 = new Estudiantes("Patricio", "Gu", "ggg@hmail.com", 3, "9 DE JULIO ");
		Profesor p1 = new Profesor("Juan", "Castillo", "jc@hho", "A", "UNLP");
		Profesor p2 = new Profesor("Peter", "Castillo", "jc@hho", "A", "UNLAM");
		Profesor p3= new Profesor("ANA", "de", "ds@", "B", "UADE");
		
		
		
		arrayP[0] = p1;
		arrayP[1] = p2;
		arrayP[2]= p3;
		arrayE[0] = e1;
		arrayE[1] = e2;
		arrayE[2] = e3;
		

        System.out.println("Datos de los estudiantes:");
        for (int i = 0; i<arrayE.length; i++) {
            System.out.println(arrayE[i].tusDatos());
        }
        System.out.println("Datos de los profesores:");
        for (int j = 0; j<arrayP.length; j++) {
            System.out.println(arrayP[j].tusDatos());
        }
	}
	
	
}