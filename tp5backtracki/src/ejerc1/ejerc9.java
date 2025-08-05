package ejerc1;

public class ejerc9 {
/* Dado un tablero de 4 x 4, en cuyas casillas se encuentran desordenados los números enteros del 1
 al 15 y una casilla desocupada en una posición inicial dada, determinar una secuencia de pasos tal
 intercambiando números contiguos (en horizontal y en vertical) con la casilla desocupada, los
 números en el tablero queden ordenados (como muestra la figura) y la casilla desocupada quede en
 la posición 4,4*/
	int n=4;
	int m=4;
	Casilla[][]tablero = new int[n][m]; //ya nos dan el tablero completo con los numeros desordenados.
	Casilla inicial;
	Solucion casillaCompleta;
	public Solucion backtracking() {
		Estado e = new Estado(new tablero, new LinkedList<>(), new LinkedList<>());//el tablero y la secuencia de pasos.
		//y la lista de casillas que voy
		casillaCompleta = new Solucion(new int[n][m]);
		backtracking(e);
		return casillaCompleta;
	}
	private void backtracking(Estado e, int fila, int col) {
		if(e.casillaAct() == e.tablero[n-1][m-1]) {
			if(e.estaOrdenada()) {
				casillaCompleta.tablero = new LinkedList<>(e.tablero);
			}
		}
		List<Casilla> hijos = generarHijosLista(e.casillaAct());
		//genero una lista con la fila, y ahi voy reemplazando...
		for(Casilla c : hijos) {
			if(!e.listadoActual().contains(c)) {
					String mov = e.intercambiarCasilla(e.casillaAct, c);
					e.agregarPaso(mov);//el intercambio intercambia uan casilla con la otra
					//y devuelve el movimiento hecho, si movio a izq, arriba, o derecha, como string
					//y eso mismo lo agrego al a lista de pasos
					e.agregarVisitado(c);
					backtracking(e);
					e.quitarCasilla();
					e.quitarPaso();
			}
		}
	}
}
