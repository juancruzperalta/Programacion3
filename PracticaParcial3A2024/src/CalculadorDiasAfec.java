
public class CalculadorDiasAfec extends CalculadorCosto {
	private int diasAfect;
	public CalculadorDiasAfec(int dias) {
		this.diasAfect = dias;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int calcularCosto(PresupuestoBasico bb) {
		// TODO Auto-generated method stub
		return diasAfect*bb.tiempoEstimado();
	}

}
