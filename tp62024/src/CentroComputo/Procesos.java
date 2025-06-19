package CentroComputo;

public class Procesos extends ColaEspera{
	protected double reqMemoria;
	protected String nombre;
	
	
	public Procesos(double reqMemoria, String nombre) {
		this.reqMemoria = reqMemoria;
		this.nombre = nombre;
	}


	public double getReqMemoria() {
		return reqMemoria;
	}


	public void setReqMemoria(double reqMemoria) {
		this.reqMemoria = reqMemoria;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean sosMayor(ColaEspera t1) {
		return this.getReqMemoria() < ((Procesos) t1).getReqMemoria();
	}
	
}
