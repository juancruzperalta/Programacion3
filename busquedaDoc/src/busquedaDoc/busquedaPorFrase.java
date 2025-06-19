package busquedaDoc;

public class busquedaPorFrase implements Condicion{
	private String fraseQueBusco;
	
	public busquedaPorFrase(String fraseQueBusco) {
		this.fraseQueBusco = fraseQueBusco;
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().contains(fraseQueBusco);
	}

}
