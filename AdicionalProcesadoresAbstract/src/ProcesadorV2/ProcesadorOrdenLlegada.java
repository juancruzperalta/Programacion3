package ProcesadorV2;

public class ProcesadorOrdenLlegada extends Procesador {

	public ProcesadorOrdenLlegada(String nombreProcesador) {
		super(nombreProcesador);
	}
	public void addTarea(Tarea tnueva) {
		tareas.add(tnueva);
	}

}
