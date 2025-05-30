package arbolResuelto;

public class TreeNodeRes {

	private Integer value;
	private TreeNodeRes left;
	private TreeNodeRes right;
	private char caracter; 

	public TreeNodeRes(Integer value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	public TreeNodeRes(char value) {
		this.caracter=value;
		this.left=null;
		this.right=null;
	}

	public TreeNodeRes getLeft() {
		return left;
	}

	public void setLeft(TreeNodeRes left) {
		this.left = left;
	}

	public TreeNodeRes getRight() {
		return right;
	}

	public void setRight(TreeNodeRes right) {
		this.right = right;
	}
	

	public Integer getValue() {
		return value;
	}
	public Integer setValue(int value) {
		return this.value=value;
	}
	
	public char getCaracter() {
		return caracter;
	}
	public char setCaracter(char value) {
		return this.caracter=value;
	}
	public boolean esHoja() {
		return this.getLeft()==null && this.getRight()==null;
	}

}
