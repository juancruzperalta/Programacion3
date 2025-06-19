
public class CondicionPalabraClave extends Condicion {
	private String palabraClave;
	
	
	public CondicionPalabraClave(String palabraClave) {
		super();
		this.palabraClave = palabraClave;
	}


	@Override
	public boolean cumple(Tema tt) {
		return tt.tenesPalabraClave(palabraClave);
	}

}
