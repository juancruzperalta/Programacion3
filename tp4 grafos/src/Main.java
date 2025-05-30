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
		grafito.agregarArco(1, 2, 3F);
		grafito.agregarArco(1, 3, 5F);
		grafito.agregarArco(3, 4, 1F);
		grafito.agregarArco(4, 5, 3F);
		grafito.agregarArco(5, 2, 1F);
		//System.out.println("La cantidad de vertices del grafito es: "+grafito.cantidadVertices());
		//System.out.println("La cantidad de arcos son: "+ grafito.cantidadArcos());
		/*Iterator<Integer> it = grafito.obtenerVertices();
		while(it.hasNext()) {
			System.out.println("Vertice " + it.next());
		}
		
		Iterator<Integer> ady = grafito.obtenerAdyacentes(1);
		while(ady.hasNext()) {
			System.out.println("Adyacentes: " + ady.next());
		}
		Iterator<Arco<Float>> arc = grafito.obtenerArcos();
		while(arc.hasNext()) {
			Arco<Float> arco = arc.next();
			System.out.println(arco.getVerticeOrigen() + " Origen | Destino " + arco.getVerticeDestino());
		}
		Iterator<Arco<Float>> arcos = grafito.obtenerArcos(1);
		while(arcos.hasNext()) {
			Arco<Float> arc = arcos.next();
			System.out.println(arc.getVerticeOrigen() + " Origen | Destino " + arc.getVerticeDestino());
		}
		grafito.borrarArco(1, 2);

		grafito.borrarVertice(1);
		
		*/
		//System.out.println("DFS en grafo " + grafito.DFS());
		//System.out.println("BFS en grafo "+ grafito.BFS());
		//System.out.println(grafito.tieneAlgunCiclo());
		System.out.println("El camino más largo es " + grafito.caminoMasLargo(1, 2));
	}

}
