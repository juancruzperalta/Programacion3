import java.util.Iterator;


public class Iterators<T> implements  Iterator<Integer>{

	private Iterator<Arco<T>> iterator;
	
	public Iterators(Iterator<Arco<T>> it) {
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
