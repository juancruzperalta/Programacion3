package EmpleadoV2;

public class CalculadorVentasPorcentaje extends CalcularSueldo {
	private double porcentaje;
	private int ventas;
	
	
	
	public CalculadorVentasPorcentaje(double porcentaje, int ventas) {
		super();
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



	public double liquidarSueldo(Empleado ee) {
		return ventas*ee.porcentaje/100;
	}

}
