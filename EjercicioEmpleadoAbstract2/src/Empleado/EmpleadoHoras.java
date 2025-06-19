package Empleado;

public class EmpleadoHoras extends Empleado {
	protected int horas;
	protected double pagoHoras;
	public EmpleadoHoras(String nombre, int edad, int horas, double pagoHoras) {
		super(nombre, edad);
		this.horas = horas;
		this.pagoHoras = pagoHoras;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getPagoHoras() {
		return pagoHoras;
	}

	public void setPagoHoras(double pagoHoras) {
		this.pagoHoras = pagoHoras;
	}

	@Override
	public double getSueldo() {
		return this.getHoras() * this.getPagoHoras();
	}

}
