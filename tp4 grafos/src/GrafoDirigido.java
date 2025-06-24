

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
public class GrafoDirigido<T> implements Grafo<T> {

	Hashtable<Integer, List<Arco<T>>> mapa_vertices;
	public GrafoDirigido() {
		mapa_vertices = new Hashtable<>();
	}
	@Override
	public void agregarVertice(int verticeId) {
		if(!contieneVertice(verticeId)) {
			mapa_vertices.put(verticeId, new LinkedList<>());
		}
	}

	@Override
	public void borrarVertice(int verticeId) {
		if(contieneVertice(verticeId)) {
			List<Arco<T>> arc = mapa_vertices.get(verticeId);
			for(Arco<T> ar : arc) {
				int prox = ar.getVerticeDestino();
				borrarArco(verticeId, prox);
				borrarArco(prox, verticeId);
				}
			}
		mapa_vertices.remove(verticeId);
		}

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			if(!existeArco(verticeId1, verticeId2)) {
				List<Arco<T>> arcos = mapa_vertices.get(verticeId1);
				arcos.add(new Arco<T>(verticeId1, verticeId2, etiqueta));
			}
		}
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		if(existeArco(verticeId1, verticeId2)) {
			List<Arco<T>> arcos = mapa_vertices.get(verticeId1);
			for(Arco<T> arc: arcos) {
				int arcProx = arc.getVerticeDestino();
				if(arcProx==verticeId2) {
					arcos.remove(arc);
				}
			}
		}
	}

	@Override
	public boolean contieneVertice(int verticeId) {
		return mapa_vertices.containsKey(verticeId);
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			List<Arco<T>> arcos = mapa_vertices.get(verticeId1);
			for(Arco<T> arc: arcos) {
				int vertAdy = arc.getVerticeDestino();
				if(verticeId2 == vertAdy) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			List<Arco<T>> arcos = mapa_vertices.get(verticeId1);
			for(Arco<T> arc: arcos) {
				int vertProx = arc.getVerticeDestino();
				if(vertProx == verticeId2) {
					return arc;
				}
			}
		}
		return null;
	}

	@Override
	public int cantidadVertices() {
		return mapa_vertices.size();
	}

	@Override
	public int cantidadArcos() {
		int cant=0;
		for(Integer vert : mapa_vertices.keySet()) {
			List<Arco<T>> arc = mapa_vertices.get(vert);
				cant+=arc.size();
		}
		return cant;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		return mapa_vertices.keySet().iterator();
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		List<Arco<T>> arc = mapa_vertices.get(verticeId);
		return new Iterators<>(arc.iterator());
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		for(Integer vert : mapa_vertices.keySet()) {
			List<Arco<T>> arc = mapa_vertices.get(vert);
			return arc.iterator();
		}
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		List<Arco<T>> arc = mapa_vertices.get(verticeId);
		return arc.iterator();
	}
	public void DFS() {
		Hashtable<Integer, String> colores = new Hashtable<>();
		
		for(Integer vert : mapa_vertices.keySet()) {
			colores.put(vert, "blanco");
		}
		for(Integer vert : mapa_vertices.keySet()) {
			if(colores.get(vert).equals("blanco")) {
				DFS_Visit(colores,vert);
			}
		}
	}
	private void DFS_Visit(Hashtable<Integer, String> colo, int vert ) {
		colo.put(vert,"amarillo");
		
		List<Arco<T>> vec = mapa_vertices.get(vert);
		for(Arco<T> ady : vec) {
			int vertProx = ady.getVerticeDestino();
			if(colo.get(vertProx).equals("blanco")) {
				DFS_Visit(colo, vertProx);
			}
			else {
				if(colo.get(vertProx).equals("amarillo")) {
					System.out.println("ciclo");
				}
					}
		}
		colo.put(vert, "negro");
	}
	List<Integer> fila;
	public void BFS() {
		fila.clear();
		Hashtable<Integer, Boolean> visitados = new Hashtable<>();
		for(Integer vert: mapa_vertices.keySet()) {
			visitados.put(vert, false);
		}
		for(Integer vert : mapa_vertices.keySet()) {
			if(visitados.get(vert).equals(false)) {
				BFS_Visit(visitados, vert);
			}
		}
	}
	private void BFS_Visit(Hashtable<Integer, Boolean> visitados, int vert) {
		visitados.put(vert, true);
		fila.add(vert);
		while(!fila.isEmpty()) {
			int prim = fila.remove(0);
			List<Arco<T>> arc = mapa_vertices.get(prim);
			for(Arco<T> ady: arc) {
				int prox = ady.getVerticeDestino();
				if(visitados.get(prox).equals(false)) {
					BFS_Visit(visitados, prox);
				}else {
					visitados.put(prox, true);
					fila.add(prox);
				}
			}
		}
	}
}
