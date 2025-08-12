package tp4r;
import java.util.*;

public class Iterators<T> implements  Iterator<Integer>{

	private Iterator<Arco<T>> arcoIterator;

	public Iterators(Iterator<Arco<T>> iterator) {
		this.arcoIterator = iterator;
	}

	@Override
	public boolean hasNext() {
		return arcoIterator.hasNext();
	}

	@Override
	public Integer next() {
		return arcoIterator.next().getVerticeDestino();
	}
	
}
