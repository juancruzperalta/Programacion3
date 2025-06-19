package PlataformaStreaming;

import java.util.ArrayList;

import PlataformaStreaming.Condicion.Condicion;

public class Plataforma {
	private ArrayList<Pelicula> peliculas;
	private String nombrePlataforma;
	
	public Plataforma(String nombrePlataforma) {
		peliculas =new ArrayList<>();
		this.nombrePlataforma = nombrePlataforma;
	}

	public void addPelicula(Pelicula pp) {
		if(!peliculas.contains(pp)) {
			peliculas.add(pp);
		}
	}
	public ArrayList<Pelicula> buscar(Condicion cond) {
		ArrayList<Pelicula> aux = new ArrayList<>();
		for(Pelicula pel: peliculas) {
			if(cond.buscarCondicion(pel)) {
				aux.add(pel);
			}
		}
		return aux;
	}
	
	public String getNombrePlataforma() {
		return nombrePlataforma;
	}

	public void setNombrePlataforma(String nombrePlataforma) {
		this.nombrePlataforma = nombrePlataforma;
	}
	
	public boolean peliculaRentable(Condicion cond) {
		for(Pelicula pel: peliculas) {
			if(cond.buscarCondicion(pel)) {
				return true;
			}
		}
		return false;
	}
}	
