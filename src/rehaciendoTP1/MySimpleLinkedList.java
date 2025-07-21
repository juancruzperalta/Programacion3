package rehaciendoTP1;
import java.util.*;
public class MySimpleLinkedList<T> {
	
	private Node<T> first, last;
	private int size;
	public MySimpleLinkedList() {
		this.first = null;
		this.last = null;
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
	
	public T extractFront() {		
		Node<T> cursor = this.first;
		if(this.first!=null) {
			if(this.first.getNext()!=null) {				
			this.first.setNext(this.first.getNext());
			}else {				
			this.first.setNext(null);
			}
			this.size--;
		}
		return cursor.getInfo();
	}

	public boolean isEmpty() {
		return this.size==0;
	}
	
	public T get(int index) {
		int posi=0;
		Node<T> cursor = this.first;
		while(cursor != null) {
			if(index == posi) {
				return cursor.getInfo();
			}
			posi++;
			cursor = cursor.getNext();
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
	public int indexOf(T elemento) {
		Node<T> cursor = this.first;
		int pos=0;
		while(cursor != null) {
			if(cursor.getInfo().equals(elemento)) {
				return pos;
			}
			pos++;
			cursor = cursor.getNext();
		}
		return -1;
	}
	public void insertBack(T element) {
		Node<T> cursor = this.last;
		Node<T> sig = new Node<T>(element, null,null);
		if(this.last != null) {
			cursor.setNext(sig);
			this.last = sig;
			this.size++;
		}
	}
	public void insertAt(int index, T element) {
		int pos=0;
		Node<T> cursor = this.first;
		Node<T> nuevo = new Node<T>(element, null,null);
		while(cursor != null) {
			if(index == pos) {
				nuevo.setNext(cursor.getNext());
				cursor.setNext(nuevo);
				this.size++;
			}
			pos++;
			cursor =cursor.getNext();
		}
	}
	public List<T> listaDeElement(){
		List<T> lista = new LinkedList<>();
		Node<T> cursor = this.first;
		while(cursor!=null) {
			lista.add(cursor.getInfo());
			cursor=cursor.getNext();
		}
		return lista;
	}
	
	public T removeBack() {
		Node<T> cursor = this.last;
			if(cursor.getPrev()!=null) {
				this.last=cursor.getPrev();
				cursor.getPrev().setNext(null);
				return cursor.getInfo();
		}else {
			extractFront();
		}
	 return null;
	}
	public boolean contains(T element) {
		Node<T> cursor = this.first;
		while(cursor!=null) {
			if(cursor.getInfo()==element) {
				return true;
			}
			cursor=cursor.getNext();
		}
		return false;
	}
	public T getFirst() {
		return this.first.getInfo();
	}
	public T getLast() {
		return this.last.getInfo();
	}
	public boolean equals(MySimpleLinkedList<T> otraLista) {
		int pos=0;
		Node<T> cursor = this.first;
		while(pos <= this.size && pos <= otraLista.size) {
			if(pos==otraLista.size) {
				return true;
			}
			if(cursor.getInfo() != otraLista.get(pos)) {
				return false;
			}
			pos++;
			cursor=cursor.getNext();
		}
		return false;
	}
	public boolean remove(T element) {
		Node<T> cursor = this.first;
		boolean borrado=false;
		while(cursor != null) {
			if(cursor.getInfo() == element) {
				cursor.getPrev().setNext(cursor.getNext());;
				cursor.getNext().setPrev(cursor.getPrev());
				borrado = true;
			}
			cursor = cursor.getNext();
		}
		return borrado;
	}
}
