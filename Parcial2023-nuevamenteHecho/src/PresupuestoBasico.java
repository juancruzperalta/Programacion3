import java.util.ArrayList;

public class PresupuestoBasico extends Presupuesto{
	private ArrayList<String> matQueRequiero;
	private int cantEmpleados;
	private int tiempo;
	private CalcularCosto cc;


	
	
	public PresupuestoBasico(String nombre, int cantEmpleados, int tiempo, CalcularCosto cc) {
		super(nombre);
		this.cantEmpleados = cantEmpleados;
		this.tiempo = tiempo;
		this.cc = cc;
		matQueRequiero = new ArrayList<>();
	}



	public CalcularCosto getCc() {
		return cc;
	}



	public void setCc(CalcularCosto cc) {
		this.cc = cc;
	}



	public int getCantEmpleados() {
		return cantEmpleados;
	}



	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}



	public int getTiempo() {
		return tiempo;
	}



	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}



	@Override
	public ArrayList<String> matRequeridos() {
		return new ArrayList<String>(matQueRequiero);
	}

	@Override
	public int cantEmpleadosAfectados() {
		return this.cantEmpleados;
	}

	@Override
	public int tiempoEstimado() {
		return this.tiempo;
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
	public double getCosto() {
		return cc.calcularCosto(this);
	}

}
