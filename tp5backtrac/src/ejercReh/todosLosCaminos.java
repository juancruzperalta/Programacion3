package ejercReh;

import java.util.Hashtable;
import java.util.List;

public class todosLosCaminos {
	List<List<Integer>> todosLosCaminos=new LinkedList<>();
	GrafoDirigido grafo;
	
	public List<List<Integer>> caminosPosibles(int origen, int destino){
		Hashtable<Integer, String> colores = new LinkedList<>();
		List<Integer> camino = new LinkedList<>();
		for(Integer vert : grafo.listado.keySet()) {
			colores.put(vert, "blanco");
		}
		caminosPosibles(origen, destino, colores, camino);
		return todosLosCaminos;
	}
	private void caminosPosibles(int origen, int destino, Hashtable<Integer, String> colores, List<Integer> camino) {
		camino.add(origen);
		colores.put(origen, "amarillo");
		
		if(origen == destino) {
			todosLosCaminos.add(new LinkedList<>(camino));
		}
		List<Arco<T>> adyac = grafo.obtenerAdyacentes(origen);
		for(Arco<T> arc : adyac) {
			int prox = arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				caminosPosibles(prox, destino, colores, camino);
			}
		}
		colores.put(origen, "blanco");
		camino.remove(camino.size()-1);
	}
}
