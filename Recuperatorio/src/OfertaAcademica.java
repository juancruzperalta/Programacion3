import java.util.ArrayList;

public abstract class OfertaAcademica {
	private String nombre;
	
	public OfertaAcademica(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int getPrecio();
	public abstract ArrayList<String> getDocentes();
	public abstract ArrayList<String> palabrasClave();
	public abstract int horasCatedra();
	public abstract int cantidadCursos();
	public abstract int cantDocentes();
	public abstract ArrayList<Curso> buscar(Condicion cond);
}


