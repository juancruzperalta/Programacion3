package ejercReh;

import java.util.Hashtable;
import java.util.List;

public class mejorCamino {
	GrafoDirigido grafo;
	
	List<Integer> mejorCamino= new LinkedList<>();
	//el mas corto
	public List<Integer> mejorCamino(int origen, int destino){
		Hashtable<Integer, String> colores = new LinkedList<>();
		List<Integer> camino = new LinkedList<>();
		for(Integer vert : grafo.listado.keySet()) {
			colores.put(vert, "blanco");
		}
		mejorCamino(origen, destino, camino,colores);
		return mejorCamino;
	}
	private void mejorCamino(int origen, int destino, List<Integer> camino, Hashtable<Integer,String>colores) {
		camino.add(origen);
		colores.put(origen, "amarillo");
		if(origen == destino) {
			if(mejorCamino.size() > camino.size()) {
				mejorCamino.clear();
				mejorCamino.addAll(new LinkedList<>(camino));
			}
		}
		List<Arco<T>> ady = grafo.obtenerAdyacentes(origen);
		for(Arco<T> arc : ady) {
			int prox =arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				mejorCamino(prox,destino,camino,colores);
			}else {
				if(colores.get(prox).equals("amarillo")) {
					System.out.println(ciclo);
				}
			}
		}
		colores.put(origen,"blanco");
		camino.remove(camino.size()-1);
	}
}
