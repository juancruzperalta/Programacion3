package CandyCrushV2.Condiciones;

import CandyCrushV2.Ficha;

public class CondicionNOT extends Condicion {
	private Condicion cond1;
	
	public CondicionNOT(Condicion cond1) {
		this.cond1 = cond1;
	}
	@Override
	public boolean buscar(Ficha cc) {
		return !cond1.buscar(cc);
	}

}
