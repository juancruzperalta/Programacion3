
public class CondicionCategoria extends Condicion {
	private String loquebusco;
	
	
	public CondicionCategoria(String loquebusco) {
		super();
		this.loquebusco = loquebusco;
	}


	@Override
	public boolean cumple(ProductoGeneral pp) {
		return pp.vosTenesCategoria(loquebusco);
	}

}
