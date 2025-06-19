
public class CalcularSuma extends CalcularCosto {
	private CalcularCosto c1,c2;
	
	public CalcularSuma(CalcularCosto c1, CalcularCosto c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public double calcularcosto(PresupuestoBasico bb) {
		return c1.calcularcosto(bb) + c2.calcularcosto(bb);
	}

}
