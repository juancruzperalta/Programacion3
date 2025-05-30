package ejerc4Practico5;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
public class ejerc4Practico5 {
	List<Integer> conjuntos;
	Solucion soluciones;
	//Este me trabe y me falta seguir...
	public ejerc4Practico5(List<Integer> conjuntos) {
		super();
		this.conjuntos = conjuntos;
	}
	public void BackTracking() {
		Estado e = new Estado(0, 0, 0, 0, new LinkedList<>(), new LinkedList<>());
		soluciones = new Solucion(new LinkedList<>());
		BackTracking(e);
	}
	private void BackTracking(Estado e) {
		if(e.valorActualA == this.conjuntos.size() || e.valorActualB == this.conjuntos.size()) {
			if(e.sumaTotalActualA == e.sumaTotalActualB) {
				soluciones.caminoSolucionActual.add(new LinkedList<>(e.subConjuntoA));
			}
		}else {
			for(int i=0; i<this.conjuntos.size(); i++) {
				int hijoA = this.conjuntos.get(i);
				e.pasarAlSiguienteHijo(hijoA);
				e.sumarValorHijo(hijoA);
				e.agregarVisitado(hijoA);
				//if(!poda(e))
					BackTracking(e);
				e.restarValorHijo(hijoA);
				e.desmarcarVisita();
				//Hijo subconjunto B
				int hijoB = this.conjuntos.get(i+1);
				e.pasarAlSiguienteHijoB(hijoB);
				e.sumarValorHijoB(hijoB);
				e.agregarVisitadoB(hijoB);
				//if(!poda(e))
					BackTracking(e);
				e.restarValorHijoB(hijoB);
				e.desmarcarVisitaB();
				
			}
		}
	}
	
	public void imprimirSolucion() {
		for(int i=0; i<soluciones.caminoSolucionActual.size(); i++) {
			System.out.println(soluciones.caminoSolucionActual.get(i));
		}
	}
}
