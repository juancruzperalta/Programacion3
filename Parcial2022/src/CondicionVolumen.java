
public class CondicionVolumen extends Condicion {
	private int volum;
	
	
	public CondicionVolumen(int volum) {
		super();
		this.volum = volum;
	}


	@Override
	public boolean cumple(Pedido pp) {
		return pp.getVolumen()<volum;
	}

}
