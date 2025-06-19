
public class CostoFijo extends CalcularCosto {
	private int fijo;
	
	
	public CostoFijo(int fijo) {
		super();
		this.fijo = fijo;
	}


	@Override
	public double calcularcosto(PresupuestoBasico bb) {
		return fijo;
	}

}
