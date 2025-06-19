package CandyCrushV2.Condiciones;

import CandyCrushV2.Ficha;

public class CondicionAND extends Condicion {
	private Condicion cond1, cond2;
	
	public CondicionAND(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}
	@Override
	public boolean buscar(Ficha cc) {
		return cond1.buscar(cc) && cond2.buscar(cc);
	}

}
