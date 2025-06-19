
public class valorFijoxDias extends calcularCosto{
	private int fijo;
	
	
	public valorFijoxDias(int fijo) {
		super();
		this.fijo = fijo;
	}


	@Override
	public int calcularCosto(Basico bb) {
		return bb.getEmpleadosAfectados()*fijo;
	}

}
