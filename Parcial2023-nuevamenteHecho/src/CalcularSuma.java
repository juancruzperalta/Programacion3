
public class CalcularSuma extends CalcularCosto {
	private CalcularCosto c1,c2;
	
	
	public CalcularSuma(CalcularCosto c1, CalcularCosto c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public int calcularCosto(PresupuestoBasico bb) {
		return c1.calcularCosto(bb) + c2.calcularCosto(bb);
	}

}
