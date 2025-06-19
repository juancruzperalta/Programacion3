
public class CondicionDias extends Condicion {
	private int limDias;
	
	public CondicionDias(int l) {
		this.limDias = l;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.cantDias() < limDias;
	}

}
