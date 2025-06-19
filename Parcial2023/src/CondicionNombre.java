
public class CondicionNombre extends Condicion {
	private String busquedaEquipo;
	
	public CondicionNombre(String b) {
		this.busquedaEquipo = b;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.cantMateriales().contains(busquedaEquipo);
	}

}
