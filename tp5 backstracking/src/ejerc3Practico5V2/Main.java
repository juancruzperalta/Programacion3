package ejerc3Practico5V2;
import java.util.List;
import java.util.LinkedList;
public class Main {
	public static void main(String[]args) {

		List<Integer> conjuntos = new LinkedList<>();
		{
			conjuntos.add(2);
			conjuntos.add(6);
			conjuntos.add(3);
			conjuntos.add(4);
		}
		int valorObjetivo=12;
		ejerc3Practico5V2 eje = new ejerc3Practico5V2(conjuntos, valorObjetivo);
		eje.backTracking();
		eje.imprimirEstado();
	}
}
