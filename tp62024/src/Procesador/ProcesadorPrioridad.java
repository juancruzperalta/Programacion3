package Procesador;

public class ProcesadorPrioridad extends ProcesadorOrdenado {


	public boolean procesadorComparacion(Tarea t1, Tarea t2) {
		return t1.getPrioridad() > t2.getPrioridad();
	}

}
