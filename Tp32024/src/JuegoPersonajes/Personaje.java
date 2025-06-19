package JuegoPersonajes;

public class Personaje {
	String nombreReal;
	String superHeroe;
	boolean visionNocturna;
	int velocidad;
	int peso;
	int fuerza;
	double altura;
	int edad;
	public Personaje(String nombreReal, String superHeroe, boolean visionNocturna, int velocidad, int peso, int fuerza,
			double altura, int edad) {
		this.nombreReal = nombreReal;
		this.superHeroe = superHeroe;
		this.visionNocturna = visionNocturna;
		this.velocidad = velocidad;
		this.peso = peso;
		this.fuerza = fuerza;
		this.altura = altura;
		this.edad = edad;
	}
	public String getNombreReal() {
		return nombreReal;
	}
	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}
	public String getSuperHeroe() {
		return superHeroe;
	}
	public void setSuperHeroe(String superHeroe) {
		this.superHeroe = superHeroe;
	}
	public boolean isVisionNocturna() {
		return visionNocturna;
	}
	public void setVisionNocturna(boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public int getFuerza() {
		return fuerza;
	}
	

	
	
}
