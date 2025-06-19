
public class CondicionPrecio extends Condicion {
	private int precio;
	
	
	public CondicionPrecio(int precio) {
		super();
		this.precio = precio;
	}


	@Override
	public boolean cumple(ProductoAbstracto pp) {
		return pp.getPrecio()<precio;
	}

}
