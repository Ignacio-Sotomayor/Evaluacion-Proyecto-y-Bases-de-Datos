package punto1;

public class Socio {
	
	private String name="";
	private int nroSocio;
	private Libro libropedido;
	
	public Socio(String n, int ns) {
		name=n;
		nroSocio=ns;
	}
	public String getName() {
		return name;
	}
	public int getNroSocio() {
		return nroSocio;
	}
	public void pedirLibro(Libro libroRequerido, Biblioteca b) {
		b.prestar(libroRequerido, this);
	}
	public Libro getLibropedido() {
		return libropedido;
	}
	public void setLibropedido(Libro libropedido) {
		this.libropedido = libropedido;
	}	
	public void devolverLibro(Biblioteca b) {
		Libro l= this.getLibropedido();
		this.setLibropedido(null);
		b.devolver(l);
	}
}