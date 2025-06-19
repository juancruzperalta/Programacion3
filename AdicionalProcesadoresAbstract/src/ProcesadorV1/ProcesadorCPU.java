package ProcesadorV1;

public class ProcesadorCPU extends Procesador {

	public ProcesadorCPU(String nombreProcesador) {
		super(nombreProcesador);
	}

	@Override
	public boolean esMayorTarea(Tarea ti, Tarea tnueva) {
		return ti.getUsoCpu()<tnueva.getUsoCpu();
	}

}
