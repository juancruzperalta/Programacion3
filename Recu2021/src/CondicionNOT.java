
public class CondicionNOT extends Condicion {
	private Condicion c1;
	
	
	public CondicionNOT(Condicion c1) {
		super();
		this.c1 = c1;
	}


	@Override	
	public boolean cumple(ProductoAbstracto pp) {
		return !c1.cumple(pp);
	}

}
