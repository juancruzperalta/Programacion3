package ejerc1;

public class ejerc3 {
/* Ejercicio 3
 Suma desubconjuntos. Dados n números positivos distintos, se desea encontrar todas las
 combinaciones de esos números tal que la suma sea igual a M.*/
	List<Integer> sumaConjuntos;
	int sumaM;
	Solucion listaDeSubConjuntos; //lista de listas de  los subconjuntos que suman M
	//el arbol sería pongo en subconjunto A o subconjunto B.
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), int sumaAct); //lista de subconjunto, la sumaAct.
		listaDeSubConjuntos = new Solucion(new LinkedList<>());
		backtracking(e);
		return listaDeSubconjuntos;
	}
	private void backtracking(Estado e) {
		if(e.sumaAct() == sumaM) {
			listaDeSubConjuntos.lista.add(e.caminoAct());
		}
		for(Integer num : sumaConjuntos) {
			if(!e.caminoAct().contains(num)) {
				e.agregarVisitado(num); //agrego a la lista
				e.sumarValor(num);// sumo el valor del numero
				if(poda(e)) //podamos solo si la sulmaAct ya supera a M...
					backtracking(e);
				e.quitarVisitado();//el ultimo
				e.restarValor(num);//resto el valor de numero
			}
		}
	}
	
}
