package ejerc1;

public class eje5 {
/* Ejercicio 5
 Asignación de tareas a procesadores. Se tienen m procesadores idénticos y n tareas con un tiempo
 de ejecución dado. Se requiere encontrar una asignación de tareas a procesadores de manera de
 minimizar el tiempo de ejecución del total de tareas*/
	List<Tarea> tareas; //tareas con un ti de ejecución
	List<Procesador> procesadoresM; 
	Solucion listadoTareas; //lista de tareas seleccionadas al procesador, y el procesador elegido
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), new Tarea(0),0) //llevar las tareas que asigné, la tarea act y el tiempo de ejecución actual
		listadoTareas = new Solucion(new LinkedList<>(), new Procesador() ,0);
		backtracking(e);
		return listadoTareas;
	}
	private void backtracking(Estado e) {
		if(tareas.isEmpty()) {
			if(e.tiempoDeEjecucion() < listadoTareas.tiempoEjecucion()) {
				listadoTareas.lista.addAll(new LinkedList<>(e.listaTareas()));
				listadoTareas.tiempoEje = e.tiempoDeEjecucion();
			}
		}
		Procesador primero = procesadoresM.get(0);
		procesadoresM.remove(primero);
		e.procesadorActual = primero;
		for(Tarea t: tareas) {
			if(!e.listaTareas().contains(t)) {
				e.agregarTarea(t);
				e.agregarValorTarea(t.getTiempoEjecucion());
				backtracking(e);
				e.quitarTarea();//la ultima
				e.restarValorTarea(t.getTiempoEjecucion());
			}
		}
	}
	
}
