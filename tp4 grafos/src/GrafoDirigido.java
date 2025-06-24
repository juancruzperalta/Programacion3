

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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
