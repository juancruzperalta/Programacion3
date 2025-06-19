
public class CondicionReqSol extends Condicion {
	private int limite;
	
	
	public CondicionReqSol(int lim) {
		this.limite = lim;
	}
	@Override
	public boolean cumple(Planta pp) {
		return pp.getReqSol()<limite;
	}

}
