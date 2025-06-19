package ProcesadorV1;

public class ProcesadorPrioridad extends Procesador {

	public ProcesadorPrioridad(String nombreProcesador) {
		super(nombreProcesador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esMayorTarea(Tarea ti, Tarea tnueva) {
		return ti.getPrioridad()<tnueva.getPrioridad();
	}

}
