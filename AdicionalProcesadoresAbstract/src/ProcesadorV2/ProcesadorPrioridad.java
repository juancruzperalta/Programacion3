package ProcesadorV2;

public class ProcesadorPrioridad extends ProcesadorOrdenado {

	public ProcesadorPrioridad(String nombreProcesador) {
		super(nombreProcesador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esMayorTarea(Tarea ti, Tarea tnueva) {
		return ti.getPrioridad()<tnueva.getPrioridad();
	}

}
