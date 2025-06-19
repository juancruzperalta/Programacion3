
public class CondicionAND extends Condicion {
	private Condicion c1,c2;
	
	
	
	public CondicionAND(Condicion c1, Condicion c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean cumple(ProductoAbstracto pp) {
		// TODO Auto-generated method stub
		return c1.cumple(pp) && c2.cumple(pp);
	}

}
