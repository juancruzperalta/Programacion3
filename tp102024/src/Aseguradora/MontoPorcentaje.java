package Aseguradora;

public class MontoPorcentaje extends CalcularMonto {
	private int porcentaje;
	
	public MontoPorcentaje(int por) {
		this.porcentaje = por;
	}
	@Override
	public int CalcularMonto(Seguro ss) {
		return ss.montoAsegurado()*porcentaje;
	}

}
