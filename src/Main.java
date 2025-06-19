
public class Main{
	public static void main(String[]args) {
		
		MySimpleLinkedList<Integer>Lista = new MySimpleLinkedList<Integer>();
		
		Lista.insertFront(10);
		Lista.insertFront(25);
		Lista.insertFront(30); 
		Lista.insertFront(20);
		Lista.insertFront(40); 
		//40->20->30->25->10
		Lista.insertBack(45);
		Lista.insertBack(55);
		//40->20->30->25->10->45->55
	//	Lista.insertAt(2, 15);
		//40->20->15->30->25->10->45->55
		System.out.println(Lista.removeAt(3));
		System.out.println(Lista.size());
		System.out.println(Lista.indexOf(10));
		System.out.println(Lista.estaT(10));
	}
}