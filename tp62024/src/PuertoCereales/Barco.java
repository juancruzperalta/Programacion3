package PuertoCereales;

public class Barco extends ListaOrdenada{
	private String nombre;
	private int capacidad;
	public Barco(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean sosMayor(ListaOrdenada l1) {
		return this.getCapacidad()< ((Barco)l1).getCapacidad();
	}
	
	
}
