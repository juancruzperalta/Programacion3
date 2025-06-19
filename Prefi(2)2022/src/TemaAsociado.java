
public class TemaAsociado extends Tema {
	private Tema temaAsociado;

	public TemaAsociado(String titulo, String descripcion, String ejeTematico, String autor, Tema temaAsociado) {
		super(titulo, descripcion, ejeTematico, autor);
		this.temaAsociado = temaAsociado;
	}
	
	public void addComentario(Comentario cc) {
		super.addComentario(cc);
		temaAsociado.addComentario(cc);
	}

	public TemaGenerico copiar(Condicion cond) {
		return null;
	}
}
