
public class SectorEspecial extends Sector {
	private Condicion c1;
	
	public SectorEspecial(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public void addPedido(Pedido pp) {
		if(c1.cumple(pp)) {
			super.addPedido(pp);
		}
	}
}
