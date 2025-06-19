import java.util.ArrayList;

public abstract class ProductoGenerico {
	public abstract ArrayList<String> categorias();
	public abstract int getPeso();
	public abstract int getPrecio();
	public abstract int cantProductos();
	
	public abstract Producto menorPeso();
	public abstract ArrayList<ProductoGenerico> buscar(Condicion cc);
	
	public boolean tenesEstaPalabra(String palabraQuebusco) {
		return categorias().contains(palabraQuebusco);
	}
	
	public abstract ProductoGenerico copiar(Condicion cc);
}
