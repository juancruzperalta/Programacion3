
public class Main {

	public static void main(String[] args) {

		GrafoDirigido<Float> grafito = new GrafoDirigido<>();
		
		grafito.agregarVertice(1);
		grafito.agregarVertice(2);
		grafito.agregarVertice(3);
		grafito.agregarVertice(4);
		grafito.agregarVertice(5);
		grafito.agregarArco(1, 2, 3F);
		grafito.agregarArco(2, 3, 1F);
		grafito.agregarArco(3, 5, 7F);
		grafito.agregarArco(5, 4, 8F);
		/*System.out.println(etiqueta); // Deber�a imprimir 3
		System.out.println(grafito.cantidadVertices());
		System.out.println(grafito.cantidadArcos());
		System.out.println(grafito.tenesAlgunCiclo());
		System.out.println(grafito.caminoSimple(1, 4));
		System.out.println(grafito.hayCicloDesde(1));
		*/
		System.out.println("1 → 4: " + grafito.hayCamino(1, 4)); // true
		System.out.println("2 → 5: " + grafito.hayCamino(2, 5)); // true
		System.out.println("3 → 2: " + grafito.hayCamino(3, 2)); // false
		System.out.println("5 → 4: " + grafito.hayCamino(5, 4)); // true
		System.out.println("4 → 1: " + grafito.hayCamino(4, 1)); // false
	}

}
