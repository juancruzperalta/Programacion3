
public class MySimpleLinkedList<T> {
	
	private Node<T> first, last;
	private int size;
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	//O(1)
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null,null);
		if(this.first == null) {
			this.last = tmp;
			tmp.setNext(this.first);
			this.first = tmp;
		}else {			
		this.first.setPrev(tmp);
		tmp.setNext(this.first);
		this.first = tmp;
		size++;
		}
	}
	public void insertBack(T info) {
		if(this.last != null) {
			Node<T> tmp = new Node<T>(info, null, null);			
			size++;
			tmp.setPrev(this.last);
			this.last.setNext(tmp);
			this.last = tmp;
		}
	}
	//O(1)
	public T extractFront() {		
		if(this.first != null) {
			Node<T> cursor = this.first;
			if(cursor.getNext() != null) {
				this.first = cursor.getNext();
				size--;
				return cursor.getInfo();
			}
			size--;
			this.first = null;
			return cursor.getInfo();
		}
		return null;
	}
	//O(1)
	public boolean isEmpty() {
		return this.first==null;
	}
	//O(n)
	public T get(int index) {
		if(this.first != null) {
			int valor=0;
			Node<T> cursor = this.first;
			while(cursor!=null) {
				if(valor == index) {
					return cursor.getInfo();
				}
				valor++;
				cursor = cursor.getNext();
			}
		}
		return null;
	}
	//O(1)
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		// TODO
		return "";
	}
	
	public int indexOf(T elemento) {
		if(this.first!=null) {
			Node<T> cursor = this.first;
			int index=0;
			while(cursor != null) {
				if(cursor.getInfo() == elemento) {
					return index;
				}
				cursor=cursor.getNext();
				index++;
			}
		}
		return -1;
	}
	public T extractBack() {
		if(this.last!=null) {
			Node<T> cursor = this.last;
			if(cursor.getPrev() != null) {
				this.last = this.last.getPrev();
				this.last.setNext(null);
				return cursor.getInfo();
			}
		}
		return null;
	}
	
	public void insertAt(int index, T elem) {
		if(this.first != null) {
			int valor=0;
			Node<T> cursor = this.first;
			Node<T> nuevo = new Node<T>(elem, null, null);
			while(cursor!=null) {
				if(valor == index) {
					if(cursor.getNext() != null) {						
					nuevo.setPrev(cursor);
					nuevo.setNext(cursor.getNext());
					cursor.setNext(nuevo);
					size++;
					}else {
						insertBack(elem);
					}
				}
				valor++;
				cursor=cursor.getNext();
			}
		}
	}
	public T removeAt(int index) {
		if(this.first!=null) {
			int valor=0;
			Node<T> cursor = this.first;
			while(cursor != null) {
				if(valor == index) {
					cursor.getPrev().setNext(cursor.getNext());
					size--;
					return cursor.getInfo();
				}
				valor++;
				cursor=cursor.getNext();			
				}
		}
		return null;
	}
}
