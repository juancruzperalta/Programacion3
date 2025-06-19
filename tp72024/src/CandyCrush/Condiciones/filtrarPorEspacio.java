package CandyCrush.Condiciones;

import CandyCrush.Ficha;

public class filtrarPorEspacio extends Condicion {
	
	private int espacioLimite;
	
	public filtrarPorEspacio(int espacioLimite) {
		this.espacioLimite =espacioLimite;
	}
	@Override
	public boolean cumple(Ficha ff) {
		return ff.getEspacioOcupa() < espacioLimite;
	}

}
