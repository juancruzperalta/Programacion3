package tp4ejerc2;

public class EmpleadoPorcentaje extends empleado {
	private int ventasRealizadas;
	private double porcentaje;
	public EmpleadoPorcentaje(String nombre, String apellido, int sueldoFijo, int horasTrabajadas, double gananciaHoras, int ventas, double porcentaje) {
		super(nombre, apellido, sueldoFijo, horasTrabajadas, gananciaHoras);
		this.ventasRealizadas = ventas;
		this.porcentaje = porcentaje;
	}
	public int getVentasRealizadas() {
		return ventasRealizadas;
	}
	public void setVentasRealizadas(int ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}
	
	public double getPorcentaje() {
		return ventasRealizadas*porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public double salarioVentasPorcentaje() {
		return this.getSueldoFijo()+this.getPorcentaje();
	}
	
}
//los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
//cantidad de ventas realizadas.