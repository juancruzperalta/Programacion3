
public class CondicionVolumen extends Condicion {
	private int volumenMax;
	
	
	public CondicionVolumen(int volumenMax) {
		super();
		this.volumenMax = volumenMax;
	}


	@Override
	public boolean cumple(ProductoGenerico pp) {
		return pp.getVolumen() < volumenMax;
	}

}
