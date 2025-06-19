package CandyCrush;

import java.util.ArrayList;

import CandyCrush.Condiciones.Condicion;

public class Tablero {
	private int puntajeMin;
	private int nivel;
	private ArrayList<Ficha> fichas;
	private int limiteNivel;
	public Tablero(int puntajeMin, int limiteNivel) {
		super();
		this.puntajeMin = puntajeMin;
		this.nivel = 1;
		this.limiteNivel = limiteNivel;
		fichas = new ArrayList<>();
	}
	
	public void addFichas(Ficha ff) {
		this.fichas.add(ff);
	}
	
	public int getPuntajeMin() {
		return puntajeMin;
	}
	public void setPuntajeMin(int puntajeMin) {
		this.puntajeMin = puntajeMin;
	}
	public int getNivel() {
		return nivel;
	}
	
	public void setNivel() {
		if(this.getPuntajeMin() > limiteNivel) {
			this.nivel++;
		}
	}
	
	public int getDificultad() {
		int suma=0;
		for(Ficha f: fichas) {
			suma += f.getFortaleza()/f.getPoderDestruccion();
		}
		return suma;
	}
	
	public ArrayList<Ficha> buscarFicha(Condicion cond){
		ArrayList<Ficha> aux = new ArrayList<>();
		for(Ficha ff: fichas) {
			if(cond.cumple(ff)) {
				aux.add(ff);
			}
		}
		return aux;
		
	}
	
	
	
}
