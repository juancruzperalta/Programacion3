package EjercicioEmpleado;

public class EmpleadoPorVenta extends Empleado {
	private int ventas;
	private double porcentaje;
	
	public EmpleadoPorVenta(String nombre, int nroLegajo,
			int ventas, double porcentaje) {
		super(nombre, nroLegajo);
		this.ventas = ventas;
		this.porcentaje = porcentaje;
	}
	

	public int getVentas() {
		return ventas;
	}


	public void setVentas(int ventas) {
		this.ventas = ventas;
	}


	public double getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}


	@Override
	public double getSueldo() {
		return this.getVentas()*this.getPorcentaje()/100;
	}

}
