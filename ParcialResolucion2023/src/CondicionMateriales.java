
public class CondicionMateriales extends Condicion {
	private String matQueBusco;
	
	
	public CondicionMateriales(String matQueBusco) {
		super();
		this.matQueBusco = matQueBusco;
	}


	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.matQueRequiero().contains(matQueBusco);
	}

}
