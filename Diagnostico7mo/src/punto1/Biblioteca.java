package punto1;

import java.util.ArrayList;

public class Biblioteca {

	private String nombre="";
	private String direccion="";
	private ArrayList <Socio>afiliados;
	private ArrayList <Libro>coleccion;
	private ArrayList <Libro>prestamos;
		
	public Biblioteca(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void addSocio(Socio s) {
		afiliados.add(s);
	}
	public void removeSocio(Socio s) {
		afiliados.remove(s);
	}
	public void addLibro(Libro l) {
		coleccion.add(l);
	}
	public void removeLibro(Libro l) {
		coleccion.remove(l);
	}
	public void prestar(Libro titulo, Socio s) {
		int numero = coleccion.indexOf(titulo);
		Libro seleccionado = coleccion.get(numero);
		prestamos.add(seleccionado);
		s.setLibropedido(seleccionado);
	}
	public void devolver (Libro l) {
		prestamos.remove(l);
	}
	
	public String coleccionLibros() {
		String lista="";
		for(int i = 1; i<=coleccion.size();i++) {
			Libro l=coleccion.get(i);
			lista+="El libro nro "+ i + " es " + l.toString() + "\n";
		}
		return lista;
	}
	public String libroPrestados() {
		String lista="";
		for(int i = 1; i<=prestamos.size();i++) {
			Libro l=prestamos.get(i);
			lista+="El libro nro "+ i + " es " + l.toString() + "\n";
		}
		return lista;
	}
	
}
