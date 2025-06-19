package Futbol5.Condiciones;

import Futbol5.Socio;

public class CondicionAlquiler extends Condicion {
	private int cancha;
	
	public CondicionAlquiler(int can) {
		this.cancha = can;
	}
	@Override
	public boolean cumple(Socio so) {
		return so.alquilasteLaCancha(cancha);
	}

}
