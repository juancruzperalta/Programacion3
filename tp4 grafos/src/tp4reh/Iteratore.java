package tp4reh;
import java.util.Iterator;
import java.util.List;

public class Iteratore<T> implements  Iterator<Integer>{

	private Iterator<Arco<T>> arcoIterator;


	public Iteratore(Iterator<Arco<T>> iterator) {
		this.arcoIterator = iterator;
		// TODO Auto-generated constructor stub
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
