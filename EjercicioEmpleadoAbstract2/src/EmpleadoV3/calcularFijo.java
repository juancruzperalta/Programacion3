package EmpleadoV3;

public class calcularFijo extends calcularSueldo {
	int sueldo;
	
	
	public calcularFijo(int sueldo) {
		super();
		this.sueldo = sueldo;
	}


	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}


	@Override
	public double calcularPago(Empleado e1) {
		return sueldo;
	}

}
