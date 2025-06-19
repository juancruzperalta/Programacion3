
public class CondicionPrecio extends Condicion {
	private int precioQueBusco;
	
	
	public CondicionPrecio(int precioQueBusco) {
		super();
		this.precioQueBusco = precioQueBusco;
	}


	@Override
	public boolean cumple(ProductoAbstracto pp) {
		return pp.precio()<precioQueBusco;
	}

}
