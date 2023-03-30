package punto2;


public class Medicos extends Empleados {

	private int matricula;
	private Contrato acuerdo;
	
	public Medicos(String nombre, int dNI, int matricula, Contrato acuerdo) {
		super(nombre, dNI);
		this.matricula = matricula;
		this.acuerdo = acuerdo;
	}

	public Contrato getAcuerdo() {
		return acuerdo;
	}

	public void setAcuerdo(Contrato acuerdo) {
		this.acuerdo = acuerdo;
	}

	public int getMatricula() {
		return matricula;
	}
	public int calcularSueldo() {
	    int sueldo=acuerdo.getSueldo();
	    return sueldo;
	}

	@Override
	public String toString() {
		return "El medico "+ super.getNombre()+ " cobra: " + calcularSueldo();
	}
	
	

}
