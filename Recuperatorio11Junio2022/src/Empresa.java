import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
	private ArrayList<Cliente> clientes;
	private ArrayList<ElementoAlquiler> elementos;

	
	public Empresa() {
		super();
		elementos = new ArrayList<>();
		clientes = new ArrayList<>();
	}
	

	public void addCliente(Cliente cc) {
		clientes.add(cc);
	}
	public void addElemento(ElementoAlquiler cc) {
		elementos.add(cc);
	}
	
	public ArrayList<Cliente> clientes(Comparator<Cliente> orden){
		ArrayList<Cliente> copia = new ArrayList<>(clientes);
		Collections.sort(copia, orden);
		return copia;
	}
}
