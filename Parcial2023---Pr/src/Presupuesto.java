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
	
	public abstract ArrayList<String> getMateriales();
	public abstract int getCantEmpleados();
	public abstract int getTiempoEstimado();
	public abstract ArrayList<Presupuesto> buscar(Condicion cond);
	public abstract double getCosto();
	
	public boolean tenesMaterial(String matQueBusco) {
		return this.getMateriales().contains(matQueBusco);
	}
}
