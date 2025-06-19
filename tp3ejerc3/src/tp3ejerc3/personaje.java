package tp3ejerc3;

public class personaje {
	private String nombre;
	private boolean superHeroe;
	private boolean visionNocturna;
	private int velocidad;
	private int fuerza;
	private int altura;
	private int edad;
	public personaje(String nombre, boolean superHeroe, boolean visionNocturna, int velocidad, int fuerza, int altura,
			int edad) {
		super();
		this.nombre = nombre;
		this.superHeroe = superHeroe;
		this.visionNocturna = visionNocturna;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.altura = altura;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean getSuperHeroe() {
		return superHeroe;
	}
	public void setSuperHeroe(boolean superHeroe) {
		this.superHeroe = superHeroe;
	}
	public boolean isVisionNocturna() {
		return visionNocturna;
	}
	public void setVisionNocturna(boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
