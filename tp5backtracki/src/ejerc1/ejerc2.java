package ejerc1;

public class ejerc2 {
/*Ejercicio 2
 Dado un laberinto consistente en una matriz cuadrada que tiene en cada posición un valor natural y
 cuatro valores booleanos, indicando estos últimos si desde esa casilla se puede ir al norte, este, sur
 y oeste, encontrar un camino de longitud mínima entre dos casillas dadas, siendo la longitud de un
 camino la suma de los valores naturales de las casillas por las que pasa. Idea: podría representarse
 el laberinto como una matriz, de objetos, donde cada objeto tiene el valor natural, y cuatro
 booleanos, uno para cada dirección a la que se permite ir desde allí*/
	Casilla[][] laberinto; //trae 4 booleanos la casilla, norte sur este y oeste.
	Casilla inicial, salida; //"dos casillas dadas"
	Solucion caminoCasillas; //una lista de las casillas que voy pasando
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), inicial, 0); //lista de casillas 
		//también la casilla inicial actual, y después los valores..
		caminoCasillas = new Solucion(new LinkedList<>(),0);//lista de camino, y el valor que hizo
		backtracking(e);
		return caminoCasillas;
	}
	private void backtracking(Estado e) {
		if(e.casillaActual()==salida) {
			if(e.valorNaturalTotal() < caminoCasillas.valor() || caminoCasillas==null) {
				caminoCasillas.valor= e.valorNaturalTotal;
				caminoCasillas.lista.clear();
				caminoCasillas.lista.add(e.caminoCasilla);
			}
		}
		List<Integer> casillasHijas = generarHijasCasillas(e.casillaActual());//genero los hijos
		//con la casilla actual, veo si puedo ir a izq, der, arriba o abajo...
		for(Casilla c: casillasHijas) {
			if(!e.caminoCasilla.contains(c)) {
				e.avanzarCasilla(c);//Avanzo la actual a la sig.
				e.agregarVisitada(c); //agrego a la lista de casillas
				e.sumarValorCasilla(c.getValor());
				if(!poda(e))//la poda sería que si la suma que llevo actual del estado, es mayor a la de la
					//solucion, ya no sigo alpedo...
				backtracking(e);
				e.quitarCasilla(c); //quito de la lista.
				e.restarValorCasilla(c.getValor());
			}
		}
	}
}
