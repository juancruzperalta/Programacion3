package SistemaAlquiler;

public class Pelicula extends Item{
	protected String nombrePeli;
	protected String autorPeli;
	protected double duracion;
	protected double copias;
	
	public Pelicula(String nombrePeli, String autorPeli, double duracion, double copias) {
		this.nombrePeli = nombrePeli;
		this.autorPeli = autorPeli;
		this.duracion = duracion;
		this.copias = copias;
	}

	public String getNombrePeli() {
		return nombrePeli;
	}

	public void setNombrePeli(String nombrePeli) {
		this.nombrePeli = nombrePeli;
	}

	public String getAutorPeli() {
		return autorPeli;
	}

	public void setAutorPeli(String autorPeli) {
		this.autorPeli = autorPeli;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public double getCopias() {
		return copias;
	}

	public void setCopias(double copias) {
		this.copias = copias;
	}

	public boolean podemosUsarte() {
		if(this.getCopias() > 1) {
			return true;
		}
		return false;
	}
	
	

	
	
}
//Pelicula: alquilada si hay copias aún disponibles
