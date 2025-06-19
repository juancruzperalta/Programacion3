package SitioWebNoticias;

public class CondicionTexto extends Condicion {
	private int largoLimite;
	
	public CondicionTexto(int largoLimite) {
		super();
		this.largoLimite = largoLimite;
	}

	@Override
	public boolean cumple(Noticia nn) {
		return nn.getTexto().length() < largoLimite;
	}

}
