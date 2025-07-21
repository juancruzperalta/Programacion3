package arcoHechoYa;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Creo un grafo dirigdo donde las etiquetas de los arcos son valores Float
		GrafoDirigidoAnterior<Float> grafito = new GrafoDirigidoAnterior<>();
		
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
		System.out.println("tiene vertice" + grafito.contieneVertice(12));
		System.out.println(grafito.obtenerArco(1, 2));
		//grafito.borrarArco(1, 3);
		//grafito.borrarVertice(1);
		// Obtengo el arco entre 1 y 2, y le pido la etiqueta
		/*Float etiqueta = grafito.obtenerArco(1, 2).getEtiqueta();
		
		System.out.println("La etiqueta del grafito es: "+ etiqueta); // Deber�a imprimir 3
		
		System.out.println("La cantidad de vertices del grafito es: "+ grafito.cantidadVertices());
		System.out.println("La cantidad de ARCOS es: "+ grafito.cantidadArcos());
		
		//grafito.borrarVertice(4);
		 
		Iterator<Integer> obtVertice = grafito.obtenerVertices();
		while (obtVertice.hasNext()) {
		    System.out.println("Obtener Vertices: " + obtVertice.next());
		}
		
		Iterator<Integer> it = grafito.obtenerAdyacentes(1);
		while (it.hasNext()) {
		    System.out.println("Adyacente: " + it.next());
		}
		
		Iterator<Arco<Float>> obtArcosXId = grafito.obtenerArcos(3);
		while (obtArcosXId.hasNext()) {
			Arco<Float> arco = obtArcosXId.next();
			System.out.println("Arcos por id son: "+ arco.getVerticeOrigen() + " Origen | Destino " + arco.getVerticeDestino());
		}
		Iterator<Arco<Float>> obtArcos = grafito.obtenerArcos();
		while (obtArcos.hasNext()) {
			Arco<Float> arco = obtArcos.next();
			System.out.println("Arcos son: "+ arco.getVerticeOrigen() + " Origen | Destino " + arco.getVerticeDestino());
		}
		*/
		
		System.out.println("Orden en el DFS" + grafito.DFS());
		System.out.println("Orden en el BFS" + grafito.BFS());
		//System.out.println(grafito.tieneAlgunCiclo());
		/*GrafoNoDirigido<Float> noDirigido = new GrafoNoDirigido<>();
		
		noDirigido.agregarVertice(1);
		noDirigido.agregarVertice(2);
		noDirigido.agregarVertice(3);
		noDirigido.agregarArco(1, 2, 8F);
		noDirigido.agregarArco(3, 2, 1F);
		System.out.println("La cantidad de ARCOS del grafo no dirigido: "+ noDirigido.cantidadArcos());*/
		//System.out.println(grafito.buscarElCaminoLargo(1,2));
		//System.out.println(grafito.buscarCaminoCorto(1, 2));
		System.out.println(grafito.caminoQueTerminaEn(2));
		
		System.out.println("La cantidad de arcos salientes son " + grafito.contarArcosSalientes(1));
		System.out.println("Los arcos con destinos del vertice son: "+ grafito.obtenerArcosDestinos(1));
		System.out.println("El peso del arco es: " + grafito.obtenerPesoArco(1, 2));
		System.out.println("Es un vertice aislado?(no tiene arcos): " + grafito.esVerticeAislado(5));
	}

}
