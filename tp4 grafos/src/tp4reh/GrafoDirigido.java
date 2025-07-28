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
	//Devuelve el camino de todos los vertices...
	public List<Integer> caminoDFS(){
		Hashtable<Integer,String> colores = new Hashtable<>();
		List<Integer> camino = new LinkedList<>();
		for(Integer vert : mapa_vertices.keySet()) {
			colores.put(vert, "blanco");
		}
		for(Integer vert : mapa_vertices.keySet()) {
			if(colores.get(vert).equals("blanco")) {
				caminoDFS_visit(vert, colores,camino);
			}
		}
		return camino;
	}
	private void caminoDFS_visit(Integer vert, Hashtable<Integer, String> colores, List<Integer> camino) {
		colores.put(vert, "amarillo");
		camino.add(vert);
		List<Arco<T>> arcos = mapa_vertices.get(vert);
		for(Arco<T> arc : arcos) {
			int prox = arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				caminoDFS_visit(prox, colores,camino);
			}
			else {
				if(colores.get(prox).equals("amarillo")) {
					System.out.println("ciclo");
				}
			}
		}
		colores.put(vert,"negro");
	}
	List<Integer> fila;
	public List<Integer> caminoBFS(){
		Hashtable<Integer, Boolean> visitados = new Hashtable<>();
		fila.clear();
		for(Integer vert : mapa_vertices.keySet()) {
			visitados.put(vert, true);
		}
		for(Integer vert : mapa_vertices.keySet()) {
			if(visitados.get(vert).equals(false)) {
				caminoBFSVisit(visitados, vert);
			}
		}
		return fila;
	}
	private void caminoBFSVisit(Hashtable<Integer, Boolean> visitados, Integer vert) {
		visitados.put(vert, true);
		fila.add(vert);
		while(!fila.isEmpty()) {
			int x = fila.remove(0);
			List<Arco<T>> arcos = mapa_vertices.get(x);
			for(Arco<T> arc: arcos) {
				int adyacente  = arc.getVerticeDestino();
				if(visitados.get(adyacente).equals(false)) {
					visitados.put(adyacente, true);
					fila.add(adyacente);
				}
			}
		}
	}
	public boolean tenesAlgunCiclo() {
		Hashtable<Integer, String> colores = new Hashtable<>();
		for(Integer vert : mapa_vertices.keySet()) {
			colores.put(vert,"blanco");
		}
		for(Integer vert : mapa_vertices.keySet()) {
			if(colores.get(vert).equals("blanco")) {
				if(tenesAlgunCicloVisit(vert, colores)) {
					return true;
				}
			}
		}
		return false;
	}
	private boolean tenesAlgunCicloVisit(Integer vert, Hashtable<Integer, String> colores) {
		colores.put(vert, "amarillo");
		List<Arco<T>> arcos = mapa_vertices.get(vert);
		for(Arco<T> arc: arcos) {
			int arcoProx = arc.getVerticeDestino();
			if(colores.get(arcoProx).equals("blanco")) {
				if(tenesAlgunCicloVisit(arcoProx, colores)) {
					return true;
				}
			}else {
				if(colores.get(arcoProx).equals("amarillo")) {
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
	public List<Integer> caminoDiri(int i, int j){
		List<Integer> camino = new LinkedList<>();
		List<Integer> caminoAct = new LinkedList<>();
		Hashtable<Integer, String> colores = new Hashtable<>();
		for(Integer vert : mapa_vertices.keySet()) {
			colores.put(vert, "blanco");
		}
		caminoDiriVisit(colores, i,j,camino, caminoAct);
		return camino;
	}
	private void caminoDiriVisit(Hashtable<Integer, String> colores, int i, int j, List<Integer> camino,
			List<Integer> caminoAct) {
		caminoAct.add(i);
		colores.put(i, "amarillo");
		if(i==j) {
			if(camino.size() < caminoAct.size()) {
				camino.clear();
				camino.addAll(caminoAct);
			}
		}
		List<Arco<T>> arcos = mapa_vertices.get(i);
		for(Arco<T> arc : arcos) {
			int prox = arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {
				caminoDiriVisit(colores, prox, j, camino, caminoAct);
			}
		}
		colores.put(i, "negro");
		caminoAct.remove(caminoAct.size()-1);
	}
	/*Objetivo:
Escribir un método que, dado un grafo dirigido (puede tener ciclos), 
y dos vértices origen y destino, devuelva la cantidad total de caminos simples
 (es decir, sin repetir vértices) que existen desde origen hasta destino*/
	Hashtable<List<Integer>, Integer> general = new Hashtable<>();
	int contador=0;
	public int contarCaminosSimples(int origen, int destino) {
	    Hashtable<Integer, String> colores = new Hashtable<>();
	    List<Integer> camino = new LinkedList<>();
	    for(Integer vert : mapa_vertices.keySet()) {
	    	colores.put(vert, "blanco");
	    }
	    contarCaminosSimplesVisit(colores, origen, destino,camino);
	    return contador;
	}
	private void contarCaminosSimplesVisit(Hashtable<Integer, String> colores, int origen, int destino,
			List<Integer> camino) {
		colores.put(origen, "amarillo");
		camino.add(origen);
		if(origen == destino) {
			contador++;
			general.put(camino, contador);
		}
		List<Arco<T>> arcos = mapa_vertices.get(origen);
		for(Arco<T> arc : arcos) {
			int prox = arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")){
				contarCaminosSimplesVisit(colores, prox, destino, camino);
			}
		}
		colores.put(origen, "blanco");
		camino.remove(camino.size()-1);
	}
	/*Objetivo:
Escribir un método que, dado un grafo dirigido (puede tener ciclos), 
y dos vértices origen y destino, devuelva los posibles caminos*/
	
}
