package punto2;

public class Domicilio {

	public String calle;
	public int numero;
	
	
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + "]";
	}
	public String getCalle() {
		return calle;
	}
	public Domicilio(String calle, int numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
