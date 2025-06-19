package busquedaDoc;

public class condicionAND implements Condicion{
	private Condicion cond1, cond2;
	
	public condicionAND(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}
	@Override
	public boolean cumple(Documento doc) {
		return cond1.cumple(doc) && cond2.cumple(doc);
	}

}
