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
	
	public int sumaDeNodosInternos() {
		if(this.root!=null) {
			return sumaDeNodosInternos(this.root);
		}
		return 0;
	}
	private int sumaDeNodosInternos(TreeNode node) {
		if(node == null) return 0;
		boolean esHoja = node.getLeft() ==null && node.getRight()==null;
		int valIzq=0, valDer=0;

		if(node.getLeft()!=null) {
			valIzq = sumaDeNodosInternos(node.getLeft());
		}
		if(node.getRight() != null) {
			valDer = sumaDeNodosInternos(node.getRight());
		}
		if(!esHoja) {
			return node.getValue()+valIzq+valDer;
		}
		return valIzq+valDer;
	}
	
	public List<Integer> hojasSupereAK(int K){
		if(this.root != null) {
			return hojasSupereAK(this.root, K);
		}
		return null;
	}
	private List<Integer> hojasSupereAK(TreeNode node, int k){
		if(node==null)return null;
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		boolean esHoja = node.getLeft() == null && node.getRight() == null;
		if(node.getLeft() != null) {
			listaIzq = hojasSupereAK(node.getLeft(), k);
		}
		if(node.getRight() != null) {
			listaDer = hojasSupereAK(node.getRight(), k);
		}
		if(node.getValue() > k && esHoja) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
	/*🧩 Ejercicio Propuesto
Dado un árbol binario de búsqueda que almacena números enteros y un valor de entrada K,
 implementar un algoritmo que devuelva una lista con los valores de todas las hojas cuyo valor sea múltiplo de K.

Por ejemplo, si el árbol fuera el siguiente:*/
	public List<Integer> arbolMultiploK(int K){
		if(this.root != null) {
			return arbolMultiploK(this.root, K);
		}
		return null;
	}
	private List<Integer> arbolMultiploK(TreeNode node, int k){
		if(node==null)return null;
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>(), total = new LinkedList<>();
		boolean esHoja = node.getLeft()==null && node.getRight()==null;
		if(node.getLeft()!=null) {
			listaIzq = arbolMultiploK(node.getLeft(), k);
		}
		if(node.getRight() != null) {
			listaDer = arbolMultiploK(node.getRight(), k);
		}
		if(esHoja && node.getValue()%k==0) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
	/*Dado un árbol binario de búsqueda que almacena números enteros, 
	 * implementar un algoritmo que calcule la suma de todos los nodos 
	 * hoja que se encuentren en niveles pares (considerando la raíz como nivel 0).*/
	public int sumaNodosHojasNivelesPares() {
		if(this.root != null) {
			return sumaNodosHojasNivelesPares(this.root,0);
		}
		return 0;
	}
	private int sumaNodosHojasNivelesPares(TreeNode node, int altura) {
		if(node==null)return 0;
		int sumaIzq=0, sumaDer=0, total=0;
		boolean esHoja = node.getLeft() == null && node.getRight()==null;
		if(node.getLeft()!=null) {
			sumaIzq = sumaNodosHojasNivelesPares(node.getLeft(), altura+1);
		}
		if(node.getRight() != null) {
			sumaDer = sumaNodosHojasNivelesPares(node.getRight(), altura+1);
		}
		if(esHoja && altura%2==0) {
			total+= node.getValue();
		}
		return total+sumaIzq+sumaDer;
	}
	/*Ejercicio 4 — Contar nodos con un solo hijo
Implementar un método que cuente la cantidad de nodos
 que tienen exactamente un hijo (ya sea izquierdo o derecho, pero no ambos).*/
	public int cantidadNodosConUnHijo() {
		if(this.root != null) {
			return cantidadNodosConUnHijo(this.root);
		}
		return 0;
	}
	private int cantidadNodosConUnHijo(TreeNode node) {
		if(node==null)return 0;
		int nodoIzq=0, nodoDer=0, total=0;
		if(node.getLeft() != null) {
			nodoIzq = cantidadNodosConUnHijo(node.getLeft());
		}
		if(node.getRight() != null) {
			nodoDer = cantidadNodosConUnHijo(node.getRight());
		}
		if((node.getLeft() == null && node.getRight() != null) || 
				   (node.getLeft() != null && node.getRight() == null)) {
				    total = 1;
		}
		return total+nodoIzq+nodoDer;
	}
	
	public double promedioHojas() {
		if(this.root ==null)return 0;
			int suma = promedioHojas(root);
			int hojas = contarHojas(root);
		if(hojas==0)return 0;
		return suma/hojas;
	}
	private int contarHojas(TreeNode node) {
		if(node == null) return 0;
		int cantIzq=0, cantDer=0;
		boolean esHoja = node.getLeft() == null && node.getRight()==null;
		if(node.getLeft() != null) {
			cantIzq = contarHojas(node.getLeft());
		}
		if(node.getRight()  != null) {
			cantDer = contarHojas(node.getRight());
		}
		if(esHoja) {
			return 1;
		}
		return cantIzq+cantDer;
	}
	private int promedioHojas(TreeNode node) {
		if(node == null)return 0;
		int valIzq=0, valDer=0;
		if(node.getLeft() != null) {
			valIzq = promedioHojas(node.getLeft());
		}
		if(node.getRight() != null) {
			valDer = promedioHojas(node.getRight());
		}
		if (node.getLeft() == null && node.getRight() == null) {
			return node.getValue();
		}
		return valIzq+valDer;
		
	}
	/*Ejercicio 6 — Valores entre A y B
Dado un BST y dos valores a y b, retornar una lista con 
todos los elementos del árbol que están en ese rango: [a, b] (inclusive).

	 */
	public List<Integer> getValoresEnRango(int a, int b){
		if(this.root != null) {
			return getValoresEnRango(root, a, b);
		}
		return new LinkedList<>();
	}
	private List<Integer> getValoresEnRango(TreeNode node, int a, int b){
		if(node==null)return null;
		List<Integer> izq= new LinkedList<>(), der = new LinkedList<>(), total = new LinkedList<>();
		
		if(node.getLeft() != null && node.getValue() > a) {
			izq = getValoresEnRango(node.getLeft(), a,b);
		}
		if(node.getRight() != null && node.getValue() < b) {
			der = getValoresEnRango(node.getRight(), a, b);
		}
		if(node.getValue() >= a && node.getValue() <= b) {
			izq.add(node.getValue());
		}
		total.addAll(izq);
		total.addAll(der);
		return total;
	}
	
	public int getDiametro() {
		if(this.root != null) {
			return getDiametro(this.root);
		}
		return 0;
	}
	private int getDiametro(TreeNode node) {
		if(node == null) return 0;
		int valIzq=0, valDer=0;
		if(node.getLeft()!=null) {
			valIzq = getDiametro(node.getLeft());
		}
		if(node.getRight() != null) {
			valDer = getDiametro(node.getRight());
		}
		if(valIzq > valDer) {
			return valIzq+valDer;
		}
		return valIzq+1+valDer+1;
	}
	
}
