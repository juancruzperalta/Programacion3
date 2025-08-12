package tp4r;

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
		grafito.agregarArco(1, 2, 3F);
		grafito.agregarArco(1, 3, 5F);
		grafito.agregarArco(3, 4, 1F);
		grafito.agregarArco(4, 2, 2F);
		grafito.agregarArco(4, 5, 2F);
		System.out.println(grafito.tieneCiclo());
		System.out.println(grafito.verticesCaminoGaV(4));
		System.out.println(grafito.caminoCortoEntreCiudad(1, 2));
	}

}
