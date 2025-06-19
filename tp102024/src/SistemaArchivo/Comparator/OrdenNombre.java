package SistemaArchivo.Comparator;

import java.util.Comparator;

import SistemaArchivo.ElementoSA;

public class OrdenNombre implements Comparator<ElementoSA>{

	@Override
	public int compare(ElementoSA o1, ElementoSA o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
