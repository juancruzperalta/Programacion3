package busquedaDoc;

public class busquedaPorTitulo implements Condicion {
	private String titulo;
	
	public busquedaPorTitulo(String titulo) {
		this.titulo =titulo;
	}
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public boolean cumple(Documento doc) {
	return	this.getTitulo().equals(doc.getTitulo());
	}

}
