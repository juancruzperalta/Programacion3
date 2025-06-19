
public class CondicionAND extends Condicion {
	private Condicion c1,c2;
	
	public CondicionAND(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean cumple(ProductoGenerico pp) {
		return c1.cumple(pp) && c2.cumple(pp);
	}

}
