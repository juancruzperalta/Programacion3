
public class CondicionDias extends Condicion {
	private int diasLimite;
	
	
	public CondicionDias(int diasLimite) {
		super();
		this.diasLimite = diasLimite;
	}


	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.tiempoEstimado() < diasLimite;
	}

}
