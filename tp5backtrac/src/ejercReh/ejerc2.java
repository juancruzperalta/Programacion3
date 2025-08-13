package ejercReh;

public class ejerc2 {
/* Ejercicio 2
 Dado un laberinto consistente en una matriz cuadrada que tiene en cada posición un valor natural y
 cuatro valores booleanos, indicando estos últimos si desde esa casilla se puede ir al norte, este, sur
 y oeste, encontrar un camino de longitud mínima entre dos casillas dadas, siendo la longitud de un
 camino la suma de los valores naturales de las casillas por las que pasa. Idea: podría representarse
 el laberinto como una matriz, de objetos, donde cada objeto tiene el valor natural, y cuatro
 booleanos, uno para cada dirección a la que se permite ir desde allí.*/
	
	Celda[][] laberinto; //Trae ya una valor natura y los cuatro booleans...
	Celda inicio, fin; //Vienen en el constructor
	Solucion caminoMinimo; //una lista de enteros del caminoMinimo... y una suma de pasos...
	
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), inicio, 0);//llevo una lista del camino que hice...
		//más la suma de pasos que voy haciendo.
		caminoMinimo = new Soluion(new LinkedList<>(),0);
		backtracking(e);
		return caminoMinimo;
	}
	private void backtracking(Estado e) {
		if(e.salaAct() == this.fin) {
				if( caminoMinimo.lista==null || caminoMinimo.pasosDados()  > e.pasosDados()) {
					caminoMinimo.lista.clear();
					caminoMinimo.pasosDados = e.pasosDados();
					caminoMinimo.lista = e.listaAct();
				}
			}
		}
		List<Celda> celdasHijas = generarCeldasSiguientes(e.celdaAct()); //genero las celdas mientras que esten
		//dentro de la matriz...
		for(Celda c: celdasHijas) {
			if(puedoIrSiguiente(c,e.celdaAct())) {//un metodoque si desde la actual puedo ir a esa siguiente...
				if(!e.listaAct().contains(c)) {
					e.pasarSiguienteCelda(c);
					e.agregarListaCelda(c);
					e.sumarPaso(c.getValor()); //sumo un paso...
					if(!poda(e)) { //la poda sería, si la suma de pasos act,
						//es mayor a la sumade pasos que habia en la solucion...no sigo
						backtracking(e);
					}
					e.quitarLista();//la ultima...
					e.restarPaso(c.getValor()); //resto el paso de la celda nuevametne "backtracking"
				}
			}
		}
	}
}
