package ModernizandoElSombrero;

public class Familia {
	private String nombre;
	private Casa c;
	public Familia(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Casa getC() {
		return c;
	}
	public void setC(Casa c) {
		this.c = c;
	}
	
	public boolean familiaPerteneceCasa(Alumno a) {
		if(this.getC().equals(a.getCasa())){
			return true;
		}
		return false;
	}

}
