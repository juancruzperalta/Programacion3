import java.util.ArrayList;

public class Libreria {
	private ArrayList<Paquete> paquetes;
	private ArrayList<Producto> productos;
	private Condicion c1;
	public Libreria(Condicion c1) {
		super();
		this.c1 = c1;
		paquetes = new ArrayList<>();
		productos = new ArrayList<>();
	}
	
	public void addPaquete(Paquete pp) {
		if(c1.cumple(pp)) {
			paquetes.add(pp);
		}
	}
	public void addProducto(Producto pp) {
		if(c1.cumple(pp)) {
			productos.add(pp);
		}
	}
}
