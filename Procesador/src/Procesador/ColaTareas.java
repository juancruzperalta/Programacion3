package Procesador;

import java.util.ArrayList;

public abstract class ColaTareas {
	protected ArrayList<Tarea> tareas;
	
	public ColaTareas() {
		tareas = new ArrayList<Tarea>();
	}
	public void ejecutarTarea() {
		   if (tareas.size()>0) {
			   Tarea t0 = tareas.get(0);
			   tareas.remove(0);
			   t0.ejecutar();
	  	   }
		}
	
	public void addTarea(Tarea tnueva) {
		int puntero = 0;
		boolean encontro = false;
		while (puntero<tareas.size() && ! encontro) {
			Tarea ti = tareas.get(puntero);
			if (this.esMayorTarea(tnueva,ti)) {
				encontro = true;
			} else {
				puntero ++;
			}
			if(encontro) { //EN PUNTERO ESTA LA POSICION
				tareas.add(puntero, tnueva); //ESTA EL CORRIMIENTO A DERECHA
			} else {
				tareas.add(tnueva);
			}
		}
	}
	public abstract boolean esMayorTarea(Tarea t1, Tarea t2);
	public boolean hayMasTareas() {
		return tareas.size()>0;
	}
	public Tarea getPrimera() {
		Tarea t0=null;
		if (tareas.size()>0) {
			t0 = tareas.get(0);
			tareas.remove(0);
		}
		
		return t0;
	}
		
}
