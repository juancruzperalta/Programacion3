package ejerc1;

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
	Celda[][] casa; //Celda tiene un valor 0 y 1...
	Celda posInicioRobot, posCargador; //identificados con los valores de la pos de inicio y fin..
	Solucion caminoMasCorto;//lista del camino
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), posInicioRobot);
		caminoMasCorto = new Solucion(new LinkedList<>());
		backtracking(e);
		return caminoMasCorto;
	}
	private void backtracking(Estado e) {
		if(e.casillaAct() == posCargador) {
			if(caminoMasCorto == null || caminoMasCorto.camino.size() > e.caminoAct.size()) {
				caminoMasCorto.camino.clear();
				caminoMasCorto.camino.addAll(new LinkedList<>(e.caminoAct));
			}
		}
		List<Celda> celdasHijas = generarCeldasHijas(e.casillaAct());//genero detectando qeu no se
		//vaya de la matriz, por ende, una fila me devolvería, que recorro...
		for(Celda c : celdasHijas) {
			if(!e.caminoAct().contains(c)) {
				if(c.getValor() != 1) {
					e.agregarCeldaAlCamino(c);//agrego a la lista del estado la cedlda
					e.pasarSigCelda(c); //cambio celda act por la sig..
					backtracking(e);
					e.quitarCelda(); //la ultima
				}
			}
		}
	}
}
