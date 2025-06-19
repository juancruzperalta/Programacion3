
public class CalculadorSuma extends CalculadorCosto {
	private CalculadorCosto c1, c2;
	
	public CalculadorSuma(CalculadorCosto c1, CalculadorCosto c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public double CalculadorCosto(PresupuestoBasico dd) {
		return c1.CalculadorCosto(dd) + c2.CalculadorCosto(dd);
	}

}
