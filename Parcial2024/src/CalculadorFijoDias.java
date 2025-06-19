
public class CalculadorFijoDias extends CalculadorCosto {
	private int costoFijo;
	
	
	public CalculadorFijoDias( int costoFijo) {
		super();
		this.costoFijo = costoFijo;
	}


	@Override
	public int CalculadorCost(PresupuestoBasico bb) {
		return costoFijo*bb.getCantDias();
	}

}
