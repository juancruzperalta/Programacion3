
public class TemaAsociado extends Tema {
	private Tema temaAsociado;
	
	public TemaAsociado(String titulo, String descripcion, String ejeTematico, String autor) {
		super(titulo, descripcion, ejeTematico, autor);
		// TODO Auto-generated constructor stub
	}
	
	public Tema getTemaAsociado() {
		return temaAsociado;
	}

	public void setTemaAsociado(Tema temaAsociado) {
		this.temaAsociado = temaAsociado;
	}

	public Elemento copiar(Condicion cond) {
		return null;
	}
}
