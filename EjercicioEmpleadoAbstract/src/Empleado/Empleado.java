package Empleado;

public abstract class Empleado {
	private String nombre;
	private int edad;
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract double getSueldo();
	

	public String toString() {
		return this.nombre;
	}
}
