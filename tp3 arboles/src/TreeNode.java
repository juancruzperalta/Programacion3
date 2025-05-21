
public class TreeNode {

	private Integer value;
	private TreeNode left;
	private TreeNode right;
	private char caracter; 

	public TreeNode(Integer value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	public TreeNode(char value) {
		this.caracter=value;
		this.left=null;
		this.right=null;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
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
