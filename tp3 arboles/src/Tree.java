import java.util.List;
import java.util.LinkedList;

public class Tree {

	private TreeNode root;
	
	public Tree() {
		this.root = null;
	}
	
	public void add(Integer value) {
		if (this.root == null)
			this.root = new TreeNode(value);
		else
			this.add(this.root,value);
	}
	
	private void add(TreeNode actual, Integer value) {
		if (actual.getValue() > value) {
			if (actual.getLeft() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setLeft(temp);
			} else {
				add(actual.getLeft(),value);
			}
		} else if (actual.getValue() < value) {
			if (actual.getRight() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setRight(temp);
			} else {
				add(actual.getRight(),value);
			}
		}
	}
	/*
	 * Sería un O(1). Si el primero es null, entonces dice "vacio"
	 * si no, sería con elementos.
	 */
	public boolean isEmpty() {
		return this.root == null;
	}
	/*
	 * O(1)
	 */
	public int getRoot() {
		TreeNode nuevoRoot = this.root;
		return nuevoRoot.getValue();
	}
	public boolean hasElem(int integer) {
		TreeNode nuevoRoot = this.root;
		if(nuevoRoot.getValue()==integer) return true;
		while(nuevoRoot != null) {
			if(integer > nuevoRoot.getValue()) {
				nuevoRoot=nuevoRoot.getRight();
			}else if(integer < nuevoRoot.getValue()) {
				nuevoRoot=nuevoRoot.getLeft();
			}else {
				return true;
			}
			
		}
		return false;
	}

	public int getHeight() {
		return getHeight(this.root);
	}
	private int getHeight(TreeNode node) {
		if(node==null) return -1;
		int heightIzq=0, heightDer=0;
			if(node.getLeft()!=null) {
				heightIzq = getHeight(node.getLeft());
			}
			if(node.getRight()!=null) {
				heightDer = getHeight(node.getRight());
			}
		if(heightIzq > heightDer) {
			return heightIzq+1;
		}
		return heightDer+1;
	}
	public void printPosOrder() {
		TreeNode node = this.root;
		printPosOrder(node);
	}
	private void printPosOrder(TreeNode node) {
		if(node == null) return;
		
		printPosOrder(node.getLeft());
		printPosOrder(node.getRight());
        System.out.print(node.getValue() + " "); 		
	}
	public void printPreOrder() {
		TreeNode node = this.root;
		printPreOrder(node);
	}
	private void printPreOrder(TreeNode node) {
		if(node==null) return;
		
	      System.out.print(node.getValue() + " "); 
	        printPreOrder(node.getLeft()); 
	        if(node.getLeft()==null) {
	        	System.out.print("-");
	        }
	        printPreOrder(node.getRight()); 
	        if(node.getRight()==null) {
	        	System.out.print("-");
	        }
	}
	public void printInOrder() {
		printInOrder(this.root);
	}
	private void printInOrder(TreeNode node) {
        if (node == null) 
            return; 
  
        printInOrder(node.getLeft()); 
        System.out.print(node.getValue() + " "); 
  
        printInOrder(node.getRight()); 
	}
	
	public List<Integer> getLongestBranch(){
		if(this.root==null) return new LinkedList<>();
		return getLongestBranch(this.root);
	}
	private List<Integer> getLongestBranch(TreeNode node){
		if(node == null) return new LinkedList<>();
		
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>();
		
		if(node.getLeft()!=null) {
			listaIzq = getLongestBranch(node.getLeft());
		}
		if(node.getRight()!=null) {
			listaDer = getLongestBranch(node.getRight());
		}
		listaIzq.add(node.getValue());
		listaDer.add(node.getValue());
		if(listaIzq.size() > listaDer.size()) {
			return listaIzq;
		}
		return listaDer;
	}
	
	public List<Integer> getFrontera(){
		if(this.root==null) return new LinkedList<>();
		return getFrontera(this.root);
	}
	private List<Integer> getFrontera(TreeNode node){
		if(node==null) return new LinkedList<>();
		boolean esHoja = node.getLeft()==null && node.getRight()==null;
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		if(node.getLeft()!=null) {
			listaIzq = getFrontera(node.getLeft());
		}
		if(node.getRight()!=null) {
			listaDer = getFrontera(node.getRight());
		}
		if(esHoja) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
	
	public int getMaxElem() {
		if(this.root==null) return -1;
		return getMaxElem(this.root);
	}
	private int getMaxElem(TreeNode node) {
		if(node==null)return -1;
		boolean esHoja= node.getLeft()==null && node.getRight()==null;
		int maxElem=0;
		if(node.getRight()!=null) {
			maxElem = getMaxElem(node.getRight());
		}
		if(esHoja) {
			maxElem = node.getValue();
		}
		return maxElem;
	}
	
	public List<Integer> getElemAtLevel(int pos){
		if(this.root == null) return new LinkedList<>();
		return getElemAtLevel(this.root, pos, 0);
	}
	private List<Integer> getElemAtLevel(TreeNode node, int pos, int altura){
		if(node==null) return new LinkedList<>();
		List<Integer> elemIzq = new LinkedList<>();
		List<Integer> elemDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		if(node.getLeft()!=null) {
			elemIzq = getElemAtLevel(node.getLeft(),pos, altura+1);
		}
		if(node.getRight()!=null) {
			elemDer = getElemAtLevel(node.getRight(),pos,altura+1);
		}
		if(altura==pos) {
			elemIzq.add(node.getValue());
		}
		total.addAll(elemIzq);
		total.addAll(elemDer);
		return total;
	}
}
