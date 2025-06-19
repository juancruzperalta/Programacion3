package SistemaArchivo.Comparator;

import java.util.Comparator;

import SistemaArchivo.ElementoSA;

public class OrdenTamanio implements Comparator<ElementoSA>{

	@Override
	public int compare(ElementoSA o1, ElementoSA o2) {
		return (int) (o1.getTamanio() - o2.getTamanio());
	}

}
