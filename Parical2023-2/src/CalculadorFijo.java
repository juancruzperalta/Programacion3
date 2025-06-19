
public class CalculadorFijo extends CalculadorCosto {
	private int fijo;
	
	public CalculadorFijo(int fijo) {
		this.fijo =fijo;
	}
	@Override
	public double CalculadorCosto(PresupuestoBasico dd) {
		return fijo;
	}

}
