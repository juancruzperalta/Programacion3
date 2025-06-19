import java.util.ArrayList;

public abstract class ProductoGeneral {
	public abstract int peso();
	public abstract int precio();
	public abstract ArrayList<String> categorias();
	public abstract ArrayList<ProductoGeneral> buscar(Condicion cond);
	public abstract Producto menorPeso();
	public abstract int cantProductos();
	public abstract ProductoGeneral copia(Condicion cond);
	
	
	public boolean vosTenesCategoria(String loquebusco) {
		return this.categorias().contains(loquebusco);
	}
	

}
