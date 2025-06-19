package Procesador;

public class ProcesadorCPU extends ProcesadorOrdenado {

	public boolean procesadorComparacion(Tarea t1, Tarea t2) {
		return t1.getCpu() > t2.getCpu();
	}

}
