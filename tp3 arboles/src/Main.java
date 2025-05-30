import java.util.List;

import arbolResuelto.TreeRes;

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
		//System.out.println(t.getRoot());
		//System.out.println(t.hasElem(3));
		//System.out.println("Esta vacio " + t.isEmpty());
		//System.out.println(t.getHeight());
		System.out.println("La rama más larga es la: " + t.getLongestBranch());
		System.out.println("La frontera es: "+ t.getFrontera());
		System.out.println("El elemento más grande es: " + t.getMaxElem());
		System.out.println("GetElemAtLevel" + t.getElemAtLevel(0));
		/*t.add(6);
		t.add(2);
		t.add(1);
		t.add(4);
		t.add(10);
		t.add(8);
		t.add(7);
		t.add(9);
		t.add(11);*/
		//System.out.println(t.isEmpty());
		//t.printPreOrder();
		//System.out.println();
		//System.out.println(t.hasElem(7));
		//System.out.println(t.Delete(7));
		System.out.println("-----------------------------");
		//t.printPreOrder();
		//System.out.println();
		//List<Integer> ramaLarga = t.getLongestBranch();
		//System.out.println(ramaLarga);
		//List<Integer> frontera = t.getFrontera();
		//System.out.println(frontera);
		//System.out.println("El elemento más grande en el arbol es el "+ t.getMaxElem());
		//Falta el DELETE para el caso de la RAMA..
		//System.out.println("-----------------------------");
		//System.out.println("Suma de elementos del arbol "+ t.getSumaNodos());
		//System.out.println("-----------------------------");
		//System.out.println("Valores que superan a K :"+ t.valoresSuperioresA(8));
		//System.out.println("-------ARBOL BINARIO SIN BUSQUEDA-------");
        //FALTA HACER (no pude)
		
	/*	System.out.println("---------ARBOL DE CARACTERES---------");
		Tree t = new Tree();
		t.addCaracter('M');
		t.addCaracter('A');
		t.addCaracter('I');
		t.addCaracter('L');
		t.addCaracter('S');
		t.addCaracter('N');
		t.addCaracter('A');
		t.addCaracter('O');
		t.addCaracter('E');
		t.printTreeCaracter();
		System.out.println(t.buscarVocales(2));*/
	}
}
