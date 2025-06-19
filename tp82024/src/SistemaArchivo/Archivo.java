package SistemaArchivo;

public class Archivo extends Elemento {

	private int fechaUltModificacion;
	
	public Archivo(String nombre, int fechaCreacion, int fechaUltModificacion) {
		super(nombre, fechaCreacion);
		this.fechaUltModificacion = fechaUltModificacion;
	}

	public int getFechaUltModificacion() {
		return fechaUltModificacion;
	}

	public void setFechaUltModificacion(int fechaUltModificacion) {
		this.fechaUltModificacion = fechaUltModificacion;
	}

	public double getTamanio() {
		return 1;
	}

	@Override
	public int cantElementosQueTenes() {
		return 1;
	}


	
	
}
