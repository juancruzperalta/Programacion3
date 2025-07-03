package ejerc6IA;

public class ejerc6IA {
/*✅ Ejercicio 6 – Problema de la grúa (Job Scheduling con deadlines)
Tenés n tareas, cada una con un deadline y una ganancia.
 Solo se puede hacer una tarea por unidad de tiempo. Una tarea solo puede hacerse antes o
  justo en su deadline.

Objetivo: Maximizar la ganancia total eligiendo qué tareas hacer.
Usá greedy ordenando por ganancia y asignando el tiempo más tardío disponible antes del deadline.*/
	
	List<Tarea> tareas; //cada tarea tiene un deadline y ganancia.
	Solucion listaTareas; 
	
	public Solucion greedy() {
		Collections.sort(tareas); //ordeno por las tareas que tengan ganancia mayor primeras...
		int tiempoTardío=0;
		while(!tareas.isEmpty()) {
			Tarea primera = seleccionar() //selecciono la primera, siempre será la 0..por el orden
			tareas.remove(primera);
			if(tiempoTardío <= primera.getDeadLine()) {
				listaTareas.lista.add(primera);
				listaTareas.ganancias.add(primera.getGanancia());
				tiempoTardío++;
			}
		}
	}
}
