package practico2.ejercicio2;

import java.util.ArrayList;

public class Serie {
 /*
  * as series poseen como atributos (además de los episodios
  *  correspondientes) un título,
una descripción, un creador y un género
  */
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	
	private ArrayList<Temporada> temps;

	public Serie(String titulo, String descripcion, String creador, String genero) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		temps = new ArrayList<Temporada>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public void addTemporada(Temporada tt) {
		temps.add(tt);
	}
	
	public Temporada getTemporada(int nroTemp) {
		nroTemp = nroTemp-1;// transformo numero de Temporada en posicion en arraylist
		if ((nroTemp>=0) && ( nroTemp<temps.size())) {
			return temps.get(nroTemp);
		}
		
		return null;
	}
	
	public Episodio getEpisodio(int nroTemp, int nroEpi) {
		Temporada pedida = this.getTemporada(nroTemp);
		if (pedida!=null) {
		  return pedida.getEpisodio(nroEpi);
		} else {
		   return null;
		}
	}
	
	public Episodio getEpisodio(String titulo) {
		
		for(int i = 0; i<temps.size();i++) {
			Temporada ti = temps.get(i);
			Episodio epTi = ti.getEpisodio(titulo);
			if (epTi !=null) {
				return epTi;
			}
		}
		return null;
	}
	
	
	public void calificarEpisodio(int nroTem, int nroE, int calif) {
		Temporada te = this.getTemporada(nroTem);
		if (te!=null) {
			te.calificarEpisodio(nroE, calif);
		}
	}
	
	public int getCantidadEpisodiosVistos() {
		int suma =0;
		for(int i=0; i<temps.size();i++) {
			Temporada temp = temps.get(i);
			suma = suma + temp.getCantidadEpisodiosVistos();
		}
		return suma;
	}
	
	public int getCantidadEpisodios() {
		int suma =0;
		for(int i=0; i<temps.size();i++) {
			Temporada temp = temps.get(i);
			suma = suma + temp.getCantidadEpisodios();
		}
		return suma;
	}
	
	public boolean todosVistos() {
		return this.getCantidadEpisodiosVistos() == this.getCantidadEpisodios();
	}
	
	
	public double getPromedio() {
		double suma =0;
		int contador =0;
		for(int i=0; i<temps.size();i++) {
			Temporada temp = temps.get(i);
			double valor = temp.getPromedio();
			if (valor>0) {
				suma = suma + valor;
				contador++;
			}	
		}
		return suma/contador;
	}
}
