package rehecho;

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
	public boolean isEmpty() {
		return this.root==null;
	}
	public Integer getRoot() {
		if(this.root!=null) {
			return this.root.getValue();
		}
		return 0;
	}
	public boolean hasElem(int elem) {
		if(this.root!=null) {
			return hasElem(root, elem);
		}
		return false;
	}
	private boolean hasElem(TreeNode node, int elem) {
		if(node == null)return false;
		if(elem==node.getValue())return true;
		if(elem > node.getValue()) {
			return hasElem(node.getRight(), elem);
		}
		if(elem<node.getValue()) {
			return hasElem(node.getLeft(), elem);
		}
		return false;
	}
	
	public int getHeight() {
		if(this.root != null) {
			return getHeight(root);
		}
		return -1;
	}
	private int getHeight(TreeNode node) {
		if(node== null)return 0;
		int altIzq =0, altDer=0;
		if(node.getLeft()!=null) {
			altIzq = getHeight(node.getLeft());
		}
		if(node.getRight()!=null) {
			altDer = getHeight(node.getRight());
		}
		if(altIzq > altDer) {
			return altIzq+1;
		}
		return altDer+1;
	}
	
	public List<Integer> getLongestBranch(){
		if(this.root != null) {
			return getLongestBranch(this.root);
		}
		return null;
	}
	private List<Integer> getLongestBranch(TreeNode node){
		if(node==null)return new LinkedList<>();
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>();
		
		if(node.getLeft()!=null) {
			listaIzq = getLongestBranch(node.getLeft());
		}
		if(node.getRight()!=null) {
			listaDer = getLongestBranch(node.getRight());
		}
		listaIzq.add(node.getValue());
		listaDer.add(node.getValue());
		if(listaIzq.size() < listaDer.size()) {
			return listaDer;
		}
		return listaIzq;
	}
	public List<Integer> getFrontera(){
		if(this.root!=null) {
			return getFrontera(this.root);
		}
		return null;
	}
	private List<Integer> getFrontera(TreeNode node){
		if(node == null) return null;
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>(),
				total = new LinkedList<>();
		boolean esHoja = node.getLeft() == null && node.getRight()==null;
		if(node.getLeft()!=null) {
			listaIzq = getFrontera(node.getLeft());
		}
		if(node.getRight() != null) {
			listaDer = getFrontera(node.getRight());
		}
		if(esHoja) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
	
	public Integer getMaxElem() {
		if(this.root != null) {
			return getMaxElem(this.root);
		}
		return 0;
	}
	private Integer getMaxElem(TreeNode node) {
		if(node == null) return 0;
		int val=0;
		boolean esHoja = node.getRight()==null; 
		if(node.getRight()!=null) {
			val = getMaxElem(node.getRight());
		}
		if(esHoja) {
			val = node.getValue();
		}
		return val;
	}
	
	public List<Integer> getElemAtLevel(int nivel) {
		if(this.root != null) {
			return getElemAtLevel(root, nivel,0);
		}
		return null;
	}
	private List<Integer> getElemAtLevel(TreeNode node, int nivel, int altura){
		if(node==null)return null;
		List<Integer> listaIzq = new LinkedList<>(),listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		if(node.getLeft() != null) {
			listaIzq = getElemAtLevel(node.getLeft(), nivel, altura+1);
		}
		if(node.getRight() != null) {
			listaDer = getElemAtLevel(node.getRight(), nivel, altura+1);
		}
		if(altura == nivel) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
}
