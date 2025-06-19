import java.util.ArrayList;

public class Combo extends ProductoGenerico {
	private ArrayList<ProductoGenerico> prods;
	private double descuento;
	private static double descuentoMax = 0.5;
	private Condicion cond;
	public Combo(double desc, Condicion cond) {
		prods = new ArrayList<>();
		this.descuento=desc;
		this.cond = cond;
	}
	
	public void addProducto(ProductoGenerico prod) {
		if(cond.cumple(prod)) {
			prods.add(prod);
		}
	}
	
	
	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public static double getDescuentoMax() {
		return descuentoMax;
	}


	public static void setDescuentoMax(double descuentoMax) {
		Combo.descuentoMax = descuentoMax;
	}


	@Override
	public ArrayList<String> getCategorias() {
		ArrayList<String> res = new ArrayList<>();
		for(ProductoGenerico pp: prods) {
			ArrayList<String> aux= pp.getCategorias();
			for(String au: aux) {
				if(!res.contains(au)) {
					res.addAll(aux);
				}
			}
		}
		return res;
	}

	@Override
	public int getPeso() {
		int suma=0;
		for(ProductoGenerico pp: prods) {
			suma+= pp.getPeso();
		}
		return suma;
	}
	public double totalPrecio() {
		int suma=0;
		for(ProductoGenerico pp: prods) {
			suma+= pp.getPrecio();
		}
		return suma;
	}
	
	@Override
	public double getPrecio() {
		int suma=(int) this.totalPrecio();
		descuento = descuento*this.cantProductos();
		if(descuento >= Combo.descuentoMax) {
			descuento = Combo.descuentoMax;
		}
		return suma - suma*descuento;
	}


	@Override
	public int cantProductos() {
		int suma=0;
		for(ProductoGenerico pp: prods) {
			suma += pp.cantProductos();
		}
		return suma;
	}
	
	public ArrayList<ProductoGenerico> buscar(Condicion cond){
		ArrayList<ProductoGenerico> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}else {
			for(ProductoGenerico pp: prods) {
				aux.addAll(pp.buscar(cond));
			}
		}
		return aux;
		
	}
	
	public Producto menorPeso() {
		Producto menorPeso = null;
		int valor = 0;
		for(ProductoGenerico pp: prods) {
			Producto sosElDeMenorPeso = pp.menorPeso();
			int valorDeMenorPeso = sosElDeMenorPeso.getPeso();
			if(valorDeMenorPeso < valor) {
				valor = valorDeMenorPeso;
				menorPeso = sosElDeMenorPeso;
			}
		}
		return menorPeso;
	}
	
	public ProductoGenerico copiar(Condicion cond) {
		Combo copiaCombo = new Combo(this.descuento, this.cond);
		if(cond.cumple(copiaCombo)) {
			for(ProductoGenerico pp: prods) {
				copiaCombo.addProducto(pp.copiar(cond));
			}
			return copiaCombo;
		}
		return null;
	}
}
