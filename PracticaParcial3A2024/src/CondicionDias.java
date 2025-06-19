
public class CondicionDias extends Condicion {
	int diasLimite;
	
	public CondicionDias(int dias) {
		this.diasLimite = dias;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.tiempoEstimado() < diasLimite;
	}

}
