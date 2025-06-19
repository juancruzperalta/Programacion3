
public class CondicionPalabra extends Condicion {
	private String palabraQueBusco;
	
	
	public CondicionPalabra(String palabraQueBusco) {
		super();
		this.palabraQueBusco = palabraQueBusco;
	}


	@Override
	public boolean cumple(CursoGenerico curso) {
		return curso.tenesPalabra(palabraQueBusco);
	}

}
