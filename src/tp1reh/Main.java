package tp1reh;

public class Main{
	public static void main(String[]args) {
		
		MySimpleLinkedList<Integer>Lista = new MySimpleLinkedList<Integer>();
		
		Lista.insertFront(10);
		Lista.insertFront(25);
		Lista.insertFront(30); 
		Lista.insertFront(20);
		Lista.insertFront(40); 
		//40->20->30->25->10
		System.out.println(Lista.getElemento(20));
	}
}