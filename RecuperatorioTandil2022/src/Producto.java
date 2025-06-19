import java.util.ArrayList;

public class Producto extends ProductoGenerico {
	private ArrayList<String> categorias;
	private int peso;
	private int precio;
	
	
	public Producto(int peso, int precio) {
		super();
		this.peso = peso;
		this.precio = precio;
		categorias = new ArrayList<>();
		
	}

	public void addCategoria(String cc) {
		if(!categorias.contains(cc)) {
			categorias.add(cc);
		}
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public ArrayList<String> categorias() {
		return new ArrayList<>(this.categorias);
	}

	@Override
	public int getPeso() {
		return this.peso;
	}

	@Override
	public int getPrecio() {
		return this.precio;
	}

	@Override
	public int cantProductos() {
		return 1;
	}

	@Override
	public Producto menorPeso() {
		return this;
	}

	@Override
	public ArrayList<ProductoGenerico> buscar(Condicion cc) {
		ArrayList<ProductoGenerico> aux = new ArrayList<>();
		if(cc.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	@Override
	public ProductoGenerico copiar(Condicion cc) {
		Producto productoCopia = new Producto(this.precio, this.peso);
		if(cc.cumple(productoCopia)) {
			for(String aux: categorias) {
				productoCopia.addCategoria(aux);
			}
			return productoCopia;
		}
		return null;
	}

}
