package Aseguradora.Ordenamiento;

import java.util.Comparator;

import Aseguradora.SeguroGeneral;

public class OrdenNumeroPoliz  implements Comparator<SeguroGeneral>{
	
	@Override
	public int compare(SeguroGeneral o1, SeguroGeneral o2) {
		return o1.numeroPoliza() - o2.numeroPoliza();
	}

}
