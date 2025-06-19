import java.util.ArrayList;

public class Producto extends ProductoGeneral {
	private int peso;
	private int precio;
	private ArrayList<String> categorias;
	
	
	public Producto(int peso, int precio) {
		super();
		this.peso = peso;
		this.precio = precio;
		categorias = new ArrayList<>();
	}

	public void addCategoria(String ca) {
		if(!categorias.contains(ca)) {
			categorias.add(ca);
		}
	}
	
	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public int peso() {
		return this.peso;
	}

	@Override
	public int precio() {
		return this.precio;
	}

	@Override
	public ArrayList<String> categorias() {
		ArrayList<String> aux = new ArrayList<>(categorias);
		return aux;
	}

	@Override
	public ArrayList<ProductoGeneral> buscar(Condicion cond) {
		ArrayList<ProductoGeneral> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	@Override
	public Producto menorPeso() {
		return this;
	}

	@Override
	public ProductoGeneral copia(Condicion cond) {
		Producto nuevo = new Producto(this.getPeso(), this.getPrecio());
		if(cond.cumple(nuevo)) {
			for(String cat: categorias) {
				nuevo.addCategoria(cat);
				
				return nuevo;
			}
		}
		return null;
	}

	@Override
	public int cantProductos() {
		return 1;
	}

}
