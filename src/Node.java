
public class Node<T> {

	private T info;
	private Node<T> next;
	private Node<T> prev;
	public Node() {
		this.info = null;
		this.next = null;
		this.prev = null;
	}
	
	public Node(T info, Node<T> next, Node<T> prev) {
		this.setInfo(info);
		this.setNext(next);
		this.setPrev(prev);
	}
	
	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

}
