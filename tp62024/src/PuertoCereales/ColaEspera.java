package PuertoCereales;

import java.util.ArrayList;

public class ColaEspera {
	private ArrayList<ListaOrdenada> productos;

	public ColaEspera() {
		productos = new ArrayList<ListaOrdenada>();
	}
	
	public void addProducto(ListaOrdenada l1) {
		int i=0;
		
		while(i<productos.size() && productos.get(i).sosMayor(l1)) {
			i++;
			productos.add(i, l1);
		}
	}

	
}
