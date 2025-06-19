			
public class CondicionAND extends Condicion {
	Condicion c1,c2;
	
	
	public CondicionAND(Condicion c1, Condicion c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean cumple(Pedido pp) {
		return c1.cumple(pp) && c2.cumple(pp);
	}

}
