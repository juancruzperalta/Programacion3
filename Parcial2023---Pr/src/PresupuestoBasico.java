import java.util.ArrayList;

public class PresupuestoBasico extends Presupuesto {
	private int cantEmpleados;
	private int tiempoEstimado;
	private ArrayList<String> materiales;
	private CalcularCosto cc;
	

	public PresupuestoBasico(String nombre, int cantEmpleados, int tiempoEstimado, CalcularCosto cc) {
		super(nombre);
		this.cantEmpleados = cantEmpleados;
		this.tiempoEstimado = tiempoEstimado;
		materiales = new ArrayList<>();
		this.cc = cc;
	}
	
	
	public CalcularCosto getCc() {
		return cc;
	}


	public void setCc(CalcularCosto cc) {
		this.cc = cc;
	}


	public void addMaterial(String materiales) {
		this.materiales.add(materiales);
	}

	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}



	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}



	@Override
	public ArrayList<String> getMateriales() {
		ArrayList<String> aux = new ArrayList<>(this.materiales);
		return aux;
	}

	@Override
	public int getCantEmpleados() {
		return this.cantEmpleados;
	}

	@Override
	public int getTiempoEstimado() {
		return this.tiempoEstimado;
	}

	@Override
	public ArrayList<Presupuesto> buscar(Condicion cond) {
		ArrayList<Presupuesto> aux =new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	@Override
	public double getCosto() {
		return cc.calcularcosto(this);
	}

}
