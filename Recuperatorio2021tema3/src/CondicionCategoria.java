
public class CondicionCategoria extends Condicion {
	private String catQueBusco;
	
	
	public CondicionCategoria(String catQueBusco) {
		super();
		this.catQueBusco = catQueBusco;
	}


	@Override
	public boolean cumple(ProductoGenerico pp) {
		return pp.tenesCategoria(catQueBusco);
	}

}
