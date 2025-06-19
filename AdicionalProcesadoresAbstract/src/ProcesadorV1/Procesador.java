package ProcesadorV1;
import java.util.ArrayList;

public abstract class Procesador {
	protected ArrayList<Tarea> tareas;
	private String nombreProcesador;
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
	
	public void addTarea(Tarea tnueva) {
		int puntero =0;
		boolean encontro = false;
		
		while(puntero < tareas.size() && !encontro) {
			Tarea ti = tareas.get(puntero);
			if(this.esMayorTarea(ti, tnueva)) {
				encontro=true;
			}
			puntero++;
		}
		if(encontro) {
			tareas.add(puntero, tnueva);
		}else {
			tareas.add(tnueva);
		}
	}
	
	public void ejecutarTarea() {
		if(tareas.size()>0) {
			Tarea t0 = tareas.get(0);
			tareas.remove(0);
			t0.ejecutar();
		}
		
	}
	public abstract boolean esMayorTarea(Tarea ti, Tarea tnueva);
}
