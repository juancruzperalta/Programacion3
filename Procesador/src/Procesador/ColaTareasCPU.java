package Procesador;

public class ColaTareasCPU extends ColaTareas {

	@Override
	public boolean esMayorTarea(Tarea t1, Tarea t2) {
		return t1.getCpu() > t2.getCpu();
	}

}
