import java.util.ArrayList;

public class Paquete extends ProductoAbstracto {
	private ArrayList<ProductoAbstracto> elementos;
	private Condicion c1;
	
	
	
	public Paquete(String nombre, ArrayList<ProductoAbstracto> elementos, Condicion c1) {
		super(nombre);
		this.elementos = elementos;
		this.c1 = c1;
	}

	public Condicion getC1() {
		return c1;
	}

	public void setC1(Condicion c1) {
		this.c1 = c1;
	}

	public void addElemento(ProductoAbstracto pp) {
		elementos.add(pp);
	}
	
	public boolean sePublicitaEnDiario(ProductoAbstracto pp) {
		return c1.cumple(pp);
	}
	@Override
	public int volumen() {
		int suma=0;
		for(ProductoAbstracto el: elementos) {
			int mayor = el.volumen();
			if(suma > mayor) {
				suma = mayor;
			}
		}
		return suma;
	}

	@Override
	public String marca() {
		String marca="";
		for(ProductoAbstracto el: elementos) {
			marca = el.marca();
		}
		return marca;
	}

	@Override
	public int precio() {
		int suma=0;
		for(ProductoAbstracto el: elementos) {
			suma += el.precio();
		}
		return suma;
	}

	@Override
	public ArrayList<ProductoAbstracto> buscar(Condicion cond) {
		ArrayList<ProductoAbstracto> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		for(ProductoAbstracto pp: elementos) {
			aux.addAll(pp.buscar(cond));
		}
		return aux;
	}

	@Override
	public int cantProductos() {
		int suma=0;
		for(ProductoAbstracto pp: elementos) {
			suma+=pp.cantProductos();
		}
		return suma;
	}

}
