package busquedaDocumento.Condiciones;

import busquedaDocumento.Documento;

public class busquedaPorPalabraClave extends Condicion {
	private String palabraClave;
	
	public busquedaPorPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.tenesPalabraClave(palabraClave);
	}

}
//c) Todos los documentos que contengan una palabra clave dada.

