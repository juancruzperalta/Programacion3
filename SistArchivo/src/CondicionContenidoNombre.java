
public class CondicionContenidoNombre extends Condicion {
	private String nombreQueBusco;
	
	
	public CondicionContenidoNombre(String nombreQueBusco) {
		super();
		this.nombreQueBusco = nombreQueBusco;
	}


	@Override
	public boolean cumple(Archivo ach) {
		return ach.getNombre().contains(nombreQueBusco);
	}

}
