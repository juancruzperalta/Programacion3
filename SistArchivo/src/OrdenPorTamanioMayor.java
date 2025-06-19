import java.util.Comparator;

public class OrdenPorTamanioMayor implements Comparator<Archivo> {

	@Override
	public int compare(Archivo o1, Archivo o2) {
		return (int) (o1.getTamanio() - o2.getTamanio());
	}

}
