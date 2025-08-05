package ejerc1;

public class ejerc7 {
/*Ejercicio 7
 Tablero mágico. Dado un tablero de tamaño n x n, construir un algoritmo que ubique (si es posible)
 n*n números naturales diferentes, entre 1 y un cierto k (con k>n*n), de manera tal que la suma de las
 columnas y de las filas sea igual a S*/
	int n=4;
	int m=4;
	int[][] tablero = new int [n][m];
	int k = n*m;
	int S = 125;
	Solucion matrizCompletada;
	public Solucion backtracking() {
		Estado e = new Estado(new int[][], new LinkedList<>(), 0);//la matriz y la suma que voy llevando
		//por cada fila col... tambien la posicion del numero que voy poniendo y una lista con los usados
		matrizCompletada = new Solucion(new int[][]);
		backtracking(e);
		return matrizCompletada;
	}
	private void backtracking(Estado e, int posA, int posB) {
		if(e.estaCompleta()) {//completa la matriz
			if(e.matrizPorFilaColSumaS())//si la matriz en la fila 0, y col 0, suma S,
				//devuelve un true, luego en el for se suma un numero mientras que sea menor al maximo
				//y si la fila 1 y col 1, suma S, también devuelv etrue, todo esto hasta el ultimo fila y col
				matrizCompletada.matriz = e.matrizCompleta();
		}
		for(int i=0; i<k; i++) {
			if(!e.visitado.contains(i)) {
				int posAnterior = posA;
				int posAntB=posB;
				e.agregarElemento(i, posA, posB);//pongo en la matriz ese elemento posA y posB
				e.agregarVisitado(i);
				e.irSumandoElValorS(i);//sumo al int del estado el valor actual, s=1, y así sucesivamente
				//Segun el numero que me llegue
				if(posB == m) {
					posA++;
					posB=0;
				}
				backtracking(e,posA, posB+1);
				e.quitarElemento(i, posAnterior, posAntB);
				e.restarValor(i);
				e.quitarVisitado();//e ultimo
			}
		}
	}
}
