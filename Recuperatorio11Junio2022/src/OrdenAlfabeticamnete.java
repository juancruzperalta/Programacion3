import java.util.Comparator;

public class OrdenAlfabeticamnete implements Comparator<Cliente>{
	
	@Override
	public int compare(Cliente o1, Cliente o2) {
		int res = o1.getApellido().compareTo(o2.getApellido());
		if(res == 0) {
			return o1.getNombre().compareTo(o2.getNombre());
		}
		return res;
	}

}
