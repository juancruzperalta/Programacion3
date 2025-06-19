import java.util.Comparator;

public class OrdenCantidadAlquilado implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.cantElementosAlquilados()-o2.cantElementosAlquilados();
	}

}
