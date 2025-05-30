package ejerc11Practico5;

import java.util.List;

public class Estado {
	List<Celda> visitadasActuales;
	Celda celdaActual;
	int pasosDadosActual;
	public Estado(List<Celda> visitadasActuales, Celda celdaActual, int pasosDadosActual) {
		super();
		this.visitadasActuales = visitadasActuales;
		this.celdaActual = celdaActual;
		this.pasosDadosActual = pasosDadosActual;
	}
	public List<Celda> getVisitadasActuales() {
		return visitadasActuales;
	}
	public void setVisitadasActuales(List<Celda> visitadasActuales) {
		this.visitadasActuales = visitadasActuales;
	}
	public Celda getCeldaActual() {
		return celdaActual;
	}
	public void setCeldaActual(Celda celdaActual) {
		this.celdaActual = celdaActual;
	}
	public int getPasosDadosActual() {
		return pasosDadosActual;
	}
	public void setPasosDadosActual(int pasosDadosActual) {
		this.pasosDadosActual = pasosDadosActual;
	}
	public void moverCeldaSiguiente(Celda hijo) {
		this.celdaActual = hijo;
	}
	public void sumarUnPasoDado() {
		this.pasosDadosActual++;
	}
	public void ponerComoVisitado(Celda hijo) {
		this.visitadasActuales.add(hijo);
	}
	public void restarPasoDado() {
		this.pasosDadosActual--;
	}
	public void quitarVisitado() {
		this.visitadasActuales.remove(this.visitadasActuales.size()-1);
	}
	public boolean noEsVisitada(Celda hijo) {
		return !this.visitadasActuales.contains(hijo);
	}
	
}
