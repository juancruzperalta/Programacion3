import java.util.Comparator;

public class OrdenadoMayorAMenor implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.cantAlquilados()-o2.cantAlquilados();
	}

}
