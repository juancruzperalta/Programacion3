
public class calcularAND extends calcularCosto {
	private calcularCosto c1, c2;
	
	
	
	public calcularAND(calcularCosto c1, calcularCosto c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}



	@Override
	public int calcularCosto(Basico bb) {
		return c1.calcularCosto(bb)+c2.calcularCosto(bb);
	}

}
