
public class CondicionPeso extends Condicion {
	private int limPeso;
	
	
	public CondicionPeso(int limPeso) {
		super();
		this.limPeso = limPeso;
	}


	@Override
	public boolean cumple(Archivo ach) {
		return ach.getTamanio() < limPeso;
	}

}
