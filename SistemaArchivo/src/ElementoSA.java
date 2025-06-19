
public abstract class ElementoSA {
	protected String nombre;
	protected int fechaCreacion;
	public ElementoSA(String nombre, int fechaCreacion) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(int fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public abstract int getTamanio();
	public abstract int cantElementos();
}
