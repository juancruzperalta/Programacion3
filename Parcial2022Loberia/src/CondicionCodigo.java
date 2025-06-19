
public class CondicionCodigo extends Condicion {
	private int codigo;
	
	
	public CondicionCodigo(int codigo) {
		super();
		this.codigo = codigo;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getCodigo() == codigo;
	}

}
