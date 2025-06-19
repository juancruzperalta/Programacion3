package EjercicioEmpleado;

public class EmpleadoPorHoras extends Empleado {
	private int horasTrabajadas;
	private int pagoHoras;
	public EmpleadoPorHoras(String nombre, int nroLegajo, int horasTrabajadas, int pagoHoras) {
		super(nombre, nroLegajo);
		this.horasTrabajadas = horasTrabajadas;
		this.pagoHoras = pagoHoras;
	}
	
	

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}



	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}



	public int getPagoHoras() {
		return pagoHoras;
	}



	public void setPagoHoras(int pagoHoras) {
		this.pagoHoras = pagoHoras;
	}



	@Override
	public double getSueldo() {
		return this.getHorasTrabajadas()*this.getPagoHoras();
	}

}
