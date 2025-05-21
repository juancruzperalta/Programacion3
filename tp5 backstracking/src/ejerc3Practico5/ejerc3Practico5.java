package ejerc3Practico5;

import java.util.Iterator;
import java.util.List;


import java.util.LinkedList;
public class ejerc3Practico5 {
	List<Integer> conjunto;
	int valorObjetivo;
	Solucion solucionActual;
/*Profe en esta parte habíamos hecho una List<Solucion> lista, entendí por qué hacerlo asi,
 * pero tenía que castear por que me rompía si no al intentar agregar una lista de integer a solucion.
 * O bueno, también podía cambiar todo el Estado para que tenga una lista de solucion y devuelva solucion.
 * 
 */
	public ejerc3Practico5(List<Integer> conjunto, int valorObjetivo, Solucion solucionActual) {
		super();
		this.conjunto = conjunto;
		this.valorObjetivo = valorObjetivo;
		this.solucionActual = solucionActual;
	}
	public void backTracking() {
		solucionActual = new Solucion(new LinkedList<>(), valorObjetivo);
		Estado estadoActual = new Estado(new LinkedList<>(), 0, 0);
		backTracking(estadoActual);
	}
	private void backTracking(Estado e) {
		if(this.valorObjetivo == e.sumaTotalActual) {
				solucionActual.caminoActual.add(new LinkedList<>(e.visitadosActual));
		}else {
			Iterator<Integer> hijos = this.conjunto.iterator();
			while(hijos.hasNext()){	
				int hijoProximo = hijos.next();
				if(!e.yaVisite(hijoProximo)) {	
				e.moverSiguienteHijo(hijoProximo);
				e.sumarSiguienteNumero(hijoProximo);
				e.avisarQueVisite(hijoProximo);
				if(!poda(e))
					backTracking(e);
				e.restarNumero(hijoProximo);
				e.avisarQueVolviYDesvisite();
				}
			}
		}
	}
	
	private boolean poda(Estado e) {
		if(e.getSumaTotalActual() > this.valorObjetivo) {
			return true;
		}
		return false;
	}

	public void imprimirSolucion() {
		for(int i=0; i<solucionActual.caminoActual.size(); i++) {
			System.out.println(solucionActual.caminoActual.get(i));
		}
		System.out.println("Lo que buscamos a sumar ahora es " + solucionActual.getSumaTotalActual());
	}
}
