
public class CondicionAntiguedad extends Condicion {
	private int antiguedad;
	
	
	public CondicionAntiguedad(int antiguedad) {
		super();
		this.antiguedad = antiguedad;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getAntiguedad()<antiguedad;
	}

}
