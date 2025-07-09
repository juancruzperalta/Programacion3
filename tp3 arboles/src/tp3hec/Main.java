package tp3hec;

public class Main {
	public static void main(String[]args) {
		Tree t = new Tree();
		t.add(6);
		t.add(3);
		t.add(1);
		t.add(5);
		t.add(4);
		t.add(7);
		t.add(9);
		//System.out.println(t.caminosHastaHojas());
		System.out.println(t.sumaNodos(6));
		System.out.println(t.profundidadDelNodo(5));
	}
}
