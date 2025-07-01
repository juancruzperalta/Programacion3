import java.util.*;

package ejerc2;
/* Ejercicio 2
 Problema de la mochila: Se tienen n objetos y una mochila. Para i = 1,2,..n, el objeto i tiene un peso
 positivo pi y un valor positivo vi. La mochila puede llevar un peso que no sobrepase P. El objetivo es
 llenar la mochila de tal manera que se maximice el valor de los objetos transportados, respetando la
 limitación de capacidad impuesta. Los objetos pueden ser fraccionados, si una fracción xi (0 ≤ xi ≤ 1)
 del objeto i es ubicada en la mochila contribuye en xipi al peso total de la mochila y en xivi al valor
 de la carga.
 ¿Qué estrategia Greedy seguiría para resolver el problema? Esquematice la resolución mediante un
 pseudocódigo en Java*/
public class ejerc2Mochila {
	List<Objeto> objetos; //lista de obj con peso y valor
	Mochila mochila; //tiene el peso maximo
	Solucion pesoPuesto; //lista de objs...
	
	public Solucion greedy() {
		Collections.sort(objetos);
		//ordeno de mayor a menor por el peso
		//y también por el valor
		//entonces se ordenaría por la relacion peso valor
		int disponible = mochila.pesoMaximo();
		while(!objetos.isEmpty() && disponible > 0) {
			Objeto primero = seleccionar();//selecciona el primer y mejor obj...
			objetos.remove(0);//el primero... lo quito
			if(primero.getPeso() <= disponible) {
				pesoPuesto.add(primero);
				disponible-=primero.getPeso();
			}else {
				double fraccion = disponible/primero.getPeso();
				double valorFracc = primero.getValor()*fraccion;
				Objeto fracc = new Objeto(fraccion, valorFracc);
				pesoPuesto.add(fracc);
				disponible-=fracc.getPeso();
			}
		}
		if(!pesoPuesto.lista.isEmpty()) {
			return pesoPuesto;
		}
		return null;
	}
}
