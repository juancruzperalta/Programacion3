import java.util.Comparator;

public class OrdenCodigo implements Comparator<Elemento> {
	
	public int compare(Elemento o1, Elemento o2) {
		int res = o1.getCodigo()-o2.getCodigo();
		if(res == 0) {
			return o1.getAntiguedad() - o2.getAntiguedad();
			
		}
		return res;
	}
}
