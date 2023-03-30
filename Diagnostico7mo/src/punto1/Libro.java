package punto1;

public class Libro {

	private String autor="";
	private String titulo="";
	private String editorial="";
	private int anio;
	
	public Libro (String t) {
		titulo=t;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public int getAnio() {
		return anio;
	}

	@Override
	public String toString() {
		return  titulo + " del autor "+ autor + ", de la editorial " + editorial + " publicado en el año=" + anio ;
	}
	
	
}
