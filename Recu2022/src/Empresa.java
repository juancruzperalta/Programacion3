import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
	private ArrayList<Cliente> clientes;
	private ArrayList<ElementoAbstracto> elementos;
	
	public Empresa() {
		super();
		clientes = new ArrayList<>();
		elementos = new ArrayList<>();
	}
	public void addCliente(Cliente cc) {
		clientes.add(cc);
	}
	
	public void addElemento(ElementoAbstracto el) {
		elementos.add(el);
	}
	
	public ArrayList<Cliente> obtenerCliente(Comparator<Cliente> ordenado){
		ArrayList<Cliente> copia = new ArrayList<>();
		for(Cliente cc: clientes) {
			copia.add(cc);
		}
		Collections.sort(copia, ordenado);
		return copia;
	}
	
}
