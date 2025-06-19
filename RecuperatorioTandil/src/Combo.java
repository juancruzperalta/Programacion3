import java.util.ArrayList;

public class Combo extends ProductoGeneral {
	protected ArrayList<ProductoGeneral> productos;
	private double descuento;
	private static double descuentoLimite=0.5;
	private Condicion cond;
	public Combo(double desc, Condicion cond) {
		productos = new ArrayList<>();
		this.descuento =desc;
		this.cond =cond;
	}
	public void addProducto(ProductoGeneral pp) {
		if(this.cond.cumple(pp)) {
			productos.add(pp);
		}
	}
	
	public void setCond(Condicion cond) {
		this.cond = cond;
	}
	@Override
	public int peso() {
		int suma=0;
		for(ProductoGeneral pp: productos) {
			suma+= pp.peso();
		}
		return suma;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public int totalPrecio() {
		int suma=0;
		for(ProductoGeneral pp: productos) {
			suma += pp.precio();
		}
		return suma;
	}

	@Override
	public int precio() {
		int suma=this.totalPrecio();
		descuento = descuento*this.cantProductos();
		if(this.descuento > Combo.descuentoLimite) {
			descuento = descuentoLimite;
		
		}
		return suma = (int) (suma*descuento);
	}

	@Override
	public ArrayList<String> categorias() {
		ArrayList<String> resultado = new ArrayList<>();
		for(ProductoGeneral pp: productos) {
			ArrayList<String> aux = pp.categorias();
			for(String au: aux) {
				if(!resultado.contains(au)) {
					resultado.addAll(aux);
				}
			}
		}
		return resultado;
	}
	@Override
	public ArrayList<ProductoGeneral> buscar(Condicion cond) {
		ArrayList<ProductoGeneral> aux =new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}else {	
		for(ProductoGeneral pp: productos) {
			aux.addAll(pp.buscar(cond));
		}
		}
		return aux;
	}
	
	public Producto menorPeso() {
		Producto prodMenorPeso=null;
		int peso=0;
		for(ProductoGeneral pp: productos) {
			Producto hijoMenor = pp.menorPeso();
			int menor = hijoMenor.peso();
			if(menor< peso) {
				peso = menor;
				prodMenorPeso = hijoMenor;
			}
		}
		return prodMenorPeso;
	}
	@Override
	public ProductoGeneral copia(Condicion cond) {
		Combo nuevo = new Combo(descuento, cond);
		if(cond.cumple(nuevo)) {
			for(ProductoGeneral hijo: productos) {
				nuevo.addProducto(hijo.copia(cond));
			}
			return nuevo;
		}
		return null;
	}
	@Override
	public int cantProductos() {
		int suma=0;
		for(ProductoGeneral hijo: productos) {
			suma += hijo.cantProductos();
		}
		return suma;
	}

}
