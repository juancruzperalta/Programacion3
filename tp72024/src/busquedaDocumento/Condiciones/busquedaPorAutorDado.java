package busquedaDocumento.Condiciones;

import busquedaDocumento.Documento;

public class busquedaPorAutorDado extends Condicion {
	private String autorQueBusco;
	
	public busquedaPorAutorDado(String autorQueBusco) {
		this.autorQueBusco = autorQueBusco;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.tenesElAutor(autorQueBusco);
	}

}
//e) Todos los documentos de un autor determinado.
