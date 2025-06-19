import java.util.ArrayList;

public abstract class Presupuesto {
	private String nombre;

	public Presupuesto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public abstract int tiempoEstimado();
	public abstract int empleadosAfectados();
	public abstract ArrayList<String> matRequeridos();
	public abstract double getCosto();
	public abstract ArrayList<Presupuesto> buscar(Condicion cond);
}
