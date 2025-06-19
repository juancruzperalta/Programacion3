
public class CondicionCodigo extends Condicion {
	private int codigoquebusco;
	
	
	public CondicionCodigo(int codigoquebusco) {
		super();
		this.codigoquebusco = codigoquebusco;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getCodigo() == codigoquebusco;
	}

}
