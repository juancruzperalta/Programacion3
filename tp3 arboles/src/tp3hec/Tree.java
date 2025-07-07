package tp3hec;

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
		TreeNode root = this.root;
		return root.getValue();
	}
	public boolean hasElem(int integer) {
		if(this.root != null) {
			return hasElem(this.root, integer);
		}
		return false;
	}
	private boolean hasElem(TreeNode node, int integer) {
		if(node == null) return false;
		boolean izq=false, der=false;
		if(node.getValue() == integer) {
			return true;
		}
		if(node.getLeft() != null) {
			izq= hasElem(node.getLeft(), integer);
		}
		if(node.getRight() != null) {
			der= hasElem(node.getRight(), integer);
		}
		return izq || der;
	}
	public boolean isEmpty() {
		return this.root==null;
	}
	public int getHeight() {
		if(this.root != null) {
			return getHeight(this.root);
		}
		return 0;
	}
	private int getHeight(TreeNode node) {
		if(node == null) return 0;
		int altIzq=0, altDer=0;
		if(node.getLeft() != null) {
			altIzq = getHeight(node.getLeft());
		}
		if(node.getRight() != null) {
			altDer = getHeight(node.getRight());
		}
		if(altIzq > altDer) {
			return altIzq+1;
		}else {
			return altDer+1;
		}
	}
	public List<Integer> getLongestBranch(){
		if(this.root != null) {
			return getLongestBranch(this.root);
		}
		return new LinkedList<>();
	}
	private List<Integer> getLongestBranch(TreeNode node){
		if(node == null) return new LinkedList<>();
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>();
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
		}
		return listaDer;
	}
	public List<Integer> getFrontera(){
		if(this.root != null) {
			return getFrontera(this.root);
		}
		return new LinkedList<>();
	}
	private List<Integer> getFrontera(TreeNode node){
		if(node==null) return new LinkedList<>();
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		boolean esHoja = node.getLeft()==null && node.getRight()==null;
		if(node.getLeft() != null) {
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
	public int getMaxElem() {
		if(this.root!=null) {
			return getMaxElem(this.root);
		}
		return 0;
	}
	private int getMaxElem(TreeNode node) {
		if(node==null)return 0;
		int valIzq = 0, valDer=0;
		if(node.getLeft() !=null) {
			valIzq = getMaxElem(node.getLeft());
		}
		if(node.getRight() != null) {
			valDer = getMaxElem(node.getRight());
		}
		valIzq = node.getValue();
		if(valIzq > valDer) {
			return valIzq;
		}else {			
			return valDer;
		}
	}
	public List<Integer> getElemAtNivel(int elem){
		if(this.root != null) {
			return getElemAtNivel(this.root, elem, 0);
		}
		return new LinkedList<>();
	}
	private List<Integer> getElemAtNivel(TreeNode node, int lvl, int altura){
		if(node==null) return new LinkedList<>();
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		if(node.getLeft() != null) {
			listaIzq = getElemAtNivel(node.getLeft(),lvl, altura+1);
		}
		if(node.getRight()!=null) {
			listaDer = getElemAtNivel(node.getRight(), lvl, altura+1);
		}
		if(altura==lvl) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
}

