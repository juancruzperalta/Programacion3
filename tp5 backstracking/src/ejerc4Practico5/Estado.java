package ejerc4Practico5;

import java.util.List;

public class Estado {
	int valorActualA;
	int valorActualB;
	int sumaTotalActualA;
	int sumaTotalActualB;
	List<Integer> subConjuntoA;
	List<Integer> subConjuntoB;

	public Estado(int valorActualA, int valorActualB, int sumaTotalActualA, int sumaTotalActualB,
			List<Integer> subConjuntoA, List<Integer> subConjuntoB) {
		super();
		this.valorActualA = valorActualA;
		this.valorActualB = valorActualB;
		this.sumaTotalActualA = sumaTotalActualA;
		this.sumaTotalActualB = sumaTotalActualB;
		this.subConjuntoA = subConjuntoA;
		this.subConjuntoB = subConjuntoB;
	}
	public void pasarAlSiguienteHijo(int hijoA) {
		this.valorActualA = hijoA;
	}
	public void sumarValorHijo(int hijoA) {
		this.sumaTotalActualA+=hijoA;
	}
	public void agregarVisitado(int hijoA) {
		this.subConjuntoA.add(hijoA);
	}
	public void restarValorHijo(int hijoA) {
		this.valorActualA-=hijoA;
		
	}
	public void desmarcarVisita() {
		this.subConjuntoA.remove(this.subConjuntoA.size()-1);
	}
	public void pasarAlSiguienteHijoB(int hijoB) {
		this.valorActualB=hijoB;
	}
	public void sumarValorHijoB(int hijoB) {
		this.sumaTotalActualB+=hijoB;
	}
	public void agregarVisitadoB(int hijoB) {
		this.subConjuntoB.add(hijoB);
	}
	public void restarValorHijoB(int hijoB) {
		this.sumaTotalActualB-=hijoB;
	}
	public void desmarcarVisitaB() {
		this.subConjuntoB.remove(this.subConjuntoB.size()-1);
	}
	
	
	
}
