
public class CalcularAND extends CalcularCosto {
	private CalcularCosto c1,c2;
	
	public CalcularAND(CalcularCosto c1, CalcularCosto c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public double calcularCosto(PresupuestoBasico bb) {
		return c1.calcularCosto(bb) + c2.calcularCosto(bb);
	}

}
