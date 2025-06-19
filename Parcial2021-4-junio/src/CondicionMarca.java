
public class CondicionMarca extends Condicion {
	private String marcaQueBusco;
	
	@Override
	public boolean cumple(ProductoGenerico pp) {
		return pp.getMarca().equals(marcaQueBusco);
	}

}
