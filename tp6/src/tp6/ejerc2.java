package tp6;

import java.util.Collections;

public class ejerc2 {
/* Ejercicio 2
 Problema de la mochila: Se tienen n objetos y una mochila. Para i = 1,2,..n, el objeto i tiene un peso
 positivo pi y un valor positivo vi. La mochila puede llevar un peso que no sobrepase P. El objetivo es
 llenar la mochila de tal manera que se maximice el valor de los objetos transportados, respetando la
 limitación de capacidad impuesta. Los objetos pueden ser fraccionados, si una fracción xi (0 ≤ xi ≤ 1)
 del objeto i es ubicada en la mochila contribuye en xipi al peso total de la mochila y en xivi al valor
 de la carga.
 ¿Qué estrategia Greedy seguiría para resolver el problema? Esquematice la resolución mediante un
 pseudocódigo en Java.*/
	
	Mochila m; //peso maximo
	List<Objeto> n; //peso positivo pi y valor vi
	List<Objeto> solucion;
	
	public List<Objeto> greedy(){
		//maximizar los objetos, osea que es, ordenar de mayor a menor pero por PESO/VALOR.
		Collections.sort(n);
		int pesoDisponible = m.pesoMaximo();
		while(!n.isEmpty() && pesoDisponible >=0) {
			Objeto primero = n.get(0);
			if(primero.getPeso()-pesoDisponible >= 0) {
				pesoDisponible-=primero.getPeso();
				solucion.add(primero);
			}else {
				double fraccion = pesoDisponible/primero.getPeso();
				double valorFracc = primero.getValor()/fraccion;
				Objeto fracc = new Objeto(fraccion, valorFracc);
				solucion.add(fracc);
				pesoDisponible-=fraccion;
			}
			n.remove(0);
		}
	}
}
