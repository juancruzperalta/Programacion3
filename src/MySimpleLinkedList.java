
public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	private Node<T> last;
	private int size;
	public MySimpleLinkedList() {
		this.first = null;
		this.last = null;
		size=0;
	}
	//O(1)
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null, null);
		tmp.setNext(this.first);
		if(tmp.getNext()==null) {			
			this.last=tmp;
		}
		if(tmp.getNext()!=null) {
			this.first.setPrev(tmp);
		}
		this.size++;
		this.first = tmp;
	}
	//O(1)
	public void insertLast(T info) {
		if(this.isEmpty()) {
			this.insertFront(info);
		}
		Node<T> cursor = this.last;
		Node<T> cursorNuevo = new Node<T>(info, null, null);
		cursorNuevo.setPrev(cursor);
		cursor.setNext(cursorNuevo);
		this.size++;
		this.last=cursorNuevo;
	}
	public T mostrarUltimoElemento() {
		return this.last.getInfo();
	}
	//O(n)
	public T extractFront() {		
		Node<T> cursor = this.first;
		if(this.first!=null) {
		if(cursor.getNext() != null) {
			Node<T> next = cursor.getNext();
			this.first=next;
			cursor.setNext(null);
			this.size--;
			return cursor.getInfo();
		}
			cursor.setNext(null);
			this.size--;
			return cursor.getInfo();
			}
		return null;
	}
	public void eliminarUltimo() {
		if(this.last.getPrev() != null) {
			this.last = this.last.getPrev();
			this.last.setNext(null);
		}
	}
	//O(1);
	public boolean isEmpty() {
		return size==0;
	}
	//O(n)
	public T get(int index) {
		Node<T> cursor = this.first;
		int valor=0;
		while(valor < size) {
			if(valor==index) {
				return cursor.getInfo();
			}
			valor++;
			cursor = cursor.getNext();
		}
		return null;
	}
	//O(1)
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		return this.first.getInfo() + " | " + this.size;
	}
	public int indexOf(T elem) {
		Node<T> cursor = this.first;
		int value=0;
		if(this.first!= null) {
			while(value < size) {
				if(cursor.getInfo() ==elem) {
					return value;
				}
					value++;
					cursor = cursor.getNext();
			}
		}
		return -1;
	}
}
