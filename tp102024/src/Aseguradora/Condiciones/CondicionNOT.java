package Aseguradora.Condiciones;

import Aseguradora.SeguroGeneral;

public class CondicionNOT extends Condicion {
	private Condicion c1;
	
	public CondicionNOT(Condicion c1) {
		this.c1 = c1;
	}
	@Override
	public boolean cumple(SeguroGeneral sg) {
		return !c1.cumple(sg);
	}

}
