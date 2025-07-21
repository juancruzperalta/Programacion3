package ejerc3;
/* Ejercicio 3
 Maximizar el número de actividades compatibles. Se tienen n actividades que necesitan utilizar un
 recurso, tal como una sala de conferencias, en exclusión mutua. Cada actividad i tiene asociado un
 tiempo de comienzo ci y un tiempo de finalización fi de utilización del recurso, con ci < fi. Si la
 actividad i es seleccionada se llevará a cabo durante el intervalo [ci, fi). Las actividades i y j son
 compatibles si los intervalos [ci, fi) y [cj, ) no se superponen (es decir, ci >  o cj > fi). El problema
 consiste en encontrar la cantidad máxima de actividades compatibles entre sí.*/
public class ejerc3Actividads {
	List<Actividad> actividades; //lista de act de tiempo inicio y tiempo fin...
	Solucion listaAct; //lista de act...
	
	
	public Solucion greedy() {
		Collections.sort(actividades); //ordeno por la que tenga menor tiempo de finalización..
		//por ende, la que termine antes siempre quedaría primera...
		int tiempoFin=0;
		while(!actividades.isEmpty()) {
			Actividad primera = seleccionar();//Seleciona la mejor actividad, por ende la priemra
			actividades.remove(0); //quito la primera la que seleccione...
			if(primera.getTiempoInicio() >= tiempoFin) {
				listaAct.lista.add(primera);
				tiempoFin = primera.getTiempoFin();
			}
		}
		if(listaAct != null) {
			return listaAct;
		}
		return null;
	}
}
