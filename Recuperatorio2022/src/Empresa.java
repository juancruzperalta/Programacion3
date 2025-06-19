import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
	private ArrayList<Cliente> clientes;
	private ArrayList<ElementoAbstracto> elems;

	public Empresa() {
		clientes = new ArrayList<>();
		elems =new ArrayList<>();
	}
	
	public void addCliente(Cliente cc) {
			clientes.add(cc);

	}
	public void addElemento(ElementoAbstracto ee) {
		elems.add(ee);
	}
	
	public ArrayList<Cliente> obtenerCliente(Comparator<Cliente> orden){
		ArrayList<Cliente> aux =new ArrayList<>(clientes);
		Collections.sort(aux, orden);
		return aux;
	}
}
