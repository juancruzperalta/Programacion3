package SistemaArchivo;

public class Link extends Elemento {
	private Elemento elem;
	private static double tamanio=1;
	
	
	public Link(String nombre, int fechaCreacion, Elemento elem) {
		super(nombre, fechaCreacion);
		this.elem =elem;
	}

	@Override
	public double getTamanio() {
		return tamanio;
	}

	public Elemento getElem() {
		return elem;
	}

	public void setElem(Elemento elem) {
		this.elem = elem;
	}

	@Override
	public int cantElementosQueTenes() {
		return 1;
	}
	
	

}
