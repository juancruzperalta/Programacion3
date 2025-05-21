import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Tree {

	private TreeNode root;
	
	public Tree() {
		this.root = null;
	}
	/*
	 * Por lo que veo es un O(1).
	 */
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
	/*
	 * O(n), ya que voy a mostrar todos los elementos y tengo que ir uno por uno
	 */
	public void printInorder() {
		printInorder(this.root);
	}
	public void printInorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
  
        printInorder(node.getLeft()); 
        System.out.print(node.getValue() + " "); 
  
        printInorder(node.getRight()); 
} 
	public void printPosOrder() {
		printPosOrder(this.root);
	}
	private void printPosOrder(TreeNode node) {
        if (node == null) 
            return; 
        printPosOrder(node.getLeft()); 
        printPosOrder(node.getRight()); 
        System.out.print(node.getValue() + " "); 
	}
	public void printPreOrder() {
		printPreOrder(this.root);
	}
	private void printPreOrder(TreeNode node) {
        if (node == null) 
            return; 
   
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
	/*
	 * O(n) en el peor de los casos recorro todo el arbol
	 * y ninguno lo es.
	 */
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
	public void getHeight() {
		System.out.println("----"+getHeight(this.root));
	}
	/*
	 * O(n) ya que en el peor de los casos, recorro todo.
	 *
	 */
	private int getHeight(TreeNode node) {
		int heightIzq=0;
		int heightDere=0;
	     if (node == null)  return -1; 
	        heightIzq= getHeight(node.getLeft());
	    	heightDere=getHeight(node.getRight());
	    if(heightIzq > heightDere) {
	    	return heightIzq+1;
	    }else {
	    	return heightDere+1;
	    }
		
	}
	
	/*
	 * O(n) ya que recorremos todos los elementos.
	 */
	public boolean Delete(int value) {
		if(this.root==null)return false;
		if(this.root.getValue() == value) {
			if(this.root.esHoja()) {
				this.root=null;
			}
		}
		return Delete(this.root, value);
	}
	public boolean Delete(TreeNode node, int value) {
		if(node==null)return false;
		if(node.getLeft()!=null) {
			TreeNode hijoIzq = node.getLeft();
			if(hijoIzq.esHoja()) {
				if(hijoIzq.getValue()==value) {
					node.setLeft(null);
					return true;
				}
			}else if((node.getLeft()==null) || (node.getRight()==null)) {
				if(hijoIzq.getValue()==value) {
					
					if(hijoIzq.getLeft()!=null) {
						System.out.println("---");
						node.setLeft(hijoIzq.getLeft());
						return true;
					}else {
						node.setLeft(hijoIzq.getRight());
						return true;
					}
					
				}
			}else {
				int nuevoValor=0;
				if(hijoIzq.getValue()==value) {
					TreeNode actual = hijoIzq;
					if(hijoIzq.getRight()!=null) {
						hijoIzq=hijoIzq.getRight();
					if(hijoIzq.getLeft()!=null) {					
						hijoIzq=hijoIzq.getLeft();
						if(hijoIzq.getLeft()==null) {						
							nuevoValor = hijoIzq.getValue();
							System.out.println(nuevoValor + " | " + actual.getValue());
							actual.setValue(nuevoValor);
							Delete(node.getLeft(), nuevoValor);
							return true;
							}
						}
					}				
				}
			}
			Delete(hijoIzq, value);
		}
		if(node.getRight()!=null) {
			TreeNode hijoDer = node.getRight();
			if(hijoDer.esHoja()) {
				if(hijoDer.getValue()==value) {
					node.setRight(null);
					return true;
				}
			}else if(node.getLeft()!=null || node.getRight()!=null) {
				if(hijoDer.getValue()==value) {
					System.out.println("---");
					if(hijoDer.getRight()!=null) {
						node.setRight(hijoDer.getRight());
						return true;
					}else {
						node.setRight(hijoDer.getLeft());
						return true;
					}
				}
			}else {
				int nuevoValor=0;
				if(hijoDer.getValue()==value) {
					TreeNode actual = hijoDer;
					if(hijoDer.getRight()!=null) {
						hijoDer=hijoDer.getRight();
					if(hijoDer.getLeft()!=null) {					
						hijoDer=hijoDer.getLeft();
						if(hijoDer.getLeft()==null) {						
							nuevoValor = hijoDer.getValue();
							System.out.println(nuevoValor + " | " + actual.getValue());
							actual.setValue(nuevoValor);
							Delete(node.getRight(), nuevoValor);
							return true;
							}
						}
					}				
				}
			}
			Delete(hijoDer, value);
		}
		return false;
	}
	/*
	 * O(n)
	 */
	public List<Integer> getLongestBranch() {
		if(this.root == null) return new ArrayList<>();
		return getLongestBranch(this.root);
	}
	private List<Integer> getLongestBranch(TreeNode node) {
		if(node==null)return new ArrayList<>();

        
        List<Integer>totalIzq = getLongestBranch(node.getLeft());   
        List<Integer>totalDer = getLongestBranch(node.getRight());
        totalIzq.add(node.getValue());
        totalDer.add(node.getValue());
        if(totalIzq.size() > totalDer.size()) {
        	return totalIzq;
        }
        return totalDer;
	}
	/*
	 * O(n), ya que tengo que ir por todos los elementos.
	 */
	public List<Integer> getFrontera() {
		if(this.root == null) return new ArrayList<>();
		return getFrontera(this.root);
	}
	private List<Integer> getFrontera(TreeNode node) {
		if(node==null)return new ArrayList<>();
		List<Integer> total = new ArrayList<>();
		total = getFrontera(node.getLeft());   
		total.addAll(getFrontera(node.getRight()));
        if(node.getLeft()==null && node.getRight()==null) {
        	total.add(node.getValue());
        }
        return total;
	}
	
	/*
	 * En este caso solo tengo que ir para un lado, entonces es
	 * O(H), la altura.
	 */
	public int getMaxElem() {
		if(this.root==null)return -1;
		return getMaxElem(this.root);
	}
	private int getMaxElem(TreeNode node) {
		int valor=0;
		if(node==null) return -1;
			if(node.getRight()!=null) {
				valor= getMaxElem(node.getRight());
			}
			if(node.getRight()==null) {
				valor=node.getValue();
			}
		return valor;
	}
	
	/*
	 * Es O(n)...
	 */
	public int getSumaNodos() {
		if(this.root==null)return -1;
		return this.getSumaNodos(this.root);
	}
	private int getSumaNodos(TreeNode node) {
		if(node == null) return 0;
		int valorTotal=0, valorIzq=0, valorDer=0;
		if(node.getLeft()!=null) {
			valorIzq = getSumaNodos(node.getLeft());
		}
		if(node.getRight()!=null) {
			valorDer = getSumaNodos(node.getRight());
		}
		if(!node.esHoja()) {
			valorTotal=valorIzq + valorDer;
			return valorTotal+node.getValue();
		}
		return 0;
	}

	/*
	 * O(n)..
	 */
	public List<Integer> valoresSuperioresA(int value) {
		if(this.root == null) return new ArrayList<>();
		return valoresSuperioresA(this.root,value);
	}
	private List<Integer> valoresSuperioresA(TreeNode node, int value) {
		List<Integer> valoresIzq = new ArrayList<>();
		List<Integer> valoresDer = new ArrayList<>();
		List<Integer> valoresTotal = new ArrayList<>();
		if(node.getLeft()!=null) {
			valoresIzq = valoresSuperioresA(node.getLeft(), value);
		}
		if(node.getRight()!=null) {
			valoresDer = valoresSuperioresA(node.getRight(), value);
		}
		if(node.esHoja() && node.getValue() >= value) {
			valoresIzq.add(node.getValue());
		}
		valoresTotal.addAll(valoresIzq);
		valoresTotal.addAll(valoresDer);
		return valoresTotal;
	}
	

	
	
	/*
	 * IMPRIMIR EL ARBOL
	 */
	public void printTree() {
        if (root == null) {
            System.out.println("El árbol está vacío");
            return;
        }

        List<List<String>> lines = new ArrayList<>();
        List<TreeNode> level = new ArrayList<>();
        List<TreeNode> next = new ArrayList<>();

        level.add(root);
        int nn = 1;
        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<>();
            nn = 0;

            for (TreeNode n : level) {
                if (n == null) {
                    line.add(null);
                    next.add(null);
                    next.add(null);
                } else {
                    String aa = n.getValue().toString();
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(n.getLeft());
                    next.add(n.getRight());

                    if (n.getLeft() != null) nn++;
                    if (n.getRight() != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);
            List<TreeNode> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;

            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {
                    // split node
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '┴' : '┘';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '└';
                        }
                    }
                    System.out.print(c);

                    // lines and spaces
                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            System.out.print(" ");
                        }
                    } else {
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? " " : "─");
                        }
                        System.out.print(j % 2 == 0 ? "┌" : "┐");
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "─" : " ");
                        }
                    }
                }
                System.out.println();
            }

            // print line of numbers
            for (String f : line) {
                if (f == null) f = "";
                int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
                int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

                // a number
                for (int k = 0; k < gap1; k++) {
                    System.out.print(" ");
                }
                System.out.print(f);
                for (int k = 0; k < gap2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            perpiece /= 2;
        }
    } 
	/* --------------------------*/
	/*
	 * O(1)
	 */
	public void addCaracter(char caracter) {
	    if (this.root == null) {
	        this.root = new TreeNode(caracter);
	    } else {
	        addCaracterRec(this.root, caracter);
	    }
	}

	private void addCaracterRec(TreeNode actual, char caracter) {
	    if (actual == null) return;
	    if (actual.getLeft() == null) {
	        actual.setLeft(new TreeNode(caracter));
	        return;
	    }
	    if (actual.getRight() == null) {
	        actual.setRight(new TreeNode(caracter));
	        return;
	    }
	    if (getHeight(actual.getLeft()) <= getHeight(actual.getRight())) {
	        addCaracterRec(actual.getLeft(), caracter); 
	    } else {
	        addCaracterRec(actual.getRight(), caracter);
	    }
	}
	/*
	 * O(n)
	 */
	public List<Character> buscarVocales(int valor) {
		if(this.root==null) return new ArrayList<>();
		return buscarVocales(this.root, valor, new ArrayList<>());
	}
	private List<Character> buscarVocales(TreeNode actual, int valor, List<Character> todosVal) {
		if(actual ==null) return new ArrayList<>();
		List<Character> valorIzq = new ArrayList<>();
		List<Character> valorDer = new ArrayList<>();
		List<Character> resultado = new ArrayList<>();
		List<Character> copiaCamino = new ArrayList<>(todosVal);
		copiaCamino.add(actual.getCaracter());
		if(actual.getLeft()!=null) {
			valorIzq = buscarVocales(actual.getLeft(), valor, copiaCamino);
		}
		if(actual.getRight()!=null) {
			valorDer = buscarVocales(actual.getRight(), valor, copiaCamino);
		}
		if(actual.esHoja()) {
			if(esVocal(copiaCamino,valor)) {
				resultado.addAll(copiaCamino);
			}
		}
		resultado.addAll(valorIzq);
		resultado.addAll(valorDer);
		return resultado;
	}
	public boolean esVocal(List<Character> valorIzq, int valor) {
		int contador=0;
		for(int i=0; i<valorIzq.size(); i++) {
			if(valorIzq.get(i)== 'A' || valorIzq.get(i)== 'E' || valorIzq.get(i)== 'I' || valorIzq.get(i)== 'O'
					|| valorIzq.get(i)== 'U') {
				contador++;
			}
		}
		return contador==valor;
	}
	/*
	 * METODO PARA IMPRIMIR
	 */
	public void printTreeCaracter() {
	    if (root == null) {
	        System.out.println("El árbol está vacío");
	        return;
	    }

	    List<List<String>> lines = new ArrayList<>();
	    List<TreeNode> level = new ArrayList<>();
	    List<TreeNode> next = new ArrayList<>();

	    level.add(root);
	    int nn = 1;
	    int widest = 0;

	    while (nn != 0) {
	        List<String> line = new ArrayList<>();
	        nn = 0;

	        for (TreeNode n : level) {
	            if (n == null) {
	                line.add(null);
	                next.add(null);
	                next.add(null);
	            } else {
	                String aa = Character.toString(n.getCaracter()); // ← usamos el caracter
	                line.add(aa);
	                if (aa.length() > widest) widest = aa.length();

	                next.add(n.getLeft());
	                next.add(n.getRight());

	                if (n.getLeft() != null) nn++;
	                if (n.getRight() != null) nn++;
	            }
	        }

	        if (widest % 2 == 1) widest++;

	        lines.add(line);
	        List<TreeNode> tmp = level;
	        level = next;
	        next = tmp;
	        next.clear();
	    }

	    int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
	    for (int i = 0; i < lines.size(); i++) {
	        List<String> line = lines.get(i);
	        int hpw = (int) Math.floor(perpiece / 2f) - 1;

	        if (i > 0) {
	            for (int j = 0; j < line.size(); j++) {
	                char c = ' ';
	                if (j % 2 == 1) {
	                    if (line.get(j - 1) != null) {
	                        c = (line.get(j) != null) ? '┴' : '┘';
	                    } else {
	                        if (j < line.size() && line.get(j) != null) c = '└';
	                    }
	                }
	                System.out.print(c);

	                if (line.get(j) == null) {
	                    for (int k = 0; k < perpiece - 1; k++) {
	                        System.out.print(" ");
	                    }
	                } else {
	                    for (int k = 0; k < hpw; k++) {
	                        System.out.print(j % 2 == 0 ? " " : "─");
	                    }
	                    System.out.print(j % 2 == 0 ? "┌" : "┐");
	                    for (int k = 0; k < hpw; k++) {
	                        System.out.print(j % 2 == 0 ? "─" : " ");
	                    }
	                }
	            }
	            System.out.println();
	        }

	        for (String f : line) {
	            if (f == null) f = "";
	            int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
	            int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

	            for (int k = 0; k < gap1; k++) {
	                System.out.print(" ");
	            }
	            System.out.print(f);
	            for (int k = 0; k < gap2; k++) {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();

	        perpiece /= 2;
	    }
	}
	/* --------------------------*/
	

}
