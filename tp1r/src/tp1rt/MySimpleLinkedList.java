package tp1rt;

public class MySimpleLinkedList<T> {
	
	private Node<T> first, last;
	int size=0;
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		if(this.first==null) {
			tmp.setNext(this.first);
			last = tmp;
		}
		this.first = tmp;
	}
	
	public T extractFront() {		
		if(this.first != null) {
			Node<T> cursor = this.first;
			if(cursor.getNext() != null) {
				this.first = cursor.getNext();
				return cursor.getInfo();
			}
			this.first = null;
			return null;
		}
		return null;
	}

	public boolean isEmpty() {
		return this.first==null;
	}
	
	public T get(int index) {
		if(this.first != null) {
			Node<T> cursor = this.first;
			int valor=0;
			while(cursor != null) {
				if(valor == index) {
					return cursor.getInfo();
				}
				cursor = cursor.getNext();
				valor++;
			}
		}
		return null;
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		// TODO
		return "";
	}
	
}
