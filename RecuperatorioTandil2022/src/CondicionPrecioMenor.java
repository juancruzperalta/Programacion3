
public class CondicionPrecioMenor extends Condicion {
	private int precioMenor;
	
	
	public CondicionPrecioMenor(int precioMenor) {
		super();
		this.precioMenor = precioMenor;
	}


	@Override
	public boolean cumple(ProductoGenerico pp) {
		return pp.getPrecio()<precioMenor;
	}

}
