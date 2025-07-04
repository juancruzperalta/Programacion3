package tp1reh;

public class MySimpleLinkedList<T> {
	
	private Node<T> first, last;
	private int size;
	public MySimpleLinkedList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null,null);
		if(this.first==null) {
			this.last = tmp;
		}else {
			tmp.setNext(this.first);
			this.first.setPrev(tmp);	
		}
		this.first = tmp;
		this.size++;
	}
	//10->20->30
	public T extractFront() {		
		Node<T> node = this.first;
		if(this.first!=null) {
			if(node.getNext() != null) {
				this.first = this.first.getNext();
				this.size--;
			}else {
				this.first=null;
				this.size--;
			}
		}
		return node.getInfo();
	}

	public boolean isEmpty() {
		return this.first==null;
	}
	
	public T get(int index) {
		Node<T> tmp = this.first;
		int value=0;
		if(this.first!=null) {
			while(tmp!=null) {
				if(value==index) {
					return tmp.getInfo();
				}
				tmp= tmp.getNext();
				value++;
			}
		}
		return null;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		// TODO
		return "";
	}
	
	public int getElemento(T elemento) {
		if(this.first!=null) {
			int posicion=0;
			Node<T> tmp = this.first;
			while(tmp!=null) {
				if(tmp.getInfo() == elemento) {
					return posicion;
				}
				tmp=tmp.getNext();
				posicion++;
			}
		}
		return -1;
	}
	
	public void insertBack(T elemento) {
		if(this.last!=null) {
			Node<T> tmp = new Node<T>(elemento, null, null);
			tmp.setPrev(this.last);
			this.last.setNext(tmp);
			this.last = tmp;
			size++;
		}else {			
		insertFront(elemento);
		}
	}
	public T extractBack() {
		if(this.last!=null) {
			Node<T> tmp = this.last;
			if(this.last.getPrev()!=null) {
				this.last = this.last.getPrev();
				this.last.setNext(null);
				size--;
			}
			return tmp.getInfo();
		}
		return null;
	}
	public boolean constains(T element) {
		if(this.first != null) {
			Node<T> cursor = this.first;
			while(cursor!=null) {
				if(cursor.getInfo()==element) {
					return true;
				}
				cursor = cursor.getNext();
			}
		}
		return false;
	}
	public void insertAt(int index, T element) {
		if(this.first!=null) {
			int value=0;
			Node<T> cursor = this.first;
			while(cursor != null) {
				if(value==index) {
					Node<T> tmpNuevo = new Node<T>(element, null,null);
					cursor.getPrev().setNext(tmpNuevo);
					cursor.setNext(cursor.getNext());
					tmpNuevo.setNext(cursor);
					cursor.setPrev(tmpNuevo);
					size++;
				}
				cursor = cursor.getNext();
				value++;
			}
		}
	}
	
	public T remoteAt(int index) {
		if(this.first!=null) {
			Node<T> cursor = this.first;
			int value=0;
			while(cursor != null) {
				if(value==index) {
					Node<T> anterior = cursor.getPrev();
					Node<T> despues = cursor.getNext();
					if(anterior!=null) {
						anterior.setNext(despues);
					}else {
						this.first = despues;
					}
					if(despues!=null) {
						despues.setPrev(anterior);
					}else {
						this.last = anterior;
					}
					size--;
					return cursor.getInfo();
				}
				value++;
				cursor=cursor.getNext();
			}
		}
		return null;
	}
}
