
public class CondicionPalabraClave extends Condicion {
	private String palabraQueBusco;
	
	
	public CondicionPalabraClave(String palabraQueBusco) {
		super();
		this.palabraQueBusco = palabraQueBusco;
	}


	@Override
	public boolean cumple(Pedido pp) {
		return pp.palabrasClave().contains(palabraQueBusco);
	}

}
