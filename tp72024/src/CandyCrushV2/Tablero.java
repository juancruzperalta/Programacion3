package CandyCrushV2;

import java.util.ArrayList;

import CandyCrushV2.Condiciones.Condicion;

public class Tablero {
	private int puntajeMinimo;
	private ArrayList<Ficha> fichas;
	private int dificultad;
	public Tablero(int puntajeMinimo) {
		super();
		this.puntajeMinimo = puntajeMinimo;
		fichas = new ArrayList<>();
		this.dificultad = 0;
	}
	public void addFicha(Ficha ff) {
		if(!fichas.contains(ff)) {
			this.fichas.add(ff);
		}
	}
	public ArrayList<Ficha> obtenerFichas(){
		ArrayList<Ficha> copia = new ArrayList<>(fichas);
		return copia;
	}
	
	public int getPuntajeMinimo() {
		return puntajeMinimo;
	}
	public void setPuntajeMinimo(int puntajeMinimo) {
		this.puntajeMinimo = puntajeMinimo;
	}
	public int getDificultad() {
		int sumatoriaFortaleza=0;
		int sumaDestruc=0;
		for(Ficha ff: fichas) {
			sumatoriaFortaleza += ff.getFortaleza();
			sumaDestruc+= ff.getPoderDestrucción();
		}
		return sumatoriaFortaleza/sumaDestruc;
	}
	
	public ArrayList<Ficha> buscar(Condicion cond){
		ArrayList<Ficha> aux = new ArrayList<>();
			for(Ficha ff: fichas) {
				if(cond.buscar(ff)) {
					aux.add(ff);
				}
			}
			return aux;
		
	}

	
	
}
