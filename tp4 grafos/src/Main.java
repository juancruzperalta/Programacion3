import java.util.*;


public class Main {

	public static void main(String[] args) {

		// Creo un grafo dirigdo donde las etiquetas de los arcos son valores Float
		GrafoDirigido<Float> grafito = new GrafoDirigido<>();
		
		// Agrego los vertices 1 y 2
		grafito.agregarVertice(1);
		grafito.agregarVertice(2);
		grafito.agregarVertice(3);
		grafito.agregarVertice(4);
		grafito.agregarVertice(5);
		// Genero un arco desde 1 hasta 2 con el valor de etiqueta 3
		grafito.agregarArco(1, 2, 3F, 10);
		grafito.agregarArco(2, 4, 1F, 100);
		grafito.agregarArco(1, 3, 5F, 30);
		grafito.agregarArco(3, 4, 1F, 5);
		grafito.agregarArco(4, 2, 2F, 25);
		grafito.agregarArco(4, 5, 2F, 15);
		/*Iterator<Integer> it = grafito.obtenerVertices();
		while (it.hasNext()) {
			int Vertices = it.next();
		    System.out.println("Vertices son " + Vertices);
		}*/

		System.out.println(grafito.encontrarCaminoV1YV2PorRestriccion(1, 2));
		System.out.println(grafito.caminoQuePasaUnaVez(1, 3));
		System.out.println(grafito.caminoMayorConSumaDePesos(1, 4));
	}

}
