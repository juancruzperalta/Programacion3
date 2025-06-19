import java.util.Comparator;

public class OrdenIdentificacion implements Comparator<Elemento>{

	@Override
	public int compare(Elemento o1, Elemento o2) {
		int res = o1.codigo-o2.codigo;
		if(res == 0) {
			return o1.getAntiguedad()-o2.getAntiguedad();
		}
		return res;
	}
	
}
