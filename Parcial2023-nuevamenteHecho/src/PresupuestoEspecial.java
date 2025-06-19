import java.util.ArrayList;

public class PresupuestoEspecial extends PresupuestoBasico {
	private ArrayList<String> especialidades;
	private int costo;
	public PresupuestoEspecial(String nombre, int cantEmpleados, int tiempo,
			int costo, CalcularCosto cc) {
		super(nombre, cantEmpleados, tiempo, cc);
		this.costo = costo;
		especialidades= new ArrayList<>();
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}


	public void addEspecialidad(String esp) {
		especialidades.add(esp);
	}
	
}
