import java.util.ArrayList;

public class PresupuestoEspecial extends PresupuestoBasico {
	private ArrayList<String> especialidades;
	private int costoMio;
	public PresupuestoEspecial(String nombre, int tiempo, int cantEmpleados, int costo, CalcularCosto cc) {
		super(nombre, tiempo, cantEmpleados, cc);
		this.costoMio = costo;
		especialidades =new ArrayList<>();
	}
	
	public void addEspecialidad(String esp) {
		if(!especialidades.contains(esp)) {
			especialidades.add(esp);
		}
	}

	public int getCostoMio() {
		return costoMio;
	}

	public void setCostoMio(int costoMio) {
		this.costoMio = costoMio;
	}


	
	

}
