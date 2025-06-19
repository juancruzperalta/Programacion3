import java.util.Comparator;

public class Orden implements Comparator<Elemento>{

	@Override
	public int compare(Elemento o1, Elemento o2) {
		int res = o1.getCodigoIdentificado() - o2.getCodigoIdentificado();
		if(res == 0) {
			return o1.antiguedad() - o2.antiguedad();
		}
		return res;
	}

}
