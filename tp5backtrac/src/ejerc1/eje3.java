package ejerc1;

import java.util.List;

public class eje3 {
/*Ejercicio 3
 Suma desubconjuntos. Dados n números positivos distintos, se desea encontrar todas las
 combinaciones de esos números tal que la suma sea igual a M.*/
	List<Integer> listaNumeros;
	int M = 10; //ya lo inicio pero esto deberia quedar para que inicie el usuario
	Solucion listaCombinacion; //lista de listas numeros integer...
	
	
	public Solucion bactracking() {
		Estado e = new Estado(new LinkedList<>(), 0); //lista de numeros visitados, suma act...
		listaCombinacion = new Solucion(new LinkedList<>());
		backtracking(e);
		return listaCombinacion;
	}
	private void backtracking(Estado e) {
		if(e.sumaAct()==M) {
			listaCombinacion.listas.add(new LinkedList<>(e.listaAct()));
		}
		for(Integer i: listaNumeros) {
			if(!e.listaAct.contains(i)) {				
			e.agregarVisitado(i);
			e.sumarEseValor(i);
			if(!poda(e)) { //la poda sería si la suma actual  del estado superó a M no sigo de gusto
				backtracking(e);
			}
			e.quitarVisitado();//el ultimo
			e.restarValor(i);//restarlo
			}
		}
	}
}
