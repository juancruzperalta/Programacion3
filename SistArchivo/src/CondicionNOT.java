
public class CondicionNOT extends Condicion {
	private Condicion cond1;
	
	
	public CondicionNOT(Condicion cond1) {
		super();
		this.cond1 = cond1;
	}
	@Override
	public boolean cumple(Archivo ach) {
		return !cond1.cumple(ach);
	}

}
