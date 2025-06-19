package ProcesadorV2;

public class TareaOrdenadaMemoria extends TareaOrdenada {

	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getMemoria() < t2.getMemoria();
	}

}
