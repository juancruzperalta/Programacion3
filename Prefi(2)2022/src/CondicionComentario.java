
public class CondicionComentario extends Condicion {
	private String autorComentario;
	
	
	public CondicionComentario(String autorComentario) {
		super();
		this.autorComentario = autorComentario;
	}


	@Override
	public boolean cumple(Tema tt) {
		return tt.tenesComentario(autorComentario);
	}

}
