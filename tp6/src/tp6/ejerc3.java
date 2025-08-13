package tp6;

import java.util.Collections;

public class ejerc3 {
/*Ejercicio 3
 Maximizar el número de actividades compatibles. Se tienen n actividades que necesitan utilizar un
 recurso, tal como una sala de conferencias, en exclusión mutua. Cada actividad i tiene asociado un
 tiempo de comienzo ci y un tiempo de finalización fi de utilización del recurso, con ci < fi. Si la
 actividad i es seleccionada se llevará a cabo durante el intervalo [ci, fi). Las actividades i y j son
 compatibles si los intervalos [ci, fi) y [cj, ) no se superponen (es decir, ci >  o cj > fi). El problema
 consiste en encontrar la cantidad máxima de actividades compatibles entre sí.*/
	
	
	List<Actividad> actividades;
	List<Actividad> solucion;
	
	public List<Actividad> greedy(){
		Collections.sort(actividades); //actividades ordenadas por tiempo de fin primero...
		int tiempoFin=0;
		while(!actividades.isEmpty()) {
			Actividad primera = actividades.get(0);
			if(primera.getTiempoComienzo() >= tiempoFin) {
				solucion.add(primera);
				tiempoFin=primera.getTiempoFin();
			}
			actividades.remove(0);
		}
		if(solucion!=null) {
			return solucion;
		}
		return null;
	}
}
