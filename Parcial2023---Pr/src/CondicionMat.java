
public class CondicionMat extends Condicion {
	private String matQueBusco;
	
	
	public CondicionMat(String matQueBusco) {
		super();
		this.matQueBusco = matQueBusco;
	}


	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.tenesMaterial(matQueBusco);
	}

}
