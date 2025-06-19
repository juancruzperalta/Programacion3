package SitioWebNoticias;

import java.util.ArrayList;

public class Noticia {
	private String titulo;
	private ArrayList<String> palabrasClave;
	private String introduccion;
	private String texto;
	private String autor;
	private Categoria contenidoAsociado;
	public Noticia(String titulo,String introduccion, String texto, String autor,
			Categoria contenidoAsociado) {
		super();
		this.titulo = titulo;
		this.introduccion = introduccion;
		this.texto = texto;
		this.autor = autor;
		this.contenidoAsociado = contenidoAsociado;
		palabrasClave = new ArrayList<>();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIntroduccion() {
		return introduccion;
	}
	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Categoria getContenidoAsociado() {
		return contenidoAsociado;
	}
	public void setContenidoAsociado(Categoria contenidoAsociado) {
		this.contenidoAsociado = contenidoAsociado;
	}
	
	public void addPalabraClave(String pp) {
		if(!palabrasClave.contains(pp)) {
			palabrasClave.add(pp);
		}
	}
	public boolean tenesPalabra(String palabraClave) {
		return palabrasClave.contains(palabraClave);
	}
	
	public String toString() {
		return this.getAutor() + this.getIntroduccion() + this.getTexto() + this.getTitulo();
		}
	
}
