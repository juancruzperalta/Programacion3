package ProcesadorV2;

public abstract class ProcesadorOrdenado extends Procesador {

	public ProcesadorOrdenado(String nombreProcesador) {
		super(nombreProcesador);
	}

	public void addTarea(Tarea tnueva) {
		int puntero =0;
		boolean encontro = false;
		
		while(puntero < tareas.size() && !encontro) {
			Tarea ti = tareas.get(puntero);
			if(this.esMayorTarea(ti, tnueva)) {
				encontro=true;
			}
			puntero++;
		}
		if(encontro) {
			tareas.add(puntero, tnueva);
		}else {
			tareas.add(tnueva);
		}
	}
	public abstract boolean esMayorTarea(Tarea t1, Tarea tnueva);
}
