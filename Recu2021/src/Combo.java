import java.util.ArrayList;

public class Combo extends ProductoAbstracto{
	private ArrayList<ProductoAbstracto> productos;
	private double descuento;
	private static final double descuentoMaximo = 0.5;
	private Condicion cond;
	
	

	

	public Combo(double descuento, Condicion cond) {
		super();
		this.descuento = descuento;
		this.cond = cond;
		productos = new ArrayList<>();
	}
	public void addElemento(ProductoAbstracto pp) {
		if(cond.cumple(pp)) {
			productos.add(pp);
		}
	}
	
	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public static double getDescuentomaximo() {
		return descuentoMaximo;
	}
	
	public int getPrecioTotal() {
		int suma=0;
		for(ProductoAbstracto pp: productos) {
			suma += pp.getPrecio();
		}
		return suma;
	}

	@Override
	public int getPeso() {
		int suma=0;
		for(ProductoAbstracto pp: productos) {
			suma+= pp.getPeso();
		}
		return suma;
	}

	@Override
	public int getPrecio() {
		int suma = 0;
		descuento = descuento*this.cantProductos();
		if(descuento >= Combo.descuentoMaximo) {
			descuento = Combo.descuentoMaximo;
		}
		return (int) (suma - suma*descuento);
	}

	@Override
	public ArrayList<String> getCategorias() {
		ArrayList<String> res = new ArrayList<>();
		for(ProductoAbstracto pp: productos) {
			ArrayList<String> aux = pp.getCategorias();
			for(String au: aux) {
				if(!res.contains(au)) {
					res.addAll(aux);
				}
			}
		}
		return res;
	}

	@Override
	public int cantProductos() {
		int suma=0;
		for(ProductoAbstracto pp: productos) {
			suma+= pp.cantProductos();
		}
		return suma;
	}
	@Override
	public Producto menorPeso() {
		Producto menorPeso = null;
		int valor =0;
		for(ProductoAbstracto pp: productos) {
			Producto sosMenorPeso = pp.menorPeso();
			int valorMenor = sosMenorPeso.getPrecio();
			if(valorMenor < valor) {
				valor = valorMenor;
				menorPeso = sosMenorPeso;
			}
		}
		return menorPeso;
	}
	
	public ArrayList<ProductoAbstracto> buscar(Condicion cond){
		ArrayList<ProductoAbstracto> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}else {
			
		for(ProductoAbstracto pp: productos) {
			aux.addAll(pp.buscar(cond));
		}
		}
		return aux;
	}
	
	public ProductoAbstracto copiar(Condicion cond) {
		Combo copia = new Combo(this.descuento, this.cond);
		if(cond.cumple(copia)) {
			for(ProductoAbstracto pp: productos) {
				copia.addElemento(pp.copiar(cond));
			}
			return copia;
		}
		return null;
	}

}
