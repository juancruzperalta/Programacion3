
public class CondicionPrecio extends Condicion {
	int precio;
	
	public CondicionPrecio(int precio) {
		super();
		this.precio = precio;
	}

	@Override
	public boolean cumple(OfertaAcademica cc) {
		return cc.getPrecio() < precio;
	}

}
