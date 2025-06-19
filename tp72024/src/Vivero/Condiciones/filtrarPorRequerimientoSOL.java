package Vivero.Condiciones;

import Vivero.Planta;

public class filtrarPorRequerimientoSOL extends Condicion {

	private int requerimientoSol;
	
	public filtrarPorRequerimientoSOL(int requerimientoSol) {
		this.requerimientoSol = requerimientoSol;
	}
	@Override
	public boolean filtrar(Planta pp) {
		return pp.getRequerimientoSol() < requerimientoSol;
	}

}
