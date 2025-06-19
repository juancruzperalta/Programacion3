package CandyCrush.Condiciones;

import CandyCrush.Ficha;

public class CondicionNOT extends Condicion {
	private Condicion cond1;
	
	public CondicionNOT(Condicion cond1) {
		this.cond1 = cond1;
	}
	@Override
	public boolean cumple(Ficha ff) {
		return !cond1.cumple(ff);
	}

}
