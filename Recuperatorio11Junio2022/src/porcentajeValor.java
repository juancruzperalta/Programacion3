
public class porcentajeValor extends CalcularCosto {
	private int porcentaje;
	
	
	public porcentajeValor(int porcentaje) {
		super();
		this.porcentaje = porcentaje;
	}


	@Override
	public double calcularCosto(Elemento el) {
		return el.getValor()*porcentaje;
	}

}
