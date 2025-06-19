
public class CondicionNOT extends Condicion {
	Condicion c1;
	
	public CondicionNOT(Condicion c1) {
		this.c1 = c1;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return !c1.cumple(pp);
	}

}
