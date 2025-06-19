
public class MySimpleLinkedList<T> {
	
	private Node<T> first, last, prev;
	int size;
	public MySimpleLinkedList() {
		this.first = null;
		this.last = null;
		this.prev=null;
		this.size=0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null,null);
		tmp.setNext(this.first);
		if(this.first==null) {
			this.last=tmp;
		}else {			
		this.first.setPrev(tmp);
		}
		this.first = tmp;
		this.size++;
	}
	
	public T extractFront() {		
		Node<T> cursor = this.first;
		if(this.first!=null) {
			if(this.first.getNext()!=null) {
				this.first = this.first.getNext();
				this.size--;
			}else {
				this.first = null;
				this.last = null;
				this.size--;
			}
		}
		return cursor.getInfo();
	}

	public boolean isEmpty() {
		return this.first==null;
	}
	
	public T get(int index) {
		if(this.first != null) {
			int pos=0;
			Node<T> cursor = this.first;
			while(cursor!=null) {
				if(pos==index) {
					return cursor.getInfo();
				}
				cursor = cursor.getNext();
				pos++;
			}
		}
		return null;
	}
	
	public int size() {
		return size;
	}
	public int indexOf(T elemento) {
		int pos=0;
		Node<T> cursor = this.first;
		if(this.first != null) {
			while(cursor != null) {
				if(cursor.getInfo() == elemento) {
					return pos;
				}
				pos++;
				cursor = cursor.getNext();
			}
		}
		return -1;
	}
	@Override
	public String toString() {
		// TODO
		return "";
	}
	public void insertBack(T element) {
		if(this.last!=null) {
			Node<T> cursor = this.last;
			Node<T> tmp = new Node<T>(element, null, null);
			cursor.setNext(tmp);
			tmp.setPrev(cursor);
			this.last = tmp;
			size++;
		}else {
			insertFront(element);
		}
	}
	public void insertAt(int index, T element) {
		if(this.first!=null) {
			Node<T> cursor = this.first;
			Node<T> nuevo = new Node<T>(element, null, null);
			int pos=0;
			while(cursor != null) {
				if(pos==index) {
					if(cursor.getPrev()!=null) {						
						nuevo.setNext(cursor);
					cursor.getPrev().setNext(nuevo);
					cursor.setPrev(nuevo);
					size++;
					}else {
						insertFront(element);
					}
				}
				cursor = cursor.getNext();
				pos++;
			}
		}
	}
	public T removeAt(int index) {
		if(this.first!=null) {
			int pos=0;
			Node<T> cursor = this.first;
			while(cursor!=null) {
				if(pos==index) {
					if(cursor.getPrev() != null && cursor.getNext() != null) {
					cursor.getPrev().setNext(cursor.getNext());
					cursor.getNext().setPrev(cursor.getPrev());
					size--;
					return cursor.getInfo();
					}else if(cursor.getNext()==null){						
						return extractLast();
					}else {						
					return extractFront();
					}
				}
				pos++;
				cursor=cursor.getNext();
			}
		}
		return null;
	}

	private T extractLast() {
		Node<T> tmp = this.last;
		if(this.last!=null) {
			if(tmp.getPrev()!=null)
			tmp = tmp.getPrev();
			tmp.setNext(null);
			this.last = tmp;
			size--;
		}
		return tmp.getInfo();
	}
	public boolean estaT(T elemento) {
		if(this.first!= null) {
			Node<T> cursor = this.first;
			while(cursor!=null) {
				if(cursor.getInfo()==elemento) {
					return true;
				}
				cursor= cursor.getNext();
			}
		}
		return false;
	}
}