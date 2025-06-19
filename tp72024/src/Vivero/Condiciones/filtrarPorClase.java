package Vivero.Condiciones;

import Vivero.Planta;

public class filtrarPorClase extends Condicion {
	private String claseQueBusco;
	
	
	public filtrarPorClase(String claseQueBusco) {
		this.claseQueBusco = claseQueBusco;
	}
	@Override
	public boolean filtrar(Planta pp) {
		return pp.getClase().contains(claseQueBusco);
	}

}
