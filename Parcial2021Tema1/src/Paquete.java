import java.util.ArrayList;

public class Paquete extends ProductoGenerico {
	private ArrayList<ProductoGenerico> prods;
	
	public Paquete(String nn) {
		super(nn);
		prods = new ArrayList<>();
	}
	
	@Override
	public String marca() {
		String marcaPrimera="";
		marcaPrimera = prods.get(0).marca();
		return marcaPrimera;
	}

	@Override
	public int getPrecio() {
		int suma=0;
		for(ProductoGenerico pp: prods) {
			suma+= pp.getPrecio();
		}
		return suma;
	}

	@Override
	public int getVolumen() {
		int suma=0;
		for(ProductoGenerico pp: prods) {
			int mayor = pp.getVolumen();
			if(mayor > suma) {
				suma = mayor;
			}
		}
		return suma;
	}

	public int cantProductos() {
		int suma=0;
		for(ProductoGenerico pp: prods) {
			suma += pp.cantProductos();
		}
		return suma;
	}
	
	public ArrayList<ProductoGenerico> buscar(Condicion cond){
		ArrayList<ProductoGenerico> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		for(ProductoGenerico pp: prods) {
			aux.addAll(pp.buscar(cond));
		}
		return aux;
	}
}
