package CandyCrush.Condiciones;

import CandyCrush.Ficha;

public class filtrarPorFortaleza extends Condicion {
	private int fortalezaMaxima;
	
	public filtrarPorFortaleza(int fortalezaMaxima) {
		this.fortalezaMaxima =fortalezaMaxima;
	}
	@Override
	public boolean cumple(Ficha ff) {
		return ff.getFortaleza() < fortalezaMaxima;
	}

}
