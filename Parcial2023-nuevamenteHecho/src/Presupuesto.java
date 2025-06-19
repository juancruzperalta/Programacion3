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
	
	public abstract ArrayList<String> matRequeridos();
	public abstract int cantEmpleadosAfectados();
	public abstract int tiempoEstimado();
	public abstract ArrayList<Presupuesto> buscar(Condicion cond);
	public abstract double getCosto();
}
