package ejerc1;
/*Trabajo práctico N° 6- Greedy
 Ejercicio 1
 Cambio de monedas: Dado un conjunto C de N tipos de monedas con un número ilimitado de
 ejemplares de cada tipo, se requiere formar, si se puede, una cantidad M empleando el mínimo
 número de ellas.
 Por ejemplo, un cajero automático dispone de billetes de distintos valores: 100$, 25$, 10$, 5$ y 1$,
 si se tiene que pagar 289$, la mejor solución consiste en dar 10 billetes: 2 de 100$, 3 de 25$, 1 de
 10$ y 4 de 1$*/
public class ejerc1billetes {
	List<Integer> conjuntosBilletes;
	int valorABuscar;
	Solucion listaDeBilletesUsados;
	

	public Solucion greedy() {
		Collections.sort(conjuntosBilletes);
		//ordeno de mayor a menor, quedando [100,25,10,5,1]
		int restante = valorABuscar;
		while(!conjuntosBilletes.isEmpty() && restante >=0) {
			int numeroPrimero = conjuntosBilletes.get(0); //el primero
			while(numeroPrimero < restante) {
				listaDeBilletesUsados.add(numeroPrimero);
				restante-=numeroPrimero;
			}
			conjuntosBilletes.remove(0);
		}
		if(!listaDeBilletesUsados.lista.isEmpty()) {
			return listaDeBilletesUsados;
		}
		return null;
	}
}
