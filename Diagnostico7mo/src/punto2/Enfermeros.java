package punto2;

public class Enfermeros extends Empleados {

	private int antiguedad;
	private int sueldoB;
	
	
	public Enfermeros(String nombre, int dNI, int antiguedad, int sueldoB) {
		super(nombre, dNI);
		this.antiguedad = antiguedad;
		this.sueldoB = sueldoB;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getSueldoB() {
		return sueldoB;
	}
	public void setSueldoB(int sueldoB) {
		this.sueldoB = sueldoB;
	}
	
	public int calcularSueldo(){
		int sueldo;
		sueldo=sueldoB+sueldoB*((5*antiguedad)/100);
		return sueldo;
	}
	
	public String toString() {
		return "El enfermero "+ super.getNombre()+ " cobra: " + calcularSueldo();
	}
}
