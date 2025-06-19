package Procesados;

public class ProcesadorPrioridad extends Procesador {

	public ProcesadorPrioridad(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean sosMayor(Tarea t1, Tarea t2) {
		return t1.getPrioridad() < t2.getPrioridad();
	}

}
