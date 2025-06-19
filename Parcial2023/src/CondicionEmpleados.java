
public class CondicionEmpleados extends Condicion {
	private int empleados;
	
	public CondicionEmpleados(int i) {
		this.empleados = i;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.getCantEmpleados() < empleados;
	}

}
