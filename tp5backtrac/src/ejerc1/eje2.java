package ejerc1;
/* Ejercicio 2
 Dado un laberinto consistente en una matriz cuadrada que tiene en cada posición un valor natural y
 cuatro valores booleanos, indicando estos últimos si desde esa casilla se puede ir al norte, este, sur
 y oeste, encontrar un camino de longitud mínima entre dos casillas dadas, siendo la longitud de un
 camino la suma de los valores naturales de las casillas por las que pasa. Idea: podría representarse
 el laberinto como una matriz, de objetos, donde cada objeto tiene el valor natural, y cuatro
 booleanos, uno para cada dirección a la que se permite ir desde allí*/
public class eje2 {
	Casilla[][] matriz; //una matriz de casillas, donde cada casilla tiene
	//un valor natural, y cuatro booleanos.
	Casilla inicial;//Casilla de que arranca hasta la salida
	Casilla salida; //salida
	Solucion mejorCamino;//mejor camino...
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), inicial,0); //la lista de casillas que voy pasando
		//más la casilla inicial y la suma de los valores...
		mejorCamino = new Solucion(new LinkedList<>(),0); //camino para llegar a la salida y la suma de valores
		backtracking(e);
		return mejorCamino;
	}
	private void backtracking(Estado e) {
		if(e.casllaAct()==salida) {
			if(e.sumaValores() < mejorCamino.sumaValores()) {
				mejorCamino.camino.clear();
				mejorCamino.addAll(new LinkedList<>(e.caminoAct()));
				mejorCamino.sumaValores = e.sumaValores();
			}
		}
		List<Casilla> casillasHijas = generarHijas(e.casillaAct());//genero hijos que no se vayan
		//de los extremos de la matriz, es decir, que verifique qu estén dentro del casillero
		for(Casilla ca: casillasHijas) {
			if(!e.caminoAct().contains(ca) && puedoIrDesdeCasilla(ca)) {//metodo que verifica si puedo ir desde esa casilla a la siguiente
				//preguntando si tengo derecha izquierda y abajo y arriba
				e.pasarSiguienteCasilla(ca);
				e.agregarVisitado(ca);
				e.sumarValorCasilla(ca.getValor());
				backtracking(e);
				e.quitarVisitada(ca);
				e.restarValorCasilla(ca.getValor());
			}
		}
	}
	
}
