package Procesados;

public class ProcesadorCPU extends Procesador {

	public ProcesadorCPU(String nombre) {
		super(nombre);
	}
	public boolean sosMayor(Tarea t1, Tarea t2) {
		return t1.getCpu() < t2.getCpu();
	}

}
