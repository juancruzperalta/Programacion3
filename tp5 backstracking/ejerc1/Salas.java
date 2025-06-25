package ejerc1;

public class Salas {
	Hashtable<Integer, List<Arco<T>>> habitaciones //con sus respectivos adyacentes
	Solucion caminoMayor //Tengo el camino mayor hasta la salida..desde la entrada
	int entrada //vertice de entrada
	int salida //Vertice de salida. suponemos que nos lo dan
	Grafo grafo;
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), int salaAct);//salas pasadas, 
		caminoMayor = new Solucion(new LinkedList<>())//camino hasta la salida, siempre el mas largo
		backtracking(e);
		return caminoMayor;//Retorno la solucion
	}
	private void backtracking(Estado e) {
		if(e.salaAct()==this.salida) {
			if(e.caminoActual().size() > caminoMayor.caminoSalas.size()) {
				caminoMayor.caminoSalas.clear();
				caminoMayor.caminoSalas.addAll(new LinkedList<>(e.caminoActual()));
			}
		}else {
			Iterator<Integer> it = this.grafo.obtenerAdyacente(e.salaAct());
			while(it.hasNext()) {
				int prox = it.next();
				if(!e.caminoActual.contains(prox)) {
					e.agregarVisitado(prox);//agrego al caminoActual
					backtracking(e);
					e.quitarVisitado()//El ultimo del caminoaCtual;
				}
			}
		}
	}
	
}
