package SistemaArchivo.Condicion;

import SistemaArchivo.Elemento;

public class CondicionAND extends Condicion {
	private Condicion cond1, cond2;
	
	
	public CondicionAND(Condicion cond1, Condicion cond2) {
		super();
		this.cond1 = cond1;
		this.cond2 = cond2;
	}


	@Override
	public boolean filtrar(Elemento em) {
		return cond1.filtrar(em) && cond2.filtrar(em);
	}

}
