import java.util.Comparator;

public class OrdenPorNombreMayor implements Comparator<Archivo>{

	@Override
	public int compare(Archivo o1, Archivo o2) {
		return o1.getNombre().compareTo(o2.getNombre());
		
	}

}
