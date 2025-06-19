
public class CondicionClasificacion extends Condicion {
	private String clasificacion;
	
	public CondicionClasificacion(String cla) {
		this.clasificacion = cla;
	}
	@Override
	public boolean cumple(Planta pp) {
		return pp.getClasificacion().contains(clasificacion);
	}

}
