package ProcesadorV1;

public class ProcesadorOrdenLlegada extends Procesador {

	public ProcesadorOrdenLlegada(String nombreProcesador) {
		super(nombreProcesador);
		// TODO Auto-generated constructor stub
	}
	
	public void addTarea(Tarea tnueva) {
		tareas.add(tnueva);
	}

	@Override
	public boolean esMayorTarea(Tarea ti, Tarea tnueva) {
		// TODO Auto-generated method stub
		return false;
	}

}
