package ejemploCola;

public class Cliente {
	private String nombre;
	private int cantidadProd;
	
	
	public Cliente(String nombre, int cantidadProd) {
		this.nombre = nombre;
		this.cantidadProd = cantidadProd;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadProd() {
		return cantidadProd;
	}
	public void setCantidadProd(int cantidadProd) {
		this.cantidadProd = cantidadProd;
	}
	
	
	
}
