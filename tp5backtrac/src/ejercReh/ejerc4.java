package ejercReh;

import java.util.List;

public class ejerc4 {
/* Ejercicio 4
 Partición de conjunto. Dado un conjunto de n enteros se desea encontrar, si existe, 
 una partición en
 dos subconjuntos disjuntos, tal que la suma de sus elementos sea la misma.*/

	List<Integer> conjunto;
	boolean existeSolucion=false;
	
	public boolean backtracking() {
		Estado e = new Estado(new LinkedList<>(), new LinkedList<>()); //lista A, lista B
		existeSolucion = backtracking(e);
		return existeSolucion;
	}
	private boolean backtracking(Estado e) {
		if(conjunto.isEmpty()) {
			if(e.recorrerListasYSumar()) { //recorre la lista A y guarda un int con la suma
				//recorre la Lista B y guarda con un int con la suma, compara si son iguales devuelve true.
				return true;
			}else {
				return false;
			}
		}
		int primero = conjunto.get(0);
		conjunto.remove(0);
		for(List<Integer> listado : e.obtenerAmbasListas()) { //cantidad de subconjuntos nos daría 2...
			if(!listado.contains(primero)) {
				e.agregarAlListado(listado, primero);
				if(backtracking(e)) {
					return true;
				}
				e.quitarDelListado(listado, primero);
			}
		}
		conjunto.add(primero,0);
	}
}
