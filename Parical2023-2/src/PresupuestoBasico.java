import java.util.ArrayList;

public class PresupuestoBasico extends Presupuesto{
	
	private int empleadosAfectados;
	private int tiempo;
	private ArrayList<String> matQueRequiero;
	private CalculadorCosto calculador;
	
	
	public PresupuestoBasico(String nombre, int empleados, int tiempo, CalculadorCosto cc) {
		super(nombre);
		this.empleadosAfectados = empleados;
		this.tiempo = tiempo;
		matQueRequiero = new ArrayList<>();
		this.calculador = cc;
	}

	public CalculadorCosto getCalculador() {
		return calculador;
	}

	public void setCalculador(CalculadorCosto calculador) {
		this.calculador = calculador;
	}

	public int getEmpleadosAfectados() {
		return empleadosAfectados;
	}

	public void setEmpleadosAfectados(int empleadosAfectados) {
		this.empleadosAfectados = empleadosAfectados;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public int tiempoEstimado() {
		return this.getTiempo();
	}

	@Override
	public int empleadosAfectados() {
		return this.getEmpleadosAfectados();
	}

	@Override
	public ArrayList<String> matRequeridos() {
		ArrayList<String> aux = new ArrayList<>(matQueRequiero);
		return aux;
	}

	@Override
	public double getCosto() {
		return calculador.CalculadorCosto(this);
	}

	@Override
	public ArrayList<Presupuesto> buscar(Condicion cond) {
		ArrayList<Presupuesto> aux = new ArrayList<>();
			if(cond.cumple(this)) {
				aux.add(this);
			
		}
		return aux;
	}

}
