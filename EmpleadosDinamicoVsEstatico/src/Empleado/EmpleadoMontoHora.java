package Empleado;

public class EmpleadoMontoHora extends Empleado {
	private double horasTrabajadas;
	private int pagoHoras;
	
	public EmpleadoMontoHora(String nombre, int dni, double sueldo, double horasTrabajadas, int pagoHoras) {
		super(nombre, dni, sueldo);
		this.horasTrabajadas = horasTrabajadas;
		this.pagoHoras = pagoHoras;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getPagoHoras() {
		return pagoHoras;
	}

	public void setPagoHoras(int pagoHoras) {
		this.pagoHoras = pagoHoras;
	}
	
	public double getSueldo() {
		return super.getSueldo() + horasTrabajadas*pagoHoras;
	}

}
