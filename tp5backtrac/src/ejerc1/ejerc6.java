package ejerc1;

public class ejerc6 {
/* Ejercicio 6
 Caballo de Atila. Por donde pisa el caballo de Atila jamás vuelve a crecer el pasto. El caballo fue
 directamente hacia el jardín de n x n casillas. Empezó su paseo por una casilla cualquiera y volvió a
 ella, es decir hizo un recorrido cerrado. No visitó dos veces una misma casilla, se movió de una
 casilla a otra vecina en forma horizontal o vertical, pero nunca en diagonal. Por donde pisó el
 caballo, el pasto jamás volvió a crecer. Luego de terminado el recorrido en algunas casillas todavía
 había pasto (señal de que en ellas no había estado el caballo). Escriba un algoritmo que deduzca el
 recorrido completo que hizo el caballo*/
	Casilla[][] jardin;//ya viene marcado el pasto pisado.
	Casilla posInicialCaballo;
	Solucion caminoQueHizoCaballo;
	int pisadasRestantes; //pisadas que nos restan por dar en el jardin(sin contar el pasto pisado)
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), posInicialCaballo, 0);//una lista de casillas
		//por las que voy pasando...
		caminoQueHizoCaballo = new Solucion(new LinkedList<>());//una lista de casillas por las que pasé
		backtracking(e);
		return caminoQueHizoCaballo;
	}
	private void backtracking(Estado e) {
		if(e.pisadasQueVoy()==pisadasRestantes()) {
			if(esVecinaDe(e.posActual(), posInicialCaballo))//el metodo esVecina lo unico que hará es
				//ve por izq,der,arriba, o abajo de la posActual si es la posInicialCaballo, 
				caminoQueHizoCaballo.add(new LinkedList<>(e.caminoHecho()));
		}
		List<Casilla> hijos = generarHijos(e.posActual()); //genero los hijos qeu vendría siendo;
		//reviso que no se salga de los parámetros adécuados.
		for(Casilla ca : hijos) {
			if(puedoIrHaciaElla(e.posActual(), ca)) {//pregunto si puedo ir desde la posicion actual
				//a la casilla, es decir; ver si puedo ir por izq, der, arriba o abajo
				if(!e.caminoHecho.contains(ca)) {
					Casilla casillaAnterior = e.posActual();
					e.agregarAlCaminoLaCasilla(ca);
					e.moverALaCasilla(ca); //de la pos actual a la casilla nueva
					backtracking(e);
					e.quitarDelCamino();//la ultima
					e.volverCasillaAnterior(casillaAnterior);
				}
			}
		}
	}
	
}
