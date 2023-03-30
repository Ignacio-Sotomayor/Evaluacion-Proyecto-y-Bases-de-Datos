package punto3;

public class CazaLigero extends NaveEspacial{

	public CazaLigero(String n, double X, double Y) {
		super(n, X, Y, 500);
	}

	@Override
	public void atacar(NaveEspacial rival) {
		rival.recibirDanio(50);
		
	}

	@Override
	public String toString() {
		return "El Caza Ligero "+ super.getNombre()+ " tiene "+ super.getEnergia()+ " puntos de energia y esta en "+super.getPosicionX()+" en X y "+ super.getPosicionY()+" en Y";
				
	}
	
}
