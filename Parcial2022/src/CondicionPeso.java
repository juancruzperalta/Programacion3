
public class CondicionPeso extends Condicion {
	private int limite;
	
	
	public CondicionPeso(int limite) {
		super();
		this.limite = limite;
	}


	@Override
	public boolean cumple(Pedido pp) {
		return pp.getPeso()<limite;
	}

}
