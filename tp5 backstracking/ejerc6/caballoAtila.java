package ejerc6;

public class caballoAtila {
	Casilla[][]jardin; //Tiene las pisadas ya...
	Casilla inicialCaballo;
	Solucion caminoDelCaballo; //Lista con el camino que hizo el caballo
	int pisadasFaltantes; //son las pisadas que me quedan por dar, es decir, sería toda la matriz
	//completa, pero si estan ya iniciadas, debería poner menos cantidad.
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), 0, inicialCaballo); //lista de camino, pisadas iniciales, casilla act...
		caminoDelCaballo = new Solucion(new LinkedList<>());
		backtracking(e);
		return caminoDelCaballo;
	}
	private void backtracking(Estado e) {
		if(!e.noHayMovimientos()) { //es cuándo ya haya recorrido todo el espacio del jardin
			//o, no pueda ir ni a izq ni a der ni arriba ni abajo
			if(e.esVecina(this.inicialCaballo, e.casillaAct) && e.pisadasAct()==pisadasFaltantes) {
				caminoDelCaballo.clear();
				caminoDelCaballo.addAll(new LinkedList<>(e.caminoActual()));
			}
		}else {
			List<Casilla> casillasHijas = generarHijosDeCasillas(e.casillaAct());
					//este metodo lo único que hará es controlar que pueda ir a esa casilla
					//es decir, que este dentro del cuadrante y no se salga de la matriz
				for(Casilla c: casillasHijas) {
					if(!e.caminoActual().contains(c)) {//si no pasé por esa.
						e.avanzarCasilla(c);//avanzo la casillaAct a esa
						e.marcarVisitada(c);//marco como visitada
						e.sumarPisada(); //una pisada más
						backtracking(e);
						e.quitarVisitada();//la ultima casilla;
						e.restarPisada();
					}
				}
					
		}
	}
}
