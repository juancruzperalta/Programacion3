import java.util.ArrayList;

public abstract class Presupuesto {
	String nombre;
	
	public Presupuesto(String nn) {
		this.nombre = nn;			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract ArrayList<String> materiales();
	public abstract int empleadosAfectados();
	public abstract int tiempoEstimado();
	
	

}
