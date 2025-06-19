
public class CondicionAND extends Condicion {
	Condicion c1,c2;
	
	
	public CondicionAND(Condicion c1, Condicion c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean cumple(OfertaAcademica cc) {
		return c1.cumple(cc) && c2.cumple(cc);
	}

}
