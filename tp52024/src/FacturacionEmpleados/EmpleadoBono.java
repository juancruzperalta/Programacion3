package FacturacionEmpleados;

public class EmpleadoBono extends Empleado {
	private double ventas;
	private double bonoPorVentas;
	public EmpleadoBono(String nombre, String apellido, double sueldoMensual, double ventas, double bonoPorVentas) {
		super(nombre, apellido, sueldoMensual);
		this.ventas = ventas;
		this.bonoPorVentas = bonoPorVentas;
	
	}
	public double getVentas() {
		return ventas;
	}
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	public double getBonoPorVentas() {
		return bonoPorVentas*ventas/10;
	}//Si es un bono de 1000*100ventas(1) sería 1010;
	public void setBonoPorVentas(double bonoPorVentas) {
		this.bonoPorVentas = bonoPorVentas;
	}
	
	public double getSueldoMensual() {
		double sueldo= super.getSueldoMensual();
		return sueldo + this.getBonoPorVentas();
	}

}
