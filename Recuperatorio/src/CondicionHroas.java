
public class CondicionHroas extends Condicion {
	private int horas;
	
	
	public CondicionHroas(int horas) {
		super();
		this.horas = horas;
	}


	@Override
	public boolean cumple(OfertaAcademica cc) {
		return cc.horasCatedra() < horas;
	}

}
