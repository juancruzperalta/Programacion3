package SistemaArchivo;

public abstract class Elemento {
	protected String nombre;
	protected int fechaCreacion;
	public Elemento(String nombre, int fechaCreacion) {
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
	
	public abstract int cantElementos();
	
	public abstract double tamanio();
	
	public boolean equals(Object o1) {
		Elemento ee = (Elemento) o1;
		return this.getNombre() == ee.getNombre();
	}
}
