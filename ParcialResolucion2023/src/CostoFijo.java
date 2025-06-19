
public class CostoFijo extends calcularCosto {
	private int fijo;
	
	
	public CostoFijo(int fijo) {
		super();
		this.fijo = fijo;
	}


	@Override
	public int calcularCosto(Basico bb) {
		return fijo;
	}

}
