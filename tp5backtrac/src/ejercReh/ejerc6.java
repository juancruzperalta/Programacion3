package ejercReh;

public class ejerc6 {
/*Ejercicio 6
 Caballo de Atila. Por donde pisa el caballo de Atila jamás vuelve a crecer el pasto. El caballo fue
 directamente hacia el jardín de n x n casillas. Empezó su paseo por una casilla cualquiera y volvió a
 ella, es decir hizo un recorrido cerrado. No visitó dos veces una misma casilla, se movió de una
 casilla a otra vecina en forma horizontal o vertical, pero nunca en diagonal. Por donde pisó el
 caballo, el pasto jamás volvió a crecer. Luego de terminado el recorrido en algunas casillas todavía
 había pasto (señal de que en ellas no había estado el caballo). Escriba un algoritmo que deduzca el
 recorrido completo que hizo el caballo.
*/
	Casillas[][] jardin;
	Casilla inicioCaballo;
	Solucion caminoCaballo; //Recorrido del caballo, (una lista con las casillas que paso)...
	int pisadasPorDar;
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), inicioCaballo, 0); //una lista para las casillas que va pasando
		//las pisadas qeu va dando...
		caminoCaballo = new Solucion(new LinkedList<>());
		backtracking(e);
		return caminoCaballo;
	}
	private void backtracking(Estado e) {
		if(!noPuedoSeguir()) {
			if(e.esVecina(e.casillaAct, inicioCaballo) && noTengoPisadas()) {
				caminoCaballo.lista.clear();
				caminoCaballo.lista = e.listaPisado();
			}
		}
		List<Casilla> casillasHijas = generarCasillasHijas(e.casillaAct()); //las "casillas" que puedo ir
		for(Casilla c: casillasHijas) {
			if(!e.listaPisado().contains(c)) {
				e.pasarSiguienteCasilla(c);
				e.agregarVisitado(c);
				e.sumarPaso(); //sumo un paso
				backtracking(e);
				e.quitarVisitado(); //la ultima casilla
				e.restarPaso();
			}
		}
	}
}
