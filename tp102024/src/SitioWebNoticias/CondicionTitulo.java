package SitioWebNoticias;

public class CondicionTitulo extends Condicion {
	private String titulo;
	
	
	public CondicionTitulo(String titulo) {
		super();
		this.titulo = titulo;
	}


	@Override
	public boolean cumple(Noticia nn) {
		return nn.getTitulo().equals(titulo);
	}

}
