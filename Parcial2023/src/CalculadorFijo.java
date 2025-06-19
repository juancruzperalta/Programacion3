
public class CalculadorFijo extends CalculadorCosto {
	private int valorFijo;
	
	public CalculadorFijo(int v) {
		this.valorFijo = v;
	}
	@Override
	public int CalculadorCost(PresupuestoBasico bb) {
		return valorFijo;
	}

}
