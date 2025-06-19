
public class CondicionEmpleadosAfec extends Condicion {
	int limiteEmpleadosAfectados;
	
	public CondicionEmpleadosAfec(int limEmpl) {
		this.limiteEmpleadosAfectados = limEmpl;
	}
	@Override
	public boolean cumple(Presupuesto pp) {
		return pp.empleadosAfectados() < limiteEmpleadosAfectados;
	}

}
