package tp4reh;

import java.util.*;
public class GrafoDirigido<T> implements Grafo<T> {

	Hashtable<Integer,List<Arco<T>>> mapa_vertices;
	
	public GrafoDirigido(){
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
			List<Arco<T>> arcos = mapa_vertices.get(verticeId);
			for(Arco<T> arc: arcos) {
				int prox = arc.getVerticeDestino();
				borrarArco(verticeId, prox);
				borrarArco(prox, verticeId);
			}
			mapa_vertices.remove(verticeId);
		}
	}

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			if(!existeArco(verticeId1, verticeId2)) {
				List<Arco<T>> lista = mapa_vertices.get(verticeId1);
				lista.add(new Arco<T>(verticeId1, verticeId2, etiqueta));
			}
		}
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		if(existeArco(verticeId1, verticeId2)) {
			List<Arco<T>> mapa = mapa_vertices.get(verticeId1);
			for(Arco<T> arc: mapa) {
				int prox = arc.getVerticeDestino();
				if(prox==verticeId2) {
					mapa.remove(verticeId2);
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
			List<Arco<T>> arco = mapa_vertices.get(verticeId1);
			for(Arco<T> arc: arco) {
				int prox = arc.getVerticeDestino();
				if(prox == verticeId2) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		Arco<T> arc = null;
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			List<Arco<T>> arcos = mapa_vertices.get(verticeId1);
			for(Arco<T> ar: arcos) {
				int prox = ar.getVerticeDestino();
				if(prox==verticeId2) {
					arc = ar;
				}
			}
		}
		return arc;
	}

	@Override
	public int cantidadVertices() {
		return mapa_vertices.size();
	}

	@Override
	public int cantidadArcos() {
		int size=0;
		for(Integer vert : mapa_vertices.keySet()) {
			List<Arco<T>> arc = mapa_vertices.get(vert);
			size=arc.size();
		}
		return size;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		return mapa_vertices.keySet().iterator();
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		List<Arco<T>> adya = mapa_vertices.get(verticeId);
		return new Iteratore<T>(adya.iterator());
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
		if(contieneVertice(verticeId)) {			
			List<Arco<T>> arc = mapa_vertices.get(verticeId);
			return arc.iterator();
		}
		return null;
	}
	public boolean esFuertementeConexo(){
		boolean existe=false;
		Hashtable<Integer, String> colores = new Hashtable<>();
		for(Integer vert : mapa_vertices.keySet()) {
			colores.put(vert, "blanco");
		}
		for(Integer vert : mapa_vertices.keySet()) {
			if(colores.get(vert).equals("blanco")) {
				if(esFuertementeConexoVisit(vert, colores)) {
					existe = true;
				}
			}
		}
		return existe;
	}
	private boolean esFuertementeConexoVisit(Integer vert, Hashtable<Integer, String> colores) {
		colores.put(vert,"amarillo");
		List<Arco<T>> arc = mapa_vertices.get(vert);
		for(Arco<T> arco : arc) {
			int prox = arco.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				if(esFuertementeConexoVisit(prox, colores)) {
					return true;
				}
			}
		}
		colores.put(vert, "negro");
		return false;
	}
	

}
