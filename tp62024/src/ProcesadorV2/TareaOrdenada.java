package ProcesadorV2;

import java.util.ArrayList;

public abstract class TareaOrdenada {
	protected ArrayList<Tarea> tareas;
	
	public TareaOrdenada() {
		tareas = new ArrayList<Tarea>();
	}
	
	public void addTarea(Tarea tnueva) {
		int puntero=0;
		boolean encontro = false;
		while(puntero < tareas.size() && !encontro) {
			Tarea ti =tareas.get(puntero);
			if(this.esMayor(tnueva, ti)) {
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
	
	public abstract boolean esMayor(Tarea t1, Tarea t2);
	
	
	public Tarea getPrimera() {
		Tarea t0 = null;
		t0 = tareas.get(0);
		tareas.remove(0);
		return t0;
	}
}
