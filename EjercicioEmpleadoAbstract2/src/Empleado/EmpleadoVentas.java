package Empleado;

public class EmpleadoVentas extends Empleado {

	protected int ventas;
	protected double porcentaje;
	public EmpleadoVentas(String nombre, int edad, int ventas, double porcentaje) {
		super(nombre, edad);
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
		return ventas * porcentaje/100;
	}

}
