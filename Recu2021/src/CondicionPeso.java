
public class CondicionPeso extends Condicion {
	private int peso;
	
	
	public CondicionPeso(int peso) {
		super();
		this.peso = peso;
	}


	@Override
	public boolean cumple(ProductoAbstracto pp) {
		return pp.getPeso()<peso;
	}

}
