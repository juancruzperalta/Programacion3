
public class CalculadorxAfectado extends CalculadorCosto {
	private int afectados;
	
	public CalculadorxAfectado(int af) {
		this.afectados = af;
	}
	@Override
	public double CalculadorCosto(PresupuestoBasico dd) {
		return afectados*dd.empleadosAfectados();
	}

}
