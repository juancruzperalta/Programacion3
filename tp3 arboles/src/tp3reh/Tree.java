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
	/*Dado un árbol binario de búsquedas que almacena números enteros, implementar un algoritmo
 que retorne la suma de todos los nodos internos del árbol.*/
	public int sumaNodosInternos() {
		if(this.root !=null) {
			return sumaNodosInternos(this.root);
		}
		return 0;
	}
	private int sumaNodosInternos(TreeNode node) {
		if(node == null)return 0;
		int sumaIzq=0, sumaDer=0;
		boolean esHoja = node.getLeft()==null&&node.getRight()==null;
		if(node.getLeft()!=null) {
			sumaIzq = sumaNodosInternos(node.getLeft());
		}
		if(node.getRight() != null) {
			sumaDer = sumaNodosInternos(node.getRight());
		}
		if(!esHoja) {
			return node.getValue()+sumaIzq+sumaDer;
		}
		return sumaIzq+sumaDer;
	}
	/* Dado un árbol binario de búsqueda que almacena números
 enteros y un valor de entrada K, implementar un algoritmo
 que permita obtener un listado con los valores de todas las
 hojas cuyo valor supere K. Por ejemplo, para el árbol de la
 derecha, con un valor K = 8, el resultado debería ser [9, 11]*/
	public List<Integer> ejercicioDeBusquedaK(int K){
		if(this.root != null) {
			return ejercicioDeBusquedaK(this.root, K);
		}
		return new LinkedList<>();
	}
	private List<Integer> ejercicioDeBusquedaK(TreeNode node, int K){
		if(node==null)return new LinkedList<>();
		List<Integer> listaIzq = new LinkedList<>();
		List<Integer> listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		boolean esHoja = node.getLeft()==null&&node.getRight()==null;
		if(node.getLeft() != null) {
			listaIzq = ejercicioDeBusquedaK(node.getLeft(), K);
		}
		if(node.getRight() != null) {
			listaDer = ejercicioDeBusquedaK(node.getRight(), K);
		}
		if(esHoja && node.getValue() > K) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
	public int contarNodosConUnSoloHijo() {
		if(this.root != null) {
			return contarNodosConUnSoloHijo(this.root);
		}
		return 0;
	}
	private int contarNodosConUnSoloHijo(TreeNode node) {
		if(node == null)return 0;
		int hijoIzq=0, hijoDer=0;
		boolean esHoja=node.getLeft()==null&&node.getRight()==null;
		if(node.getLeft() != null) {
			hijoIzq = contarNodosConUnSoloHijo(node.getLeft());
		}
		if(node.getRight() != null) {
			hijoDer = contarNodosConUnSoloHijo(node.getRight());
		}
		if(!esHoja) {			
			if(node.getLeft()==null || node.getRight() == null) {
				return node.getValue()+hijoIzq+hijoDer;
			}
		}
		return hijoIzq+hijoDer;
	}
	/*Dado un árbol binario de búsqueda y dos valores a y b, implementá un método que 
	 * devuelva una lista con todos los valores que estén dentro del rango [a, b], inclusive.*/
	public List<Integer> obtenerEnRango(int a, int b){
		if(this.root != null) {
			return obtenerEnRango(this.root, a,b);
		}
		return new LinkedList<>();
	}
	private List<Integer> obtenerEnRango(TreeNode node, int a, int b){
		if(node==null)return new LinkedList<>();
		List<Integer> listaIzq = new LinkedList<>();
		List<Integer> listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		
		if(node.getLeft() != null) {
			listaIzq = obtenerEnRango(node.getLeft(),a,b);
		}
		if(node.getRight() != null) {
			listaDer = obtenerEnRango(node.getRight(), a,b);
		}
		if(node.getValue() >= a && node.getValue() <=b) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
	/*🔸 Ejercicio 3 – Nivel con más nodos
Implementá un método que devuelva el número del nivel que contiene la mayor cantidad de nodos. 
En caso de empate, devolvé el nivel más bajo (más cercano a la raíz).
	 */

	public int nivelConMasNodos() {
		if(this.root != null) {
			return nivelConMasNodos(this.root);
		}
		return 0;
	}
	private int nivelConMasNodos(TreeNode node) {
		if(node==null)return 0;
		int listaIzq =0, listaDer=0, alturaIzq=0, alturaDer=0;
		if(node.getLeft() != null) {
			listaIzq = nivelConMasNodos(node.getLeft());
			alturaIzq++;
		}
		if(node.getRight() != null) {
			listaDer = nivelConMasNodos(node.getRight());
			alturaDer++;
		}
		if(listaIzq > listaDer) {
			return alturaIzq+listaIzq;
		}else {
			return alturaDer+listaDer;
		}
		
	}
	public int sumarDesdeNivel(int k) {
		if(this.root!=null) {
			return sumarDesdeNivel(this.root, k,0);
		}
		return 0;
	}
	private int sumarDesdeNivel(TreeNode node, int k, int altura) {
		if(node==null)return 0;
		int sumaIzq=0, sumaDer=0;
		if(node.getLeft() != null) {
			sumaIzq = sumarDesdeNivel(node.getLeft(), k, altura+1);
		}
		if(node.getRight() != null) {
			sumaDer = sumarDesdeNivel(node.getRight(), k, altura+1);
		}
		if(altura >= k) {
			return sumaIzq+sumaDer+node.getValue();
		}
		return sumaIzq+sumaDer;
	}
	public int nivelDelElemento(int x) {
		if(this.root!=null) {
			return nivelDelElemento(this.root,x,0);
		}
		return -1;
	}
	private int nivelDelElemento(TreeNode node, int x, int nivelTotal) {
		if(node==null)return -1;
		if(node.getValue()==x) {
			return nivelTotal;
		}
		if(node.getLeft()!=null) {
			return nivelDelElemento(node.getLeft(), x,nivelTotal+1);
		}
		if(node.getRight()!=null) {
			return nivelDelElemento(node.getRight(), x,nivelTotal+1);
		}			
		return -1;
	}
	public List<Integer> caminoHasta(int x){
		if(this.root != null) {
			return caminoHasta(this.root, x);
		}
		return new LinkedList<>();
	}
	private List<Integer> caminoHasta(TreeNode node, int x){
		if(node == null) return new LinkedList<>();
		List<Integer> listaIzq= new LinkedList<>();
		List<Integer> listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		if(node.getValue()==x) {
			total.add(x);
			return total;
		}
		if(node.getLeft() != null) {
			listaIzq = caminoHasta(node.getLeft(), x);
		}
		if(node.getRight() != null) {
			listaDer = caminoHasta(node.getRight(), x);
		}
		if(!listaIzq.isEmpty()) {			
		total.addAll(listaIzq);
		total.add(node.getValue());
		return total;
		}
		if(!listaDer.isEmpty()) {	
			total.add(node.getValue());
		total.addAll(listaDer);
		return total;
		}
		return total;
	}
	public List<Integer> hojasImparesMayoresA(int k){
		if(this.root != null) {
			return hojasImparesMayoresA(this.root, k);
		}
		return new LinkedList<>();
	}
	private List<Integer> hojasImparesMayoresA(TreeNode node, int k){
		if(node == null)return new LinkedList<>();
		List<Integer> listaIzq= new LinkedList<>(), listaDer=new LinkedList<>(), total = new LinkedList<>();
		if(node.getLeft() != null) {
			listaIzq = hojasImparesMayoresA(node.getLeft(), k);
		}
		if(node.getRight()!=null) {
			listaDer = hojasImparesMayoresA(node.getRight(), k);
		}
		if(node.getValue() %2!=0 && node.getValue() > k) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
	}
	public List<Integer> nodosInternosMultiplosDe(int n){
		if(this.root != null) {
			return nodosInternosMultiplosDe(this.root, n);
		}
		return new LinkedList<>();
	}
	private List<Integer> nodosInternosMultiplosDe(TreeNode node, int n){
		if(node == null)return new LinkedList<>();
		List<Integer> izq = new LinkedList<>(), der = new LinkedList<>(), total = new LinkedList<>();
		if(node.getLeft() != null) {
			izq = nodosInternosMultiplosDe(node.getLeft(), n);
		}
		if(node.getRight() != null) {
			der = nodosInternosMultiplosDe(node.getRight(), n);
		}
		if(node.getValue()%n==0) {
			izq.add(node.getValue());
		}
		total.addAll(izq);
		total.addAll(der);
		return total;
	}
}
