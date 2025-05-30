package ejerc11Practico5;

import java.util.List;

public class Solucion {
	List<Celda> caminoCorto;
	int pasosDadosMasCortos;
	public Solucion(List<Celda> caminoCorto, int pasosDadosMasCortos) {
		super();
		this.caminoCorto = caminoCorto;
		this.pasosDadosMasCortos = pasosDadosMasCortos;
	}
	public List<Celda> getCaminoMasCorto() {
		return caminoCorto;
	}
	public void setCaminoMasCorto(List<Celda> caminoCorto) {
		this.caminoCorto = caminoCorto;
	}
	public int getPasosDadosMasCortos() {
		return pasosDadosMasCortos;
	}
	public void setPasosDadosMasCortos(int pasosDadosMasCortos) {
		this.pasosDadosMasCortos = pasosDadosMasCortos;
	}
	
	
}
