package Procesador;

public class Procesador {

	private String nombre;
	protected ColaTareas tareas;
	
	public Procesador() {
		nombre = "miCpu";
		tareas = new ColaTareasCPU();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addTarea(Tarea tnueva) {
		
		tareas.addTarea(tnueva);
	}
	public boolean hayMasTareas() {
		return tareas.hayMasTareas();
	}
	
	public void setFormaOrdenar(ColaTareas nuevaTareas) {
		
		while(tareas.hayMasTareas()) {
			nuevaTareas.addTarea(tareas.getPrimera());
		}
		tareas = nuevaTareas;
	}
	//ROMPE EL ENCAPSULAMIENTO NO HACER
	//public ArrayList<Tarea> getTareas(){
	//	return tareas;
	//}
	
}
