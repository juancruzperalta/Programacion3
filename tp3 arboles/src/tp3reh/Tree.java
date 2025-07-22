package tp3reh;

import java.util.*;

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
	public Integer getRoot() {
		return this.root.getValue();
	}
	public boolean isEmpty() {
		return this.root == null;
	}
	public boolean hasElem(int valor) {
		if(this.root == null)return false;
		if(this.root != null) {
			return hasElem(this.root, valor);
		}
		return false;
	}
	private boolean hasElem(TreeNode node, int valor) {
		if(node == null) return false;
		if(node.getValue() == valor) {
			return true;
		}
		if(node.getLeft() != null) {
			return hasElem(node.getLeft(), valor);
		}
		if(node.getRight()!=null) {
			return hasElem(node.getRight(), valor);
		}
		return false;
	}
	public int getHeight() {
		if(this.root != null) {
			return getHeight(this.root);
		}
		return -1;
	}
	private int getHeight(TreeNode node) {
		if(node == null)return 0;
		int altIzq=0, altDer=0;
		if(node.getLeft() != null) {
			altIzq= getHeight(node.getLeft());
		}
		if(node.getRight() != null) {
			altDer = getHeight(node.getRight());
		}
		if(altIzq > altDer) {
			return altIzq+1;
		}
		return altDer+1;
	}
	public List<Integer> getLongestBranch() {
		if(this.root != null) {
			return getLongestBranch(this.root);
		}
		return new LinkedList<>();
	}
	private List<Integer> getLongestBranch(TreeNode node){
		if(node == null) return new LinkedList<>();
		List<Integer> listaIzq = new LinkedList<>();
		List<Integer> listaDer = new LinkedList<>();
		if(node.getLeft() != null) {
			listaIzq = getLongestBranch(node.getLeft());
		}
		if(node.getRight() != null) {
			listaDer = getLongestBranch(node.getRight());
		}
		listaIzq.add(node.getValue());
		listaDer.add(node.getValue());
		if(listaIzq.size() > listaDer.size()) {
			return listaIzq;
		}else {
			return listaDer;
		}
	}
	public List<Integer> getFrontera() {
		if(this.root!=null) {
			return getFrontera(this.root);
		}
		return new LinkedList<>();
	}
	private List<Integer> getFrontera(TreeNode node){
		if(node == null) return new LinkedList<>();
		List<Integer> hojaIzq = new LinkedList<>();
		List<Integer> hojaDer = new LinkedList<>();
		List<Integer> hojas = new LinkedList<>();
		boolean esHoja = node.getLeft()==null && node.getRight()==null;
		if(node.getLeft() != null) {
			hojaIzq = getFrontera(node.getLeft());
		}
		if(node.getRight() != null) {
			hojaDer = getFrontera(node.getRight());
		}
		if(esHoja) {
			hojaIzq.add(node.getValue());
		}
		hojas.addAll(hojaIzq);
		hojas.addAll(hojaDer);
		return hojas;
	}
	public int getMaxElem() {
		if(this.root!=null) {
			return getMaxElem(this.root);
		}
		return -1;
	}
	private int getMaxElem(TreeNode node) {
		int nodoDer=0;
		if(node == null)return 0;
		if(node.getRight() != null) {
			nodoDer = getMaxElem(node.getRight());
		}
		if(node.getRight() == null) {
			return nodoDer+node.getValue();			
		}
		return nodoDer;
	}
}
