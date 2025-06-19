package Vivero.Condiciones;

import Vivero.Planta;

public class filtrarPorNombre extends Condicion {
	private String nombreQueBusco;
	
	public filtrarPorNombre(String nombreQueBusco) {
		this.nombreQueBusco = nombreQueBusco;
	}
	
	@Override
	public boolean filtrar(Planta pp) {
		return pp.getNombre().contains(nombreQueBusco);
	}

}
