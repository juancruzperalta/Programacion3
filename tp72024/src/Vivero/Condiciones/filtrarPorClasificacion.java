package Vivero.Condiciones;

import Vivero.Planta;

public class filtrarPorClasificacion extends Condicion {
	
	private String clasificacionQueBusco;
	
	public filtrarPorClasificacion(String clasificacionQueBusco) {
		this.clasificacionQueBusco = clasificacionQueBusco;
	}
	@Override
	public boolean filtrar(Planta pp) {
		return pp.getClasificacion().contains(clasificacionQueBusco);
	}

}
