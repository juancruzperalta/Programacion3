package rehecho;


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
		
	/*	System.out.println(t.isEmpty());
		System.out.println(t.hasElem(7));
		System.out.println(t.getHeight());
		System.out.println(t.getLongestBranch());
		System.out.println(t.getFrontera());
		System.out.println(t.getMaxElem());
		System.out.println(t.sumaDeNodosInternos());
		System.out.println(t.hojasSupereAK(0));
		System.out.println(t.arbolMultiploK(2));
		System.out.println(t.sumaNodosHojasNivelesPares());
		System.out.println(t.getElemAtLevel(0));*/
		System.out.println(t.promedioHojas());
		System.out.println(t.getValoresEnRango(4, 6));
		System.out.println(t.getDiametro());
	}
}
