
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
	public boolean hasElem5(Integer value) {
		if(this.root.getValue()==value) {
			return true;
		}else if(this.root!=null) {
			return hasElem5(this.root,value);
		}else{
			return false;
		}
	}
	private boolean hasElem5(TreeNode node, Integer value) {
		if(node==null)return false;
		boolean vIzq = false, vDer=false;
		if(node.getValue()==value) {
			return true;
		}
		if(node.getLeft()!=null) {
			vIzq= hasElem5(node.getLeft(), value);
		}
		if(node.getRight() != null) {
			vDer= hasElem5(node.getRight(), value);
		}
		return vDer || vIzq;
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
	public int getHeight5() {
		if(this.root==null) {
			return 0;
		}else {
			return getHeight5(this.root, 1);
		}
		
	}
	public List<Integer> getLongestBranch3(){
		if(this.root==null) return new LinkedList<>();
		return getLongestBranch3(this.root);
	}
	private List<Integer> getLongestBranch3(TreeNode node){
		if(node == null) return new LinkedList<>();
		
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		if(node.getLeft()!=null) {
			listaIzq = getLongestBranch3(node.getLeft());
		}
		if(node.getRight()!=null) {
			listaDer = getLongestBranch3(node.getRight());
		}
		listaIzq.add(node.getValue());
		listaDer.add(node.getValue());
		if(listaIzq.size() > listaDer.size()) {
			total.addAll(listaIzq);
		}else{
			total.addAll(listaDer);
		}
		return total;
		
	}
	public int getMaxElem3() {
		if(this.root==null) return 0;
		return getMaxElem3(this.root);
	}
	private int getMaxElem3(TreeNode node) {
		if(node==null)return 0;
		int value=0;
		if(node.getRight()!=null) {
			value = getMaxElem3(node.getRight());
		}
		if(node.getRight()==null) {
			value = node.getValue();
		}
		return value;
		
	}
	private int getHeight5(TreeNode node, int value) {
		if(node==null)return 0;
		int hizq=0, hder=0;
		if(node.getLeft()!=null) {
			hizq= getHeight(node.getLeft(), value+1);
		}
		if(node.getRight()!=null) {
			hder= getHeight(node.getRight(), value+1);
		}
		if(hizq > hder) {
			return hizq;
		}else {
			return hder;
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
	public boolean hasElem2(int integer) {
		boolean b = false;
		if(root != null) {
			b=hasElem2(root, integer);
		}
		return b;
	}
	private boolean hasElem2(TreeNode node, int integer) {
		if(node == null )return false;

		boolean b = false;

		if (node.getValue() == integer) {
			b = true;
		}
		if (!b && node.getLeft() != null) {
			b = hasElem2(node.getLeft(), integer);
		}

		if (!b && node.getRight() != null) {
			b = hasElem2(node.getRight(), integer);
		}

		return b;
	}
	public int getHeight() {
		return getHeight(this.root,0);
	}
	private int getHeight2(TreeNode node) {
		if(node==null) return -1;
		int heightIzq=0, heightDer=0;
			if(node.getLeft()!=null) {
				heightIzq = getHeight2(node.getLeft());
			}
			if(node.getRight()!=null) {
				heightDer = getHeight2(node.getRight());
			}
		if(heightIzq > heightDer) {
			return heightIzq+1;
		}
		return heightDer+1;
	}
	private int getHeight(TreeNode node, int altura) {
		if(node==null)return 0;
		int heightIzq=0, heightDer=0;
		if(node.getLeft() != null) {
			heightIzq = getHeight(node.getLeft(), altura);
		}
		if(node.getRight()!=null) {
			heightDer = getHeight(node.getRight(), altura);
		}
			if(heightIzq > heightDer) {
				altura = heightIzq+1;
			}else {
				altura = heightDer+1;
			}
		return altura;
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
		return getLongestBranch2(this.root);
	}
	private List<Integer> getLongestBranch2(TreeNode node){
		List<Integer> Lista = new LinkedList<>();
		List<Integer> listaIzq = new LinkedList<>();
		List<Integer> listaDer = new LinkedList<>();
		if(node.getLeft()!=null) {
			listaIzq = getLongestBranch2(node.getLeft());
		}
		if(node.getRight()!=null) {
			listaDer = getLongestBranch2(node.getRight());
		}
		listaIzq.add(node.getValue());
		listaDer.add(node.getValue());
		if(listaIzq.size() > listaDer.size()) {
			Lista.addAll(listaIzq);
		}else {
			Lista.addAll(listaDer);
		}
		return Lista;
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
		return getFrontera2(this.root);
	}
	private List<Integer> getFrontera2(TreeNode node){
		boolean esHoja = node.getLeft() == null && node.getRight()==null;
		List<Integer> listaIzq = new LinkedList<>(), listaDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		if(node.getLeft() != null) {
			listaIzq = getFrontera2(node.getLeft());
		}
		if(node.getRight()!=null) {
			listaDer = getFrontera2(node.getRight());
		}
		if(esHoja) {
			listaIzq.add(node.getValue());
		}
		total.addAll(listaIzq);
		total.addAll(listaDer);
		return total;
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
		return getMaxElem2(this.root);
	}
	private int getMaxElem2(TreeNode node) {
		int valor=0;
		if(node.getRight() != null) {
			valor = getMaxElem2(node.getRight());
		}
		if(node.getRight()==null) {
			valor = node.getValue();
		}
		return valor;
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
		return getElemAtLevel2(this.root, pos,0);
	}
	private List<Integer> getElemAtLevel2(TreeNode node, int lvl, int altura){
		List<Integer> elemIzq = new LinkedList<>();
		List<Integer> elemDer = new LinkedList<>();
		List<Integer> total = new LinkedList<>();
		if(node.getLeft()!=null) {
			elemIzq = getElemAtLevel2(node.getLeft(),lvl, altura+1);

		}
		if(node.getRight()!=null) {
			elemDer = getElemAtLevel2(node.getRight(),lvl, altura+1);
		}
		if(altura==lvl) {
			elemIzq.add(node.getValue());
		}
		total.addAll(elemIzq);
		total.addAll(elemDer);
		return total;
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
	public int sumaInternaNodo() {
		if(this.root != null) {
			return sumaInternanodo2(this.root);
		}
		return 0;
	}
	private int sumaInternanodo(TreeNode node, int sumaTotal) {
		int sumaIzq=0, sumaDer=0;
		boolean esHoja=node.getLeft()==null && node.getRight()==null;
		
		if(node.getLeft()!=null) {
			sumaIzq = sumaInternanodo(node.getLeft(),sumaTotal);
		}
		if(node.getRight()!=null) {
			sumaDer = sumaInternanodo(node.getRight(),sumaTotal);
			
		}
		if(!esHoja) {
			sumaTotal = node.getValue()+sumaIzq+sumaDer;
			return sumaTotal;
		}else {
			return 0;
		}
	}
	private int sumaInternanodo2(TreeNode node) {
		int sumaIzq=0, sumaDer=0, sumaTotal=0;
		boolean esHoja=node.getLeft()==null && node.getRight()==null;
		
		if(node.getLeft()!=null) {
			sumaIzq = sumaInternanodo2(node.getLeft());
		}
		if(node.getRight()!=null) {
			sumaDer = sumaInternanodo2(node.getRight());
			
		}
		if(!esHoja) {
			sumaTotal+= node.getValue();
		}
		return sumaTotal+sumaIzq+sumaDer;
	}
	public List<Integer> valorSupereK(int valorK){
		if(this.root!=null) {
			return valorSupereK(this.root, valorK);
		}
		return new LinkedList<>();
	}
	private List<Integer> valorSupereK(TreeNode node, int valor){
		List<Integer> valorIzq = new LinkedList<>();
		List<Integer> valorDer = new LinkedList<>();
		boolean esHoja = node.getLeft()==null && node.getRight()==null;
		List<Integer> Todos = new LinkedList<>();
		if(node.getLeft()!=null) {
			valorIzq = valorSupereK(node.getLeft(), valor);
			
		}
		if(node.getRight()!=null) {
			valorDer = valorSupereK(node.getRight(), valor);
		}
		if(esHoja && node.getValue() > valor) {
			valorIzq.add(node.getValue());
		}
		Todos.addAll(valorIzq);
		Todos.addAll(valorDer);
		return Todos;
	}
	public int countLeaves() {
		if(this.root!=null) {
			return countLeaves(this.root);
		}
		return 0;
	}
	private int countLeaves(TreeNode node) {
		int valorIzq=0, valorDer=0, totalHojas=0;
		boolean esHoja=node.getLeft()==null && node.getRight()==null;
		if(node.getLeft()!=null) {
			valorIzq = countLeaves(node.getLeft());
		}
		if(node.getRight()!=null) {
			valorDer = countLeaves(node.getRight());
		}
		if(esHoja) {
			totalHojas++;
		}
		return totalHojas+valorIzq+valorDer;
	}
	
	public int countNodesWithOnlyChild() {
		if(this.root != null) {
			return countNodesChild(this.root);
		}
		return 0;
	}
	private int countNodesChild(TreeNode node) {
		int valorIzq=0,valorDer=0, total=0;
		if(node.getLeft()!=null) {
			valorIzq = countNodesChild(node.getLeft());
		}
		if(node.getRight()!=null) {
			valorDer = countNodesChild(node.getRight());
		}
		if((node.getLeft() == null && node.getRight() != null) ||
		        (node.getLeft() != null && node.getRight() == null)) {
			total++;
		}
		return total+valorIzq+valorDer;
	}
	public int sumAtLevel(int k) {
		if(this.root!=null) {
			return sumAtLevel(this.root, k,0);
		}
		return 0;
	}
	private int sumAtLevel(TreeNode node, int k, int altura) {
		int valorIzq =0, valorDer=0, valortotal=0;
		if(node.getLeft()!=null) {
			valorIzq = sumAtLevel(node.getLeft(), k, altura+1);
		}
		if(node.getRight()!=null) {
			valorDer = sumAtLevel(node.getRight(), k, altura+1);
		}
		if(altura==k) {
			valortotal = node.getValue();	
		};
		return valortotal+valorIzq+valorDer;
	}
	
	public int getHeightOfNode(int v) {
		if(this.root == null)return 0;
		return getHeightOfNode(this.root, v, 0);
	}
	private int getHeightOfNode(TreeNode node, int v, int altura) {
		if(node==null)return -1;
		int valorIzq=0, valorDer=0;
		if(node.getValue()==v) {
			return altura;
		}		
		if(node.getLeft()!=null) {
			valorIzq = getHeightOfNode(node.getLeft(), v, altura+1);
		}
		if(node.getRight()!=null) {
			valorDer = getHeightOfNode(node.getRight(), v, altura+1);
		}
		if (valorIzq != 0) return valorIzq;
		if (valorDer != 0) return valorDer;
		return -1;
	}//FALTA REVISAR
	
	public boolean hasElem6(Integer v) {
		if(this.root==null)return false;
		return hasElem6(this.root, v);
	}
	public boolean hasElem6(TreeNode node, int v) {
		if(node==null)return false;
		boolean esHoja=node.getLeft()==null && node.getRight()==null;
		if(!esHoja && node.getValue()==v) {
			return true;
		}
		if(node.getValue() > v) {
			return hasElem6(node.getLeft(), v);
		}else {
			return hasElem6(node.getRight(), v);
		}
	}
	
}
