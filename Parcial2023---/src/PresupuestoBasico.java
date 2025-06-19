import java.util.ArrayList;

public class PresupuestoBasico extends Presupuesto{
	private ArrayList<String> matQueRequiero;
	private int tiempo;
	private int cantEmpleados;
	private CalcularCosto cc;
	
	
	
	public PresupuestoBasico(String nombre,int tiempo, int cantEmpleados,
			CalcularCosto cc) {
		super(nombre);
		matQueRequiero = new ArrayList<>();
		this.tiempo = tiempo;
		this.cantEmpleados = cantEmpleados;
		this.cc = cc;
	}
	
	

	public CalcularCosto getCc() {
		return cc;
	}



	public void setCc(CalcularCosto cc) {
		this.cc = cc;
	}



	public void addMatQueRequiero(String mt) {
		if(!matQueRequiero.contains(mt)) {
			matQueRequiero.add(mt);
		}
	}

	public int getTiempo() {
		return tiempo;
	}



	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}



	public int getCantEmpleados() {
		return cantEmpleados;
	}



	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
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
	public ArrayList<String> matQueRequiero() {
		return new ArrayList<String>(this.matQueRequiero);
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
