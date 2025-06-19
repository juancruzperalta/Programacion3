package busquedaDocumento.Condiciones;

import busquedaDocumento.Documento;

public class busquedaPorTituloOFrase extends Condicion {
	private String titulo;
	
	public busquedaPorTituloOFrase(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().contains(titulo);
	}

}
//b) Todos los documentos cuyo título contenga una palabra o frase dada.
