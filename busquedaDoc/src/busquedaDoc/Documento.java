package busquedaDoc;

import java.util.ArrayList;

public class Documento {
	private String titulo;
	private ArrayList<String> autores;
	private String contenido;
	private ArrayList<String> palabrasClave;
	
	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
		autores = new ArrayList<>();
		palabrasClave = new ArrayList<>();
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

	public boolean tenesEstaPalabra(String palabraQueBusco) {
		return this.palabrasClave.contains(palabraQueBusco);
	}

	public boolean tenesEsteAutor(String autor) {
		return this.autores.contains(autor);
	}
	
	
}
