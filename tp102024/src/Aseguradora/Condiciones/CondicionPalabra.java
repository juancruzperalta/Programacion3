package Aseguradora.Condiciones;

import Aseguradora.SeguroGeneral;

public class CondicionPalabra extends Condicion {
	private String palabraQueBusco;
	
	public CondicionPalabra(String palabraQueBusco) {
		this.palabraQueBusco = palabraQueBusco;
	}
	@Override
	public boolean cumple(SeguroGeneral sg) {
		return sg.getDescripcion().contains(palabraQueBusco);
	}

}
