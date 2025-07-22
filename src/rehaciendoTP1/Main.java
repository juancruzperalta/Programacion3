package rehaciendoTP1;

public class Main{
	public static void main(String[]args) {
		
		MySimpleLinkedList<Integer>Lista = new MySimpleLinkedList<Integer>();
		MySimpleLinkedList<Integer>otraLista = new MySimpleLinkedList<Integer>();
		otraLista.insertFront(10);
		otraLista.insertFront(25);
		otraLista.insertFront(30); 
		otraLista.insertFront(20);
		otraLista.insertFront(40); 
		Lista.insertFront(10);
		Lista.insertFront(25);
		Lista.insertFront(30); 
		Lista.insertFront(20);
		Lista.insertFront(40); 
		//40->20->30->25->10
	}
}