package CandyCrushV2.Condiciones;

import CandyCrushV2.Ficha;

public class CondicionDestruccion extends Condicion {
	private int limiteDestruccion;
	
	public CondicionDestruccion(int limite) {
		this.limiteDestruccion = limite;
	}
	@Override
	public boolean buscar(Ficha cc) {
		return cc.getPoderDestrucción() < limiteDestruccion;
	}

}
