package Aseguradora.Condiciones;

import Aseguradora.SeguroGeneral;

public class CondicionDNI extends Condicion {
	private int dni;
	
	public CondicionDNI(int dni) {
		this.dni = dni;
	}
	@Override
	public boolean cumple(SeguroGeneral sg) {
		return sg.getDNI() == dni;
	}

}
