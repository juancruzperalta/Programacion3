package CentroComputo;

import java.util.ArrayList;

public class ListaOrdenada {
	protected ArrayList<ColaEspera> productos;
	
	public ListaOrdenada() {
		productos = new ArrayList<ColaEspera>();
	}
	
	public void addProducto(ColaEspera p1) {
		int pos=0;
		while(pos < productos.size() && productos.get(pos).sosMayor(p1)) {
			pos++;
			this.productos.add(pos, p1);
		}
	}
	public ColaEspera siguienteProd() {
		return productos.remove(0);
	}
	public boolean EstaVacia() {
		return productos.isEmpty();
	}
}