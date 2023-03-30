package punto3;

public abstract class NaveEspacial {
	
	private String nombre;
	private int energia;
	private double posicionX;
	private double posicionY;
	
	public NaveEspacial(String n,double X,double Y, int e) {
		nombre=n;
		energia=e;
		posicionX=X;
		posicionY=Y;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public double getPosicionX() {
		return posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void recibirDanio(int danio) {
		energia-=danio;
	}
	
	public void mover(double cantidadX, double cantidadY) {
		posicionX+=cantidadX;
		posicionY+=cantidadY;
	}

	public abstract void atacar(NaveEspacial rival);
}
