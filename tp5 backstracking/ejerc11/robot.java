package ejerc11;

public class robot {
	Celda posCarga;
	Celda robotInicio;
	Celda[][] mapaCasa;
	Solucion mejorCamino; //lista de camino hecho por el robot
	
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), robotInicio); //va a tener
		//una lista para el estado del camino que va hacinedo el robot y la posición donde arranca...
		mejorCamino = new Solucion(new LinkedList<>());
		backtracking(e);
		return mejorCamino;
	}
	private void backtracking(Estado e) {
		if(e.celdaActual()==posCarga) {
			if(e.caminoActual().size()< mejorCamino.camino.size()) {
				mejorCamino.camino.clear();
				mejorCamino.camino.addAll(new LinkedList<>(e.caminoActual()));
			}
		}else {
			List<Celda> celdasHijas = generarCeldasHijas(e.celdaActual());
			//genero las celdas solo con la restricción que no se vaya del lugar...
			for(Celda celdas: celdasHijas) {
				Celda celdaAnterior = celdas;
				if(celdas.getValor()!=1) {//verifico que una celda no sea obstaculo...
					e.avanzarCeldaProxima(celdas);//cambio la pos del robot al a sig...
					e.agregarComoVisitado(celdas); //agrego al caminolista del estado...
					backtracking(e);
					e.quitarVisitado(celdas);
					e.volverCeldaAnterior(celdaAnterior);
				}
			}
		}
	}
}
