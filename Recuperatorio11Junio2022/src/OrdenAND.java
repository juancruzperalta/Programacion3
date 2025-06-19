import java.util.Comparator;

public class OrdenAND implements Comparator<Cliente>{
	private Comparator<Cliente> c1,c2;
	
	public OrdenAND(Comparator<Cliente> c1, Comparator<Cliente> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Cliente o1, Cliente o2) {
		int res = c1.compare(o1, o2);
		if(res == 0) {
			 return c2.compare(o1, o2);
		}
		return res;
	}

}
