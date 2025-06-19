import java.util.Comparator;

public class OrdenDoble implements Comparator<Cliente>{
	Comparator<Cliente> c1,c2;
	
	
	public int compare(Cliente o1, Cliente o2) {
		int res = c1.compare(o1, o2);
		if(res == 0) {
			return c2.compare(o1, o2);
		}
		return res;
	}
	
}
