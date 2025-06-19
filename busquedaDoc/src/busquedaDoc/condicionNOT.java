package busquedaDoc;

public class condicionNOT implements Condicion{
	private Condicion cond1;
	
	public condicionNOT(Condicion cond1) {
		this.cond1 = cond1;
	}
	@Override
	public boolean cumple(Documento doc) {
		return !cond1.cumple(doc);
	}

}
