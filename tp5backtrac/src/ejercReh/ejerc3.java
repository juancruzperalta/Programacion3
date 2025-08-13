package ejercReh;

import java.util.List;

public class ejerc3 {
/*Ejercicio 3
 Suma desubconjuntos. Dados n números positivos distintos, se desea encontrar todas las
 combinaciones de esos números tal que la suma sea igual a M.*/
	
	List<Integer> conjuntos;
	int suma = 16;
	List<List<Integer>> combinaciones; //lista de listas de combinaciones, o una clase solucion con esto mismo

	public List<List<Integer>> backtracking(){
		Estado e = new Estado(new LinkedList<>(), 0); //la lista que voy usando y la suma que llevo
		combinaciones = new LinkedList<>();
		backtracking(e);
		return combinaciones;
	}
	private void backtracking(Estado e) {
			if(e.sumaAct()==suma) {
				combinaciones.add(new LinkedList<>(e.listaAct()));
			}
		for(Integer num: conjuntos) {
			if(!e.listaAct().contains(num)) {
				e.sumarNumero(num);
				e.agregarNum(num);
				if(!poda(e)) { //la poda sería si la suma que llevo en el estado sea mayor a la suma 
					//que me pidieron... (e.sumaAct()>this.suma) return false...
					backtracking(e);
				}
				e.restarNumero(num);
				e.quitarListaUltimo(); //saco el ultimo num puesto en la listaAct...
			}
		}
	}
}
