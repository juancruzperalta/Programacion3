package ejerc4Practico5;

import java.util.List;
import java.util.LinkedList;

public class Main {
	public static void main(String[]args) {
		List<Integer> conjuntos = new LinkedList<>();
		{
			conjuntos.add(3);
			conjuntos.add(1);
			conjuntos.add(2);
			conjuntos.add(4);
		}
		
		ejerc4Practico5 eje = new ejerc4Practico5(conjuntos);
		eje.BackTracking();
		eje.imprimirSolucion();
	}
}
