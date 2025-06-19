
public class CondicionNombreVulgar extends Condicion {
	private String nombreVulgar;
	
	public CondicionNombreVulgar(String nombre) {
		this.nombreVulgar = nombre;
	}
	@Override
	public boolean cumple(Planta pp) {
		return pp.tenesEsteNombre(nombreVulgar);
	}

}
