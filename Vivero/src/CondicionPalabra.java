
public class CondicionPalabra extends Condicion {
	private String palabraQueBusco;
	
	public CondicionPalabra(String pal) {
		this.palabraQueBusco = pal;
	}
	@Override
	public boolean cumple(Planta pp) {
		return pp.getNombreCientifico().contains(palabraQueBusco);
	}

}
