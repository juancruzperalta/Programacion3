package tp4reh;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// Creo un grafo dirigdo donde las etiquetas de los arcos son valores Float
		GrafoDirigido<Float> grafito = new GrafoDirigido<>();
		
		// Agrego los vertices 1 y 2
		grafito.agregarVertice(1);
		grafito.agregarVertice(2);
		// Genero un arco desde 1 hasta 2 con el valor de etiqueta 3
		grafito.agregarArco(1, 2, 3F);
		
		// Obtengo el arco entre 1 y 2, y le pido la etiqueta
		Float etiqueta = grafito.obtenerArco(1, 2).getEtiqueta();
		
		System.out.println(etiqueta); // Deber�a imprimir 3
		//grafito.borrarVertice(2);
		System.out.println(grafito.cantidadVertices());
		//grafito.borrarArco(1, 2);
		System.out.println(grafito.cantidadArcos());
		Iterator<Integer> it = grafito.obtenerVertices();
		while (it.hasNext()) {
			int Vertices = it.next();
		    System.out.println("Vertices son " + Vertices);
		}
		System.out.println(grafito.esFuertementeConexo());
	}

}
