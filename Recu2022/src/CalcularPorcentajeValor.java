
public class CalcularPorcentajeValor extends CalcularMonto {
	private int porcentaje;
	
	
	public CalcularPorcentajeValor(int porcentaje) {
		super();
		this.porcentaje = porcentaje;
	}


	@Override
	public double calcularMonto(Elemento el) {
		return el.getValor()*porcentaje;
	}

}
