package punto2;

public class Contrato {

	private String identificador;
	private int sueldo;

	public Contrato(String identificador, int sueldo) {

		this.identificador = identificador;
		this.sueldo = sueldo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public String getIdentificador() {
		return identificador;
	}
	
	
	
}
