package ejerc5;
/* Ejercicio 5
 Asignación de tareas a procesadores. Se tienen m procesadores idénticos y n tareas con un tiempo
 de ejecución dado. Se requiere encontrar una asignación de tareas a procesadores de manera de
 minimizar el tiempo de ejecución del total de tareas.*/
public class procesadAtareas {
	Hashtable<Procesador, List<Tarea>tareas> procesadorConTareas;
	Solucion listaDeTareas; //una lista para guardar las minimas
	
	
	public Solucion backtracking() {
		Estado e = new Estado(new Hashtable<>(), 0)//llevo la lista de procesadores y sus tareas y el tiempo.
		listaDeTareas = new Solucion(new Hashtable<>(),0) // llevo el tiempo.
		backtracking(e);
		return listaDeTareas;
	}
	public void backtracking(Estado e) {
		if(e.procesadores.listaTareas.size()>0) { //si almenos tiene una tarea
			if(listaDeTareas.tiempoMinimo()> e.tiempoMinimo()) {
				listaDeTareas.lista.clear();
				listaDeTareas.addAll(new LinkedList<>(e.listaProcYTareas()));
			}
		}else {
			List<Tarea> tareas = procesadorConTareas.values();
			for(Tarea t: tareas){
				if(!e.listaTareas().contains(t)) {
					e.agregarTareaAlProcesador(t);
					e.agregarTiempoAlContador(t.tiempo());
					if(!poda(e))//la poda sería que si el tiempo que llevo ya es mayor al de la solucion
						//no sigo
						backtracking(e);
					e.quitarTareaProcesador();//la ultima de la lista
					e.restarTiempoContador(t.tiempo());//
				}
			}
		}
	}
}
