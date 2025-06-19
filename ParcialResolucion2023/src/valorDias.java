
public class valorDias extends calcularCosto {
	private int valor;
	
	
	public valorDias(int valor) {
		super();
		this.valor = valor;
	}


	@Override
	public int calcularCosto(Basico bb) {
		return bb.getTiempoEstimado()*valor;
	}

}
