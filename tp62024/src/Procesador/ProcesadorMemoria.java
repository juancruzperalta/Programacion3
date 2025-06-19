package Procesador;

public class ProcesadorMemoria extends ProcesadorOrdenado {


	public boolean procesadorComparacion(Tarea t1, Tarea t2) {
		return t1.getMemoria() > t2.getMemoria();
	}

}
