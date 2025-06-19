import java.util.ArrayList;

public abstract class Compuesta extends Presupuesto {
	protected ArrayList<Presupuesto> presupuestos;
	
	
	public Compuesta(String nombre) {
		super(nombre);
		presupuestos = new ArrayList<>();
	}

	public void addPresupuesto(Presupuesto pp) {
		if(!presupuestos.contains(pp)) {
			presupuestos.add(pp);
		}
	}

	public ArrayList<Presupuesto> buscar(Condicion cond){
		ArrayList<Presupuesto> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		for(Presupuesto pp: presupuestos) {
			aux.addAll(pp.buscar(cond));
		}
		return aux;
	}
	
	public double getCosto() {
		int suma=0;
		for(Presupuesto pp: presupuestos) {
			suma+= pp.getCosto();
		}
		return suma;
	}

}
