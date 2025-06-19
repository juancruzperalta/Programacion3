
public class CondicionMarca extends Condicion {
	private String marcaQueBusco;
	
	
	public CondicionMarca(String marcaQueBusco) {
		super();
		this.marcaQueBusco = marcaQueBusco;
	}


	@Override
	public boolean cumple(ProductoAbstracto pp) {
		return pp.marca().equals(marcaQueBusco);
	}

}
