package ejerc10;

import java.util.*;
import java.util.Set;

public class ejerc10 {
/*Ejercicio 10
 Utilizando la técnica Backtracking, escriba un algoritmo que dado un conjunto de números enteros,
 devuelva (si existen) todos los subconjuntos de tamaño N (dado como parámetro), cuyas sumas
 sean exactamente cero. Por ejemplo dado el conjunto {-7,-3,-2,-1, 5, 8 } y N = 3, los subconjuntos
 que suman cero son: {-7,-1, 8} y {-3,-2, 5}.
*/
	List<Integer> conjunto; //conjunto y N pasados por constructor....
	int N=3;
	Solucion listaSubConjuntos; //lista de listas con los subconjuntos que suman el valor 0...
	
	public ejerc10(List<Integer> conjunto2, int n2) {
		conjunto = conjunto2;
		N = n2;
	}
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), 0, N);//una lista de tamaño N y la suma
		listaSubConjuntos = new Solucion(new LinkedList<>());
		backtracking(e,0);
		return listaSubConjuntos;
	}
	private void backtracking(Estado e, int index) {
		if(e.subconjuntoA.size() ==N) {			
		    if(e.sumaSubconjuntoA()==0) {
					listaSubConjuntos.lista.add(new LinkedList<>(e.subconjuntoA));
			}
		}
		for (int i = index; i < conjunto.size(); i++) {		
		int numero = conjunto.get(i);//tomo el primero y lo saco ya de una
		e.agregarALista(numero); //agrego el numero si no lo contiene
		e.sumarValorLista(numero);//sumo el valor
		backtracking(e,index+1);
		e.quitarLista();//ultimo del conjunt
		e.restarValorLista(numero); // resto el valor...
		}
	}
}
