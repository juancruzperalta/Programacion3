
public class EmpleadoSueldoFijo extends Empleado {
	private double sueldo;
	
	public EmpleadoSueldoFijo(String nombre, int nroLegajo, double sueldo) {
		super(nombre, nroLegajo);
		this.sueldo = sueldo;
	}

	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

}
