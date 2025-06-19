
public class CostoFijoPorDias extends CalcularCosto {
	private int costo;
	
	
	public CostoFijoPorDias(int costo) {
		super();
		this.costo = costo;
	}


	@Override
	public int calcularCosto(PresupuestoBasico bb) {
		return costo*bb.tiempoEstimado();
	}

}
