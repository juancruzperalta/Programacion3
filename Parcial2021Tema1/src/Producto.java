import java.util.ArrayList;

public class Producto extends ProductoGenerico {
	private String marca;
	private int precio;
	private int volumen;
	
	
	public Producto(String nombre, String marca, int precio, int volumen) {
		super(nombre);
		this.marca = marca;
		this.precio = precio;
		this.volumen = volumen;
	}

	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}


	@Override
	public String marca() {
		return this.marca;
	}

	@Override
	public int getPrecio() {
		return this.precio;
	}

	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return this.volumen;
	}

	public int cantProductos() {
		return 1;
	}
	
	public ArrayList<ProductoGenerico> buscar(Condicion cond){
		ArrayList<ProductoGenerico> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
}
