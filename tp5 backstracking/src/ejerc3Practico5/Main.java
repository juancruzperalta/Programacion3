package ejerc3Practico5;
import java.util.List;
import java.util.LinkedList;

public class Main {
	public static void main(String[]args) {
		List<Integer> conjunto = new LinkedList<>();
		{
		    conjunto.add(2);
		    conjunto.add(4);
		    conjunto.add(6);
		    conjunto.add(3);
		    conjunto.add(1);
		}
		int valorObjetivo = 7;
		ejerc3Practico5 eje = new ejerc3Practico5(conjunto, valorObjetivo, null);
		
		
		eje.backTracking();
		eje.imprimirSolucion();
	}
	
}
