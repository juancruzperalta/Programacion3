package ejerc2Practico5;

import java.util.LinkedList;
import java.util.List;

public class Estado {
	List<Casilla> visitados = new LinkedList<>();
	Casilla casillaActual; //PosActual
	int valorActual; //Valor actual
	int valorTotalSuma;
	public Estado(List<Casilla> visitados, Casilla casillaActual, int valorActual, int valorTotalSuma) {
		super();
		this.visitados = visitados;
		this.casillaActual = casillaActual;
		this.valorActual = valorActual;
		this.valorTotalSuma = valorTotalSuma;
	}
	public List<Casilla> getVisitados() {
		return visitados;
	}
	public void setVisitados(List<Casilla> visitados) {
		this.visitados = visitados;
	}
	public Casilla getCasillaActual() {
		return casillaActual;
	}
	public void setCasillaActual(Casilla casillaActual) {
		this.casillaActual = casillaActual;
	}
	public int getValorActual() {
		return valorActual;
	}
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	public int getValorTotalSuma() {
		return valorTotalSuma;
	}
	public void setValorTotalSuma(int valorTotalSuma) {
		this.valorTotalSuma = valorTotalSuma;
	}
	public void aplicarMovimiento(Casilla hijo) {
		this.casillaActual = hijo;
	}
	public void sumarValorActual(int posValor) {
		this.valorTotalSuma+=posValor;
	}
	public void agregarComoVisitado(Casilla hijo) {
		this.visitados.add(hijo);
	}
	public void desHacerMovimiento(Casilla hijoAnterior) {
		this.casillaActual = hijoAnterior;
	}
	public void restarValorActual(int posValor) {
		this.valorTotalSuma-=posValor;
	}
	public void desHacerComoVisitado() {
		this.visitados.remove(visitados.size()-1);
	}
	
	
}
