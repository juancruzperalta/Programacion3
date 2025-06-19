package SistemaArchivo.Comparator;

import java.util.Comparator;

import SistemaArchivo.ElementoSA;

public class OrdenFechaCreacion implements Comparator<ElementoSA>{

	@Override
	public int compare(ElementoSA o1, ElementoSA o2) {
		return o1.getFechaCreacion()-o2.getFechaCreacion();
	}

}
