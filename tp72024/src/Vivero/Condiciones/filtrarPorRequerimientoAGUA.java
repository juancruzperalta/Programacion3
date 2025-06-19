package Vivero.Condiciones;

import Vivero.Planta;

public class filtrarPorRequerimientoAGUA extends Condicion {
	
	private int requerimientoAgua;
	
	public filtrarPorRequerimientoAGUA(int requerimientoAgua) {
		this.requerimientoAgua = requerimientoAgua;
	}
	@Override
	public boolean filtrar(Planta pp) {
		return pp.getRequerimientoAgua() < requerimientoAgua;
	}

}
