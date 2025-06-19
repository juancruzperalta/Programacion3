import java.util.ArrayList;

public abstract class ProductoGenerico {
	public abstract ArrayList<String> getCategorias();
	public abstract int getPeso();
	public abstract double getPrecio();
	public abstract int cantProductos();
	public abstract ArrayList<ProductoGenerico> buscar(Condicion cond);
	public abstract Producto menorPeso();
	public abstract ProductoGenerico copiar(Condicion cond);
	public boolean tenesCategoria(String CatQueBusco) {
		return this.getCategorias().contains(CatQueBusco);
	}
	}
