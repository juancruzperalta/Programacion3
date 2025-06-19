package ProcesadorV2;

public class ProcesadorCPU extends ProcesadorOrdenado {

	public ProcesadorCPU(String nombreProcesador) {
		super(nombreProcesador);
	}

	@Override
	public boolean esMayorTarea(Tarea ti, Tarea tnueva) {
		return ti.getUsoCpu()<tnueva.getUsoCpu();
	}

}
