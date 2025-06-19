package SistemaArchivo.Condiciones;

import SistemaArchivo.ElementoSA;

public class CondicionFechaMod extends Condicion {
	private int fechaLim;
	
	public CondicionFechaMod(int fecha) {
		this.fechaLim = fecha;
	}
	@Override
	public boolean cumple(ElementoSA elem) {
		return elem.getFechaCreacion() < fechaLim;
	}

}
