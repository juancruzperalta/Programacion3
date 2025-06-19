
public class CondicionVolumen extends Condicion {
	private int volumenLimite;
	
	
	public CondicionVolumen(int volumenLimite) {
		super();
		this.volumenLimite = volumenLimite;
	}


	@Override
	public boolean cumple(ProductoAbstracto pp) {
		return pp.volumen() < volumenLimite;
	}

}
