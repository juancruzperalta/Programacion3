package ejercReh;

import java.util.*;

public class ejerc1 {
	Grafo grafo;
	int entrada, salida;
	List<Integer> caminoMayor; //podría hacer clase solucion tmb...
	
	public List<Integer> backtracking(){
		Estado e = new Estado(new LinkedList<>(), entrada); //llevo la lista actual y la salaAct...
		caminoMayor = new LinkedList<>();
		backtracking(e);
		return caminoMayor;
	}
	private void backtracking(Estado e) {
		if(e.salaAct()==salida) {
			if(caminoMayor == null || caminoMayor.size() < e.caminoAct().size()) {
				caminoMayor.clear();
				caminoMayor.addAll(new LinkedList<>(e.caminoAct()));
			}
		}
		List<Integer> hijos = generarHijosGrafo(e.salaAct(),grafo); //saco los adyacentes...
		for(Integer h: hijos) {
			if(!e.caminoAct().contains(h)) {
				int anterior =e.salaAct();
				e.pasarSalaAct(h); //paso de la act a la nueva.
				e.agregarCamino(h); //agrego al camino que voy la nueva
				backtracking(e);
				e.quitarCamino(); //la ultima...
				e.volverSalaAnterior(anterior);
			}
		}
	}
}
