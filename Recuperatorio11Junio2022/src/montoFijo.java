
public class montoFijo extends CalcularCosto {
	private int fijo;
	
	
	public montoFijo(int fijo) {
		super();
		this.fijo = fijo;
	}


	@Override
	public double calcularCosto(Elemento el) {
		return fijo;
	}

}
