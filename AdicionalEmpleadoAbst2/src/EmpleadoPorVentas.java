
public class EmpleadoPorVentas extends Empleado {
	private int ventas;
	private double porcentaje;
	public EmpleadoPorVentas(String nombre, int nroLegajo, int ventas, double porcentaje) {
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


	public double getSueldo() {
		return ventas*porcentaje/100;
	}

}
