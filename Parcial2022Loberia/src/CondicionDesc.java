
public class CondicionDesc extends Condicion {
	private String descQueBusco;
	
	
	public CondicionDesc(String descQueBusco) {
		super();
		this.descQueBusco = descQueBusco;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getDescripcion().contains(descQueBusco);
	}

}
