package ejerc7;

public class Cancion implements Comparable<Cancion>{
//nombre, género, duración del tema, y tamaño en kilobytes
	String nombre, genero;
	int duracion;
	int tamaño;
	public Cancion(String nombre, String genero, int duracion, int tamaño) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.tamaño = tamaño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public int compareTo(Cancion o) {
		return Integer.compare(this.tamaño, o.tamaño);
	}
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", tamaño=" + tamaño
				+ "]";
	}
	
}
