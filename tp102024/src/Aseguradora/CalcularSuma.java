package Aseguradora;

public class CalcularSuma extends CalcularMonto {
	private CalcularMonto c1, c2;
	
	
	public CalcularSuma(Aseguradora.CalcularMonto c1, Aseguradora.CalcularMonto c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public int CalcularMonto(Seguro ss) {
		return c1.CalcularMonto(ss) + c2.CalcularMonto(ss);
	}

}
