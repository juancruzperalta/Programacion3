
public class CondicionEmpleados extends Condicion {
	private int limiteEmpleados;
	
	
	public CondicionEmpleados(int limiteEmpleados) {
		super();
		this.limiteEmpleados = limiteEmpleados;
	}


	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.cantEmpleadosAfectados() < limiteEmpleados;
	}

}
