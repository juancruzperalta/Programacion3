package PlataformaStreaming;

import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String sinopsi;
	private ArrayList<String> generos;
	private String director;
	private ArrayList<String> actores;
	private int anioEstreno;
	private int duracion;
	private int edadMinima;
	
	public Pelicula(String titulo, String sinopsi, String director, int anioEstreno, int duracion, int edadMinima) {
		this.titulo = titulo;
		this.sinopsi = sinopsi;
		this.director = director;
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		generos = new ArrayList<>();
		actores = new ArrayList<>();
	}
	
	public void addGeneros(String gen) {
		if(!generos.contains(gen)) {
			generos.add(gen);
		}
	}
	
	public void addActores(String act) {
		if(!actores.contains(act)) {
			actores.add(act);
		}
	}
	
	public String getGeneros() {
		String aux="";
		for(String gen: generos) {
			aux += gen;
		}
		return aux;
	}
	public boolean tenesEsteGenero(String gen) {
		return generos.contains(gen);
	}
	
	public String getActores() {
		String aux="";
		for(String act: actores) {
			aux += act;
		}
		return aux;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsi() {
		return sinopsi;
	}

	public void setSinopsi(String sinopsi) {
		this.sinopsi = sinopsi;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	public String toString() {
		return "<"+ "-" + this.getTitulo()+ "-" + this.getDirector()+ "-" + this.getDuracion()
		+ "-" + this.getEdadMinima()+ "-" + this.getSinopsi()+ "-" + this.getAnioEstreno()+ "-" +
		this.getGeneros() + "-" + this.getActores()+ "-" +">" + "\n";
	}

	public boolean tenesEsteActor(String actor) {
		return actores.contains(actor);
	}

	
	
	
}