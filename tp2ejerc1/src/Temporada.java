package practico2.ejercicio2;

import java.util.ArrayList;

public class Temporada {
	
	ArrayList<Episodio> eps;

	public Temporada() {
		 eps = new ArrayList<Episodio>();
	}
	
	
	public void addEpisodio(Episodio e) {
		eps.add(e);
	}
	
	public int getCantidadEpisodios() {
		return eps.size();
	}
	
	public Episodio getEpisodio(int i) {
		i = i-1;// transformo numero de episodio en posicion en arraylist
		if ((i>=0) && ( i<eps.size())) {
			return eps.get(i);
		}
		
		return null;
	}
	
	public Episodio getEpisodio(String titulo) {
		Episodio ep;
		for(int i= 0; i< eps.size();i++) {
			ep = eps.get(i);
			if (ep.getTitulo().equals(titulo)) {
				return ep;
			}
		}
		return null;
		
	}
	
	public void calificarEpisodio(int nroE, int calif) {
		Episodio ep = this.getEpisodio(nroE);
		if (ep!=null)
			ep.setCalificacion(calif);
	}
	
	public int getCantidadEpisodiosVistos() {
		int suma =0;
		for(int i=0; i<eps.size();i++) {
			Episodio ep = eps.get(i);
			if (ep.seVio())
				suma++;
		}
		return suma;
	}
	
	public double getPromedio() {
		double suma =0;
		for(int i=0; i<eps.size();i++) {
			Episodio ep = eps.get(i);
			if (ep.seVio())
				suma=suma + ep.getCalificacion();
		}
		return suma/this.getCantidadEpisodios();
	}

}
