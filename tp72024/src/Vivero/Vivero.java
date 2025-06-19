package Vivero;

import java.util.ArrayList;

import Vivero.Condiciones.Condicion;


public class Vivero {
	private ArrayList<Planta> plantas;
	
	public Vivero() {
		plantas = new ArrayList<>();
	}
	
	public void addPlanta(Planta pp) {
		this.plantas.add(pp);
	}
	
	public ArrayList<Planta> buscarPlanta(Condicion cond) {
		ArrayList<Planta> aux = new ArrayList<>();
			for(Planta pp: plantas) {
			if(cond.filtrar(pp)) {
				aux.add(pp);
			}
		}
			return aux;
	}
	
	
}
