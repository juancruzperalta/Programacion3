
import java.util.*;

import arcoHechoYa.ArcoAnterior;

public class GrafoDirigido<T> implements Grafo<T> {
	Hashtable<Integer, List<Arco<T>>> mapa_vertices;

	public GrafoDirigido() {
		mapa_vertices = new Hashtable<Integer, List<Arco<T>>>();
	}

	@Override
	public void agregarVertice(int verticeId) {
		if(!contieneVertice(verticeId)) {
			mapa_vertices.put(verticeId, new LinkedList<Arco<T>>());
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
		// TODO Auto-generated method stub
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
				int vertProx = arc.getVerticeDestino();
				if(vertProx == verticeId2) {
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
			for(Arco<T> arc:  arcos) {
				if(arc.getVerticeDestino() == verticeId2) {
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
		List<Arco<T>> arcos = mapa_vertices.get(verticeId);
		return new Iterators<>(arcos);
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		List<Arco<T>> arcos = new LinkedList<>();
		for(Integer vert : mapa_vertices.keySet()) {
			if(contieneVertice(vert)) {
				for(Arco<T> arc: mapa_vertices.get(vert)) {
					int vertProx = arc.getVerticeDestino();
					if(contieneVertice(vertProx))
					arcos.add(arc);
				}
			}
		}
		return arcos.iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		List<Arco<T>> arcos = new LinkedList<>();
		if(contieneVertice(verticeId)) {
			for(Arco<T> arc : mapa_vertices.get(verticeId)) {
				int vertProx = arc.getVerticeDestino();
				if(contieneVertice(vertProx)) {
					arcos.add(arc);
				}
			}
		}
		return arcos.iterator();
	}
	
	public void DFS() {
		Hashtable<Integer, String> colores = new Hashtable<Integer, String>();
		for(Integer vert : mapa_vertices.keySet()) {
			colores.put(vert, "blanco");
		}
		for(Integer vert : mapa_vertices.keySet()) {
			if(colores.get(vert).equals("blanco")) {
				DFS_Visit(vert,colores);
			}
		}
	}
	private void DFS_Visit(int vert, Map<Integer, String> colores) {
		colores.put(vert, "amarillo");
		List<Arco<T>> arcos = mapa_vertices.get(vert);
		for(Arco<T> arc : arcos) {
			int prox = arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				DFS_Visit(prox, colores);
			}else {
				if(colores.get(prox).equals("amarillo")) {
					System.out.println("ciclo");
				}
			}
		}
		colores.put(vert,"negro");
	}
	List<Integer> fila = new LinkedList<>();
	public void BFS() {
		fila.clear();
		Hashtable<Integer, Boolean> VISITADO = new Hashtable<Integer, Boolean>();
		for(Integer vert : mapa_vertices.keySet()) {
			VISITADO.put(vert, true);
		}
		for(Integer vert : mapa_vertices.keySet()) {
			if(VISITADO.get(vert).equals(true)) {
				BFS_Visit(vert, VISITADO);
			}
		}
	}
	public void BFS_Visit(int vert, Hashtable<Integer, Boolean> visitados) {
		visitados.put(vert, true);
		fila.add(vert);
		while(!fila.isEmpty()) {
			int primero = fila.remove(0);
			List<Arco<T>> arcos = mapa_vertices.get(primero);
			for(Arco<T> arc: arcos) {
				int prox = arc.getVerticeDestino();
				if(visitados.get(prox).equals(false)) {
					fila.add(prox);
					visitados.put(prox, true);
				}
			}
		}
	}
	/* Ejercicio 2: Obtener todos los caminos entre dos vértices
Dado un vértice origen v1 y un destino v2,
 escribí un método que devuelva todos los caminos posibles entre ellos.*/
	public List<List<Integer>> obtenerCaminos(int origen, int destino){
		List<Integer> visitados= new LinkedList<>();
		List<Integer> caminos = new LinkedList<>();
		List<List<Integer>> todosLosCaminos = new LinkedList<>();
		obtenerCaminosVisit(origen, destino, visitados, caminos,todosLosCaminos);
		return todosLosCaminos;
	}
	private void obtenerCaminosVisit(int origen, int destino,
			List<Integer> visitados, List<Integer> caminos, List<List<Integer>> todosLosCaminos){
		visitados.add(origen);
		caminos.add(origen);
		if(origen==destino) {
			todosLosCaminos.add(new LinkedList<>(caminos));
		}
		List<Arco<T>> arc = mapa_vertices.get(origen);
		for(Arco<T> arco : arc) {
			int prox = arco.getVerticeDestino();
			if(!visitados.contains(prox)) {
				obtenerCaminosVisit(prox, destino, visitados, caminos, todosLosCaminos);
			}
		}
		caminos.remove(caminos.size()-1);
		visitados.remove(visitados.size()-1);
	}
	public List<List<Integer>> obtenerCaminosDeLongitud(int origen, int destino, int k){
		List<List<Integer>> caminosTotales = new LinkedList<>();
		List<Integer> caminoAct = new LinkedList<>();
		List<Integer> visitados = new LinkedList<>();
		obtenerCaminosDeLongitudVisit(origen, destino, k, caminosTotales, caminoAct, visitados);
		return caminosTotales;
	}
	private void obtenerCaminosDeLongitudVisit(int origen, int destino, int K, List<List<Integer>>caminosTotales,
			List<Integer> caminoAct, List<Integer> visitados) {
		caminoAct.add(origen);
		visitados.add(origen);
		if(origen == destino) {
			if(K+1 == caminoAct.size()) {
				caminosTotales.add(new LinkedList<>(caminoAct));
			}
		}
		List<Arco<T>> arcos = mapa_vertices.get(origen);
		for(Arco<T> arc : arcos) {
			int prox = arc.getVerticeDestino();
			if(!visitados.contains(prox)) {
				obtenerCaminosDeLongitudVisit(prox, destino, K, caminosTotales, caminoAct, visitados);
			}
		}
		visitados.remove(visitados.size()-1);
		caminoAct.remove(caminoAct.size()-1);
	}
	/*Dado un vértice origen v1, un vértice destino v2,
	 *  y un entero K, implementá un método que retorne true si existe
	 *  al menos un camino dirigido de longitud exactamente K entre ellos, y false en caso contrario.*/
	public boolean existeCaminoDeLongitudK(int origen, int destino, int k) {
		List<Integer> visitados = new LinkedList<>();
		if(existeCaminoDeLongitudK(origen, destino,k, visitados)) {
			return true;
		}
		return false;
	}

	private boolean existeCaminoDeLongitudK(int origen, int destino, int k, List<Integer> visitados) {
		visitados.add(origen);
		if(origen==destino) {
			if(visitados.size()==k+1) {
				return true;
			}
		}
		List<Arco<T>> arcos = mapa_vertices.get(origen);
		for(Arco<T> arc:  arcos) {
			int prox = arc.getVerticeDestino();
			if(!visitados.contains(prox)) {
				if(existeCaminoDeLongitudK(prox, destino, k,visitados)) {
					return true;
				}
			}
		}
		visitados.remove(visitados.size()-1);
		return false;
	}
	/*Dado un vértice de inicio v, escribí un método que retorne true si existe un
	 *  ciclo en el grafo que pueda alcanzarse desde v, es decir, un camino que vuelva 
	 *  a un nodo ya visitado desde v.*/
	public boolean hayCicloDesde(int verticeInicio) {
		Hashtable<Integer, String> colores = new Hashtable<Integer, String>();
		for(Integer vert : mapa_vertices.keySet()) {
			colores.put(vert, "blanco");
		}
		if(hayCicloDesde(verticeInicio, colores)) {
			return true;
		}
		return false;
	}

	private boolean hayCicloDesde(int verticeInicio, Hashtable<Integer, String> colores) {
		colores.put(verticeInicio, "amarillo");
		List<Arco<T>> arc = mapa_vertices.get(verticeInicio);
		for(Arco<T> arco: arc) {
			int prox = arco.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				if(hayCicloDesde(prox, colores)) {
					return true;
				}
			}else {
				if(colores.get(prox).equals("amarillo")) {
					return true;
				}
			}
		}
		colores.put(verticeInicio, "negro");
		return false;
	}
	/*Dado un vértice origen v1, un vértice destino v2, y un vértice intermedio obligatorio v3, 
	 * escribí un método que retorne true si existe algún camino dirigido que vaya de v1 a v2 pasando obligatoriamente por v3.
No importa si el camino es el más corto, largo o de qué longitud — solo importa que v3 esté incluido.*/
	public boolean existeCaminoConIntermedio(int origen, int intermedio, int destino) {
		boolean pasamosPorElIntermedio=false;
		List<Integer> visitados = new LinkedList<>();
		if(existeCaminoConIntermedio(origen, intermedio, destino, visitados, pasamosPorElIntermedio)) {
			return true;
		}
		return false;
	}

	private boolean existeCaminoConIntermedio(int origen, int intermedio, int destino, List<Integer> visitados,
			boolean pasamosPorElIntermedio) {
		visitados.add(origen);
		if(origen==intermedio) {
			pasamosPorElIntermedio=true;
		}
		if(pasamosPorElIntermedio && origen == destino) {
			return true;
		}
		List<Arco<T>> arc = mapa_vertices.get(origen);
		for(Arco<T> arco: arc) {
			int prox = arco.getVerticeDestino();
			if(existeCaminoConIntermedio(prox, intermedio, destino, visitados, pasamosPorElIntermedio)) {
				return true;
			}
		}
		visitados.remove(visitados.size()-1);
		return false;
	}
	/*Ejercicio 4
 Escribir un algoritmo que, dado un grafo dirigido y dos vértices i, j de este grafo, devuelva el
 camino simple (sin ciclos) de mayor longitud del vértice i al vértice j. Puede suponerse que el
 grafo de entrada es acíclico.*/
	List<Integer> mayorCamino = new LinkedList<>();
	List<Integer> visitados = new LinkedList<>();
	public List<Integer> caminoSimpleMayorLongitud(int verticeI, int verticeJ){
		List<Integer> camino = new LinkedList<>();
		visitados.add(verticeI);
		camino.add(verticeI);
		caminoSimpleMayorLongitud(verticeI, verticeJ, camino);
		return mayorCamino;
	}

	private void caminoSimpleMayorLongitud(int verticeI, int verticeJ, List<Integer> camino) {
		if(verticeI==verticeJ) {
			if(mayorCamino.size() < camino.size()) {
				mayorCamino.clear();
				mayorCamino.addAll(new LinkedList<>(camino));
			}
		}else {
		List<Arco<T>> arcos = mapa_vertices.get(verticeI);
		for(Arco<T> arc: arcos) {
			int prox = arc.getVerticeDestino();
			if(!visitados.contains(prox)) {				
				visitados.add(verticeI);
				camino.add(verticeI);
			caminoSimpleMayorLongitud(prox, verticeJ, camino);
			visitados.remove(visitados.size()-1);
			camino.remove(camino.size()-1);
			}
		}
		}
	}
}
