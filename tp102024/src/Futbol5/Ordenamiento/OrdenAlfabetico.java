package Futbol5.Ordenamiento;

import java.util.Comparator;

import Futbol5.Socio;

public class OrdenAlfabetico implements Comparator<Socio>{
	@Override
	public int compare(Socio o1, Socio o2) {
		int res = o1.getApellido().compareTo(o2.getApellido());
		if(res == 0) {
			return o1.getNombre().compareTo(o2.getNombre());
		}
		return res;
	}

}
