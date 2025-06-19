
public class CondicionDias extends Condicion {
	private int limite;
	
	public CondicionDias(int lim) {
		this.limite = lim;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.tiempoEstimado() < limite;
	}

}
