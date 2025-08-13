package ejercReh;

import java.util.Hashtable;

public class existeCamino {
	GrafoDirigido grafo;
	
	public boolean existeCamino(int origen, int destino) {
		Hashtable<Integer, String> colores = new Hashtable<>();
		
		for(Integer vert : grafo.listado.keySet()) {
			colores.put(vert, "blanco");
		}
		return existeCamino(origen, destino, colores);
	}
	public boolean existeCamino(int origen, int destino, Hashtable<Integer, String> colores) {
		colores.put(origen, "amarillo");
		if(origen == destino) {
			return true;
		}
		List<Arco<T>> adyacentes = grafo.obtenerAdyacentes(origen);
		for(Arco<T> ady: adyacentes) {
			int prox = ady.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				if(existeCamino(prox, destino, colores)) {
					return true;
				}
			}else {
				if(colores.get(prox).equals("amarillo")) {
					return false;
				}
			}
		}
		colores.put(origen, "blanco");
		return false;
	}
}
