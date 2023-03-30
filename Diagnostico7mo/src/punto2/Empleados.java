package punto2;

public abstract class Empleados {
	
	private String nombre;
	private Domicilio domicilio;
	private int DNI;
	public Empleados(String nombre, int dNI) {
		super();
		this.nombre = nombre;
		DNI = dNI;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public String getNombre() {
		return nombre;
	}
	public int getDNI() {
		return DNI;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int calcularSueldo();
	
}
