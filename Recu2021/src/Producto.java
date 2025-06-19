import java.util.ArrayList;

public class Producto extends ProductoAbstracto{
	private int peso;
	private int precio;
	private ArrayList<String> categorias;
	
	
	public Producto(int peso, int precio) {
		super();
		this.peso = peso;
		this.precio = precio;
		categorias = new ArrayList<>();
	}
	
	public void addCategoria(String cat) {
		if(!categorias.contains(cat)) {
			categorias.add(cat);
		}
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
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
	public ArrayList<String> getCategorias() {
		ArrayList<String> copia = new ArrayList<>(this.categorias);
		return copia;
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
	public ArrayList<ProductoAbstracto> buscar(Condicion cond) {
		ArrayList<ProductoAbstracto> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	@Override
	public ProductoAbstracto copiar(Condicion cond) {
		Producto copia = new Producto(this.peso, this.precio);
		if(cond.cumple(copia)) {
			for(String aux: categorias) {
				copia.addCategoria(aux);
			}
			return copia;
		}
		return null;
	}

}
