
public class CalcularFijoXDias extends CalcularCosto{
	private int fijo;
	
	
	public CalcularFijoXDias(int fijo) {
		super();
		this.fijo = fijo;
	}


	@Override
	public double calcularcosto(PresupuestoBasico bb) {
		return bb.getTiempoEstimado()*fijo;
	}

}
