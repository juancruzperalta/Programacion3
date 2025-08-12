package tp4r;

import java.util.*;

public class GrafoDirigido<T> implements Grafo<T> {

	Hashtable<Integer, List<Arco<T>>> listado;
	
	
	
	public GrafoDirigido() {
		super();
		this.listado = new Hashtable<>();
	}

	@Override
	public void agregarVertice(int verticeId) {
		if(!contieneVertice(verticeId)) {
			listado.put(verticeId, new LinkedList<>());
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
				List<Arco<T>> arcos = listado.get(verticeId1);
				Arco<T> arc = new Arco<>(verticeId1, verticeId2, etiqueta);
				arcos.add(arc);
			}
		}
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean contieneVertice(int verticeId) {
		return listado.containsKey(verticeId);
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			List<Arco<T>> arcos = listado.get(verticeId1);
			for(Arco<T> arc : arcos) {
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
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {
			List<Arco<T>> arcos = listado.get(verticeId1);
			for(Arco<T> arc : arcos) {
				int prox = arc.getVerticeDestino();
				if(prox == verticeId2) {
					return arc;
				}
			}
		}
		return null;
	}

	@Override
	public int cantidadVertices() {
		return listado.size();
	}

	@Override
	public int cantidadArcos() {
		int cant=0;
		for(Integer key : listado.keySet()) {
			List<Arco<T>> arcos = listado.get(key);
			cant+=arcos.size();
		}
		return cant;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		return listado.keySet().iterator();
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		List<Arco<T>> arcos = listado.get(verticeId);
		return new Iterators<T>(arcos.iterator());
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		for(Integer vert : listado.keySet()) {
			List<Arco<T>> arcos = listado.get(vert);
			return new Iterators(arcos.iterator());
		}
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		List<Arco<T>> arcos = listado.get(verticeId);
		return new Iterators(arcos.iterator());
	}
	public void DFS() {
		Hashtable<Integer, String> colores = new Hashtable<>();
		for(Integer val : listado.keySet()) {
			colores.put(val, "blanco");
		}
		for(Integer val : listado.keySet()) {
			if(colores.get(val).equals("blanco")) {
				DFS_VISIT(colores, val);
			}
		}
	}

	private void DFS_VISIT(Hashtable<Integer, String> colores, Integer val) {
		colores.put(val, "amarillo");
		List<Arco<T>> arcos = listado.get(val);
		for(Arco<T> arc: arcos) {
			int prox =arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				DFS_VISIT(colores, prox);
			}else {
				if(colores.get(prox).equals("amarillo")) {
					System.out.println("ciclo");
				}
			}
		}
		colores.put(val, "negro");
	}
	List<Integer> bfs;
	public void BFS() {
		bfs.clear();
		Hashtable<Integer, Boolean> VISITADOS = new Hashtable<>();
		for(Integer vert : listado.keySet()) {
			VISITADOS.put(vert, false);
		}
		for(Integer vert : listado.keySet()) {
			if(VISITADOS.contains(vert) == false) {
				BFS_Visit(VISITADOS, vert);
			}
		}
	}

	private void BFS_Visit(Hashtable<Integer, Boolean> VISITADOS, Integer vert) {
		VISITADOS.put(vert, true);
		bfs.add(vert);
		while(!bfs.isEmpty()) {
			int primero = bfs.remove(0);
			if(VISITADOS.get(primero) == false) {
				VISITADOS.put(primero, true);
				bfs.add(primero);				
				BFS_Visit(VISITADOS, primero);
			}
			
		}
	}
	
