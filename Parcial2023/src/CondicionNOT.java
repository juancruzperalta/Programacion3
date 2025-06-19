
public class CondicionNOT extends Condicion {
	Condicion cond1;
	
	
	public CondicionNOT(Condicion cond1) {
		this.cond1 = cond1;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return !cond1.cumple(pp);
	}

}
