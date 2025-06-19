import java.util.ArrayList;

public class Producto extends ProductoGenerico {
	private ArrayList<String> categorias;
	private int peso;
	private double precio;
	
	public Producto(int peso, int precio) {
		this.peso = peso;
		this.precio = precio;
		categorias = new ArrayList<>();
	}
	
	public void addCategoria(String cat) {
		categorias.add(cat);
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public ArrayList<String> getCategorias() {
		ArrayList<String> copia = new ArrayList<>(this.categorias);
		return copia;
	}

	@Override
	public int getPeso() {
		return this.peso;
	}

	@Override
	public double getPrecio() {
		return this.precio;
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

	public Producto menorPeso() {
		return this;
	}

	public ProductoGenerico copiar(Condicion cond) {
		Producto copia = new Producto(this.peso, (int) this.precio);
		if(cond.cumple(copia)) {
			for(String aux: categorias) {
				copia.addCategoria(aux);
			}
			return copia;
		}
		return null;
	}

}
