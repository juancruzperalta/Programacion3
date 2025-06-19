package CandyCrushV2.Condiciones;

import CandyCrushV2.Ficha;

public class CondicionMayorLugar extends Condicion {
	private int limite;
	
	public CondicionMayorLugar(int limite) {
		this.limite = limite;
	}
	@Override
	public boolean buscar(Ficha cc) {
		return cc.getEspacioOcupado() < limite;
	}

}
