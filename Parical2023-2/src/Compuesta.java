import java.util.ArrayList;

public abstract class Compuesta extends Presupuesto{
	protected ArrayList<Presupuesto> elems;
	
	public Compuesta(String nombre) {
		super(nombre);
		elems = new ArrayList<>();
	}
	
	public void addElemento(Presupuesto pp) {
		if(!elems.contains(pp)) {
			elems.add(pp);
		}
	}
	
	public ArrayList<Presupuesto> buscar(Condicion cond){
		ArrayList<Presupuesto> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}else {
			for(Presupuesto pp: elems) {
				aux.addAll(pp.buscar(cond));
			}
		}
		return aux;
	}
	
	public double getCosto() {
		int suma=0;
		for(Presupuesto pp: elems) {
			suma += pp.getCosto();
		}
		return suma;
	}

}
