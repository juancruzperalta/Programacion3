package ProcesadorV2;

public abstract class Procesador {
	protected TareaOrdenada tareas;
	protected String nombre;
	
	
	public Procesador(String nombre) {
		this.nombre = nombre;
		tareas = new TareaOrdenadaCPU();
	}
	
	public abstract void addTarea(Tarea tnueva);
	
	public void ejecutarTarea(Tarea t1) {
		t1.ejecutarTarea(t1);
	}
	
}
