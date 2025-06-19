package busquedaDocumento;

import java.util.ArrayList;

public class Documento {
	private String titulo;
	private ArrayList<String> autores;
	private String contenido;
	private ArrayList<String> palabrasClave;
	public Documento(String titulo, String contenido) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
		autores = new ArrayList<>();
		palabrasClave = new ArrayList<>();
	}
	
	public void addAutor(String autor) {
		autores.add(autor);
	}
	public void addPalabraClave(String palabraClave) {
		palabrasClave.add(palabraClave);
	}
	
	public String obtPalabrasClave() {
		String aux="";
		for(String pal: palabrasClave) {
			aux += pal;
		}
		
		return aux;
	}
	public String obtAutor() {
		String aux="";
		for(String aut: autores) {
			aux += aut;
		}
		
		return aux;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public boolean tenesPalabraClave(String palabraClave) {
		return palabrasClave.contains(palabraClave);
	}

	public boolean tenesElAutor(String autorQueBusco) {
		return autores.contains(autorQueBusco);
	}
	
	
	public String toString() {
		return "Titulo"  + "|" +  this.getTitulo() + " " + "Contenido" + "|" + this.getContenido() + " " + "Palabras Clave" + "|" + this.obtPalabrasClave() + " " + "Autores" + "|" + this.obtAutor();
	}
	
	
	
}