
public class CondicionAntiguedad extends Condicion {
	private int antiguedadLimite;
	
		
	public CondicionAntiguedad(int antiguedadLimite) {
		super();
		this.antiguedadLimite = antiguedadLimite;
	}


	@Override
	public boolean cumple(Elemento el) {
		return el.getAntiguedad()<antiguedadLimite;
	}

}
