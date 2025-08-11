package tp3;

import java.util.LinkedList;
import java.util.List;

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
		if(this.root != null) {
			return this.root.getValue();
		}
		return null;
	}
	public boolean hasElem(Integer elem) {
		if(this.root != null) {
			return hasElem(this.root, elem);
		}
		return false;
	}
	private boolean hasElem(TreeNode node, int elem) {
		if(node == null) return false;
		if(node.getValue() == elem) {
			return true;
		}		
		return hasElem(node.getLeft(), elem) || hasElem(node.getRight(), elem);

	}
	public boolean isEmpty() {
		return this.root == null;
	}
	public int getHeight() {
		if(this.root != null) {
			return getHeight(this.root);
		}
		return 0;
	}
	private int getHeight(TreeNode node) {
		if(node == null) return 0;
		int alturaIzq =0, alturaDer=0;
		if(node.getLeft() != null) {
			alturaIzq = getHeight(node.getLeft());
		}
		if(node.getRight() != null) {
			alturaDer = getHeight(node.getRight());
		}
		if(alturaIzq > alturaDer) {
			return alturaIzq+1;
		}
		return alturaDer+1;
	}
	public List<Integer> getLongestBranch() {
		if(this.root != null) {
			return getLongestBranch(this.root);
		}
		return new LinkedList<>();
	}

	private List<Integer> getLongestBranch(TreeNode node) {
		if(node==null)return new LinkedList<>();
		List<Integer> ladoIzq = new LinkedList<>();
		List<Integer> ladoDer = new LinkedList<>();
		if(node.getLeft() != null) {
			ladoIzq = getLongestBranch(node.getLeft());
		}
		if(node.getRight() != null) {
			ladoDer = getLongestBranch(node.getRight());
		}
		ladoIzq.add(node.getValue());
		ladoDer.add(node.getValue());
		if(ladoIzq.size() > ladoDer.size()) {
			return ladoIzq;
		}
		return ladoDer;
	}
	public List<Integer> getFrontera() {
		if(this.root != null) {
			return getFrontera(this.root);
		}
		return new LinkedList<>();
	}

	private List<Integer> getFrontera(TreeNode node) {
		if(node == null) return new LinkedList<>();
		List<Integer> izq = new LinkedList<>();
		List<Integer> der = new LinkedList<>();
		List<Integer> juntos = new LinkedList<>();
		if(node.getLeft() != null) {
			izq = getFrontera(node.getLeft());
		}
		if(node.getRight() != null) {
			der = getFrontera(node.getRight());
		}
		if(node.getLeft() == null && node.getRight() == null) {
			izq.add(node.getValue());
		}
		juntos.addAll(izq);
		juntos.addAll(der);
		return juntos;
	}
	public Integer getMaxElem() {
		if(this.root != null) {
			return getMaxElem(this.root);
		}
		return 0;
	}
	private Integer getMaxElem(TreeNode node) {
		if(node == null)return 0;
		int der=0;

		if(node.getRight() != null) {
			der = getMaxElem(node.getRight());
		}
		if(node.getRight()==null) {
			return node.getValue();			
		}
		return der;
	}
	public List<Integer> getElemAtLevel(int level) {
		if(this.root != null) {
			return getElemAtLevel(this.root, level,0);
		}
		return new LinkedList<>();
	}

	private List<Integer> getElemAtLevel(TreeNode node, int level, int nivel) {
		if(node == null) return new LinkedList<>();
		List<Integer> listaIzq = new LinkedList<>();
		List<Integer> listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		if(node.getLeft() != null) {
			listaIzq = getElemAtLevel(node.getLeft(), level, nivel+1);
		}
		if(node.getRight() != null) {
			listaDer = getElemAtLevel(node.getRight(), level, nivel+1);
		}
		if(level == nivel) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
	/*Ejercicio 2
 Dado un árbol binario de búsquedas que almacena números enteros, implementar un algoritmo
 que retorne la suma de todos los nodos internos del árbol.*/
	public int sumaNodosInternos() {
		if(this.root != null) {
			return sumaNodosInternos(this.root);
		}
		return 0;
	}
	private int sumaNodosInternos(TreeNode node) {
		if(node == null)return 0;
		int izq=0, der=0;
		boolean esHoja = node.getLeft() == null && node.getRight()==null;
		if(node.getLeft() != null) {
			izq = sumaNodosInternos(node.getLeft());
		}
		if(node.getRight() != null) {
			der = sumaNodosInternos(node.getRight());
		}
		if(!esHoja) {
			return izq+der+node.getValue();
		}
		return izq+der;
	}
	/* Ejercicio 3
 Dado un árbol binario de búsqueda que almacena números
 enteros y un valor de entrada K, implementar un algoritmo
 que permita obtener un listado con los valores de todas las
 hojas cuyo valor supere K. Por ejemplo, para el árbol de la
 derecha, con un valor K = 8, el resultado debería ser [9, 11].*/
	public List<Integer> valorSumaK(int K){
		if(this.root != null) {
			return valorSumaK(this.root, K);
		}
		return new LinkedList<>();
	}
	private List<Integer> valorSumaK(TreeNode node, int K){
		if(node == null) return new LinkedList<>();
		List<Integer> izq = new LinkedList<>(), der = new LinkedList<>(), total = new LinkedList<>();
		boolean esHoja = node.getLeft()==null&&node.getRight()==null;
		
		if(node.getLeft() != null) {
			izq = valorSumaK(node.getLeft(), K);
		}
		if(node.getRight() != null) {
			der = valorSumaK(node.getRight(), K);
		}
		if(esHoja && node.getValue() > K) {
			izq.add(node.getValue());
		}
			total.addAll(izq);
			total.addAll(der);
			return total;
	}
}
