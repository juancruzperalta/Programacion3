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

	public abstract int getCantEmpleados();
	public abstract ArrayList<String> cantMateriales();
	public abstract int cantDias();
	
}
