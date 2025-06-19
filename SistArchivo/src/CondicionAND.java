
public class CondicionAND extends Condicion {
	private Condicion cond1,cond2;
	
	
	public CondicionAND(Condicion cond1, Condicion cond2) {
		super();
		this.cond1 = cond1;
		this.cond2 = cond2;
	}


	@Override
	public boolean cumple(Archivo ach) {
		return cond1.cumple(ach) && cond2.cumple(ach);
	}

}
