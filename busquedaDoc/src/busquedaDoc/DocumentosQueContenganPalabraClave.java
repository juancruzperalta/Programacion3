package busquedaDoc;

public class DocumentosQueContenganPalabraClave implements Condicion{
	private String palabraQueBusco;
	
	public DocumentosQueContenganPalabraClave(String palabraQueBusco) {
		this.palabraQueBusco = palabraQueBusco;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.tenesEstaPalabra(palabraQueBusco);
	}

}
