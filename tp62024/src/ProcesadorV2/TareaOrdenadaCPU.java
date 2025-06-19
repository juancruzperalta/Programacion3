package ProcesadorV2;

public class TareaOrdenadaCPU extends TareaOrdenada {

	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getCpu() < t2.getCpu();
	}

}
