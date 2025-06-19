package EmpleadoV2;

public class Empleado {
	private int dni;
	protected String nombre;
	protected double sueldo;
	
	
	
	
	public Empleado(int dni, String nombre, double sueldo) {

		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}