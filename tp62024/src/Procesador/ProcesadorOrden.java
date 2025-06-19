package Procesador;

public class ProcesadorOrden extends Procesador {


	public void addTarea(Tarea tnueva) {
		if(tareas.size() >= 0) {
			tareas.add(tnueva);			
		}
	}


}
