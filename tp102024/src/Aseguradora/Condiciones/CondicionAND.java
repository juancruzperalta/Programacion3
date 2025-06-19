package Aseguradora.Condiciones;

import Aseguradora.SeguroGeneral;

public class CondicionAND extends Condicion {
	private Condicion c1,c2;
	
	public CondicionAND(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean cumple(SeguroGeneral sg) {
		return c1.cumple(sg) && c2.cumple(sg);
	}

}
