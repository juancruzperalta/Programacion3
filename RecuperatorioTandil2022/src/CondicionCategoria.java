
public class CondicionCategoria extends Condicion {
	private String palabraQuebusco;
	
	
	public CondicionCategoria(String palabraQuebusco) {
		super();
		this.palabraQuebusco = palabraQuebusco;
	}


	@Override
	public boolean cumple(ProductoGenerico pp) {
		return pp.tenesEstaPalabra(palabraQuebusco);
	}

}
