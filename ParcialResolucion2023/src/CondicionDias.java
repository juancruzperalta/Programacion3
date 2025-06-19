
public class CondicionDias extends Condicion {
	private int limite;
	
	
	public CondicionDias(int limite) {
		super();
		this.limite = limite;
	}


	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.tiempoEstimado() < limite;
	}

}
