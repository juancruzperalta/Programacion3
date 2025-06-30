package ejercIA4;

public class robotBateriaLimitada {
	/*🤖 Ejercicio: Robot con Batería Limitada
Enunciado:
Un robot se encuentra en una celda inicial de una casa representada como una matriz.
 Cada celda de la matriz puede ser:

0: espacio libre

1: obstáculo

2: cargador (puede haber más de uno)

El robot tiene una cantidad limitada de batería, por ejemplo B = 6 movimientos. 
Desde una celda puede moverse arriba, abajo, izquierda o derecha, solo por celdas libres.

Objetivo:
Encontrar el camino más corto desde la posición inicial del robot hasta cualquier cargador,
 sin quedarse sin batería.

*/
	Celda robotInicial;
	Celda[][]casa;
	int cantBateria;
	Solucion mejorCamino;
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), cantBateria, robotInicial);//lista de camino actual,
		//movimientos actuales, posición del robot...
		mejorCamino = new Solucion(new LinkedList<>());
		backtracking(e);
		return mejorCamino;
	}
	private void backtracking(Estado e) {
		if(e.celdaActual.getValor()==2 && e.bateriaRestante()>0) {
			if(e.caminoActual().size() < mejorCamino.camino.size()) {
				mejorCamino.camino.clear();
				mejorCamino.camino.addAll(new LinkedList<>(e.caminoActual()));
			}
		}else {
			List<Celda> celdas = generarHijos(e.celdaActual());//genero la celdaActual con las restricciones
			//de que simplemnete no se vaya de la matriz...el resto lo compruebo debajo
			for(Celda celd : celdas) {
				Celda celdaActual = celd;
				if(celd.getValor()!=1 && !e.caminoActual().contains(celd)) {
					e.avanzarSiguienteCelda(celd);
					e.agregarVisitado(celd);
					e.restarBateria(); //bateria restante menos...
					if(poda(e)) //si la bateria del robot ya es 0, directamente podo y no sigo
						//buscando camino innecesariamente si ya no tengo más movs...
					backtracking(e);
					e.volverAnteriorCelda(celdaActual);
					e.quitarVisitado(celd);
					e.sumarBateria(); //sumar uno más a bateria..
				}
			}
		}
	}
}
