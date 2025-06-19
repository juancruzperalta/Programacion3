
public class CostoFijo extends CalcularCosto {
	private int costo;
	
	
	public CostoFijo(int costo) {
		super();
		this.costo = costo;
	}


	@Override	
	public int calcularCosto(PresupuestoBasico bb) {
		return costo;
	}

}
