package ejerc1;

import java.util.*;

public class ejerc1 {
/* Cambio de monedas: Dado un conjunto C de N tipos de monedas con un número ilimitado de
 ejemplares de cada tipo, se requiere formar, si se puede, una cantidad M empleando el mínimo
 número de ellas.
 Por ejemplo, un cajero automático dispone de billetes de distintos valores: 100$, 25$, 10$, 5$ y 1$,
 si se tiene que pagar 289$, la mejor solución consiste en dar 10 billetes: 2 de 100$, 3 de 25$, 1 de
 10$ y 4 de 1$*/
	List<Integer> conjuntoC; //acá vienen las monedas
	int cantM=289; //aca viene cuanto hay que formar...$$$
	List<Integer> mejoresBilletes; //lista con los billetes que vamos dando...
	
	
	public ejerc1(List<Integer> conjunto) {
		conjuntoC = conjunto;
		mejoresBilletes = new LinkedList<>();
	}
	public List<Integer> greedy() {
		Collections.sort(conjuntoC, Collections.reverseOrder()); //ordeno el conjunto de billetes, de mayor a menor, quednado
		//ejemplo: 100->25->10->5->1.
		int sumaValor=0;
		while(!conjuntoC.isEmpty() && sumaValor < cantM) {
			 int primerValor = conjuntoC.get(0); //selecciono el primero, por ende, conjuntoC.get(0);
			 while(primerValor+sumaValor <= cantM) {
				 sumaValor+=primerValor;
				 mejoresBilletes.add(primerValor);
			 }
			 conjuntoC.remove(0); //lo quito, pero primero tengo que ver si lo tengo que usar...
			 //uno sola o mas veces
		}
		if(sumaValor==cantM) {
			return mejoresBilletes;
		}
		return null;
	}
	public static void main(String[]args) {
		List<Integer> conjunto = new LinkedList<>();
		conjunto.add(100);
		conjunto.add(25);
		conjunto.add(10);
		conjunto.add(5);
		conjunto.add(1);
		
		ejerc1 eje = new ejerc1(conjunto);
		
		System.out.println(eje.greedy());
	}
}
