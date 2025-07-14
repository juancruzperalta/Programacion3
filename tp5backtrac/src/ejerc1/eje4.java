package ejerc1;

import java.util.List;

public class eje4 {
/*Ejercicio 4
 Partición de conjunto. Dado un conjunto de n enteros se desea encontrar, si existe, una partición en
 dos subconjuntos disjuntos, tal que la suma de sus elementos sea la misma.*/
	List<Integer> conjuntos;
	Solucion mejorSolucion; //un boolean para la solucion..
	
	
	public Solucion backtracking() {
		Estado e = new Estado(new LinkedList<>(), new LinkedList<>(),0,0)//lista A y lista B, suma A y B..
		mejorSolucion = new Solucion(false); //un booleano para lasolucion..		
		backtracking(e);
		return mejorSolucion;
	}
	private Solucion backtracking(Estado e) {
		if(isEmpty(conjuntos)) {
			if(e.sumaListadoA() == e.sumaListadoB()) {
				mejorSolucion.booleano = true;
				return mejorSolucion;
			}
		}
		int primerValor = this.conjuntos.get(0);
		conjuntos.remove(0);
		for(List primero : e.listadoConjuntos) { //el listadoConjuntos tiene tanto el conjunto A como el B
			//Devuelve ambos...
			if(!primero.contains(primerValor)) {				
			e.agregarElNumero(primero,primerValor);//lo agrego a ListaA por ej
			e.sumarValor(primero, primerValor);//lo sumo al listaA por ejemplo
			backtracking(e);
			e.quitarNumero(primero, primerValor); //quito el numero del listado q lo puse
			e.restarValor(primero, primerValor); //resto el numero del listado que lo puse
			}
		}
		conjuntos.add(primerValor, 0);
	}
}
