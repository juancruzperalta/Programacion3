import java.util.ArrayList;

public class Producto extends ProductoAbstracto {
	private int volumen;
	private String marca;
	private int precio;
	
	public Producto(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int volumen() {
		return this.volumen;
	}

	@Override
	public String marca() {
		return this.marca;
	}

	@Override
	public int precio() {
		return this.precio;
	}

	@Override
	public ArrayList<ProductoAbstracto> buscar(Condicion cond) {
		ArrayList<ProductoAbstracto> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	@Override
	public int cantProductos() {
		return 1;
	}

}
