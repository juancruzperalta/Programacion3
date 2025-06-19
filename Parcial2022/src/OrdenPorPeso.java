import java.util.Comparator;

public class OrdenPorPeso implements Comparator<Pedido>{

	@Override
	public int compare(Pedido o1, Pedido o2) {
		return o1.getPeso()-o2.getPeso();
	}

}
