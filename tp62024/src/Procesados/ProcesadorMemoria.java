package Procesados;

public class ProcesadorMemoria extends Procesador {

	public ProcesadorMemoria(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean sosMayor(Tarea t1, Tarea t2) {
		return t1.getMemoria() < t2.getMemoria();
	}

}
