package ejerc3;
import java.util.*;
public class ejerc3 {
/*Ejercicio 3
 Maximizar el número de actividades compatibles. Se tienen n actividades que necesitan utilizar un
 recurso, tal como una sala de conferencias, en exclusión mutua. Cada actividad i tiene asociado un
 tiempo de comienzo ci y un tiempo de finalización fi de utilización del recurso, con ci < fi. Si la
 actividad i es seleccionada se llevará a cabo durante el intervalo [ci, fi). Las actividades i y j son
 compatibles si los intervalos [ci, fi) y [cj, ) no se superponen (es decir, ci >  o cj > fi). El problema
 consiste en encontrar la cantidad máxima de actividades compatibles entre sí*/
	List<Actividad> actividades; //tiempo comienzo y tiempo fin
	//actividad i j compatibles si [ci > fj] o [cj > fi]
	List<Actividad> actividadesMaximas = new LinkedList<>();
	
	public ejerc3(List<Actividad> listado) {
		actividades = listado;
	}
	//Habría que ordenarlas por las que ...terminen antes por ende también las que arrancan antes...
	public List<Actividad> greedy(){
		Collections.sort(actividades);
		int ultimoFin=0;
		while(!actividades.isEmpty()) {
			Actividad primera = actividades.get(0);
			actividades.remove(0);
			if(primera.getTiempoComienzo() >= ultimoFin) {
				ultimoFin = primera.getTiempoFin();
				actividadesMaximas.add(primera);
			}
		}
		if(actividadesMaximas != null) {
			return actividadesMaximas;
		}
		return null;
	}
	public static void main(String[]args) {
		List<Actividad> listado = new LinkedList<>();
		Actividad act1 = new Actividad(10, 12);
		Actividad act2 = new Actividad(12, 14);
		Actividad act3 = new Actividad(14, 16);
		Actividad act4 = new Actividad(9, 13);
		Actividad act5 = new Actividad(12, 13);
		
		listado.add(act1);
		listado.add(act2);
		listado.add(act3);
		listado.add(act4);
		listado.add(act5);
		
		
		ejerc3 eje = new ejerc3(listado);
		
		System.out.println(eje.greedy());
	}
}
