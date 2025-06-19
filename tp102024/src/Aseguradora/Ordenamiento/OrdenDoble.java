package Aseguradora.Ordenamiento;

import java.util.Comparator;

import Aseguradora.SeguroGeneral;

public class OrdenDoble implements Comparator<SeguroGeneral>{
	Comparator<SeguroGeneral> c1, c2;

	public OrdenDoble(Comparator<SeguroGeneral> c1, Comparator<SeguroGeneral> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(SeguroGeneral o1, SeguroGeneral o2) {
		int res= c1.compare(o1, o2);
		if(res == 0) {
			return c2.compare(o1, o2);
		}
		return res;
	}
	
	
}
