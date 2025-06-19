package FacturacionEmpleados;

public class EmpleadoVendedor extends Empleado {
	private int ventas;
	private double porcentajeVenta;
	
	public EmpleadoVendedor(String nombre, String apellido, int sueldoMensual, int ventas, double porcentajeVenta) {
		super(nombre, apellido, sueldoMensual);
		this.ventas = ventas;
		this.porcentajeVenta = porcentajeVenta;
		
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public double getPorcentajeVenta() {
		return porcentajeVenta;
	}

	public void setPorcentajeVenta(double porcentajeVenta) {
		this.porcentajeVenta = porcentajeVenta;
	}

	public double getSueldoMensual() {
		double sueldoMensual = super.getSueldoMensual();
		double sueldoVendedor = this.getVentas()*this.getPorcentajeVenta()/100;
		return sueldoMensual + sueldoVendedor;
	}
	
}
