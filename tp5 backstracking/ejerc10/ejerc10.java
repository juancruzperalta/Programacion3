package ejerc10;

public class ejerc10 {
/* Ejercicio 10
 Utilizando la técnica Backtracking, escriba un algoritmo que dado un conjunto de números enteros,
 devuelva (si existen) todos los subconjuntos de tamaño N (dado como parámetro), cuyas sumas
 sean exactamente cero. Por ejemplo dado el conjunto {-7,-3,-2,-1, 5, 8 } y N = 3, los subconjuntos
 que suman cero son: {-7,-1, 8} y {-3,-2, 5}.*/
	List<Integer> conjunto;
	int N=3;
	Solucion listaDeSubconjuntos; //lista de listas...
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>());
		listaDeSubconjuntos = new Solucion(new LinkedList<>());
		backtracking(e);
		return listaDeSubconjuntos;
	}
	private void backtracking(Estado e, int pos) {
		if(!this.conjunto.isEmpty() || pos == this.conjunto.size()) {
			if(e.sumatoriaDeLista() == 0 && e.lista.size()==N) {
				listaDeSubconjuntos.add(e.lista());
			}
		}else {
			for(List lista: e.listaConjuntos) { // a la lista A por ej: la tomo y pongo el numero
				//del conjunto en la pos..
				int numero = pos;
				e.agregarNumeroALista(lista, conjunto[numero]);
				backtracking(e,pos+1);
				e.quitarnumero(lista, conjunto[numero]);
				
			}
		}
	}
}
