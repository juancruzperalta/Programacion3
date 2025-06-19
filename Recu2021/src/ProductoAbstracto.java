import java.util.ArrayList;

public abstract class ProductoAbstracto {
	public abstract int getPeso();
	public abstract int getPrecio();
	public abstract ArrayList<String> getCategorias();
	public abstract int cantProductos();
	public abstract Producto menorPeso();
	public abstract ArrayList<ProductoAbstracto> buscar(Condicion cond);
	public abstract ProductoAbstracto copiar(Condicion cond);
	
	public boolean tenesCategoria(String CategoriaQueBusco) {
		return this.getCategorias().contains(CategoriaQueBusco);
	}
}
