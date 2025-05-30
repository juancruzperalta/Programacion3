
public class NodeResuelto<T> {

	private T info;
	private NodeResuelto<T> next;
	private NodeResuelto<T> prev;

	public NodeResuelto() {
		this.info = null;
		this.next = null;
		this.prev = null;
	}
	
	public NodeResuelto(T info, NodeResuelto<T> next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
	public NodeResuelto<T> getNext() {
		return next;
	}

	public void setNext(NodeResuelto<T> next) {
		this.next = next;
	}
	public NodeResuelto<T> getPrev() {
		return prev;
	}

	public void setPrev(NodeResuelto<T> prev) {
		this.prev = prev;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

}
