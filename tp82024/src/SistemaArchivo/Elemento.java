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
	
	public abstract double getTamanio();
	
	public abstract int cantElementosQueTenes();
	
	
	public String toString() {
		return "<"+"Elemento"+ " - " + this.getNombre() + " " +
				"Fecha Creacion"+ " - " + this.getFechaCreacion()  + " " +
				"Tamanio"+ " - " + this.getTamanio()  + " " + 
				"Elementos"+ " - " + this.cantElementosQueTenes() + ">";
	}
}
