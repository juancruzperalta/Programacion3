import java.util.*;

public class Iterators<T> implements  Iterator<Integer>{

	private Iterator<Arco<T>> arcoIterator;

	public Iterators(List<Arco<T>> arcos) {
		this.arcoIterator = arcos.iterator();
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
