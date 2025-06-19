
import java.util.*;

public class GrafoDirigido<T> implements Grafo<T> {

	Hashtable<Integer, List<Arco<T>>> lista_vertices;
	public GrafoDirigido() {
		lista_vertices = new Hashtable<Integer, List<Arco<T>>>();
	}
	@Override
	public void agregarVertice(int verticeId) {
		if(!contieneVertice(verticeId)) {
			lista_vertices.put(verticeId, new LinkedList<Arco<T>>());
		}
	}

	@Override
	public void borrarVertice(int verticeId) {
		if(contieneVertice(verticeId)) {
			for(Integer vert : lista_vertices.keySet()) {
				for(Arco<T> arc : lista_vertices.get(vert)) {
					if(arc.getVerticeDestino() != 0) {
						borrarArco(verticeId, arc.getVerticeDestino());
					}
					borrarArco(vert, verticeId);
				}
			}
		}
	}

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			if(!existeArco(verticeId1, verticeId2)) {
				List<Arco<T>> arcos = lista_vertices.get(verticeId1);
				arcos.add(new Arco<T>(verticeId1, verticeId2, etiqueta));
			}
		}
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			List<Arco<T>> arcos = lista_vertices.get(verticeId1);
			for(Arco<T> arc: arcos) {
				if(arc.getVerticeDestino() == verticeId2) {
					System.out.println("eliminado");
					arcos.remove(arc);
				}
			}
		}
	}

	@Override
	public boolean contieneVertice(int verticeId) {
		for(Integer vert: lista_vertices.keySet()) {
			if(vert==verticeId) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			for(Integer vert: lista_vertices.keySet()) {
				if(vert==verticeId1) {
					for(Arco<T> arc: lista_vertices.get(vert)) {
						if(arc.getVerticeDestino() ==verticeId2) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1)) {
			for(Integer vert : lista_vertices.keySet()) {
				if(vert == verticeId1) {
					List<Arco<T>> arcos = lista_vertices.get(verticeId1);
					for(Arco<T> arc: arcos) {
						if(arc.getVerticeDestino()==verticeId2) {
							return arc;
						}
					}
				}
			}
		}
		return null;
	}

	@SuppressWarnings("unused")
	@Override
	public int cantidadVertices() {
		return lista_vertices.size();
	}

	@Override
	public int cantidadArcos() {
		int cant=0;
				Collection<List<Arco<T>>> arc = lista_vertices.values();
				for(List<Arco<T>> arco: arc) {
					cant+=arco.size();
				}
		return cant;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		return lista_vertices.keySet().iterator();
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		if(contieneVertice(verticeId)) {
			List<Arco<T>> arc = lista_vertices.get(verticeId);
				return new iterator<T>(arc.iterator());
		}
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		List<Arco<T>> arc = new LinkedList<>();
		for(List<Arco<T>> vert: lista_vertices.values()) {
			arc.addAll(vert);
		}
		return arc.iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		List<Arco<T>> arcos = new LinkedList<>();
		if(contieneVertice(verticeId)) {
			for(Arco<T> arc: lista_vertices.get(verticeId)) {
				arcos.add(arc);
			}
		}
		return arcos.iterator();
	}
	
	public List<Integer> DFS() {
		Map<Integer, String> colores = new HashMap<>();
		List<Integer> encontrados = new LinkedList<>();
		for(Integer vert : lista_vertices.keySet()) {
			colores.put(vert, "blanco");
		}
		for(Integer indice: lista_vertices.keySet()) {
			if(colores.get(indice).equals("blanco")) {
				DFS_Visit(colores, indice, encontrados);
			}
		}
		return encontrados;
	}
	public void DFS_Visit(Map<Integer, String> colores, int indice, List<Integer> encontrados){
		colores.put(indice, "amarillo");
		
		for(Arco<T> ady: lista_vertices.get(indice)) {
			int prox = ady.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				DFS_Visit(colores, prox, encontrados);
			}else {
				if(colores.get(prox).equals("amarillo")) {
					System.out.println("Esto es un ciclo: " + indice + " → " + prox);
				}
			}
		}
		colores.put(indice, "negro");
		encontrados.add(indice);
	}
	public List<Integer> BFS(){
		Map<Integer, Boolean>colores = new HashMap<>();
		List<Integer> encontrados = new LinkedList<>();
		List<Integer> mapa_vert = new LinkedList<>(lista_vertices.keySet());
		boolean NO_VISITADO=false;
		for(Integer vert: mapa_vert) {
			colores.put(vert, NO_VISITADO);
		}
		for(Integer vert: mapa_vert) {
			if(colores.get(vert)==false) {
				BFS_Visit(colores, vert, encontrados);
			}
		}
		return encontrados;
	}
	public void BFS_Visit(Map<Integer, Boolean> colores, int vertice, List<Integer> encontrados) {
		List<Integer> lista = new LinkedList<>();
		boolean VISITADO=true;
		colores.put(vertice, VISITADO);
		lista.add(vertice);
		while(!lista.isEmpty()) {
			int vertX = lista.remove(0);
			encontrados.add(vertX);
			List<Arco<T>> ady = lista_vertices.get(vertX);
			for(Arco<T> ad: ady) {
				int prox = ad.getVerticeDestino();
				if(!colores.get(prox)) {
					colores.put(prox, true);
					lista.add(prox);
				}
			}
		}
	}
	
	public boolean tieneAlgunCiclo() {
		Map<Integer,String> colores = new HashMap<Integer, String>();
		boolean esCicliclo=false;
		for(Integer vert: lista_vertices.keySet()) {
			colores.put(vert, "blanco");
		}
		for(Integer vert: lista_vertices.keySet()) {
			if(colores.get(vert).equals("blanco")) {
				esCicliclo=tieneAlgunCiclo_Visit(colores, vert,esCicliclo);
			}
		}
		return esCicliclo;
		
	}
	public boolean tieneAlgunCiclo_Visit(Map<Integer,String> colores, int vertice, boolean esCiclo) {
		colores.put(vertice, "amarillo");
		
		for(Arco<T> arc: lista_vertices.get(vertice)) {
			int prox = arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				esCiclo=tieneAlgunCiclo_Visit(colores, prox, esCiclo);
			}else {				
				if(colores.get(prox).equals("amarillo")) {
					esCiclo=true;
				}
			}
		}
		return esCiclo;
	}
	public List<Integer> caminoMasLargo(int verticeId1, int verticeId2){
		List<Integer> respuesta = new LinkedList<>();
		List<Integer> camino = new LinkedList<>();
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			caminoMasLargo(verticeId1, verticeId2, camino, respuesta);
		}
		
		return respuesta;
	}
	private void caminoMasLargo(int verticeId1, int verticeId2, List<Integer>camino, List<Integer> respuesta){
		 camino.add(verticeId1);
		 if(verticeId1==verticeId2) {
		       if (camino.size() > respuesta.size()) {
		            respuesta.clear();
		            respuesta.addAll(new LinkedList<>(camino));
		     }
		 }else {
			 List<Arco<T>> arc = lista_vertices.get(verticeId1);
			 for(Arco<T> arcos: arc) {
				 int prox = arcos.getVerticeDestino();
				 caminoMasLargo(prox, verticeId2, camino, respuesta);
			 }
		 }
		 camino.remove(camino.size()-1);
	}
	
	public List<Integer> conjVertices(int vertV){
		List<Integer> alcanzados = new LinkedList<>();
		List<Integer> visitados = new LinkedList<>();
		
		conjVertices(vertV, alcanzados, visitados);
		
		return alcanzados;
	}
	private void conjVertices(int vertV, List<Integer> alcanzados, List<Integer> visitados) {
		visitados.add(vertV);
		List<Arco<T>> adya = lista_vertices.get(vertV);
		for(Arco<T> ad: adya) {
			int prox = ad.getVerticeDestino();
			if(!visitados.contains(prox)) {
				alcanzados.add(prox);
			}
		}
	}
	
	public boolean existeCamino(int u, int v) {
		if(hayCamino(u, v)) {
			return true;
		}
		return false;
	}
	public boolean hayCamino(int u, int v) {
		List<Integer> visitados = new LinkedList<>();
		visitados.add(u);
		if(u==v) {
			return true;
		}else {
			List<Arco<T>> adya = lista_vertices.get(u);
			for(Arco<T> ad: adya) {
				int ady = ad.getVerticeDestino();
				if(!visitados.contains(ady)) {
					
				if(hayCamino(ady, v)) {
						return true;
					}
				}
			}
			}
		return false;
	}
	List<Integer> caminoTotal = new LinkedList<>();
	public List<Integer> caminoCiclico(){
		List<Integer> camino = new LinkedList<>();
		Map<Integer, String> colores = new HashMap<>();
		for(Integer vert: lista_vertices.keySet()) {
			colores.put(vert, "blanco");
		}
		for(Integer vert: lista_vertices.keySet()) {
			if(colores.get(vert).equals("blanco")) {
				caminoCiclicoVisit(vert, camino, colores);
			}
		}
		return caminoTotal;
	}
	private void caminoCiclicoVisit(int vert, List<Integer> camino, Map<Integer, String> colores) {
		colores.put(vert,"amarillo");	
		camino.add(vert);
		List<Arco<T>> adya = lista_vertices.get(vert);
		for(Arco<T> ad: adya) {
			int vertProx = ad.getVerticeDestino();
			if(colores.get(vertProx).equals("blanco")) {
				caminoCiclicoVisit(vertProx, camino, colores);
			}else if (colores.get(vertProx).equals("amarillo")) {
			    // Reconstruimos el ciclo desde vertProx hasta el actual
			    int i = camino.indexOf(vertProx);
			    if (i != -1) {
			        caminoTotal.addAll(camino.subList(i, camino.size()));
			        caminoTotal.add(vertProx); // cerrar el ciclo
			        return;
			    }
			}
		}
		colores.put(vert, "negro");
		camino.remove(camino.size() - 1);
	}
	
	public boolean esPartedelCiclo(int v) {
		Map<Integer, String> colores = new HashMap<>();
		for(Integer vert: lista_vertices.keySet()) {
			colores.put(vert,"blanco");
		}
		for(Integer vert: lista_vertices.keySet()) {
			if(colores.get(vert).equals("blanco")) {
				if(esParteCicloVisit(vert, v, colores)) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean esParteCicloVisit(int vert, int v, Map<Integer, String>colores) {
		colores.put(vert,"amarillo");
		List<Arco<T>> adyac = lista_vertices.get(vert);
		for(Arco<T> ady : adyac) {
			int adProx = ady.getVerticeDestino();
			if(colores.get(adProx).equals("blanco")) {
				if(esParteCicloVisit(adProx, v, colores)) {
					return true;
				}
			}else {
				if(colores.get(adProx).equals("amarillo")) {
					if(adProx==v) {
						return true;
					}
				}
			}
		}
		colores.put(vert,"negro");
		return false;
	}
}
