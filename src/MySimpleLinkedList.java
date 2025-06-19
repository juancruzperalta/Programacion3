
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
	public void insertarLast(T valor) {
		Node<T> nuevo = new Node<>(valor, null,null);
		if(this.first!=null) {
			if(this.last!= null) {
				nuevo.setPrev(this.last);
				this.last.setNext(nuevo);
				this.last = nuevo;
				size++;
				}
			}//Obviamente cuando se crea el insertFront agrega el primer elem creado como LAST.
			else {
			this.last = nuevo;
			this.first = nuevo;
		}
	}
	
	public int nodosEnreLastYFirst() {
		int size=0;
		if(this.first != null && this.last!=null) {
			Node<T> cursor = this.last;
			while(cursor.getPrev() != null) {
				size++;
				cursor = cursor.getPrev();
				if(cursor==this.first) {
					return size;
				}
			}
		}
		return -1;
	}
	public void insertarNodoAntes() {
		if(this.first != null) {
			int nodoX =0;
			Node<T> cursor = this.first;
			while(cursor != null) {
				Node<T> nuevoNodo = new Node<>(nodoX, null, null);
				Node<T> cursorSig = cursor.getNext();
				if(cursor == this.first &&cursor.getInfo().intValue()%2!=0) {
					this.first = nuevoNodo;
					this.first.setNext(cursor);
					cursor.setPrev(this.first);
				}
				if (cursorSig != null && cursorSig.getInfo().intValue() % 2 != 0) {
					cursor.setNext(nuevoNodo);
					nuevoNodo.setNext(cursorSig);
					nuevoNodo.setPrev(cursor);
					cursorSig.setPrev(nuevoNodo);
					cursor= cursor.getNext();
				}else {
					cursor = cursor.getNext();
				}
			}
		}
	}
	public void Duplicar() {
		if(this.first != null) {			
		Node<T> cursor = this.first;
			while(cursor.getNext() != null) {
			 Node<T> duplicado = new Node<>(cursor.getInfo(), null, null);
			 cursor.setNext(duplicado);
			 duplicado.setPrev(cursor);
			 cursor = cursor.getNext().getNext();
			}
		}
	}
	public void eliminar(T valor) {
		if(this.first!=null) {
			Node<T> cursor = this.first;
			int i=0;
			while(i < size && cursor.getNext()!=null) {
				if(cursor.getInfo()==valor) {
					if(cursor.getNext() != null)
					cursor = cursor.getNext();
					else if(cursor.getPrev() != null){
						cursor = cursor.getPrev();
						cursor.setNext(null);
					}else {
						cursor = null;
					}
				}
				else {
					i++;
					cursor = cursor.getNext();
				}
			}
		}
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
