
public class Episodio {
	String titulo;
	String descripcion;
	int calificacion;
	
	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		calificacion = -1;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public boolean isSeVio() {
		return false;
	}
	public void setCalificacion(int calificacion) {
		if(calificacion > 5) {
			calificacion = 5;
			isSeVio();
		}else {
			if(calificacion < 1) {
				calificacion = -1;
			}
		}
		this.calificacion = calificacion;
		isSeVio();
	}
	
	
}
