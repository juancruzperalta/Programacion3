
public class Comprimido extends Directorio {
	private int compresionDada;
	public Comprimido(String nombre, int fechaCreacion, int compresion) {
		super(nombre, fechaCreacion);
		this.compresionDada = compresion;
	}
	public int getCompresionDada() {
		return compresionDada;
	}
	public void setCompresionDada(int compresionDada) {
		this.compresionDada = compresionDada;
	}

	public int getTamanio() {
		return super.getTamanio()*compresionDada;
	}
	
}
