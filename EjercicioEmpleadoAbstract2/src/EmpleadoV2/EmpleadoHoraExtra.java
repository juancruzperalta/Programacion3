package EmpleadoV2;

public class EmpleadoHoraExtra extends Empleado {
	protected int horaExtra;
	protected double porcentajePagoHora;
	
	public EmpleadoHoraExtra(int dni, String nombre, double sueldo,int horaExtra, double porcentajePagoHora) {
		super(dni, nombre, sueldo);
		this.horaExtra = horaExtra;
		this.porcentajePagoHora = porcentajePagoHora;
	}

	public double getPorcentajePagoHora() {
		return porcentajePagoHora;
	}

	public void setPorcentajePagoHora(double porcentajePagoHora) {
		this.porcentajePagoHora = porcentajePagoHora;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}
	
	public double getSueldo() {
		return super.getSueldo()+horaExtra*porcentajePagoHora/100;
	}

}
