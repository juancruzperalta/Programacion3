import java.util.ArrayList;

public abstract class Compuesto extends Presupuesto {
	protected ArrayList<Presupuesto> elem;
	
	public Compuesto(String nombre) {
		super(nombre);
		elem = new ArrayList<>();
	}
	
	public void addElemento(Presupuesto pp) {
		if(!elem.contains(pp)) {
			elem.add(pp);
		}
	}

	public ArrayList<Presupuesto> buscar(Condicion cond){
		ArrayList<Presupuesto> aux = new ArrayList<>();
		for(Presupuesto pp: elem) {
			if(cond.cumple(pp)) {
				aux.add(pp);
			}
		}
		return aux;
	}
}
