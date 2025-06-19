package ProcesadorV2;
import java.util.ArrayList;

public abstract class Procesador {
	private String nombreProcesador;
	protected ArrayList<Tarea> tareas;
	public Procesador(String nombreProcesador) {
		tareas = new ArrayList<Tarea>();
		this.nombreProcesador = nombreProcesador;
	}
	public String getNombreProcesador() {
		return nombreProcesador;
	}
	public void setNombreProcesador(String nombreProcesador) {
		this.nombreProcesador = nombreProcesador;
	}
	
	public abstract void addTarea(Tarea tnueva);
	
	public void ejecutarTarea() {
		if(tareas.size()>0) {
			Tarea t0 = tareas.get(0);
			tareas.remove(0);
			t0.ejecutar();
		}
		
	}
}
