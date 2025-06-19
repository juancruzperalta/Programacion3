package Procesador;

public abstract class ProcesadorOrdenado extends Procesador {

	public void addTarea(Tarea tnueva) {
		int contador=0;
		boolean esEse=false;
		while(contador<tareas.size() && !esEse) {
			Tarea t = tareas.get(contador);
			if(this.procesadorComparacion(tnueva, t)) {
				esEse=true;
			}
			contador++;
		}
		if(esEse) {
			tareas.add(contador, tnueva);
		}else {
			tareas.add(tnueva);
		}
	}


	public abstract boolean procesadorComparacion(Tarea t1, Tarea t2);
}
