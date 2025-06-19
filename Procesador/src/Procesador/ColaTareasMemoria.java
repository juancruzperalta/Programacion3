package Procesador;

public class ColaTareasMemoria extends ColaTareas {

	@Override
	public boolean esMayorTarea(Tarea t1, Tarea t2) {
		return t1.getMemoria() > t2.getMemoria();
	}

}
