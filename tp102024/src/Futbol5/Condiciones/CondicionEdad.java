package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionEdad extends Condicion {
	private int limEdad;
	
	public CondicionEdad(int l) {
		this.limEdad = l;
	}
	@Override
	public boolean cumple(Socio so) {
		return so.getEdad() < limEdad;
	}

}
