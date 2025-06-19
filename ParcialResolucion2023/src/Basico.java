import java.util.ArrayList;

public class Basico extends Presupuesto {
	private ArrayList<String> matQueRequiero;
	private int empleadosAfectados;
	private int tiempoEstimado;
	protected calcularCosto cc;
	
	public Basico(String nombre, int empAfec, int tiempoEst, calcularCosto cc) {
		super(nombre);
		this.empleadosAfectados = empAfec;
		this.tiempoEstimado = tiempoEst;
		matQueRequiero = new ArrayList<>();
		this.cc = cc;
	}
	
	

	public calcularCosto getCc() {
		return cc;
	}



	public void setCc(calcularCosto cc) {
		this.cc = cc;
	}



	public int getEmpleadosAfectados() {
		return empleadosAfectados;
	}



	public void setEmpleadosAfectados(int empleadosAfectados) {
		this.empleadosAfectados = empleadosAfectados;
	}



	public int getTiempoEstimado() {
		return tiempoEstimado;
	}



	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}



	@Override
	public ArrayList<String> matQueRequiero() {
		ArrayList<String> aux = new ArrayList<>(matQueRequiero);
		return aux;
	}

	@Override
	public int empleadosAfectados() {
		return this.empleadosAfectados;
	}

	@Override
	public int tiempoEstimado() {
		return this.tiempoEstimado;
	}



	@Override
	public ArrayList<Presupuesto> buscar(Condicion cond) {
		ArrayList<Presupuesto> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}



	@Override
	public int calcularCosto() {
		return cc.calcularCosto(this);
	}

}
