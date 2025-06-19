import java.util.ArrayList;

public class PresupuestoBasico extends Presupuesto {
	private int cantDias;
	private int empleadosAfec;
	private ArrayList<String> materiales;
	public PresupuestoBasico(String nombre, int dias, int empleados) {
		super(nombre);
		this.cantDias = dias;
		this.empleadosAfec = empleados;
		materiales = new ArrayList<>();
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}

	public int getEmpleadosAfec() {
		return empleadosAfec;
	}

	public void setEmpleadosAfec(int empleadosAfec) {
		this.empleadosAfec = empleadosAfec;
	}

	@Override
	public int getCantEmpleados() {
		return empleadosAfec;
	}

	@Override
	public ArrayList<String> cantMateriales() {
		ArrayList<String> materialesCopia = new ArrayList<>(materiales);
		return materialesCopia;
	}

	@Override
	public int cantDias() {
		return cantDias;
	}

}
