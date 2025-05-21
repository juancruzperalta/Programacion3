import java.util.Iterator;

public class MiIterator<T> implements Iterator<T>{

	Node<T> cursor; 
	
	public MiIterator(Node<T> first) {
		this.cursor=first;
	}
	public boolean hasNext() {
		return cursor!=null;
	}
	@Override
	public T next() {
		T info = cursor.getInfo();
		cursor = cursor.getNext();
		return info;
	}
}
