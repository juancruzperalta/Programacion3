
public class CalculadorXdias extends CalculadorCosto {
	private int fijo;
	
	public CalculadorXdias(int f) {
		this.fijo = f;
	}
	@Override
	public double CalculadorCosto(PresupuestoBasico dd) {
		return fijo*dd.tiempoEstimado();
	}

}
