
public class CostoFijo extends CalcularCosto {
	private int costoFijo;
	
	
	public CostoFijo(int costoFijo) {
		super();
		this.costoFijo = costoFijo;
	}


	@Override
	public double calcularCosto(PresupuestoBasico bb) {
		return costoFijo;
	}

}
