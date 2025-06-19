package SitioWebNoticias;

public class CondicionAutor extends Condicion {
	private String autorQueBusco;
	
	
	
	public CondicionAutor(String autorQueBusco) {
		super();
		this.autorQueBusco = autorQueBusco;
	}



	@Override
	public boolean cumple(Noticia nn) {
		return nn.getAutor().equals(autorQueBusco);
	}

}
