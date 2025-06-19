package Futbol5.Ordenamiento;

import java.util.Comparator;

import Futbol5.Socio;

public class OrdenadorCompuesto implements Comparator<Socio>{
	Comparator<Socio> comp1, comp2;
	@Override
	public int compare(Socio o1, Socio o2) {
		int res = comp1.compare(o1, o2);
		if(res == 0) {
			return comp2.compare(o1, o2);
		}
		return res;
	}

}
