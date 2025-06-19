package tp1hecho;

import java.util.Iterator;

public class MySimpleLinkedListResuelto<T extends Comparable<T>> implements Iterable<T>{
	
	private NodeResuelto<T> first,last,prev;
	private int size;
	//O(1)
	public MySimpleLinkedListResuelto() {
		this.first = null;
		this.last = null;
		this.prev = null;
		this.size = 0;
	}
	//O(1)
	public void insertFront(T info) {
		NodeResuelto<T> tmp = new NodeResuelto<T>(info,null);
		if(this.first==null) {
			this.last = tmp;
		}else {
			tmp.setNext(this.first);
			this.first.setPrev(tmp);	
		}
		this.first = tmp;
		this.size++;
	}
	//O(1) ya que siempre es constante.
	public void insertLast(T info) {
		if(this.first==null) {
			this.insertFront(info);
		}else {
			this.last.setNext(new NodeResuelto<T>(info, null));
			size++;
		}
	}
	/*O(1) Ya que voy al siguiente una sola vez.*/
	public T extractFront() {
		NodeResuelto<T> tmp = this.first;
		if(this.first != null) {
			tmp = this.first.getNext();
		this.first=tmp;
		this.size--;
		}
		else {
		  return null;
		}
		return tmp.getInfo();
	}
	/*O(1) ya que solamente hace un acceso al tamaño.*/
	public boolean isEmpty() {
		if(this.first == null) {
			return true;
		}
		return false;
	}
	
    /*O(n) ya que debemos ingresar al nodo completo cada inserciones necesarias, 
     * hasta encontrar el que buscamos.
     */
	public T get(int index) {
		NodeResuelto<T> cursor = this.first;
		for(int i=0; i<this.size; i++) {
			if(index!=i) {
				cursor = cursor.getNext();
			}else {				
				return cursor.getInfo();
			}
		}
		return null;
	}
	
	//---------------------------------------------------------------
	/*O(1) sería en este caso por que accede solo una vez al tamaño*/
	public int size() {
		return size;
	}
	//---------------------------------------------------------------
	//Ejercicio 3
	/*O(n) ya que debo hacer un for buscando por todos los elementos, hasta encontrar
	 * el que yo buscaba.
	 */
	public int indexOf(T elem) {
		int i=0;
		int pos=0;
		NodeResuelto<T> cursor = this.first;
		if(cursor != null) {
			while(i < size) {
				if(cursor.getInfo().equals(elem)) {
				pos+=i;
				return pos;
			}else {
				cursor = cursor.getNext();
			}
			i++;
		 }
			return -1;
		}
		return -1;
		
	}
	
	//---------------------------------------------------------------
	/*O(n) por que hago acceso a cada parte del nodo para buscar y dependiendo de cuantas
tenga haré más o menos accesos.
	 */
	
	@Override
	public String toString() {
		String cadena = "[";
		NodeResuelto<T> current = this.first;

		while (current != null) {
			cadena += current.getInfo();
			if (current.getNext() != null) {
				cadena += "-";
			}
			current = current.getNext();
		}
		cadena += "]";
		return cadena;
	}
	
	
	
	//---------------------------------------------------------------
	//---------------------------------------------------------------
	/*Metodo a revisar (O(n))
	 * en el peor de los casos el anterior será el anteultimo
	 */
	public T getPrev(T valor) {
		NodeResuelto<T> cursor = this.first;
		while(cursor != null) {
			if(cursor.getInfo().equals(valor)) {
				if(cursor.getPrev()!=null) {
					return cursor.getPrev().getInfo();
				}else {
					return null;
				}
			}
			cursor = cursor.getNext();
		}
		return null;
	}
	//---------------------------------------------------------------
	@Override
	/*
	 * Metodo a revisar
	 */
	public Iterator<T> iterator() {
		return new MiIterator<T>(this.first);
	}
	
	//---------------------------------------------------------------
	/*Metodo a revisar (hicimos en clase sin dos cursores, ahora intente con 2 cursores)
	 * O(n) por que en el peor de los casos al que tengo que eliminar 
	 * este en la última posición
	 */
	public void eliminarElemento(T valor) {
		NodeResuelto<T> cursor = this.first;
		NodeResuelto<T> cursorAvanzado = cursor.getNext();
		if(cursor != null && cursorAvanzado != null) {
			if(cursor.getInfo()==valor && cursor.getNext()!=null) {
				this.first = cursor.getNext();
			}else {
				while(cursorAvanzado.getInfo() != valor) {
					cursorAvanzado = cursorAvanzado.getNext();
					cursor = cursor.getNext();
				}
				cursor.setNext(cursorAvanzado.getNext());
			}
		}
		if(cursor.getInfo()==valor && cursor.getNext()==null) {
			this.first = null;
		}
	}
	/*Revisar
	 * Esta es una de las maneras que se me ocurrió,
	 * pero que sucede, primero copio las listas a la tercera,
	 * uso bubleshort por qué todavía no había visto bien quickshort y mergeshort
	 */
	public void insertarAmbasListas(MySimpleLinkedListResuelto<T> Lista1, MySimpleLinkedListResuelto<T> Lista2) {
		NodeResuelto<T> cursor = Lista1.first;
		NodeResuelto<T> otraLista = Lista2.first;
		
		if(cursor == null || otraLista == null) return;
		while(cursor != null && otraLista != null) {
			this.insertFront(cursor.getInfo());
			this.insertFront(otraLista.getInfo());
			cursor = cursor.getNext();
			otraLista = otraLista.getNext();
		}
	}
	/*
	 * Seria O(n), ahora por qué hago este metodo, por que en el caso que la lista 
	 * ya esté ordenada, evito hacer un ORDENARME por ejemplo innecesariamente. 
	 */
	public boolean estoyOrdenado() {
		NodeResuelto<T> cursor = this.first;
		//tengo uno solo, no avanzo más.
		if(cursor ==null && cursor.getNext() == null) return true;
		while(cursor != null && cursor.getNext() != null) {
				if(cursor.getInfo().compareTo(cursor.getNext().getInfo()) > 0) {
					return false;
					}
					cursor = cursor.getNext();
			}
		return true;
	}
	public void ordenarme() {
	    NodeResuelto<T> cursor = this.first;
	    while(cursor != null) {
	    	if(cursor.getNext() != null) {
	    	if(cursor.getInfo().compareTo(cursor.getNext().getInfo()) > 0) {
	    		T temp = cursor.getInfo();
                cursor.setInfo(cursor.getNext().getInfo());
                cursor.getNext().setInfo(temp);
                ordenarme();
	    		}
	    	}
	    	cursor = cursor.getNext();
	    }
	}
	public int contarApariciones(T valor) {
		int aparicion=0;
		NodeResuelto<T> cursor = this.first;
		while(cursor != null) {
			if(cursor.getInfo().equals(valor)) {
				aparicion++;
			}
			cursor=cursor.getNext();
		}
		return aparicion;
	}
}
