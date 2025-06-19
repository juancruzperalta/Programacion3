import java.util.Comparator;

public class OrdenPorNombre implements Comparator<Pedido>{

	@Override
	public int compare(Pedido o1, Pedido o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	

}
