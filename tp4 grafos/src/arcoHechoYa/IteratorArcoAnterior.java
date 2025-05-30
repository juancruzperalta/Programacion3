package arcoHechoYa;
import java.util.Iterator;

public class IteratorArcoAnterior<T> implements Iterator<Integer>{

	private Iterator<ArcoAnterior<T>> iterator;
	
	public IteratorArcoAnterior(Iterator<ArcoAnterior<T>> it) {
		iterator = it;
	}
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Integer next() {
		return iterator.next().getVerticeDestino();
	}

}
