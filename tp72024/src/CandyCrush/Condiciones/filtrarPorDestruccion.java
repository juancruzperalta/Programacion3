package CandyCrush.Condiciones;

import CandyCrush.Ficha;

public class filtrarPorDestruccion extends Condicion {
	
	private int poderLimiteQueBusco;
	
	public filtrarPorDestruccion(int poderLimiteQueBusco) {
		this.poderLimiteQueBusco = poderLimiteQueBusco;
	}
	
	@Override
	public boolean cumple(Ficha ff) {
		return ff.getPoderDestruccion() < poderLimiteQueBusco;
	}

}
