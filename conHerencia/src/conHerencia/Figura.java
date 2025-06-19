package conHerencia;

public class Figura {
	private String nombre;
	
	public Figura(String nn) {
		this.nombre = nn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getArea() {
		return 0;
	}
	public double getPerimetro() {
		return 0;
	}
	public String getDatosCompletos() {
		return this.getNombre() +
				this.getArea() +
				this.getPerimetro();
	}
}
