
public class EmpleadoHorasExtra extends Empleado {

	private int horas;
	private int pagohoras;
	
	public EmpleadoHorasExtra(String nombre, int nroLegajo, int horas, int pagoHoras) {
		super(nombre, nroLegajo);
		this.horas = horas;
		this.pagohoras = pagoHoras;
	}
	
	
	
	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}



	public int getPagohoras() {
		return pagohoras;
	}



	public void setPagohoras(int pagohoras) {
		this.pagohoras = pagohoras;
	}


	public double getSueldo() {
		return horas*pagohoras;
	}

}
