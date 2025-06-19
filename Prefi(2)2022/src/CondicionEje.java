
public class CondicionEje extends Condicion {
	private String eje;
	
	
	public CondicionEje(String eje) {
		super();
		this.eje = eje;
	}


	@Override
	public boolean cumple(Tema tt) {
		return tt.ejeTematico().contains(eje);
	}

}
