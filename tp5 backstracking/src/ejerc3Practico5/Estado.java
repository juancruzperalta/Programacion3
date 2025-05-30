package ejerc3Practico5;

import java.util.Iterator;
import java.util.List;

public class Estado {

		
	List<Integer> visitadosActual;
	int sumaTotalActual;
	int valorActual;
	public Estado(List<Integer> visitadosActual, int sumaTotalActual, int valorActual) {
		super();
		this.visitadosActual = visitadosActual;
		this.sumaTotalActual = sumaTotalActual;
		this.valorActual = valorActual;
	}
	public List<Integer> getVisitadosActual() {
		return visitadosActual;
	}
	public void setVisitadosActual(List<Integer> visitadosActual) {
		this.visitadosActual = visitadosActual;
	}
	public int getSumaTotalActual() {
		return sumaTotalActual;
	}
	public void setSumaTotalActual(int sumaTotalActual) {
		this.sumaTotalActual = sumaTotalActual;
	}
	public int getValorActual() {
		return valorActual;
	}
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	public void moverSiguienteHijo(int hijoProximo) {
		this.valorActual = hijoProximo;
	}
	public void sumarSiguienteNumero(int valorActual2) {
		this.sumaTotalActual += valorActual2;
	}
	public void avisarQueVisite(Integer hijos) {
		this.visitadosActual.add(hijos);
	}
	public void moverAtrasHijo(int hijoAnterior) {
		this.valorActual = hijoAnterior;
	}
	public void restarNumero(int valorActual2) {
		this.sumaTotalActual -= valorActual2;
	}
	public void avisarQueVolviYDesvisite() {
		this.visitadosActual.remove(visitadosActual.size()-1);
	}
	public boolean yaVisite(int hijoProximo) {
		return this.visitadosActual.contains(hijoProximo);
	}
	
	
}
