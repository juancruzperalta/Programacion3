import java.util.ArrayList;

public class PresupuestoEspecial extends PresupuestoBasico {
	private ArrayList<String> especialidades;
	
	public PresupuestoEspecial(String nombre, int cantEmpleados, int tiempoEstimado, CalcularCosto cc) {
		super(nombre, cantEmpleados, tiempoEstimado, cc);
		especialidades  = new ArrayList<>();
	}
	
	public void addEspecialidad(String esp) {
		especialidades.add(esp);
	}
	
}
