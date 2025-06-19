package ProcesadorV2;

public class ProcesadorMemoria extends ProcesadorOrdenado {

	public ProcesadorMemoria(String nombreProcesador) {
		super(nombreProcesador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esMayorTarea(Tarea ti, Tarea tnueva) {
		return ti.getUsoMemoria() < tnueva.getUsoMemoria();
	}

}
