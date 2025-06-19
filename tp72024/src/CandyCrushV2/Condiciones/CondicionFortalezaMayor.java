package CandyCrushV2.Condiciones;

import CandyCrushV2.Ficha;

public class CondicionFortalezaMayor extends Condicion {
	private int limiteMayor;
	
	public CondicionFortalezaMayor(int limite) {
		this.limiteMayor = limite;
	}
	@Override
	public boolean buscar(Ficha cc) {
		return cc.getFortaleza()< limiteMayor;
	}

}
