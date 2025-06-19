import java.util.ArrayList;

public abstract class Compuesta extends Presupuesto {
	protected ArrayList<Presupuesto> elems;
	
	public Compuesta(String nombre) {
		super(nombre);
		elems = new ArrayList<>();
	}
	public void addPresupuesto(Presupuesto pp) {
		if(!elems.contains(pp)) {
			elems.add(pp);
		}
	}
	
	public ArrayList<Presupuesto> buscar(Condicion cond){
		ArrayList<Presupuesto> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		for(Presupuesto au: elems) {
			if(cond.cumple(au)) {
				aux.add(au);
			}
		}
		return aux;
	}

	public int calcularCosto() {
		int suma=0;
		
		for(Presupuesto pp: elems) {
			suma += pp.calcularCosto();
		}
		
		return suma;
	}
	
	
	

}
