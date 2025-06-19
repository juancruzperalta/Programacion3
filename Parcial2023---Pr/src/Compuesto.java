import java.util.ArrayList;

public abstract class Compuesto extends Presupuesto {

	protected ArrayList<Presupuesto> elementos;

	public Compuesto(String nombre) {
		super(nombre);
		elementos = new ArrayList<>();
	}
	
	public void addElemento(Presupuesto elemento) {
		elementos.add(elemento);
	}
	
	public ArrayList<Presupuesto> buscar(Condicion cond){
		ArrayList<Presupuesto> aux =new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}else {
			for(Presupuesto pp: elementos) {
				aux.addAll(pp.buscar(cond));
			}
		}		
		return aux;
	}
	
	public double getCosto() {
		int suma=0;
		for(Presupuesto pp: elementos) {
			suma += pp.getCosto();
		}
		return suma;
	}
}
