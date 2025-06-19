package Avion;

public class Avion {
	int capacidad;
	String modelo;
	String estado;
	String nombre;
	String color;
	
	public Avion() {
		capacidad = 200;
		modelo = "AirVoy400";
		estado = "en Tierra";
		nombre = "Avion de José";
		color = "blanco";
	}
	public Avion(int capacidad) {
		this.capacidad = capacidad;
	}
	public Avion(int capacidad, String estado) {
		this.setCapacidad(capacidad);
		this.estado = estado;
	}
	public Avion(int capacidad, String modelo, String estado, String nombre, String color) {
		this.capacidad = capacidad;
		this.modelo = modelo;
		this.estado = estado;
		this.nombre = nombre;
		this.color = color;
	}
	
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		if(capacidad > 0) {
			this.capacidad = capacidad;
		}
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean sosIgual(Avion otroAvion) {
		return(this.capacidad == otroAvion.capacidad &&
				this.getModelo() == otroAvion.getModelo() &&
				this.getColor() == otroAvion.getColor()
				);
	}
	
}
