
public class CondicionPalabra extends Condicion {
	private String palabra;
	
	
	public CondicionPalabra(String palabra) {
		super();
		this.palabra = palabra;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getDescripcion().contains(palabra);
	}

}
