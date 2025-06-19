
public class CondicionDias extends Condicion {
	private int dias;
	
	
	public CondicionDias(int dias) {
		super();
		this.dias = dias;
	}


	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.getTiempoEstimado()<dias;
	}

}
