package ejercReh;

public class ejerc11 {
/*Ejercicio 11
 El robot de limpieza necesita volver desde su posición actual hasta su base de carga. Dado que al
 robot le queda poca batería, desea encontrar el camino más corto. El robot dispone de un mapa de
 la casa representado como una matriz, donde cada celda es una posición de la casa. La matriz
 posee un 0 si la celda está vacía, o un 1 si la celda presenta algún obstáculo (por ejemplo, un
 mueble). Se desea encontrar entonces el camino más corto considerando que:--
 Desde una celda solo te puedes mover a las celdas contiguas (izquierda, derecha, arriba y
 abajo)
 El robot sólo puede caminar por celdas libres (no por celdas con obstáculos)
 ¿Hay alguna poda que se pueda aplicar al algoritmo?*/
	
	Celda[][] matriz;
	Solucion caminoCorto;
	Celda robot;
	Celda BaseCarga;
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), robot);
		caminoCorto = new Solucion(new LinkedList<>());
		backtracking(e);
		return caminoCorto;
	}
	private void backtracking(Estado e) {
		if(e.puedoAvanzar()) {
			if(e.celdaAct() == BaseCarga) {
				if(e.caminoAct.size() < caminoCorto.camino.size()) {
					caminoCorto.camino.clear();
					caminoCorto.camino.addAll(new LinkedList<>(e.caminoAct()));
				}
			}
		}
		List<Celda> celdasH = generarHijas(e.celdaAct());
		for(Celda c : celdasH) {
			if(!e.caminoAct().contains(c)) {
				if(c.getValor != 1) {
					e.avanzarCelda(c);
					e.agregarVisitada(c);
					if(!poda(e)) { //podo si el caminoAct.size() ya es mayor al caminoCorto.camino.size()..
 						backtracking(e);
					}
					e.quitarVisitada(c);
				}
			}
		}
	}
}
