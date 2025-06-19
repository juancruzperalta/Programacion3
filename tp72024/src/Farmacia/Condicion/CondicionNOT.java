package Farmacia.Condicion;

import Farmacia.Medicamento;

public class CondicionNOT extends Condicion {
	private Condicion cond1;
	
	
	public CondicionNOT(Condicion cond1) {
		this.cond1 = cond1;
	}
	@Override
	
	public boolean filtrar(Medicamento mm) {
		return !cond1.filtrar(mm);
	}

}
