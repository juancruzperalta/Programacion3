package Futbol5.Ordenamiento;

import java.util.Comparator;

import Futbol5.Socio;

public class OrdenadoPorAlquiler implements Comparator<Socio>{
	private int cancha;
	
	public OrdenadoPorAlquiler(int cancha) {
		super();
		this.cancha = cancha;
	}

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.alquileresCant(cancha) - o2.alquileresCant(cancha);
	}

}
