import java.util.ArrayList;

public class Paquete extends ProductoGenerico {
	private ArrayList<ProductoGenerico> productos;
	
	
	public Paquete(String nombre) {
		super(nombre);
		productos = new ArrayList<>();
	}

	@Override
	public String getMarca() {
		if(productos.size()>0) {
			for(int i=0; i<productos.size(); i++) {
			return productos.get(i).getMarca();
			}
		}
		return null;
	}

	@Override
	public int getPrecio() {
		int suma = 0;
		for(ProductoGenerico pp: productos) {
			suma += pp.getPrecio();
		}
		return suma;
	}

	@Override
	public int getVolumen() {
		int suma=0;
		for(ProductoGenerico pp: productos) {
			int mayor = pp.getVolumen();
			if(mayor > suma) {
				suma = mayor;
			}
		}
		return suma;
	}

	@Override
	public int cantProductos() {
		int suma=0;
		for(ProductoGenerico pp: productos) {
			suma += pp.cantProductos();
		}
		return suma;
	}

	@Override
	public ArrayList<ProductoGenerico> buscar(Condicion cond) {
		ArrayList<ProductoGenerico> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
			for(ProductoGenerico pp: productos) {
				aux.addAll(pp.buscar(cond));
			}
		}
		return aux;
	}

}
