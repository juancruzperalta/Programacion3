
public class CondicionReqAgua extends Condicion {
	private int limite;
	
	public CondicionReqAgua(int lim) {
		this.limite = lim;
	}
	@Override
	public boolean cumple(Planta pp) {
		return pp.getReqAgua()<limite;
	}

}
