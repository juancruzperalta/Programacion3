package EmpleadoV2;

public class CalculadorHorasExtra extends CalcularSueldo {
	
	private double horas;
	private int pagoHoras;
	
	public CalculadorHorasExtra(double horas, int pagoHoras) {

		this.horas = horas;
		this.pagoHoras = pagoHoras;
	}

	public double liquidarSueldo(Empleado ee) {
		return horas*pagoHoras;
	}

}
