package ejercReh;

import java.util.Hashtable;
import java.util.List;

public class mejorCaminoConPeso {
	GrafoDirigido grafo; 
	List<Integer> camino;
	int pesoAct = 0;
	
	public List<Integer> camino(int origen, int destino){
		List<Integer> caminoAct = new LinkedList<>();
		Hashtable<Integer, String> colores = new Hashtable<>();
		int peso=0;
		for(Integer vert : grafo.listado.keySet()) {
			colores.put(vert, "blanco");
		}
		camino(peso, origen, destino, caminoAct, colores);
		return camino;
	}
	public void camino(int peso,int origen, int destino, List<Integer> caminoAct, Hashtable<Integer, String> colores) {
		colores.put(origen, "amarillo");
		caminoAct.add(origen);
		if(origen == destino) {
			if(peso > pesoAct) {
				camino.clear();
				camino.addAll(new LinkedList<>(caminoAct));
			}
		}
		List<Arco<T>> arcos = grafo.obtenerAdyacente(origen);
		for(Arco<T> arc : arcos) {
			int prox = arc.getVerticeDestino();
			if(!caminoAct.contains(prox)) {
				if(colores.get(prox).equals("blanco")) {
					peso += arc.getPeso();
					camino(peso, prox, destino, caminoAct, colores);
					peso-=arc.getPeso();
				}
			}
		}
		colores.put(origen, "blanco");
		caminoAct.remove(caminoAct.size()-1);
	}
}
