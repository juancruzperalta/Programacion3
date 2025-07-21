package ejerc2;

public class Laberinto {
	Casilla[][]laberinto; //Un laberinto que nos dan ya hecho con casillas dentro (una matiz)
	Casilla inicio;
	Casilla salida;
	Solucion mejorCamino; //tiene el laberinto(una matriz con los elementos), y una suma de 
						//de el camino.
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), int suma, Casilla act)
				//camino actual, y la suma de las casillas, casilla act
		mejorCamino = new Solucion(new LinkedList<>(), 0);//el camino y los valores que tiene hasta ahora
		backtracking(e);
		return mejorcamino;
					
	}
	private void backtracking(Estado e) {
		if(e.casillaAct()==this.salida) {
			if(e.sumaAct() <= mejorCamino.sumaCaminos()) {
				mejorCamino.matriz = e.matriz;
				mejorCamino.sumaCaminos = e.sumaAct;
			}
		}else {
			List<Casilla> hijos = generarHijos(e.casillaAct());
			//Genero los hijos con la condición de saber si: puedo ir a izq, der, abajo o arriba
			//De la casilla actual veo si puedo ira izq der abajo o arriba
			for(Casilla h: hijos) {
				if(!e.caminoAct().contains(h)) {
					e.agregarCasilla(h)//Agrego la casilla al camino act.
					e.sumarValorCasilla(h.getValor())//tomo el valor de la casilla act y sumo
					if(poda(e)) { //la poda sería que si la suma del estado actual
						//supero a la suma de la soluci´n, ya no sigo buscando por que se pasó.
						backtracking(e);
					}
					e.quitarCasilla()//quito la ultima casilla del camino
					e.restarValor(h.getValor())//resto el valor.
				}
			}
		}
	}
	
}
