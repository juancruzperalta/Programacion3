package SistemaArchivo;

public class Archivo extends Elemento{
	private int tamanio;
	
	public Archivo(String nombre, int fechaCreacion, int tamanio) {
		super(nombre, fechaCreacion);
		this.tamanio = tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public int cantElementos() {
		return 1;
	}

	@Override
	public double tamanio() {
		return this.getTamanio();
	}

}
