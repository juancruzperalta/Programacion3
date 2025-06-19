
public class CondicionEmpleados extends Condicion {
	private int limEmpleados;
	
	public CondicionEmpleados(int lim) {
		this.limEmpleados = lim;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.empleadosAfectados() < limEmpleados;
	}

}
