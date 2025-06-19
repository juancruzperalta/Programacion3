package busquedaDocumento.Condiciones;

import busquedaDocumento.Documento;

public class busquedaPorTitulo extends Condicion{
	private String titulo;
	
	public busquedaPorTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().equals(titulo);
	}
	
}
//Todos los documentos cuyo título sea exactamente igual a un título dado.
