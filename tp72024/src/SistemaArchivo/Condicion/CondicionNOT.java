package SistemaArchivo.Condicion;

import SistemaArchivo.Elemento;

public class CondicionNOT extends Condicion {
	Condicion cond1;
	
	
	public CondicionNOT(Condicion cond1) {
		super();
		this.cond1 = cond1;
	}


	@Override
	public boolean filtrar(Elemento em) {
		return !cond1.filtrar(em);
	}

}
