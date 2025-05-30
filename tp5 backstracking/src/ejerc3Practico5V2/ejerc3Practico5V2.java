package ejerc3Practico5V2;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
public class ejerc3Practico5V2 {
/*Enunciado:
Dado un conjunto de números positivos,
 encontrar todas las combinaciones cuya multiplicación sea igual a un valor objetivo.
 conjunto = [2, 3, 4, 6]  
objetivo = 12
Combinaciones posibles:

[2, 6]

[3, 4]*/
	List<Integer> conjuntos;
	int valorObjetivo;
	Solucion solucionActual;
	public ejerc3Practico5V2(List<Integer> conjuntos, int valorObjetivo) {
		super();
		this.conjuntos = conjuntos;
		this.valorObjetivo = valorObjetivo;
	}
	public void backTracking() {
		solucionActual = new Solucion(new LinkedList<>());
		Estado estadoActual = new Estado(new LinkedList<>(), 0,0);
		backTracking(estadoActual);
	}
	private void backTracking(Estado e) {
		if(e.getSumaDeLosValores()==this.valorObjetivo) {
			solucionActual.valoresSolucion.add(new LinkedList<>(e.ListaVisitados));
		}else {
			Iterator<Integer> hijos = this.conjuntos.iterator();
			while(hijos.hasNext()) {
				int hijoProximo = hijos.next();
				int hijoAnterior = e.valorActual;
				if(!e.yaVisite(hijoProximo)) {
					e.visitarElSiguiente(hijoProximo);
					e.multiplicarValor(hijoAnterior, hijoProximo);
					e.marcarVisitado(hijoProximo);
					if(!poda(e))
						backTracking(e);
					e.volverAlAnterior(hijoAnterior);
					e.desMultiplicarValor(hijoAnterior, hijoProximo);
					e.desmarcarVisitado(hijoProximo);
				}
			}
		}
	}
	private boolean poda(Estado e) {
		if(e.getSumaDeLosValores() > this.valorObjetivo) {
			return true;
		}
		return false;
		
	}

	public void imprimirEstado() {
		for(int i=0; i<solucionActual.valoresSolucion.size();i++) {
			System.out.println(solucionActual.valoresSolucion.get(i));
		}
	}
}
