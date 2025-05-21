import java.util.Iterator;

public class Main{
	public static void main(String[]args) {
		
		MySimpleLinkedList<Integer>Lista = new MySimpleLinkedList<Integer>();
		
		Lista.insertFront(20); 
		Lista.insertFront(30); 
		Lista.insertFront(20);
		Lista.insertFront(40); 
		/*MySimpleLinkedList<Integer>Lista2 = new MySimpleLinkedList<Integer>();

		Lista2.insertFront(300); 
	    Lista2.insertFront(800); 
	    Lista2.insertFront(1000); 

		MySimpleLinkedList<Integer>Lista3 = new MySimpleLinkedList<Integer>();
		
		Lista3.insertarAmbasListas(Lista, Lista2);
		*///Yo sé que quizás hacemos un O(n) con el EstoyOrdenado, pero de esta forma, en el mejor caso
		//Si estoy ordenado no voy a tener que hacer un N"2
		/*if(!Lista3.estoyOrdenado()) {
			Lista3.ordenarme();
		}
	    //System.out.println(Lista.getPrev(20));
	    //Lista 1	    Lista.eliminarElemento(10);
	    Iterator<Integer> iterador = Lista3.iterator();
	    while(iterador.hasNext()) {
	    	System.out.print(iterador.next() + " - ");
	    }
	    */
	    System.out.println(Lista.contarApariciones(30));
	}
}