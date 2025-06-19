package Vivero.Condiciones;

import Vivero.Planta;

public class CondicionAND extends Condicion {
	private Condicion cond1, cond2;
	
	public CondicionAND(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}
	@Override
	public boolean filtrar(Planta pp) {
		return cond1.filtrar(pp) && cond2.filtrar(pp);
	}

}
