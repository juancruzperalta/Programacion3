
public class CondicionDocente extends Condicion {
	private int cantDocentes;
	
	
	public CondicionDocente(int cantDocentes) {
		super();
		this.cantDocentes = cantDocentes;
	}


	@Override
	public boolean cumple(OfertaAcademica cc) {
		return cc.cantDocentes() <= cantDocentes;
	}

}
