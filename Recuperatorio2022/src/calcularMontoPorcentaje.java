
public class calcularMontoPorcentaje extends CalcularMonto {
	private double por;
	
	
	public calcularMontoPorcentaje(double por) {
		super();
		this.por = por;
	}


	@Override
	public int calcularMonto(Elemento el) {
		return (int) (el.getValor()*por);
	}

}
