package tp1reh;

public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	private int size;
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		size++;
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
			while(tmp.getNext()!=null) {
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
			while(tmp.getNext()!=null) {
				if(tmp.getInfo() == elemento) {
					return posicion;
				}
				tmp=tmp.getNext();
				posicion++;
			}
		}
		return -1;
	}
}
