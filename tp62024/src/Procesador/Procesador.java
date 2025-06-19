package Procesador;

import java.util.ArrayList;

public abstract class Procesador {
	String nombre;
	ArrayList<Tarea> tareas;
	public Procesador() {
		this.nombre = "Procesador";
		tareas = new ArrayList<Tarea>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void addTarea(Tarea tnueva);
	
	public void ejecutarTarea() {
		if(tareas.size() > 0) {
			Tarea t0 = tareas.get(0);
			tareas.remove(0);
			t0.toString();
		}
	}
}
