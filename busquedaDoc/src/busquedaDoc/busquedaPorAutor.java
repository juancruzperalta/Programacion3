package busquedaDoc;

public class busquedaPorAutor implements Condicion{
	private String autor;
	
	public busquedaPorAutor(String autor) {
		this.autor = autor;
	}
	@Override	
	public boolean cumple(Documento doc) {
		return doc.tenesEsteAutor(autor);
	}

}
