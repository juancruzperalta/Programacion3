
public class CondicionValor extends Condicion {
	private int valor;
	
	
	public CondicionValor(int valor) {
		super();
		this.valor = valor;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getValor() < valor;
	}

}
