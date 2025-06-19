
public class CondicionPrecio extends Condicion {
	private int precioLimite;
	
	
	@Override
	public boolean cumple(ProductoGenerico pp) {
		return pp.getPrecio()<precioLimite;
	}

}
