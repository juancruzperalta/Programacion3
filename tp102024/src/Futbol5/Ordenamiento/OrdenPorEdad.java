package Futbol5.Ordenamiento;

import java.util.Comparator;

import Futbol5.Socio;

public class OrdenPorEdad implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getEdad() - o2.getEdad();
	}
	

}
