package ejerc1;

public class ejerc6 {
/* Caballo de Atila. Por donde pisa el caballo de Atila jamás vuelve a crecer el pasto. El caballo fue
 directamente hacia el jardín de n x n casillas. Empezó su paseo por una casilla cualquiera y volvió a
 ella, es decir hizo un recorrido cerrado. No visitó dos veces una misma casilla, se movió de una
 casilla a otra vecina en forma horizontal o vertical, pero nunca en diagonal. Por donde pisó el
 caballo, el pasto jamás volvió a crecer. Luego de terminado el recorrido en algunas casillas todavía
 había pasto (señal de que en ellas no había estado el caballo). Escriba un algoritmo que deduzca el
 recorrido completo que hizo el caballo*/
	
	Casilla[][] jardin;
	Casilla inicioCaballo;
	Solucion caminoCaballo;
	int pasosLibres;
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), 0, inicioCaballo); //la lista de camino del caballo
		//los pasos que va dando, y por donde arranca el caballo
		caminoCaballo = new Solucion(new LinkedList<>(), 0);//una lista del camino, y la cant de pasos dados
		backtracking(e);
		return caminoCaballo;
	}
	private void backtracking(Estado e) {
		if(e.pasosDados()==pasosLibres) {//me habian pasado los pasosLibres que me faltaban por dar
			//Es decir, los que no estaban pisados por el caballo, tampoco sería tan dificil un metodo
			//que me de esto; un for que recorra y si la casilla fue "pisada" no suma, y si no, suma uno.
			if(esVecinaDelInicio(e.casillaAct, inicioCaballo)) {//sale por la misma que entra.
				//un for que recorre si izq de casillaAct, es inicioCaballo, o derecha.
				caminoCaballo.lista.clear();
				caminoCaballo.lista.addAll(new LinkedList<>(e.caminoCaballo));
				caminoCaballo.pasosDados = e.pasosDados();
			}
		}
		List<Casilla> hijosDeMatriz = generarHijosDesdePrimera(e.casillaAct());//me genera los hijos
		//haciendo un for detectando si esta dentro de la matriz, la unica restricción.
		for(Casilla hija : hijosDeMatriz) {
			if(puedoIrAlgunLado(hija)) {//veo si puedo ir a izq, der, arriba o abajo, según la restricción
				//que tenga el booleano de esa casilla...
				if(!e.caminoCaballo.contains(hija)) {
					e.agregarVisitado(hija);//Agrego al camino del caballo
					e.sumarUnPaso();//sumo un paso
					backtracking(e);
					e.quitarVisitado();//la ultima
					e.restarPaso();//resto uno.
				}
			}
		}
	}
}
