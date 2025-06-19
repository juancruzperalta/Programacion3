package Procesados;

import java.util.ArrayList;

public abstract class Procesador {
	protected ArrayList<Tarea> tareas;
	protected String nombre;
	
	
	public Procesador(String nombre) {
		this.nombre = nombre;
		tareas = new ArrayList<Tarea>();
	}
	
	public void addTarea(Tarea tnueva) {
		for(int i=0; i<tareas.size();i++) {
			tareas.add(tnueva);
		}
	}
	
	public void ejecutarTarea(Tarea t1) {
		t1.ejecutarTarea(t1);
	}
	
	public abstract boolean sosMayor(Tarea t1, Tarea t2);
}
