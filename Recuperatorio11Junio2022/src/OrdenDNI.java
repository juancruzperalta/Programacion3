import java.util.Comparator;

public class OrdenDNI  implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.getDni()-o2.getDni();
	}
	
}
