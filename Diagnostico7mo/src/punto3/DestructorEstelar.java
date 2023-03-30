package punto3;

public class DestructorEstelar extends NaveEspacial{

	private int cantidadTripulantes;
	
	public int getCantidadTripulantes() {
		return cantidadTripulantes;
	}

	public DestructorEstelar(String n, double X, double Y, int cT) {
		super(n, X, Y, 1000);
		cantidadTripulantes=cT;
	}
	
	public void mover(double espaciosX, double espaciosY) {
		double x=espaciosX/2;
		double y=espaciosY/2;
		super.mover(x, y);
	}

	@Override
	public void atacar(NaveEspacial rival) {
		rival.recibirDanio(200);	
	}

	@Override
	public String toString() {
		return "El Destructor Estelar "+ super.getNombre() + " cuenta con "+cantidadTripulantes +" tripulantes, " +super.getEnergia()+" puntos de energia y esta en " + super.getPosicionX()+" X "+ super.getPosicionY()+" Y" ;
	}

	
}
