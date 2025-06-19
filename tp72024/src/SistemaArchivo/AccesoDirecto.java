package SistemaArchivo;

public class AccesoDirecto extends Elemento {
	private static int tamanio = 1;
	private Elemento elementoApunto;

	public AccesoDirecto(Elemento elementoApunto) {
		super("Acceso Directo a "+ elementoApunto, 200);
		this.elementoApunto = elementoApunto;
	}

	public Elemento getElementoApunto() {
		return elementoApunto;
	}

	public void setElementoApunto(Elemento elementoApunto) {
		this.elementoApunto = elementoApunto;
	}

	@Override
	public int cantElementos() {
		return 1;
	}

	public int getTamanio() {
		return tamanio;
	}
	@Override
	public double tamanio() {
		return this.getTamanio();
	}

}
