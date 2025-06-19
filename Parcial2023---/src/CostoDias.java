
public class CostoDias extends CalcularCosto{
	private int costo;
	
	
	public CostoDias(int costo) {
		super();
		this.costo = costo;
	}


	@Override
	public double calcularCosto(PresupuestoBasico bb) {
		return bb.getTiempo()*costo;
	}

}	
