
public class CondicionPesoSuperior extends Condicion {
	private int pesoLimite;
	
	
	public CondicionPesoSuperior(int pesoLimite) {
		super();
		this.pesoLimite = pesoLimite;
	}


	@Override
	public boolean cumple(ProductoGenerico pp) {
		return pp.getPeso()<pesoLimite;
	}

}
