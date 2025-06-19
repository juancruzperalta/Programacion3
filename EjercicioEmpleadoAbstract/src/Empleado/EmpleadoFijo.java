package Empleado;

public class EmpleadoFijo extends Empleado {
	int sueldo;
	public EmpleadoFijo(String nombre, int edad) {
		super(nombre, edad);
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		return sueldo;
	}

}
