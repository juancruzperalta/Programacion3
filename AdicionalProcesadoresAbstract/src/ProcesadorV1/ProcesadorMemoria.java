package ProcesadorV1;

public class ProcesadorMemoria extends Procesador {

	public ProcesadorMemoria(String nombreProcesador) {
		super(nombreProcesador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esMayorTarea(Tarea ti, Tarea tnueva) {
		return ti.getUsoMemoria() < tnueva.getUsoMemoria();
	}

}
