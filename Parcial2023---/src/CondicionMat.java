
public class CondicionMat extends Condicion {
	private String matQuebusco;
	
	
	public CondicionMat(String matQuebusco) {
		super();
		this.matQuebusco = matQuebusco;
	}


	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.tenesMaterial(matQuebusco);
	}

}
