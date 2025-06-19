import java.util.ArrayList;

public class Combo extends ProductoGenerico {
	private ArrayList<ProductoGenerico> productos;
	private double descuento;
	private static double maximoDescuento=0.5;
	private Condicion cond;


	
	
	public Combo(double descuento, Condicion cond) {
		super();
		productos = new ArrayList<>();
		this.descuento = descuento;
		this.cond = cond;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public void setCond(Condicion cond) {
		this.cond = cond;
	}

	public void addProducto(ProductoGenerico pp) {
		if(cond.cumple(pp)) {
			productos.add(pp);
		}
	}

	@Override
	public ArrayList<String> categorias() {
		ArrayList<String> resp = new ArrayList<>();
		for(ProductoGenerico pp: productos) {
			ArrayList<String> aux = pp.categorias();
			for(String au: aux) {
				if(!pp.categorias().contains(au)) {
					resp.addAll(aux);
				}
			}
		}
		return resp;
	}

	@Override
	public int getPeso() {
		int suma=0;
		for(ProductoGenerico pp: productos) {
			suma += pp.getPeso();
		}
		return suma;
	}

	public int getTotalPrecio() {
		int suma=0;
		for(ProductoGenerico pp: productos) {
			suma += pp.getPrecio();
		}
		return suma;
	}
	
	@Override
	public int getPrecio() {
		int suma = 0;
		descuento = descuento*this.cantProductos();
		if(descuento >= Combo.maximoDescuento) {
			descuento = Combo.maximoDescuento;
		}
		return suma = (int) (suma*descuento);
	}

	@Override
	public int cantProductos() {
		int suma=0;
		for(ProductoGenerico pp: productos) {
			suma += pp.cantProductos();
		}
		return suma;
	}

	@Override
	public Producto menorPeso() {
		Producto esMenorPeso = null;
		int valor=0;
		for(ProductoGenerico pp: productos) {
			Producto esElMenorDePeso = pp.menorPeso();
			int valorProductoMenorPeso = esElMenorDePeso.getPeso();
			if(valorProductoMenorPeso < valor) {
				valor = valorProductoMenorPeso;
				esMenorPeso = esElMenorDePeso;
			}
		}
		return esMenorPeso;
	}

	@Override
	public ArrayList<ProductoGenerico> buscar(Condicion cc) {
		ArrayList<ProductoGenerico> aux = new ArrayList<>();
		if(cc.cumple(this)) {
			aux.add(this);
		}else {
			for(ProductoGenerico pp: productos) {
				aux.addAll(pp.buscar(cc));
			}
		}
		return aux;
	}

	@Override
	public ProductoGenerico copiar(Condicion cc) {
		Combo comboNuevo = new Combo(this.descuento, this.cond);
		if(cc.cumple(comboNuevo)) {
			for(ProductoGenerico hijos: productos) {
				comboNuevo.addProducto(hijos.copiar(cc));
			}
			return comboNuevo;
		}
		return null;
	}

}
