package Parcial1462024.backtracking;

import java.util.List;

public class estadoBacktracking {
	List<String> palabrasVisitadas;
	int cantidadLetras;
	String palabraActual;

	public estadoBacktracking(List<String> palabrasVisitadas, int cantidadLetras, String palabraActual) {
		super();
		this.palabrasVisitadas = palabrasVisitadas;
		this.cantidadLetras = cantidadLetras;
		this.palabraActual = palabraActual;
	}
	public String getPalabraActual() {
		return palabraActual;
	}
	public void setPalabraActual(String palabraActual) {
		this.palabraActual = palabraActual;
	}
	public void setPalabrasVisitadas(List<String> palabrasVisitadas) {
		this.palabrasVisitadas = palabrasVisitadas;
	}
	public List<String> getPalabrasVisitadas() {
		return palabrasVisitadas;
	}
	public int getCantidadLetras() {
		return cantidadLetras;
	}
	public void setCantidadLetras(int cantidadLetras) {
		this.cantidadLetras = cantidadLetras;
	}
	public void avanzarSiguienteLetra(String hija) {
		this.palabraActual = hija;
	}
	public void sumarUnaLetraMas() {
		this.cantidadLetras++;
	}
	public void agregarComoVisitada(String hija) {
		this.palabrasVisitadas.add(hija);
	}
	public void restarUnaLetra() {
		this.cantidadLetras--;
	}
	public void desmarcarVisita() {
		this.palabrasVisitadas.remove(this.palabrasVisitadas.size()-1);
	}
	public boolean yaVisite(String hija) {
		return this.palabrasVisitadas.contains(hija);
	}
	
}
