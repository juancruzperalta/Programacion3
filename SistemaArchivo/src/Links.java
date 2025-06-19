
public class Links extends ElementoSA {
	private ElementoSA elementoQueApunta;
	private static int tamanio=1;
	public Links(String nombre, int fechaCreacion, ElementoSA elem) {
		super(nombre, fechaCreacion);
		this.elementoQueApunta = elem;
	}

	public ElementoSA getElementoQueApunta() {
		return elementoQueApunta;
	}

	public void setElementoQueApunta(ElementoSA elementoQueApunta) {
		this.elementoQueApunta = elementoQueApunta;
	}

	@Override
	public int getTamanio() {
		return tamanio;
	}

	@Override
	public int cantElementos() {
		return 1;
	}

}
