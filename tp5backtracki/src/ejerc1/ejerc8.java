package ejerc1;

public class ejerc8 {
	/* Colocar un entero positivo (menor que un cierto valor entero k dado) en cada casilla de una
 pirámide de base B (valor entero dado) de modo que cada número sea igual a la suma de las
 casillas sobre las que está apoyado. Los números de todas las casillas deben ser diferentes*/
	
	int B=3;
	int[][] piramide = new int[B][];
	int k = 15;
	Solucion piramideCompleta; //una piramide completa.
	
	public Solucion backtracking() {
		Estado e = new Estado(piramide, new LinkedList<>(), 0, 0);//una lista que sería la fila que va sumando
		//con el valor que lleva de suma, y la piramide vacia. y la suma anterior
		piramideCompleta = new Solucion(new int[B][]);
		backtracking(e);
		return piramideCompleta;
	}
	private void backtracking(Estado e, int fila, int col) {
		if(e.piramide.estaCompleta()) { //recorre todas el tamaño y ve si tiene elementos, devuelve true
			piramideCompleta.piramide.clear();
			piramideCompleta.piramide = e.piramide;//la copio basicamente
		}
		for(int i=1; i<k; i++) {
			if(!e.listaAct().contains(i)) {
				e.agregarVisitado(i); //Agrego a la fila
				int filaAnt=fila;
				int colAnt = col;
				piramide[fila][col]=i;
				if(fila+1<B) {
				if(piramide[fila + 1][col] + piramide[fila + 1][col + 1]!=piramide[fila][col]) {	
					e.quitarVisita();//el utimo
				}
				}
				if(col+1 > fila) {
					fila++;
					col=0;
				}
				backtracking(e, fila, col);
				piramide[filaAnt][colAnt]=0;
				e.quitarVisita();//el ultimo
			}
		}
	}
}
