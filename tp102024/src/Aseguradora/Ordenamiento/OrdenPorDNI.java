package Aseguradora.Ordenamiento;

import java.util.Comparator;

import Aseguradora.SeguroGeneral;

public class OrdenPorDNI implements Comparator<SeguroGeneral>{

	@Override
	public int compare(SeguroGeneral o1, SeguroGeneral o2) {
		return o1.getDNI()-o2.getDNI();
	}

}
