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
	/* Ejercicio 2
 Dado un árbol binario de búsquedas que almacena números enteros, implementar un algoritmo
 que retorne la suma de todos los nodos internos del árbol.*/
	public int sumaNodosInternos() {
		if(this.root != null) {
			//los nodos internos no son las hojas
			return sumaNodosInternos(this.root);
		}
		return 0;
	}
	private int sumaNodosInternos(TreeNode node) {
		if(node==null)return 0;
		int sumaIzq=0, sumaDer=0, total=0;
		boolean esHoja=node.getLeft()==null&&node.getRight()==null;
		if(node.getLeft()!=null) {
			sumaIzq = sumaNodosInternos(node.getLeft());
		}
		if(node.getRight()!=null) {
			sumaDer = sumaNodosInternos(node.getRight());
		}
		if(!esHoja) {
			sumaIzq+=node.getValue();
		}
		total+=sumaIzq;
		total+=sumaDer;
		return total;
	}
	/* Ejercicio 3
 Dado un árbol binario de búsqueda que almacena números
 enteros y un valor de entrada K, implementar un algoritmo
 que permita obtener un listado con los valores de todas las
 hojas cuyo valor supere K. Por ejemplo, para el árbol de la
 derecha, con un valor K = 8, el resultado debería ser [9, 11].*/

	public List<Integer> sumaEnteros(int K){
		if(this.root != null) {
			return sumaEnteros(this.root, K);
		}
		return new LinkedList<>();
	}
	private List<Integer> sumaEnteros(TreeNode node, int k){
		if(node == null) return new LinkedList<>();
		List<Integer> ladoIzq= new LinkedList<>(),ladoDer = new LinkedList<>(),
		total = new LinkedList<>();
		boolean esHoja = node.getLeft()==null&&node.getRight()==null;
		if(node.getLeft() != null) {
			ladoIzq = sumaEnteros(node.getLeft(), k);
		}
		if(node.getRight() != null) {
			ladoDer = sumaEnteros(node.getRight(), k);
		}
		if(esHoja && node.getValue() >= k) {
			ladoIzq.add(node.getValue());
		}
		total.addAll(ladoIzq);
		total.addAll(ladoDer);
		return total;
	}
	/*  Ejercicio B - Todos los caminos hasta hojas
Implementá un método que retorne una lista de listas,
 donde cada sublista representa un camino desde la raíz hasta una hoja, en orden. */
	
	public List<List<Integer>> caminosHastaHojas(){
		List<List<Integer>> total = new LinkedList<>();
		if(this.root != null) {
			total = caminoHastaHojas(this.root);
			return total;
		}
		return new LinkedList<>();
	}
	public List<List<Integer>> caminoHastaHojas(TreeNode node){
		if(node == null) return new LinkedList<>();
		List<List<Integer>> total = new LinkedList<>();
		List<List<Integer>> hijos = new LinkedList<>();
		boolean esHoja=node.getLeft()==null&&node.getRight()==null;

		if(node.getLeft()!=null) {
			hijos.addAll(caminoHastaHojas(node.getLeft()));
		}
		if(node.getRight() != null) {
			hijos.addAll(caminoHastaHojas(node.getRight()));
		}
		
		if(esHoja) {
			List<Integer> hoja = new LinkedList<>();
			hoja.add(node.getValue());
			total.add(hoja);
			return total;
		}
		 for (List<Integer> camino : hijos) {
		        camino.add(0, node.getValue()); // Agregás el valor actual al principio
		        total.add(camino);              // Lo agregás a la lista total
		    }
		return total;
	}
	/*Ejercicio 1 – Suma de nodos mayores a K
Implementá un método recursivo que, dado un valor K,
 devuelva la suma de todos los nodos del árbol que tengan un valor estrictamente mayor que K.*/
	
	public int sumaNodos(int k) {
		if(this.root != null) {
			return sumaNodos(this.root, k);
		}
		return 0;
	}
	private int sumaNodos(TreeNode node, int k) {
		if(node == null) return 0;
		int sumaIzq=0, sumader=0, total=0;
		sumaIzq=sumaNodos(node.getLeft(), k);
		sumader = sumaNodos(node.getRight(), k);
		if(node.getValue() > k) {
			sumaIzq+= node.getValue();
		}
		return total+sumaIzq+sumader;
	}
}

