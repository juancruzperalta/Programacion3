package ejerc1;

import java.util.List;

public class ejerc4 {
/*Ejercicio 4
 Partición de conjunto. Dado un conjunto de n enteros se desea encontrar, si existe,
  una partición en
 dos subconjuntos disjuntos, tal que la suma de sus elementos sea la misma.*/
	//El arbol del backtracking sería: pongo en e lconjunto A, luego pongo el numero ese en A o B
	List<Integer> conjunto;
	Solucion subconjuntosSuma; //una lista de listas de los subconjuntos que van a sumar
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), new LinkedList<>(), 0,0);//llevo la lista A y B,
		//y también una sumaA y sumaB...
		subconjuntosSuma = new Solucion(new LinkedList<>());
		backtracking(e);
		return subconjuntosSuma;
	}
	private void backtracking(Estado e) {
		if(conjunto.isEmpty()) {
			if(e.sumaA == e.sumaB) {
				subconjuntosSuma.lista.add(e.listaA);
				subconjuntosSuma.lista.add(e.listaB);
			}
		}
		int primero = conjunto.get(0);
		conjunto.remove(primero);
		for(List<Integer> c : e.conjuntosTodos) {
			//el conjuntoTodos tendrá un for que recorre el A, y cuándo termine el A recorrerá el
			//siguiente conjunto, acá será el B...
			if(!c.contains(primero)) {				
			e.ponerEnElConjunto(c, primero); //pongo en la lista A o B
			e.sumarAlValor(c, primero);//suma a A o B el valor primero
			backtracking(e);
			e.quitarConjunto(c, primero);
			e.restarValor(c, primero);
			}
		}
	}
}
