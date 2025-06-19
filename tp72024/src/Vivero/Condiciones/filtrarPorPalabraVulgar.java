package Vivero.Condiciones;

import Vivero.Planta;

public class filtrarPorPalabraVulgar extends Condicion {
	private String palabraVulgar;
	
	public filtrarPorPalabraVulgar(String palabraVulgar) {
		this.palabraVulgar = palabraVulgar;
	}
	@Override
	public boolean filtrar(Planta pp) {
		return pp.tenesPalabraVulgar(palabraVulgar);
	}

}
