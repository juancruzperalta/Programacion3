import java.util.Iterator;

public class Main{
	public static void main(String[]args) {
		
		MySimpleLinkedList<Integer>Lista = new MySimpleLinkedList<Integer>();
		
		Lista.insertFront(10);
		Lista.insertFront(25);
		Lista.insertFront(30); 
		Lista.insertFront(20);
		Lista.insertFront(40); 
		//40->20->30->20;
		//System.out.println(Lista.get(1));
		//System.out.println(Lista.isEmpty());
		//System.out.println("El elemento extraído de la lista es: "+ Lista.extractFront());
		//System.out.println("Tamaño: " + Lista.size());
		//System.out.println("Elementos: "+ Lista.get(0));
		//System.out.println(Lista.indexOf(40));
		//Lista.insertLast(25);
		Lista.eliminar(10);
		Lista.eliminarUltimo();
		System.out.println(Lista.get(10));
	}
}