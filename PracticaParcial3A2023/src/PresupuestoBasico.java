import java.util.ArrayList;

public class PresupuestoBasico extends Presupuesto {
	private ArrayList<String> matQueRequiero;
	private int empleadosAfec;
	private int tiempoEstim;
	public PresupuestoBasico(String nn, int empleadosAfec, int tiempoEstim) {
		super(nn);
		this.empleadosAfec = empleadosAfec;
		this.tiempoEstim = tiempoEstim;
		matQueRequiero = new ArrayList<>();
	}
	
	public void addMatRequeridos(String mat) {
		this.matQueRequiero.add(mat);
	}
	public int getEmpleadosAfec() {
		return empleadosAfec;
	}



	public void setEmpleadosAfec(int empleadosAfec) {
		this.empleadosAfec = empleadosAfec;
	}



	public int getTiempoEstim() {
		return tiempoEstim;
	}



	public void setTiempoEstim(int tiempoEstim) {
		this.tiempoEstim = tiempoEstim;
	}



	@Override
	public ArrayList<String> materiales() {
		ArrayList<String> aux = new ArrayList<String>(matQueRequiero);
		return aux;
	}

	@Override
	public int empleadosAfectados() {
		return this.empleadosAfec;
	}

	@Override
	public int tiempoEstimado() {
		return this.tiempoEstim;
	}

}
