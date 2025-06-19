
public class CondicionCategoria extends Condicion {
	private String categoriaQueBusco;
	
	
	public CondicionCategoria(String categoriaQueBusco) {
		super();
		this.categoriaQueBusco = categoriaQueBusco;
	}


	@Override
	public boolean cumple(ProductoAbstracto pp) {
		return pp.tenesCategoria(categoriaQueBusco);
	}

}
