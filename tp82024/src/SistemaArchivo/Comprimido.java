package SistemaArchivo;

public class Comprimido extends Directorio {

	private int tasaCompresion;
	
	public Comprimido(String nombre, int fechaCreacion, int tasaCompresion) {
		super(nombre, fechaCreacion);
		this.tasaCompresion = tasaCompresion;
	}

	public int getTasaCompresion() {
		return tasaCompresion;
	}

	public void setTasaCompresion(int tasaCompresion) {
		this.tasaCompresion = tasaCompresion;
	}

	public double getTamanio() {
		return super.getTamanio()*tasaCompresion;
	}
	
}
