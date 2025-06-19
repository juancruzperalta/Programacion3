import java.util.ArrayList;

public abstract class Compuesto extends Presupuesto {

	protected ArrayList<Presupuesto> elem;
	public Compuesto(String nn) {
		super(nn);
		elem = new ArrayList<>();
	}
	
	public void addElemento(Presupuesto pp) {
		this.elem.add(pp);
	}
	
	public ArrayList<Presupuesto> buscar(Condicion cond) {
		ArrayList<Presupuesto> aux = new ArrayList<>();
		
		for(Presupuesto pre: elem) {
			if(cond.cumple(pre)) {
				aux.add(pre);
			}
		}
		return aux;
		
	}
}
