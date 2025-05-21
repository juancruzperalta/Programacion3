package ejerc3Practico5V3;
import java.util.LinkedList;
import java.util.List;
public class Main {
	public static void main(String[]args) {
		List<Integer> conjuntos = new LinkedList<>();
		{
			conjuntos.add(10);
			conjuntos.add(2);
			conjuntos.add(3);
			conjuntos.add(1);
		}
		int valorObjetivo = 5;
		ejerc3Practico5V3 eje = new ejerc3Practico5V3(conjuntos, valorObjetivo, null);
		eje.backTracking();
		eje.imprimirSolucion();
	}
}
