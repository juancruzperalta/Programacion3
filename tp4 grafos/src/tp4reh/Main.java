package tp4reh;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// Creo un grafo dirigdo donde las etiquetas de los arcos son valores Float
		GrafoDirigido<Float> grafito = new GrafoDirigido<>();
		grafito.agregarVertice(1);
		grafito.agregarVertice(2);
		grafito.agregarVertice(3);
		grafito.agregarVertice(4);
		grafito.agregarVertice(5);
		// Genero un arco desde 1 hasta 2 con el valor de etiqueta 3
		grafito.agregarArco(1, 2, 3F, 2);
		grafito.agregarArco(2, 4, 1F, 5);
		grafito.agregarArco(1, 3, 5F, 1);
		grafito.agregarArco(3, 4, 1F, 2);
		grafito.agregarArco(4, 2, 2F, 23);
		grafito.agregarArco(4, 5, 2F, 15);
		System.out.println(grafito.caminoVuelta(1, 4));
		System.out.println(grafito.todosLosCaminosIgualesK(1, 4, 3));
		
	}

}
