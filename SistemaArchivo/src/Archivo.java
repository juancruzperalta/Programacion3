
public class Archivo extends ElementoSA {
	private int fechaModificacion;
	public Archivo(String nombre, int fechaCreacion, int fechaModificacion) {
		super(nombre, fechaCreacion);
		this.fechaModificacion = fechaModificacion;
	}	
	public int getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(int fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	public int getTamanio() {
		return 1;
	}
	public int cantElementos() {
		return 1;
	}

}
