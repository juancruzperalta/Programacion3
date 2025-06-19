
public class CondicionMateriales extends Condicion {
	private String matQueBusco;
	
	public CondicionMateriales(String mat) {
		this.matQueBusco = mat;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.matRequeridos().contains(matQueBusco);
	}

}
