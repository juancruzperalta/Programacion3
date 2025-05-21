package ejerc3Practico5;

import java.util.List;

public class Solucion {

	List<List<Integer>> caminoActual;
	int sumaTotalActual;

	
	public Solucion(List<List<Integer>> caminoActual, int sumaTotalActual) {
		super();
		this.caminoActual = caminoActual;
		this.sumaTotalActual = sumaTotalActual;
	}
	public List<List<Integer>> getCaminoActual() {
		return caminoActual;
	}
	public void setCaminoActual(List<List<Integer>> caminoActual) {
		this.caminoActual = caminoActual;
	}
	public int getSumaTotalActual() {
		return sumaTotalActual;
	}
	public void setSumaTotalActual(int sumaTotalActual) {
		this.sumaTotalActual = sumaTotalActual;
	}
	
	
}
