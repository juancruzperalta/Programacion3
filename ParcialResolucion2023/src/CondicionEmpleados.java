
public class CondicionEmpleados extends Condicion {
	private int empleados;
	
	
	public CondicionEmpleados(int empleados) {
		super();
		this.empleados = empleados;
	}


	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.empleadosAfectados() < empleados;
	}

}
