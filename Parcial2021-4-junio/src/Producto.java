import java.util.ArrayList;

public class Producto extends ProductoGenerico {
	private int precio;
	private int volumen;
	private String marca;
	
	
	
	public Producto(String nombre, int precio, int volumen, String marca) {
		super(nombre);
		this.precio = precio;
		this.volumen = volumen;
		this.marca = marca;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String getMarca() {
		return this.marca;
	}

	@Override
	public int getPrecio() {
		return this.precio;
	}

	@Override
	public int getVolumen() {
		return this.volumen;
	}

	@Override
	public int cantProductos() {
		return 1;
	}

	@Override
	public ArrayList<ProductoGenerico> buscar(Condicion cond) {
		ArrayList<ProductoGenerico> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

}
