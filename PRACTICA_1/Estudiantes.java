package PRACTICA_1;

public class Estudiantes extends Persona{
private int comision;
private String direccion;




public Estudiantes(String nombre, String apellido, String email, int comision, String direccion) {
	super(nombre, apellido, email);
	this.comision = comision;
	this.direccion = direccion;
}


public int getComision() {
	return comision;
}


public void setComision(int comision) {
	this.comision = comision;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public String tusDatos() {
	return "Estudiantes"+ super.tusDatos()+" Comision=" + getComision() + ", direccion=" + direccion ;}


}
