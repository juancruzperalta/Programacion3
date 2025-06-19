package EmpleadoV2;


public class CalculadorSueldoFijo extends CalcularSueldo {
	
	private double sueldo;
	public CalculadorSueldoFijo(double sueldo) {
		super();
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double liquidarSueldo(Empleado ee) {
		return sueldo;
	}
	

}
