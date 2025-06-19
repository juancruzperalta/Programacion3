package EmpleadoV2;

public class EmpleadoPorVenta extends Empleado {

	protected int ventas;
	protected double comision;
	
	public EmpleadoPorVenta(int dni, String nombre, double sueldo, int ventas, double comision) {
		super(dni, nombre, sueldo);
		this.ventas = ventas;
		this.comision = comision;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	public double getSueldo() {
		return super.getSueldo()+ventas*comision/100;
	}

}
