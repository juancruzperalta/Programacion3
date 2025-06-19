
public class CalcularSuma extends CalcularMonto {
	private CalcularMonto c1,c2;
	
	
	public CalcularSuma(CalcularMonto c1, CalcularMonto c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public double calcularMonto(Elemento el) {
		return c1.calcularMonto(el) + c2.calcularMonto(el);
	}

}
