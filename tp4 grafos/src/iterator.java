import java.util.Iterator;

public class iterator<T> implements Iterator<Integer> {

	private Iterator<Arco<T>> iterator;
	public iterator(Iterator<Arco<T>> iterator2) {
		iterator = iterator2;
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
