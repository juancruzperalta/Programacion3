package EmpleadoV3;

public class Empleado {
	private int dni;
	protected String nombre;
	protected calcularSueldo sueldo;
	protected int comision;
	protected int horasExtra;
	
	
	
	public Empleado(int dni, String nombre,int comision, int horasExtra) {

		this.dni = dni;
		this.nombre = nombre;
		this.comision = comision;
		this.horasExtra = horasExtra;
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
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	public int getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	
	public void cambiar(calcularSueldo cs) {
		sueldo = cs;
	}
}