import java.util.Iterator;

public class IteratorArco<T> implements Iterator<Integer>{

	private Iterator<Arco<T>> iterator;
	
	public IteratorArco(Iterator<Arco<T>> it) {
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
