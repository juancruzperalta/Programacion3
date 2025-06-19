import java.util.ArrayList;

public abstract class ProductoGenerico {
	private String nombre;

	public ProductoGenerico(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String marca();
	public abstract int getPrecio();
	public abstract int getVolumen();
	public abstract int cantProductos();
	
	public abstract ArrayList<ProductoGenerico> buscar(Condicion cond);
	
}
