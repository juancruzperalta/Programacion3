package EjercicioEmpleado;

public class EmpleadoSueldoFijo extends Empleado {
	double sueldoFijo;
	
	public EmpleadoSueldoFijo(String nombre, int nroLegajo , double sueldoFijo) {
		super(nombre, nroLegajo);
		this.sueldoFijo = sueldoFijo;
	}
	
	

	public double getSueldoFijo() {
		return sueldoFijo;
	}



	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}



	public double getSueldo() {
		return this.getSueldoFijo();
	}

}
