

public class Main{
	public static void main(String[]args) {
		
		MySimpleLinkedList<Integer>Lista = new MySimpleLinkedList<Integer>();
		
		Lista.insertFront(10);
		Lista.insertFront(25);
		Lista.insertFront(30); 
		Lista.insertFront(20);
		Lista.insertFront(40); 
		Lista.insertAt(3, 500);
		System.out.println(Lista.removeAt(4));
		System.out.println(Lista.get(4));
	}
}