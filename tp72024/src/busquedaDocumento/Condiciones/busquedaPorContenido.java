package busquedaDocumento.Condiciones;

import busquedaDocumento.Documento;

public class busquedaPorContenido extends Condicion {
	private String contenidoQueBusco;
	
	public busquedaPorContenido(String contenidoQueBusco) {
		this.contenidoQueBusco = contenidoQueBusco;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getContenido().contains(contenidoQueBusco);
	}

}
//f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
