
public class CondicionMarca extends Condicion {
	private String marca;
	
	
	public CondicionMarca(String marca) {
		super();
		this.marca = marca;
	}


	@Override
	public boolean cumple(ProductoGenerico pp) {
		return pp.marca().equals(marca);
	}

}
