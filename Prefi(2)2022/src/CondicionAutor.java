
public class CondicionAutor extends Condicion {
	private String autorQuebusco;
	
	
	public CondicionAutor(String autorQuebusco) {
		super();
		this.autorQuebusco = autorQuebusco;
	}


	@Override
	public boolean cumple(Tema tt) {
		return tt.getAutor().equals(autorQuebusco);
	}

}
