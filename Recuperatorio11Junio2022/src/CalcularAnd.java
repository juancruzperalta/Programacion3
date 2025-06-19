
public class CalcularAnd extends CalcularCosto {
	private CalcularCosto c1,c2;
	
	
	public CalcularAnd(CalcularCosto c1, CalcularCosto c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public double calcularCosto(Elemento el) {
		return c1.calcularCosto(el) + c2.calcularCosto(el);
	}

}
