package Empleado;

public class EmpleadoVentas extends Empleado {
	private double porcentaje;
	private int ventas;
	
	public EmpleadoVentas(String nombre, int dni, double sueldo, int ventas, double porcentaje) {
		super(nombre, dni, sueldo);
		this.porcentaje = porcentaje;
		this.ventas = ventas;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public double getSueldo() {
		return super.getSueldo()+ventas*porcentaje/100;
	}
}
