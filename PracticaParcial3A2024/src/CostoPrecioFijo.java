
public class CostoPrecioFijo extends CalculadorCosto{
	protected int precioFijo;
	
	public CostoPrecioFijo(int precio) {
		this.precioFijo = precio;
	}

	@Override
	public int calcularCosto(PresupuestoBasico bb) {
		return precioFijo;
	}
}
