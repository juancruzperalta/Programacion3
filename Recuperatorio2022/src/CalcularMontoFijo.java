
public class CalcularMontoFijo extends CalcularMonto {
	private int fijo;
	
	
	public CalcularMontoFijo(int fijo) {
		super();
		this.fijo = fijo;
	}


	@Override
	public int calcularMonto(Elemento el) {
		return fijo;
	}

}
