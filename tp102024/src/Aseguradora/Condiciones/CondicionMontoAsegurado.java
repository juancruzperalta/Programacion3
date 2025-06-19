package Aseguradora.Condiciones;

import Aseguradora.SeguroGeneral;

public class CondicionMontoAsegurado extends Condicion {
	private int montoLimite;
	
	public CondicionMontoAsegurado(int mo) {
		this.montoLimite = mo;
	}
	@Override
	public boolean cumple(SeguroGeneral sg) {
		return sg.montoAsegurado() < montoLimite;
	}

}