	public boolean tieneCiclo() {
		Hashtable<Integer, String> colores = new Hashtable<>();
		for(Integer vert : listado.keySet()) {
			colores.put(vert,"blanco");
		}
		for(Integer vert : listado.keySet()) {
			if(colores.get(vert).equals("blanco")) {
				if(tieneCicloVisit(colores, vert)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean tieneCicloVisit(Hashtable<Integer, String> colores, Integer vert) {
		colores.put(vert, "amarillo");
		List<Arco<T>> arcos = listado.get(vert);
		for(Arco<T> arc : arcos) {
			int prox = arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				if(tieneCicloVisit(colores, prox)) {
					return true;
				}
			}else {
				if(colores.get(prox).equals("amarillo")) {
					return true;
				}
			}
		}
		colores.put(vert, "negro");
		return false;
	}
	/* Ejercicio 4
 Escribir un algoritmo que, dado un grafo dirigido y dos vértices i, j de este grafo, devuelva el
 camino simple (sin ciclos) de mayor longitud del vértice i al vértice j. Puede suponerse que el
 grafo de entrada es acíclico.*/
	List<Integer> caminoSimpleMayor = new LinkedList<>();
	public List<Integer> caminoSimple(int i, int j){
		List<Integer> camino = new LinkedList<>();
		camino.add(i);
		caminoSimpleMay( i,  j, camino);
		return caminoSimpleMayor;
	}

	private void caminoSimpleMay(int i, int j, List<Integer> camino) {
		if(i==j) {
			if(caminoSimpleMayor.size() < camino.size()) {
				caminoSimpleMayor.clear();
				caminoSimpleMayor.addAll(new LinkedList<>(camino));
			}
		}
		List<Arco<T>> arcos = listado.get(i);
		for(Arco<T> arc : arcos) {
			int prox = arc.getVerticeDestino();
				if(!camino.contains(prox)) {
					camino.add(prox);
					caminoSimpleMay(prox, j, camino);
					camino.remove(camino.size()-1);
				}
		}
	}
	/* Ejercicio 5
 Escriba un algoritmo que dado un grafo G y un vértice v de dicho grafo, devuelva una lista
 con todos los vértices a partir de los cuales exista un camino en G que termine en v*/
	List<List<Integer>> listadoCompleto = new LinkedList<>();
	public List<List<Integer>> verticesCaminoGaV(int v){
		Hashtable<Integer, String> colores = new Hashtable<>();
		List<Integer> camino = new LinkedList<>();
		for(Integer i : listado.keySet()) {
			colores.put(i, "blanco");
		}
		for(Integer i : listado.keySet()) {
			if(colores.get(i).equals("blanco")) {
				verticesCaminoGaVisit(i, colores, v, camino);
			}
		}
		return listadoCompleto;
	}

	private void verticesCaminoGaVisit(int i, Hashtable<Integer, String> colores, int v, List<Integer> camino) {
		camino.add(i);
		colores.put(i, "amarillo");
		if(i == v) {
				listadoCompleto.add(new LinkedList<>(camino));
		}
		List<Arco<T>> arcos = listado.get(i);
		for(Arco<T> arc : arcos) {
			int prox = arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				verticesCaminoGaVisit(prox, colores, v, camino);
			}else if(colores.get(prox).equals("amarillo")){
				System.out.println("ciclo");
			}
		}
		colores.put(i, "blanco");
		camino.remove(camino.size()-1);
	}
	/* Ejercicio 6
 Supongamos que una ciudad se encuentra modelada mediante un grafo, donde cada nodo
 es una esquina, y las aristas representan las calles. Diseñe un algoritmo tal que dadas dos
 esquinas, devuelva el camino más corto entre ambas de manera de caminar la menor
 cantidad de cuadras posible.*/
	List<Integer> caminoCorto = new LinkedList<>();
			List<Integer> fila = new LinkedList<>();
	//voy a usar lo mismo arco y vertices, es igual, sólo que en otro caso un arco
	//tendria el nombre de la calle, supongamos que ya lo tiene...
	public List<Integer> caminoCortoEntreCiudad(int esquina1, int esquinaObjetivo){
		Hashtable<Integer, Boolean> visitados = new Hashtable<>();
		fila.clear();
		List<Integer> caminoCalle = new LinkedList<>();
		fila.add(esquina1);    
		List<List<Integer>> colaCaminos = new LinkedList<>();
	    colaCaminos.add(fila);
		caminoCalle.add(esquina1);
		visitados.put(esquina1, true);
		while(!fila.isEmpty()) {
			int prox = fila.remove(0);
			if(prox == esquinaObjetivo) {
				if(caminoCorto.size() > caminoCalle.size()) {
					caminoCorto.clear();
					caminoCorto.addAll(new LinkedList<>(caminoCalle));
					return caminoCorto;
				}
			}
				for(Arco<T> arc : listado.get(prox)) {
					int sig = arc.getVerticeDestino();
					if(!visitados.containsKey(sig)) {
		                visitados.put(sig, true);
		                List<Integer> nuevoCamino = new LinkedList<>(caminoCalle);
		                nuevoCamino.add(sig);
		                colaCaminos.add(nuevoCamino);
					}
			}
		}
		return caminoCorto;
	}
	
 	
}
