
public class CondicionVolumen extends Condicion {
	private int volumen;
	
	
	public CondicionVolumen(int volumen) {
		super();
		this.volumen = volumen;
	}


	@Override
	public boolean cumple(ProductoGenerico pp) {
		return pp.getVolumen()<volumen;
	}

}
