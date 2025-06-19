
public class CondicionMesesAntiguedad extends Condicion {
	private int meses;
	
	
	public CondicionMesesAntiguedad(int meses) {
		super();
		this.meses = meses;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getAntiguedad()<meses;
	}

}
