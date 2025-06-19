import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sector extends AbstractPedido{
	private ArrayList<AbstractPedido> elementos;
	public Sector(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	
	public void addPedido(AbstractPedido pp) {
		if(!elementos.contains(pp)) {
			elementos.add(pp);
		}
	}
	

	@Override
	public int volumenEstimado() {
		int suma=0;
		for(AbstractPedido el: elementos) {
			suma += el.volumenEstimado();
		}
		return suma;
	}
	@Override
	public int pesoEstimado() {
		int suma=0;
		for(AbstractPedido el: elementos) {
			suma += el.pesoEstimado();
		}
		return suma;
	}
	@Override
	public ArrayList<String> palabrasClave() {
		ArrayList<String> copia = new ArrayList<>();
		for(AbstractPedido el: elementos) {
			copia.addAll(el.palabrasClave());
		}
		return copia;
	}

	@Override
	public int cantPedidos() {
		int suma=0;
		for(AbstractPedido el: elementos) {
			suma+= el.cantPedidos();
		}
		return suma;
	}

	@Override
	public ArrayList<Pedido> buscar(Condicion cond) {
		ArrayList<Pedido> aux = new ArrayList<>();
		for(AbstractPedido el: elementos) {
			aux.addAll(el.buscar(cond));
		}
		return aux;
	}

	@Override
	public ArrayList<Pedido> buscar(Condicion cond, Comparator<Pedido> orden) {
		ArrayList<Pedido> aux = new ArrayList<>();
		for(AbstractPedido el: elementos) {
			aux.addAll(el.buscar(cond));
		}
		Collections.sort(aux, orden);
		return aux;
	}

	
	
}
