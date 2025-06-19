import java.util.Comparator;

public class OrdenadoPorApellido implements Comparator<Cliente>{
	public int compare(Cliente c1, Cliente c2) {
		return c1.getApellido().compareTo(c2.getApellido());
	}
}
