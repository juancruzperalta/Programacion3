package ejerc1;

import java.util.Iterator;

public class ejerc1 {
/* Ejercicio 1
 Se tiene un conjunto de salas comunicadas entre sí a través de puertas que se abren solamente en
 un sentido. Una de las salas se denomina entrada y la otra salida. Construir un algoritmo que
 permita ir desde la entrada a la salida atravesando la máxima cantidad de salas. Idea: podría
 representar el problema mediante un grafo dirigido, donde cada nodo es una habitación, y cada
 puerta es un arco dirigido hacia otra habitación.*/
	 
	Integer entrada; //nodo de entrada y de salida...
	Integer salida;
	Solucion caminoMaxCantSalas; //una lista de salas...
	Grafo grafoDirigido;
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), entrada, 0);//lista de salasAct, salaAct, pasosDados.. 
		caminoMaxCantSalas = new Solucion(new LinkedList<>(), 0); //lista de salas, pasos..
		backtracking(e);
		return caminoMaxCantSalas;
	}
	private void backtracking(Estado e) {
		if(e.salaAct()==salida) {
			if(e.cantSalas() > caminoMaxCantSalas.cantidadSalas() || caminoMaxCantSalas==null) {
				caminoMaxCantSalas.listaSalas.clear();
				caminoMaxCantSalas.listaSalas.add(new LinkedList<>(e.listaAct));
				caminoMaxCantSalas.cantidadSalas = e.cantSalas;
			}
		}
		Iterator<Integer> adyacentes = grafoDirigido.obtenerAdyacentes(e.salaAct());
		while(adyacentes.hasNext()) {
			Integer prox = adyacentes.next();
			if(!e.listaAct().contains(prox)) {
				e.pasarSigSala(prox); //sala act a la nueva
				e.agregarVisitado(prox);//agrego a la lista act.. el nuevo
				backtracking(e);
				e.quitarVisitado();//la ultima sala
			}
		}
	}
}
