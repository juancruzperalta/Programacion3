
public class CondicionPalabra extends Condicion {
	private String palabra;
	
	
	public CondicionPalabra(String palabra) {
		super();
		this.palabra = palabra;
	}


	@Override
	public boolean cumple(OfertaAcademica cc) {
		return cc.palabrasClave().contains(palabra);
	}

}
