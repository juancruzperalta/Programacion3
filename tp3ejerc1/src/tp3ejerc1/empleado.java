package tp3ejerc1;

public class empleado {
	private String nombreEmpleado;
	private int plusEncuestas;
	public empleado(String nombreEmpleado) {
		super();
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public int getPlusEncuestas() {
		return plusEncuestas;
	}
	
}
