import java.util.ArrayList;

public abstract class CursoGenerico {
	private String nombre;

	public CursoGenerico(String nombre) {
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
	public abstract int getCantHoras();
	public abstract int cantCursos();
	public abstract Curso cursoMasCaro();
	public abstract ArrayList<Curso> buscar(Condicion cond);
	
	
	public boolean tenesPalabra(String palabraQueBusco) {
		return this.palabrasClave().contains(palabraQueBusco);
	}
}
