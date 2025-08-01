package ejerc1;

public class ejerc5 {
/* Ejercicio 5
 Asignación de tareas a procesadores. Se tienen m procesadores idénticos y n tareas con un tiempo
 de ejecución dado. Se requiere encontrar una asignación de tareas a procesadores de manera de
 minimizar el tiempo de ejecución del total de tareas*/
	Hashtable<Procesador, List<Tareas>> listadoCompleto;
	Solucion mejorSolucion; //lista con las tareas y el procesador elejido..
	
	public Solucion backtracking() {
		Estado e = new Estado(new Hashtable<>(), 0)//hashtable de procesador y una lista de tareas...
				//Y el tiempo de ejecución total.
		mejorSolucion = new Solucion(new Hashtable<>(),0);//un hashtable con procesador y lista de tareas, y el tiempo
		backtracking(e);
		return mejorSolucion;
		
	}
	private void backtracking(Estado e) {
		if(listadoCompleto.get(procesador).isEmpty()) {
			if(mejorSolucion.tiempotareas() > e.tiempoActual() || mejorSolucion==null) {
				mejorSolucion.listado.clear();
				mejorSolucion.listado = e.listadoCompl;
				mejorSolucion.tiempoTareas = e.tiempoActual();
			}
		}
		int i=0;
		if(i < listadoCompleto.size)
		List<Tarea> tareas = listadoCompleto.get(0);
		for(Tarea t: tareas) {
			e.asignarAlProcesador(i, t);
			e.sumarTiempo(t.tiempoTarea());
			backtracking(e);
			e.quitarProc(i, t);
			e.restarTiempo(t.tiempoTarea());
		}
		i++;
	}
}
