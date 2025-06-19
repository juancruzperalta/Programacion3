package SistemaArchivo;

public class Comprimido extends Directorio {
	private double tasaCompresion;
	public Comprimido(String nombre, int fechaCreacion, double tasaCompresion) {
		super(nombre, fechaCreacion);
		this.tasaCompresion = tasaCompresion;
	}
	public double getTasaCompresion() {
		return tasaCompresion;
	}
	public void setTasaCompresion(double tasaCompresion) {
		this.tasaCompresion = tasaCompresion;
	}
	
	public double getTamanio() {
		return super.tamanio()*tasaCompresion;
	}
	public int cantElementos() {
		return 1;
	}
	
}
