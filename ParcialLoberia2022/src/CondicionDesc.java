
public class CondicionDesc extends Condicion {
	private String desc;
	
	
	public CondicionDesc(String desc) {
		super();
		this.desc = desc;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getDescripcion().contains(desc);
	}

}
