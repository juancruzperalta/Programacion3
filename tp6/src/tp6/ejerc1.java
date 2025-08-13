package tp6;

import java.util.Collections;
import java.util.List;

public class ejerc1 {
/* Ejercicio 1
 Cambio de monedas: Dado un conjunto C de N tipos de monedas con un número ilimitado de
 ejemplares de cada tipo, se requiere formar, si se puede, una cantidad M empleando el mínimo
 número de ellas.
 Por ejemplo, un cajero automático dispone de billetes de distintos valores: 100$, 25$, 10$, 5$ y 1$,
 si se tiene que pagar 289$, la mejor solución consiste en dar 10 billetes: 2 de 100$, 3 de 25$, 1 de
 10$ y 4 de 1$.*/
	
	//La mejor opción para greedy sería ordenar las monedas, de mayor a menor...que quede primero
	//la más grande
	
	List<Integer> conjuntoMonedas;
	int M=289;
	List<Integer> solucion = new LinkedList<>();
	
	public List<Integer> greedy(){
		Collections.sort(conjuntoMonedas);
		//Ordeno como dije antes, de mayor amenro
		int sumaAct=0;
		while(!conjuntoMonedas.isEmpty()) {
			int primero  = conjuntoMonedas.get(0);
			if(sumaAct+primero <= M) {
				solucion.add(primero);
				sumaAct+=primero;
			}
			conjuntoMonedas.remove(0);
		}
		if(solucion != null) {
			return solucion;
		}
		return null;
	}
}
