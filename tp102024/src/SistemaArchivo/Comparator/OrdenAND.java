package SistemaArchivo.Comparator;

import java.util.Comparator;

import SistemaArchivo.ElementoSA;

public class OrdenAND implements Comparator<ElementoSA>{
	private Comparator<ElementoSA> comp1, comp2;
	@Override
	public int compare(ElementoSA o1, ElementoSA o2) {
		int res= comp1.compare(o1, o2);
		if(res == 0) {
			comp2.compare(o1, o2);
		}
		return res;
	}

}
