
public class CondicionMaterial extends Condicion {
	String matQueRequiero;
	
	public CondicionMaterial(String matQueRequiero) {
		this.matQueRequiero = matQueRequiero;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.materiales().contains(matQueRequiero);
	}

}
