package arcoHechoYa;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GrafoDirigidoAnterior<T> implements GrafoAnterior<T> {

	
	Hashtable<Integer, List<ArcoAnterior<T>>> mapa_vertices;
	
	public GrafoDirigidoAnterior() {
		 mapa_vertices = new Hashtable<Integer, List<ArcoAnterior<T>>>();
	}
	@Override
	public void agregarVertice(int verticeId) {
		if(!contieneVertice(verticeId)) {
			 mapa_vertices.put(verticeId, new LinkedList<ArcoAnterior<T>>());			
		}
	}
	@Override
	public void borrarVertice(int verticeId) {
		if(contieneVertice(verticeId)) {
			for(Integer vert : mapa_vertices.keySet()) {
				if(verticeId == vert) {
					List<ArcoAnterior<T>> arcos = mapa_vertices.get(verticeId);
					for(ArcoAnterior<T> arc: arcos) {							
						int destino = arc.getVerticeDestino();
						borrarArco(verticeId, destino);
						borrarArco(destino, verticeId);
					}
				}
			}
			mapa_vertices.remove(verticeId);
		}
	}

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		if(contieneVertice(verticeId1) && contieneVertice(verticeId2)) {			
			if(!existeArco(verticeId1, verticeId2)) {
				List<ArcoAnterior<T>> arcos = mapa_vertices.get(verticeId1);
				arcos.add(new ArcoAnterior<T>(verticeId1, verticeId2, etiqueta));
			}
		}
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1)) {
			List<ArcoAnterior<T>> arcos = mapa_vertices.get(verticeId1);
			ArcoAnterior<T> valor = null;
			for(ArcoAnterior<T> arc: arcos) {
				if(arc.getVerticeDestino()==verticeId2) {
					valor = arc;
				}
			}
			if(valor != null) {				
			arcos.remove(valor);
			}
		}
	}

	@Override
	public boolean contieneVertice(int verticeId) {
		return mapa_vertices.containsKey(verticeId);
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1)) {
			List<ArcoAnterior<T>> arco = mapa_vertices.get(verticeId1);
			for(ArcoAnterior<T> arcos: arco) {
				if(arcos.getVerticeDestino() == verticeId2) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public ArcoAnterior<T> obtenerArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1)) {
			for(Integer vert : mapa_vertices.keySet()) {
				if(verticeId1 == vert) {
				List<ArcoAnterior<T>> arco = mapa_vertices.get(verticeId1);
					for(ArcoAnterior<T> arcos: arco) {
						if(arcos.getVerticeDestino() == verticeId2) {
							return arcos;
							}
						}
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
		int cantidad=0;
		  for (List<ArcoAnterior<T>> arcos : mapa_vertices.values()) {
		        cantidad += arcos.size();
		    }
		    return cantidad;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		return mapa_vertices.keySet().iterator();
	}

	@Override
	/*List<Arco<T>> arcos = mapa_vertices.get(verticeId);
		List<Integer> destinos = new LinkedList<Integer>();
		for(Arco a: arcos) {
			destinos.add(a.getVerticeDestino());
		}
		return destinos.iterator();*/
	
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		List<ArcoAnterior<T>> arcos = mapa_vertices.get(verticeId);
		return new IteratorArcoAnterior<T>(arcos.iterator());
	}

	@Override
	public Iterator<ArcoAnterior<T>> obtenerArcos() {
		List<ArcoAnterior<T>> arcos = new LinkedList<>();
		for(Integer vert: mapa_vertices.keySet()) {
			for(ArcoAnterior<T> arc: mapa_vertices.get(vert)) {
				if(contieneVertice(arc.getVerticeDestino())) {				
					arcos.add(arc);
				}
			}
		}
		return arcos.iterator();
	}

	@Override
	public Iterator<ArcoAnterior<T>> obtenerArcos(int verticeId) {
		if(contieneVertice(verticeId)) {
			List<ArcoAnterior<T>> arcos = mapa_vertices.get(verticeId);
				return arcos.iterator();
		}
		return null;
	}

	public List<Integer> DFS() {
		Map<Integer, String> colores = new HashMap<>();
		List<Integer> blancos = new LinkedList<>(mapa_vertices.keySet());
		List<Integer> encontrados = new LinkedList<>();
		for (Integer vertice : blancos) {
			colores.put(vertice, "blanco");
		}
		for (Integer vertice : blancos) {
			if (colores.get(vertice).equals("blanco")) {
				DFS_visit(vertice, colores,encontrados);
			}
		}
		return encontrados;
	}
	public void DFS_visit(int verti, Map<Integer, String> colores, List<Integer>encontrados) {
		colores.put(verti, "amarillo");
		List<ArcoAnterior<T>> arcos = mapa_vertices.get(verti);
		for(ArcoAnterior<T> arc: arcos) {
			int prox = arc.getVerticeDestino();
				if(colores.get(prox).equals("blanco")) {
					DFS_visit(prox, colores,encontrados);
				}else{
					if(colores.get(prox).equals("amarillo")) {						
							System.out.println("Hay un ciclo");
					}
				}
		}
		colores.put(verti, "negro");
		encontrados.add(verti);
	}
	public List<Integer> BFS() {
		Map<Integer, Boolean> colores = new HashMap<>();
		List<Integer> encontrados = new LinkedList<>();
		List<Integer> mapa_vert = new LinkedList<>(mapa_vertices.keySet());
		boolean NO_VISITADO=false;
		for(Integer valor: mapa_vert) {
			colores.put(valor, NO_VISITADO);
		}
		for(Integer valor: mapa_vert) {
			if(colores.get(valor) == false) {
				BFS_visit(valor, colores, encontrados);
			}
		}
		return encontrados;
	}
	public void BFS_visit(int vertice, Map<Integer, Boolean> colores, List<Integer> encontrados) {
		List<Integer> fila = new LinkedList<>();
		boolean visitado=true;
		colores.put(vertice,visitado);
		fila.add(vertice);
		while(!fila.isEmpty()) {
			int vertX = fila.remove(0);
			encontrados.add(vertX);
			List<ArcoAnterior<T>> adyacentes = mapa_vertices.get(vertX);
			for(ArcoAnterior<T> adya: adyacentes) {
				int prox=adya.getVerticeDestino();
				if(!colores.get(prox)) {
					colores.put(prox, true);
					fila.add(prox);
				}
			}
		}
	}
	
	public boolean tieneAlgunCiclo() {
		Map<Integer, String> colores = new HashMap<>();
		List<Integer> mapa_vert = new LinkedList<>(mapa_vertices.keySet());
		for(Integer vert: mapa_vert) {
			colores.put(vert, "blanco");
		}
		for(Integer vert: mapa_vert) {
			if(colores.get(vert).equals("blanco")) {
				if(tieneAlgunCiclo_visit(vert, colores)) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean tieneAlgunCiclo_visit(int vert, Map<Integer, String> colores) {
		colores.put(vert, "amarillo");
		List<ArcoAnterior<T>> arcos = mapa_vertices.get(vert);
		for(ArcoAnterior<T> arc: arcos) {
			int prox = arc.getVerticeDestino();
			if(colores.get(prox).equals("blanco")) {				
				if(tieneAlgunCiclo_visit(prox, colores)) {
					return true;
				}
			}else {
				if(colores.get(prox).equals("amarillo")) {
					return true;
			}
			}
		}
		colores.put(vert,"negro");
		return false;
	}
	
	public List<Integer> buscarElCaminoLargo(int vert1, int vert2){
		List<Integer> caminoCompleto = new LinkedList<>();
		if(contieneVertice(vert1)){
			for(ArcoAnterior<T> arc: mapa_vertices.get(vert1)) {
				if(arc.getVerticeDestino()==vert2) {
					List<Integer> camino = new LinkedList<>();
					camino.add(vert1);
					camino.add(vert2);
					if(camino.size() > caminoCompleto.size()) {
						caminoCompleto=camino;
					}
				}else {
					 List<Integer> camino = buscarElCaminoLargo(arc.getVerticeDestino(), vert2);
		                if (!camino.isEmpty()) {
		                   camino.add(vert1);
		                    if (camino.size() > caminoCompleto.size()) {
		                        caminoCompleto = camino;
		                    }
		                }
				}
			}
		}
		return caminoCompleto;
	}
	HashMap<Integer, String> colores = null;
	public boolean existeCamino(Integer origen, Integer destino) {
		Iterator<Integer> it = this.obtenerVertices();
		while(it.hasNext()) {
			Integer vert = it.next();
			colores.put(vert, "blanco");
			
		}
	//Estado inicial, arranca en amarillo el origen
		colores.put(origen, "amarillo");
		return existeCaminoRec(origen,destino);
	}
	private boolean existeCaminoRec(Integer origen, Integer destino) {
		if(origen.equals(destino)) {
			return true;
		}else {
			Iterator<Integer> it = this.obtenerAdyacentes(origen);
			while(it.hasNext()) {
				int hijo = it.next();
				if(colores.get(hijo).equals("blanco")) {
					//Avanzar en el estado
					colores.put(hijo, "amarillo");
					boolean respuesta = existeCaminoRec(hijo,destino);
					if(respuesta) {
						return true;
					}
					//Retroceder en el estado
					colores.put(hijo, "blanco");
				}
			}
		}
		return false;
	}
	public List<Integer> encontrarUnCamino(int vert1, int vert2){
		Iterator<Integer> it = this.obtenerVertices();
		while(it.hasNext()) {
			int hijo = it.next();
			colores.put(hijo, "blanco");
		}
		List<Integer> caminoActual = new LinkedList<>();
		caminoActual.add(vert1);
		colores.put(vert1, "amarillo");
		
		return encontrarUnCaminoRec(vert1, vert2, caminoActual);

	}
	private List<Integer> encontrarUnCaminoRec(int vert1, int vert2, List<Integer> caminoActual){
		if(vert1 == vert2) {
			return caminoActual;
		}else {
			Iterator<Integer> hijos = this.obtenerAdyacentes(vert1);
			while(hijos.hasNext()) {
				int hijo = hijos.next();
				if(colores.get(hijo).equals("blanco")) {
					colores.put(hijo, "amarillo");
					caminoActual.add(hijo);
					List<Integer> lista = encontrarUnCaminoRec(hijo, vert2, caminoActual);
					if(!lista.isEmpty()) {
						return lista;
					}
					colores.put(hijo, "blanco");
					caminoActual.remove(caminoActual.size()-1);
				}
			}
		}
		return null;
	}
	List<List<Integer>> soluciones = new LinkedList<>();
	public List<List<Integer>> encontrarTodosLosCaminos(int origen, int destino) {
		List<Integer> caminoActual = new LinkedList<>();
		Iterator<Integer> it = this.obtenerVertices();
		while(it.hasNext()) {
			int hijo = it.next();
			colores.put(hijo, "blanco");
		}
		caminoActual.add(origen);
		colores.put(origen, "amarillo");
		encontrarTodosLosCaminos(origen, destino, caminoActual);
		return soluciones;
	}
	private void encontrarTodosLosCaminos(int origen, int destino, List<Integer> camino) {
		if(origen == destino) {
			soluciones.add(new LinkedList<>(camino));
		}else {
			Iterator<Integer> it = this.obtenerAdyacentes(origen);
			while(it.hasNext()) {
				int hijo = it.next();
				if(colores.get(hijo).equals("blanco")) {
					colores.put(hijo, "amarillo");
					camino.add(hijo);
					encontrarTodosLosCaminos(origen, destino, camino);
					colores.put(hijo, "blanco");
					camino.remove(camino.size()-1);
				}
			}
		}
	}
	public List<Integer> buscarCaminoCorto(int vert1, int vert2){
		List<Integer> caminoCorto = new LinkedList<>();
		if(contieneVertice(vert1)) {
			for(ArcoAnterior<T> arc: mapa_vertices.get(vert1)) {
				if(arc.getVerticeDestino() == vert2) {
					List<Integer> caminoC= new LinkedList<>();
					caminoC.add(vert1);
					caminoC.add(vert2);
					if(caminoCorto.isEmpty() || caminoC.size() < caminoCorto.size()) {
						caminoCorto = caminoC;
					}
				}else {
					List<Integer> caminoC = buscarCaminoCorto(arc.getVerticeDestino(), vert2);
					if(!caminoC.isEmpty()) {						
						caminoC.add(vert1);
						if(caminoCorto.isEmpty() || caminoC.size() < caminoCorto.size()) {
							caminoCorto = caminoC;
						}
					}
				}
			}
		}
		return caminoCorto;
	}
	public List<Integer> caminoQueTerminaEn(int vert1) {
	    return caminoQueTerminaEn(vert1, new LinkedList<>());
	}
	private List<Integer> caminoQueTerminaEn(int vert1, List<Integer> visitados){
		List<Integer> lista = new LinkedList<>();
		if(contieneVertice(vert1)) {
		for(Integer val: mapa_vertices.keySet()) {
			for(ArcoAnterior<T> arc: mapa_vertices.get(val)) {
				if(arc.getVerticeDestino() ==vert1) {
						List<Integer> camino = new LinkedList<>();
						if(!camino.contains(val)) {
						camino.add(val);
						}
						visitados.add(val);
						lista.addAll(camino);
					}else {
						if(!visitados.contains(val)) {
							List<Integer> camino = caminoQueTerminaEn(arc.getVerticeDestino(), visitados);
							if(!camino.isEmpty()) {
								visitados.add(val);
								if(!camino.contains(val)) {
									camino.add(val);
									}
								lista.addAll(camino);
							}
						}
					}
				}
			}
		}
		return lista;	
	}
	public int contarArcosSalientes(int verticeId) {
		if(contieneVertice(verticeId)) {
			List<ArcoAnterior<T>> arcos = mapa_vertices.get(verticeId);
			return arcos.size();
		}
		return 0;
	}
	public List<Integer> obtenerArcosDestinos(int verticeId){
		List<Integer> arcosDestinos = new LinkedList<>();
		if(contieneVertice(verticeId)) {
			List<ArcoAnterior<T>> arcos = mapa_vertices.get(verticeId);
			for(ArcoAnterior<T> arc: arcos) {
					arcosDestinos.add(arc.getVerticeDestino());
				}
		}
		return arcosDestinos;
	}
	public T obtenerPesoArco(int verticeId1, int verticeId2) {
		if(contieneVertice(verticeId1)) {
			List<ArcoAnterior<T>> arcos = mapa_vertices.get(verticeId1);
			for(ArcoAnterior<T> arc: arcos) {
				if(arc.getVerticeDestino()==verticeId2) {
					return arc.getEtiqueta();
				}
			}
		}
		return null;
	}
	public boolean esVerticeAislado(int verticeId) {
		if(contieneVertice(verticeId)) {
			for(Integer vert: mapa_vertices.keySet()) {
				List<ArcoAnterior<T>> arco = mapa_vertices.get(verticeId);
				List<ArcoAnterior<T>> arcos = mapa_vertices.get(vert);
				for(ArcoAnterior<T> arc: arcos) {
					if(arc.getVerticeDestino() == verticeId) {
						return false;
					}else {
						if(arcos.get(verticeId).getVerticeDestino() == -1) {
							return true;
						}
					}//SEGUIR
				}
			}
		}
		return false;
	}


}
