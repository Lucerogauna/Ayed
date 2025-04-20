package PRACTICA_1;

public class Libro {
	private String titulo;
	private String autor;
	private int añoEd;
	
	
	public Libro(String titulo, String autor, int añoEd) {
		this.titulo = titulo;
		this.autor = autor;
		this.añoEd = añoEd;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAñoEd() {
		return añoEd;
	}
	public void setAñoEd(int añoEd) {
		this.añoEd = añoEd;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", añoEd=" + añoEd + "]";
	}
	
	
	

}
