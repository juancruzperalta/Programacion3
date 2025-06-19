package Futbol5.Ordenamiento;

import java.util.Comparator;

import Futbol5.Socio;

public class OrdenPago implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		if(o1.isPagoUltimo() && o2.isPagoUltimo()) {
			return 0;
		}
		else if(o1.isPagoUltimo()) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
