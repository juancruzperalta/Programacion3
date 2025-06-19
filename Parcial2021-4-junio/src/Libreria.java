import java.util.ArrayList;

public class Libreria {
	private ArrayList<ProductoGenerico> productos;
	private Condicion cond;
	public Libreria(Condicion c1) {
	
		super();
		productos = new ArrayList<>();
		this.cond = c1;
	}
	
	
	
	public void setCond(Condicion cond) {
		this.cond = cond;
	}



	public void addProducto(ProductoGenerico pp) {
		productos.add(pp);
	}
	
	
	public boolean sePuedeSubirAlDiario(ProductoGenerico pp) {
		return cond.cumple(pp);
	}
	
	
}
