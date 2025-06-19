import java.util.ArrayList;

public abstract class ProductoAbstracto {
	private String nombre;

	public ProductoAbstracto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public abstract int cantProductos();
	public abstract int volumen();
	public abstract String marca();
	public abstract int precio();
	public abstract ArrayList<ProductoAbstracto> buscar(Condicion cond);
}
