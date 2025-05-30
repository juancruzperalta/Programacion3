package ejerc1Practico6;

import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class ejerc1Practico6 {
	List<Integer> conjuntos; //Conjunto de numeros, ej: 100$, 25$, 10$, 5$, y 1$
	int valorABuscar;//Valor máximo que me tienen que dar, acá: 289$
	Solucion mejorSolucion; //Mejor solucion según greedy
	public ejerc1Practico6(List<Integer> conjuntos, int valorABuscar) {
		super();
		this.conjuntos = conjuntos;
		this.valorABuscar = valorABuscar;
		mejorSolucion = new Solucion(new LinkedList<>());
	}
	
	public Solucion greedy(){
		//Ordenarlos!!!!!
		Collections.sort(conjuntos, Collections.reverseOrder());
		int valorRestante = valorABuscar;
		while(valorRestante > 0) {
				int valorMejorAElegir = seleccionarMejorValor(conjuntos,valorRestante);
				while(valorMejorAElegir <= valorRestante) {
					valorRestante-=valorMejorAElegir;
					mejorSolucion.caminoMejor.add(valorMejorAElegir);
			}
		}
		if(valorRestante==0) {
			return mejorSolucion;
		}
		return this.mejorSolucion;
	}

	private int seleccionarMejorValor(List<Integer> conjuntos, int valorRestante) {
		for(Integer valor: conjuntos) {
			if(valor <= valorRestante) {
				return valor;
			}
		}
		return 0;
	}
	public void imprimirResultado() {
		for(int i=0; i<mejorSolucion.caminoMejor.size(); i++) {
			System.out.println(mejorSolucion.caminoMejor.get(i));
		}
		if(mejorSolucion.caminoMejor.isEmpty())
		System.out.println("No hay solución");
	}
	
}
