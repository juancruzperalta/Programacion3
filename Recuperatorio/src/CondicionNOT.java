
public class CondicionNOT extends Condicion {
	Condicion c1;
	
	
	public CondicionNOT(Condicion c1) {
		super();
		this.c1 = c1;
	}


	@Override
	public boolean cumple(OfertaAcademica cc) {
		return !c1.cumple(cc);
	}

}
