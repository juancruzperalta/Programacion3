
public class CalcularFijo extends CalcularMonto {
	private int fijo;
	
	
	public CalcularFijo(int fijo) {
		super();
		this.fijo = fijo;
	}


	@Override
	public double calcularMonto(Elemento el) {
		return fijo;
	}

}
